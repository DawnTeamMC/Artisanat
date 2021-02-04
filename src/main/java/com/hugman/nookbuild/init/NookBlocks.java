package com.hugman.nookbuild.init;

import com.hugman.dawn.api.creator.BlockCreator;
import com.hugman.dawn.api.creator.pack.block.MSBlockPack;
import com.hugman.dawn.api.creator.pack.block.MSCBlockPack;
import com.hugman.dawn.api.util.DefaultBlockGetter;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class NookBlocks extends NookPack {
	public static void init() {
	}

	public static final Block DARK_PRISMARINE_WALL = register(new BlockCreator.Builder("dark_prismarine", DefaultBlockGetter.WALL, FabricBlockSettings.copyOf(Blocks.DARK_PRISMARINE)));

	public static final MSBlockPack OAK_WOOD_BLOCKS = register(new MSBlockPack.Builder("oak_wood", FabricBlockSettings.copyOf(Blocks.OAK_WOOD), DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.WOOD_BUTTON));
	public static final MSBlockPack SPRUCE_WOOD_BLOCKS = register(new MSBlockPack.Builder("spruce_wood", FabricBlockSettings.copyOf(Blocks.SPRUCE_WOOD), DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.WOOD_BUTTON));
	public static final MSBlockPack BIRCH_WOOD_BLOCKS = register(new MSBlockPack.Builder("birch_wood", FabricBlockSettings.copyOf(Blocks.BIRCH_WOOD), DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.WOOD_BUTTON));
	public static final MSBlockPack JUNGLE_WOOD_BLOCKS = register(new MSBlockPack.Builder("jungle_wood", FabricBlockSettings.copyOf(Blocks.JUNGLE_WOOD), DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.WOOD_BUTTON));
	public static final MSBlockPack ACACIA_WOOD_BLOCKS = register(new MSBlockPack.Builder("acacia_wood", FabricBlockSettings.copyOf(Blocks.ACACIA_WOOD), DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.WOOD_BUTTON));
	public static final MSBlockPack DARK_OAK_WOOD_BLOCKS = register(new MSBlockPack.Builder("dark_oak_wood", FabricBlockSettings.copyOf(Blocks.DARK_OAK_WOOD), DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.WOOD_BUTTON));
	public static final MSBlockPack CRIMSON_HYPHAE_BLOCKS = register(new MSBlockPack.Builder("crimson_hyphae", FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE), DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.WOOD_BUTTON));
	public static final MSBlockPack WARPED_HYPHAE_BLOCKS = register(new MSBlockPack.Builder("warped_hyphae", FabricBlockSettings.copyOf(Blocks.WARPED_HYPHAE), DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.WOOD_BUTTON));

	public static final MSBlockPack COBBLESTONE_BRICKS = register(new MSBlockPack.Builder("cobblestone_bricks", FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.WALL));
	public static final MSBlockPack MOSSY_COBBLESTONE_BRICKS = register(new MSBlockPack.Builder("mossy_cobblestone_bricks", FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.WALL));
	public static final MSBlockPack GRANITE_BRICKS = register(new MSBlockPack.Builder("granite_bricks", FabricBlockSettings.copyOf(Blocks.GRANITE), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.WALL));
	public static final MSBlockPack DIORITE_BRICKS = register(new MSBlockPack.Builder("diorite_bricks", FabricBlockSettings.copyOf(Blocks.DIORITE), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.WALL));
	public static final MSBlockPack ANDESITE_BRICKS = register(new MSBlockPack.Builder("andesite_bricks", FabricBlockSettings.copyOf(Blocks.ANDESITE), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.WALL));

	public static final MSBlockPack SANDSTONE_BRICKS = register(new MSBlockPack.Builder("sandstone_bricks", FabricBlockSettings.copyOf(Blocks.SANDSTONE), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.WALL));
	public static final MSBlockPack POLISHED_SANDSTONE = register(new MSBlockPack.Builder("polished_sandstone", FabricBlockSettings.copyOf(Blocks.SANDSTONE), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB));
	public static final MSBlockPack RED_SANDSTONE_BRICKS = register(new MSBlockPack.Builder("red_sandstone_bricks", FabricBlockSettings.copyOf(Blocks.RED_SANDSTONE), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.WALL));
	public static final MSBlockPack POLISHED_RED_SANDSTONE = register(new MSBlockPack.Builder("polished_red_sandstone", FabricBlockSettings.copyOf(Blocks.RED_SANDSTONE), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB));

	public static final MSBlockPack SMOOTH_STONE_PAVING = register(new MSBlockPack.Builder("smooth_stone_paving", FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB));
	public static final MSBlockPack CHISELED_PRISMARINE = register(new MSBlockPack.Builder("chiseled_prismarine", FabricBlockSettings.copyOf(Blocks.PRISMARINE), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.WALL));
	public static final MSBlockPack PRISMARINE_BRICK_PAVING = register(new MSBlockPack.Builder("prismarine_brick_paving", FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB));

	public static final MSCBlockPack STAINED_BRICK_BLOCKS = register(new MSCBlockPack.Builder("bricks", FabricBlockSettings.copyOf(Blocks.BRICKS), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.WALL));
	public static final MSBlockPack BRICK_TILE_BLOCKS = register(new MSBlockPack.Builder("brick_tiles", FabricBlockSettings.copyOf(Blocks.BRICKS), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.WALL));
	public static final MSCBlockPack STAINED_BRICK_TILE_BLOCKS = register(new MSCBlockPack.Builder("brick_tiles", FabricBlockSettings.copyOf(Blocks.BRICKS), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.WALL));

	public static final MSBlockPack TERRACOTTA_BLOCKS = register(new MSBlockPack.Builder("terracotta", FabricBlockSettings.copyOf(Blocks.TERRACOTTA), DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.WALL, DefaultBlockGetter.STONE_PRESSURE_PLATE, DefaultBlockGetter.STONE_BUTTON));
	public static final MSCBlockPack STAINED_TERRACOTTA_BLOCKS = register(new MSCBlockPack.Builder("terracotta", FabricBlockSettings.copyOf(Blocks.TERRACOTTA), DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.WALL, DefaultBlockGetter.STONE_PRESSURE_PLATE, DefaultBlockGetter.STONE_BUTTON));
	public static final MSBlockPack TERRACOTTA_BRICKS = register(new MSBlockPack.Builder("terracotta_bricks", FabricBlockSettings.copyOf(Blocks.TERRACOTTA), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.WALL));
	public static final MSCBlockPack STAINED_TERRACOTTA_BRICKS = register(new MSCBlockPack.Builder("terracotta_bricks", FabricBlockSettings.copyOf(Blocks.TERRACOTTA), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.WALL));

	public static final MSCBlockPack DARK_PRISMARINE_BLOCKS = register(new MSCBlockPack.Builder("dark_prismarine", FabricBlockSettings.copyOf(Blocks.DARK_PRISMARINE), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.WALL));

	public static final MSCBlockPack CONCRETE_BLOCKS = register(new MSCBlockPack.Builder("concrete", FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE), DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.WALL, DefaultBlockGetter.STONE_PRESSURE_PLATE, DefaultBlockGetter.STONE_BUTTON));

	public static final MSCBlockPack QUARTZ_PAVING_BLOCKS = register(new MSCBlockPack.Builder("quartz_paving", FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB));
}
