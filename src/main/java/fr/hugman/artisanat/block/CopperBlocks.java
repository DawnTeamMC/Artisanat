package fr.hugman.artisanat.block;

import com.mojang.datafixers.util.Pair;
import fr.hugman.dawn.Registrar;
import fr.hugman.dawn.block.DawnBlockSettings;
import fr.hugman.dawn.item.ItemGroupHelper;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.block.*;
import net.minecraft.item.ItemGroups;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class CopperBlocks {
    private final Map<Pair<Oxidizable.OxidationLevel, Boolean>, Block> unplatedBlocks = new HashMap<>();
    private final Map<Pair<Oxidizable.OxidationLevel, Boolean>, Block> bricks = new HashMap<>();
    private final Map<Pair<Oxidizable.OxidationLevel, Boolean>, Block> tiles = new HashMap<>();
    private final List<Pair<String, Block>> blocks = new ArrayList<>();

    public CopperBlocks() {
        createBlocks(unplatedBlocks, "unplated", "");
        createBlocks(bricks, "", "bricks");
        createBlocks(tiles, "", "tiles");
    }

    public void register(Registrar r) {
        blocks.forEach(pair -> r.add(pair.getFirst(), pair.getSecond()));

        fillOxidizationMap(unplatedBlocks);
        fillOxidizationMap(bricks);
        fillOxidizationMap(tiles);

        ItemGroupHelper.append(ItemGroups.BUILDING_BLOCKS, e -> {
            blocks.forEach(pair -> e.add(pair.getSecond()));
        });
    }

    private void fillOxidizationMap(Map<Pair<Oxidizable.OxidationLevel, Boolean>, Block> map) {
        registerOxi(get(map, Oxidizable.OxidationLevel.UNAFFECTED, false), get(map, Oxidizable.OxidationLevel.EXPOSED, false), get(map, Oxidizable.OxidationLevel.UNAFFECTED, true));
        registerOxi(get(map, Oxidizable.OxidationLevel.EXPOSED, false), get(map, Oxidizable.OxidationLevel.WEATHERED, false), get(map, Oxidizable.OxidationLevel.EXPOSED, true));
        registerOxi(get(map, Oxidizable.OxidationLevel.WEATHERED, false), get(map, Oxidizable.OxidationLevel.OXIDIZED, false), get(map, Oxidizable.OxidationLevel.WEATHERED, true));
        registerOxi(get(map, Oxidizable.OxidationLevel.OXIDIZED, false), null, get(map, Oxidizable.OxidationLevel.OXIDIZED, true));
    }

    private static void registerOxi(Block block, @Nullable Block oxidized, Block waxed) {
        if (oxidized != null) {
            OxidizableBlocksRegistry.registerOxidizableBlockPair(block, oxidized);
        }
        OxidizableBlocksRegistry.registerWaxableBlockPair(block, waxed);
    }

    private void createBlocks(Map<Pair<Oxidizable.OxidationLevel, Boolean>, Block> map, String prefix, String suffix) {
        createBlocks(map, prefix, suffix, false);
        createBlocks(map, prefix, suffix, true);
    }

    private void createBlocks(Map<Pair<Oxidizable.OxidationLevel, Boolean>, Block> map, String prefix, String suffix, boolean waxed) {
        if (!prefix.isEmpty()) prefix = prefix + "_";
        else suffix = "_" + suffix;
        if (waxed) prefix = "waxed_" + prefix;
        createBlock(map, Oxidizable.OxidationLevel.UNAFFECTED, waxed, prefix + "copper" + (suffix.isEmpty() ? "_block" : suffix), (waxed ? Block::new : s -> new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, s)), DawnBlockSettings.copyOf(Blocks.COPPER_BLOCK));
        createBlock(map, Oxidizable.OxidationLevel.EXPOSED, waxed, prefix + "exposed_copper" + suffix, (waxed ? Block::new : s -> new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, s)), DawnBlockSettings.copyOf(Blocks.EXPOSED_COPPER));
        createBlock(map, Oxidizable.OxidationLevel.WEATHERED, waxed, prefix + "weathered_copper" + suffix, (waxed ? Block::new : s -> new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, s)), DawnBlockSettings.copyOf(Blocks.WEATHERED_COPPER));
        createBlock(map, Oxidizable.OxidationLevel.OXIDIZED, waxed, prefix + "oxidized_copper" + suffix, (waxed ? Block::new : s -> new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, s)), DawnBlockSettings.copyOf(Blocks.OXIDIZED_COPPER));
    }

    private void createBlock(Map<Pair<Oxidizable.OxidationLevel, Boolean>, Block> map, Oxidizable.OxidationLevel OxidationLevel, boolean waxed, String name, Function<AbstractBlock.Settings, ? extends Block> blockProvider, DawnBlockSettings settings) {
        var block = blockProvider.apply(settings.item());
        map.put(Pair.of(OxidationLevel, waxed), block);
        blocks.add(Pair.of(name, block));
    }

    private Block get(Map<Pair<Oxidizable.OxidationLevel, Boolean>, Block> map, Oxidizable.OxidationLevel OxidationLevel, boolean waxed) {
        return map.get(Pair.of(OxidationLevel, waxed));
    }
}
