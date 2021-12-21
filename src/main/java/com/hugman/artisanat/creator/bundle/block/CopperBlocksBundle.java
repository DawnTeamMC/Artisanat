package com.hugman.artisanat.creator.bundle.block;

import com.hugman.dawn.api.creator.BlockCreator;
import com.hugman.dawn.api.creator.bundle.Bundle;
import com.mojang.datafixers.util.Pair;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Oxidizable;
import net.minecraft.block.OxidizableBlock;
import net.minecraft.item.ItemGroup;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class CopperBlocksBundle extends Bundle {
    private final Map<Pair<Oxidizable.OxidationLevel, Boolean>, BlockCreator> unplatedBlocks = new HashMap<>();
    private final Map<Pair<Oxidizable.OxidationLevel, Boolean>, BlockCreator> bricks = new HashMap<>();
    private final Map<Pair<Oxidizable.OxidationLevel, Boolean>, BlockCreator> tiles = new HashMap<>();

    public CopperBlocksBundle() {
        createBlocks(unplatedBlocks, "unplated", "");
        createBlocks(bricks, "", "bricks");
        createBlocks(tiles, "", "tiles");
    }

    private void fillOxidizationMap(Map<Pair<Oxidizable.OxidationLevel, Boolean>, BlockCreator> map) {
        registerOxi(get(map, Oxidizable.OxidationLevel.UNAFFECTED, false), get(map, Oxidizable.OxidationLevel.EXPOSED, false), get(map, Oxidizable.OxidationLevel.UNAFFECTED, true));
        registerOxi(get(map, Oxidizable.OxidationLevel.EXPOSED, false), get(map, Oxidizable.OxidationLevel.WEATHERED, false), get(map, Oxidizable.OxidationLevel.EXPOSED, true));
        registerOxi(get(map, Oxidizable.OxidationLevel.WEATHERED, false), get(map, Oxidizable.OxidationLevel.OXIDIZED, false), get(map, Oxidizable.OxidationLevel.WEATHERED, true));
        registerOxi(get(map, Oxidizable.OxidationLevel.OXIDIZED, false), null, get(map, Oxidizable.OxidationLevel.OXIDIZED, true));
    }

    public static void registerOxi(Block block, @Nullable Block oxidized, Block waxed) {
        if (oxidized != null) {
            OxidizableBlocksRegistry.registerOxidizableBlockPair(block, oxidized);
        }
        OxidizableBlocksRegistry.registerWaxableBlockPair(block, waxed);
    }

    private void createBlocks(Map<Pair<Oxidizable.OxidationLevel, Boolean>, BlockCreator> map, String prefix, String suffix) {
        createBlocks(map, prefix, suffix, false);
        createBlocks(map, prefix, suffix, true);
        fillOxidizationMap(map);
    }

    private void createBlocks(Map<Pair<Oxidizable.OxidationLevel, Boolean>, BlockCreator> map, String prefix, String suffix, boolean waxed) {
        if(!prefix.isEmpty()) prefix = prefix + "_";
        else suffix = "_" + suffix;
        if(waxed) prefix = "waxed_" + prefix;
        createBlock(map, Oxidizable.OxidationLevel.UNAFFECTED, waxed, prefix + "copper" + (suffix.isEmpty() ? "_block" : suffix), (waxed ? Block::new : s -> new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, s)), FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK));
        createBlock(map, Oxidizable.OxidationLevel.EXPOSED, waxed, prefix + "exposed_copper" + suffix, (waxed ? Block::new : s -> new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, s)), FabricBlockSettings.copyOf(Blocks.EXPOSED_COPPER));
        createBlock(map, Oxidizable.OxidationLevel.WEATHERED, waxed, prefix + "weathered_copper" + suffix, (waxed ? Block::new : s -> new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, s)), FabricBlockSettings.copyOf(Blocks.WEATHERED_COPPER));
        createBlock(map, Oxidizable.OxidationLevel.OXIDIZED, waxed, prefix + "oxidized_copper" + suffix, (waxed ? Block::new : s -> new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, s)), FabricBlockSettings.copyOf(Blocks.OXIDIZED_COPPER));
    }

    private void createBlock(Map<Pair<Oxidizable.OxidationLevel, Boolean>, BlockCreator> map, Oxidizable.OxidationLevel OxidationLevel, boolean waxed, String name, Function<AbstractBlock.Settings, ? extends Block> blockProvider, FabricBlockSettings settings) {
        map.put(Pair.of(OxidationLevel, waxed), put(new BlockCreator.Builder().name(name).provider(blockProvider).settings(settings).itemGroup(ItemGroup.BUILDING_BLOCKS).build()));
    }

    private Block get(Map<Pair<Oxidizable.OxidationLevel, Boolean>, BlockCreator> map, Oxidizable.OxidationLevel OxidationLevel, boolean waxed) {
        return map.get(Pair.of(OxidationLevel, waxed)).getValue();
    }

    public Block getUnplatedBlock(Oxidizable.OxidationLevel OxidationLevel, boolean waxed) {
        return get(unplatedBlocks, OxidationLevel, waxed);
    }

    public Block getBricks(Oxidizable.OxidationLevel OxidationLevel, boolean waxed) {
        return get(bricks, OxidationLevel, waxed);
    }

    public Block getTiles(Oxidizable.OxidationLevel OxidationLevel, boolean waxed) {
        return get(tiles, OxidationLevel, waxed);
    }
}
