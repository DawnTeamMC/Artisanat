package com.hugman.artisanat.creator.bundle.block;

import com.hugman.dawn.api.creator.BlockCreator;
import com.hugman.dawn.api.creator.bundle.Bundle;
import com.hugman.dawn.api.creator.bundle.block.BSSBundle;
import com.hugman.dawn.api.creator.bundle.block.BSSWBundle;
import net.minecraft.block.Block;
import net.minecraft.util.DyeColor;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ColoredBSSBundle extends Bundle {
	private final Map<DyeColor, BSSBundle> map = new HashMap<>();

	public ColoredBSSBundle(BlockCreator.Builder builder) {
		this(color -> new BSSBundle(builder.copy().name(color.getName() + "_" + builder.getName())));
	}

	public ColoredBSSBundle(Function<DyeColor, BSSBundle> function) {
		for(DyeColor color : DyeColor.values()) {
			map.put(color, put(function.apply(color)));
		}
	}

	public Block getBlock(DyeColor color) {
		return map.get(color).getBlock();
	}

	public Block getSlab(DyeColor color) {
		return map.get(color).getSlab();
	}

	public Block getStairs(DyeColor color) {
		return map.get(color).getStairs();
	}
}
