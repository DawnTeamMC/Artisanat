package com.hugman.nookbuild.init.client;

import com.hugman.nookbuild.init.NookBlockPack;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.color.world.GrassColors;

@Environment(EnvType.CLIENT)
public class NookColorMaps {
	public static void registerColors() {
		registerBlockColors();
		registerItemColors();
	}

	private static void registerBlockColors() {
		ColorProviderRegistry.BLOCK.register((block, pos, world, layer) -> FoliageColors.getSpruceColor(), NookBlockPack.SPRUCE_LEAF_PILE);
		ColorProviderRegistry.BLOCK.register((block, pos, world, layer) -> FoliageColors.getBirchColor(), NookBlockPack.BIRCH_LEAF_PILE);
		ColorProviderRegistry.BLOCK.register((block, pos, world, layer) -> pos != null && world != null ? BiomeColors.getFoliageColor(pos, world) : FoliageColors.getDefaultColor(), NookBlockPack.OAK_LEAF_PILE, NookBlockPack.JUNGLE_LEAF_PILE, NookBlockPack.ACACIA_LEAF_PILE, NookBlockPack.DARK_OAK_LEAF_PILE);
	}

	private static void registerItemColors() {
		ColorProviderRegistry.ITEM.register((item, layer) -> GrassColors.getColor(0.5D, 1.0D), NookBlockPack.OAK_LEAF_PILE, NookBlockPack.SPRUCE_LEAF_PILE, NookBlockPack.BIRCH_LEAF_PILE, NookBlockPack.JUNGLE_LEAF_PILE, NookBlockPack.ACACIA_LEAF_PILE, NookBlockPack.DARK_OAK_LEAF_PILE);
	}
}
