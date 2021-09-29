package com.hugman.artisanat.creator.bundle.block;

import com.hugman.dawn.api.creator.BlockCreator;
import com.hugman.dawn.api.creator.bundle.Bundle;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;

public class MOreBlocksBundle extends Bundle {
    private final BlockCreator platedBlock, cutBlock, bricks, tiles;

    public MOreBlocksBundle(String oreName, FabricBlockSettings settings) {
        BlockCreator.Builder builder = new BlockCreator.Builder().blockProvider(Block::new).settings(settings).itemGroup(ItemGroup.BUILDING_BLOCKS);
        this.platedBlock = put(builder.name("plated_" + oreName + "_block").build());
        this.cutBlock = put(builder.name("cut_" + oreName + "_block").build());
        this.bricks = put(builder.name(oreName + "_bricks").build());
        this.tiles = put(builder.name(oreName + "_tiles").build());
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
