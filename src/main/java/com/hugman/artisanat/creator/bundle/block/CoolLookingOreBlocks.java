package com.hugman.artisanat.creator.bundle.block;

import com.hugman.dawn.api.creator.BlockCreator;
import com.hugman.dawn.api.creator.bundle.Bundle;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;

public class CoolLookingOreBlocks extends Bundle {
    private final BlockCreator platedBlock, cutBlock, bricks, tiles;

    public CoolLookingOreBlocks(String oreName, FabricBlockSettings settings) {
        this.platedBlock = new BlockCreator.Builder().blockProvider(Block::new).name("plated_" + oreName + "_block").settings(settings).itemGroup(ItemGroup.BUILDING_BLOCKS).build();
        this.cutBlock = new BlockCreator.Builder().blockProvider(Block::new).name("cut_" + oreName + "_block").settings(settings).itemGroup(ItemGroup.BUILDING_BLOCKS).build();
        this.bricks = new BlockCreator.Builder().blockProvider(Block::new).name(oreName + "_bricks").settings(settings).itemGroup(ItemGroup.BUILDING_BLOCKS).build();
        this.tiles = new BlockCreator.Builder().blockProvider(Block::new).name(oreName + "_tiles").settings(settings).itemGroup(ItemGroup.BUILDING_BLOCKS).build();
        put(this.platedBlock);
        put(this.cutBlock);
        put(this.bricks);
        put(this.tiles);
    }

    public BlockCreator getPlatedBlock() {
        return platedBlock;
    }

    public BlockCreator getCutBlock() {
        return cutBlock;
    }

    public Block getBricks() {
        return bricks.getValue();
    }

    public BlockCreator getTiles() {
        return tiles;
    }
}
