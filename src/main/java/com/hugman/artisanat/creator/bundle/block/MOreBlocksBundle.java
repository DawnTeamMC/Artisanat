package com.hugman.artisanat.creator.bundle.block;

import com.hugman.dawn.api.creator.BlockCreator;
import com.hugman.dawn.api.creator.bundle.Bundle;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;

import java.util.function.Function;

public class MOreBlocksBundle extends Bundle {
    private final BlockCreator platedBlock, cutBlock, bricks, tiles;

    public MOreBlocksBundle(String oreName, FabricBlockSettings settings) {
        this(oreName, settings, Block::new);
    }

    public MOreBlocksBundle(String oreName, FabricBlockSettings settings, Function<AbstractBlock.Settings, ? extends Block> blockProvider) {
        BlockCreator.Builder builder = new BlockCreator.Builder().provider(blockProvider).settings(settings).itemGroup(ItemGroup.BUILDING_BLOCKS);
        this.platedBlock = put(builder.name("plated_" + oreName + "_block").build());
        this.cutBlock = put(builder.name("cut_" + oreName + "_block").build());
        this.bricks = put(builder.name(oreName + "_bricks").build());
        this.tiles = put(builder.name(oreName + "_tiles").build());
    }

    public Block getPlatedBlock() {
        return platedBlock.getValue();
    }

    public Block getCutBlock() {
        return cutBlock.getValue();
    }

    public Block getBricks() {
        return bricks.getValue();
    }

    public Block getTiles() {
        return tiles.getValue();
    }
}
