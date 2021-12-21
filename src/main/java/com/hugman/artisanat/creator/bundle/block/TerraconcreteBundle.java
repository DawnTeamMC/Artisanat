package com.hugman.artisanat.creator.bundle.block;

import com.hugman.dawn.api.creator.BlockCreator;
import com.hugman.dawn.api.creator.bundle.Bundle;
import com.hugman.dawn.api.creator.bundle.block.BSSBundle;
import com.hugman.dawn.api.util.DefaultBlockBuilders;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class TerraconcreteBundle extends Bundle {
	private final BlockCreator slab, stairs, wall, pressurePlate, button;

	public TerraconcreteBundle(BlockCreator.Builder builder) {
		this.slab = put(builder.copy(builder.getName() + "_slab").from(DefaultBlockBuilders.SLAB).build());
		this.stairs = put(builder.copy(builder.getName() + "_stairs").from(DefaultBlockBuilders.STAIRS).build());
		this.wall = put(builder.copy(builder.getName() + "_wall").from(DefaultBlockBuilders.WALL).build());
		this.pressurePlate = put(builder.copy(builder.getName() + "_pressure_plate").from(DefaultBlockBuilders.STONE_PRESSURE_PLATE).build());
		this.button = put(builder.copy(builder.getName() + "_button").from(DefaultBlockBuilders.STONE_BUTTON).build());
	}

	public Block getSlab() {
		return slab.getValue();
	}

	public Block getStairs() {
		return stairs.getValue();
	}

	public Block getWall() {
		return wall.getValue();
	}

	public Block getPressurePlate() {
		return pressurePlate.getValue();
	}

	public Block getButton() {
		return button.getValue();
	}
}
