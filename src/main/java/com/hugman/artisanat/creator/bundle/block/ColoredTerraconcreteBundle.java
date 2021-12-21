package com.hugman.artisanat.creator.bundle.block;

import com.hugman.dawn.api.creator.BlockCreator;
import com.hugman.dawn.api.creator.bundle.Bundle;
import net.minecraft.block.Block;
import net.minecraft.util.DyeColor;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ColoredTerraconcreteBundle extends Bundle {
	private final Map<DyeColor, TerraconcreteBundle> map = new HashMap<>();

	public ColoredTerraconcreteBundle(BlockCreator.Builder builder) {
		this(color -> new TerraconcreteBundle(builder.copy().name(color.getName() + "_" + builder.getName())));
	}

	public ColoredTerraconcreteBundle(Function<DyeColor, TerraconcreteBundle> function) {
		for(DyeColor color : DyeColor.values()) {
			map.put(color, put(function.apply(color)));
		}
	}
	public Block getSlab(DyeColor color) {
		return map.get(color).getSlab();
	}

	public Block getStairs(DyeColor color) {
		return map.get(color).getStairs();
	}

	public Block getWall(DyeColor color) {
		return map.get(color).getWall();
	}

	public Block getPressurePlate(DyeColor color) {
		return map.get(color).getPressurePlate();
	}

	public Block getButton(DyeColor color) {
		return map.get(color).getButton();
	}
}
