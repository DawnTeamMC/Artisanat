package com.hugman.artisanat.creator.bundle.block;

import com.hugman.artisanat.object.block.MappedOxidizableBlock;
import com.hugman.artisanat.util.CopperMap;
import com.hugman.dawn.api.creator.BlockCreator;
import com.hugman.dawn.api.creator.bundle.Bundle;
import com.mojang.datafixers.util.Pair;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Oxidizable;
import net.minecraft.item.ItemGroup;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class CopperBlocksBundle extends Bundle {
    private final Map<Pair<Oxidizable.OxidizationLevel, Boolean>, BlockCreator> unplatedBlocks = new HashMap<>();
    private final Map<Pair<Oxidizable.OxidizationLevel, Boolean>, BlockCreator> bricks = new HashMap<>();
    private final Map<Pair<Oxidizable.OxidizationLevel, Boolean>, BlockCreator> tiles = new HashMap<>();

    public CopperBlocksBundle() {
        createBlocks(unplatedBlocks, "unplated", "");
        createBlocks(bricks, "", "bricks");
        createBlocks(tiles, "", "tiles");
    }

    private void fillOxidizationMap(Map<Pair<Oxidizable.OxidizationLevel, Boolean>, BlockCreator> map) {
        CopperMap.put(get(map, Oxidizable.OxidizationLevel.UNAFFECTED, false), get(map, Oxidizable.OxidizationLevel.EXPOSED, false), get(map, Oxidizable.OxidizationLevel.UNAFFECTED, true));
        CopperMap.put(get(map, Oxidizable.OxidizationLevel.EXPOSED, false), get(map, Oxidizable.OxidizationLevel.WEATHERED, false), get(map, Oxidizable.OxidizationLevel.EXPOSED, true));
        CopperMap.put(get(map, Oxidizable.OxidizationLevel.WEATHERED, false), get(map, Oxidizable.OxidizationLevel.OXIDIZED, false), get(map, Oxidizable.OxidizationLevel.WEATHERED, true));
        CopperMap.put(get(map, Oxidizable.OxidizationLevel.OXIDIZED, false), null, get(map, Oxidizable.OxidizationLevel.OXIDIZED, true));
    }

    private void createBlocks(Map<Pair<Oxidizable.OxidizationLevel, Boolean>, BlockCreator> map, String prefix, String suffix) {
        createBlocks(map, prefix, suffix, false);
        createBlocks(map, prefix, suffix, true);
        fillOxidizationMap(map);
    }

    private void createBlocks(Map<Pair<Oxidizable.OxidizationLevel, Boolean>, BlockCreator> map, String prefix, String suffix, boolean waxed) {
        if(!prefix.isEmpty()) prefix = prefix + "_";
        else suffix = "_" + suffix;
        if(waxed) prefix = "waxed_" + prefix;
        createBlock(map, Oxidizable.OxidizationLevel.UNAFFECTED, waxed, prefix + "copper" + (suffix.isEmpty() ? "_block" : suffix), (waxed ? Block::new : s -> new MappedOxidizableBlock(Oxidizable.OxidizationLevel.UNAFFECTED, s)), FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK));
        createBlock(map, Oxidizable.OxidizationLevel.EXPOSED, waxed, prefix + "exposed_copper" + suffix, (waxed ? Block::new : s -> new MappedOxidizableBlock(Oxidizable.OxidizationLevel.EXPOSED, s)), FabricBlockSettings.copyOf(Blocks.EXPOSED_COPPER));
        createBlock(map, Oxidizable.OxidizationLevel.WEATHERED, waxed, prefix + "weathered_copper" + suffix, (waxed ? Block::new : s -> new MappedOxidizableBlock(Oxidizable.OxidizationLevel.WEATHERED, s)), FabricBlockSettings.copyOf(Blocks.WEATHERED_COPPER));
        createBlock(map, Oxidizable.OxidizationLevel.OXIDIZED, waxed, prefix + "oxidized_copper" + suffix, (waxed ? Block::new : s -> new MappedOxidizableBlock(Oxidizable.OxidizationLevel.OXIDIZED, s)), FabricBlockSettings.copyOf(Blocks.OXIDIZED_COPPER));
    }

    private void createBlock(Map<Pair<Oxidizable.OxidizationLevel, Boolean>, BlockCreator> map, Oxidizable.OxidizationLevel oxidizationLevel, boolean waxed, String name, Function<AbstractBlock.Settings, ? extends Block> blockProvider, FabricBlockSettings settings) {
        map.put(Pair.of(oxidizationLevel, waxed), put(new BlockCreator.Builder().name(name).blockProvider(blockProvider).settings(settings).itemGroup(ItemGroup.BUILDING_BLOCKS).build()));
    }

    private Block get(Map<Pair<Oxidizable.OxidizationLevel, Boolean>, BlockCreator> map, Oxidizable.OxidizationLevel oxidizationLevel, boolean waxed) {
        return map.get(Pair.of(oxidizationLevel, waxed)).getValue();
    }

    public Block getUnplatedBlock(Oxidizable.OxidizationLevel oxidizationLevel, boolean waxed) {
        return get(unplatedBlocks, oxidizationLevel, waxed);
    }

    public Block getBricks(Oxidizable.OxidizationLevel oxidizationLevel, boolean waxed) {
        return get(bricks, oxidizationLevel, waxed);
    }

    public Block getTiles(Oxidizable.OxidizationLevel oxidizationLevel, boolean waxed) {
        return get(tiles, oxidizationLevel, waxed);
    }
}
