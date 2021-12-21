package com.hugman.artisanat.creator.bundle.block;

import com.hugman.dawn.api.creator.BlockCreator;
import com.hugman.dawn.api.creator.bundle.Bundle;
import com.hugman.dawn.api.creator.bundle.block.BSSBundle;
import com.hugman.dawn.api.util.DefaultBlockBuilders;
import com.hugman.dawn.api.util.StringUtil;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;

public class WoodBlocksBundle extends Bundle {
	private final BlockCreator slab, stairs, button;

	public WoodBlocksBundle(BlockCreator.Builder builder) {
		this.slab = put(builder.copy(builder.getName() + "_slab").from(DefaultBlockBuilders.SLAB).build());
		this.stairs = put(builder.copy(builder.getName() + "_stairs").from(DefaultBlockBuilders.STAIRS).build());
		this.button = put(builder.copy(builder.getName() + "_button").from(DefaultBlockBuilders.WOOD_BUTTON).build());
	}

	public Block getSlab() {
		return slab.getValue();
	}

	public Block getStairs() {
		return stairs.getValue();
	}

	public Block getButton() {
		return button.getValue();
	}
}
