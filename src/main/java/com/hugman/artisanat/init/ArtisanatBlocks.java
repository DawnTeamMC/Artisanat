package com.hugman.artisanat.init;

import com.hugman.artisanat.creator.bundle.block.CopperBlocksBundle;
import com.hugman.artisanat.creator.bundle.block.MOreBlocksBundle;
import com.hugman.dawn.api.creator.BlockCreator;
import com.hugman.dawn.api.creator.bundle.block.MTBlockBundle;
import com.hugman.dawn.api.creator.bundle.block.MTCBlockBundle;
import com.hugman.dawn.api.util.DefaultBlockTemplates;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.RedstoneBlock;

public class ArtisanatBlocks extends ArtisanatBundle {
	public static final Block DARK_PRISMARINE_WALL = add(new BlockCreator.Builder("dark_prismarine", DefaultBlockTemplates.WALL, FabricBlockSettings.copyOf(Blocks.DARK_PRISMARINE)).build());
	public static final MTBlockBundle OAK_WOOD_BLOCKS = bundle(new MTBlockBundle(new BlockCreator.Builder().name("oak_wood").settings(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)), DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB, DefaultBlockTemplates.WOOD_BUTTON));
	public static final MTBlockBundle SPRUCE_WOOD_BLOCKS = bundle(new MTBlockBundle(new BlockCreator.Builder().name("spruce_wood").settings(FabricBlockSettings.copyOf(Blocks.SPRUCE_WOOD)), DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB, DefaultBlockTemplates.WOOD_BUTTON));
	public static final MTBlockBundle BIRCH_WOOD_BLOCKS = bundle(new MTBlockBundle(new BlockCreator.Builder().name("birch_wood").settings(FabricBlockSettings.copyOf(Blocks.BIRCH_WOOD)), DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB, DefaultBlockTemplates.WOOD_BUTTON));
	public static final MTBlockBundle JUNGLE_WOOD_BLOCKS = bundle(new MTBlockBundle(new BlockCreator.Builder().name("jungle_wood").settings(FabricBlockSettings.copyOf(Blocks.JUNGLE_WOOD)), DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB, DefaultBlockTemplates.WOOD_BUTTON));
	public static final MTBlockBundle ACACIA_WOOD_BLOCKS = bundle(new MTBlockBundle(new BlockCreator.Builder().name("acacia_wood").settings(FabricBlockSettings.copyOf(Blocks.ACACIA_WOOD)), DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB, DefaultBlockTemplates.WOOD_BUTTON));
	public static final MTBlockBundle DARK_OAK_WOOD_BLOCKS = bundle(new MTBlockBundle(new BlockCreator.Builder().name("dark_oak_wood").settings(FabricBlockSettings.copyOf(Blocks.DARK_OAK_WOOD)), DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB, DefaultBlockTemplates.WOOD_BUTTON));
	public static final MTBlockBundle CRIMSON_HYPHAE_BLOCKS = bundle(new MTBlockBundle(new BlockCreator.Builder().name("crimson_hyphae").settings(FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE)), DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB, DefaultBlockTemplates.WOOD_BUTTON));
	public static final MTBlockBundle WARPED_HYPHAE_BLOCKS = bundle(new MTBlockBundle(new BlockCreator.Builder().name("warped_hyphae").settings(FabricBlockSettings.copyOf(Blocks.WARPED_HYPHAE)), DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB, DefaultBlockTemplates.WOOD_BUTTON));
	public static final MTBlockBundle COBBLESTONE_BRICKS = bundle(new MTBlockBundle(new BlockCreator.Builder().name("cobblestone_bricks").settings(FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE)), DefaultBlockTemplates.CUBE, DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB, DefaultBlockTemplates.WALL));
	public static final MTBlockBundle MOSSY_COBBLESTONE_BRICKS = bundle(new MTBlockBundle(new BlockCreator.Builder().name("mossy_cobblestone_bricks").settings(FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE)), DefaultBlockTemplates.CUBE, DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB, DefaultBlockTemplates.WALL));
	public static final MTBlockBundle GRANITE_BRICKS = bundle(new MTBlockBundle(new BlockCreator.Builder().name("granite_bricks").settings(FabricBlockSettings.copyOf(Blocks.GRANITE)), DefaultBlockTemplates.CUBE, DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB, DefaultBlockTemplates.WALL));
	public static final MTBlockBundle DIORITE_BRICKS = bundle(new MTBlockBundle(new BlockCreator.Builder().name("diorite_bricks").settings(FabricBlockSettings.copyOf(Blocks.DIORITE)), DefaultBlockTemplates.CUBE, DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB, DefaultBlockTemplates.WALL));
	public static final MTBlockBundle ANDESITE_BRICKS = bundle(new MTBlockBundle(new BlockCreator.Builder().name("andesite_bricks").settings(FabricBlockSettings.copyOf(Blocks.ANDESITE)), DefaultBlockTemplates.CUBE, DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB, DefaultBlockTemplates.WALL));
	public static final MTBlockBundle SANDSTONE_BRICKS = bundle(new MTBlockBundle(new BlockCreator.Builder().name("sandstone_bricks").settings(FabricBlockSettings.copyOf(Blocks.SANDSTONE)), DefaultBlockTemplates.CUBE, DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB, DefaultBlockTemplates.WALL));
	public static final MTBlockBundle POLISHED_SANDSTONE = bundle(new MTBlockBundle(new BlockCreator.Builder().name("polished_sandstone").settings(FabricBlockSettings.copyOf(Blocks.SANDSTONE)), DefaultBlockTemplates.CUBE, DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB));
	public static final MTBlockBundle RED_SANDSTONE_BRICKS = bundle(new MTBlockBundle(new BlockCreator.Builder().name("red_sandstone_bricks").settings(FabricBlockSettings.copyOf(Blocks.RED_SANDSTONE)), DefaultBlockTemplates.CUBE, DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB, DefaultBlockTemplates.WALL));
	public static final MTBlockBundle POLISHED_RED_SANDSTONE = bundle(new MTBlockBundle(new BlockCreator.Builder().name("polished_red_sandstone").settings(FabricBlockSettings.copyOf(Blocks.RED_SANDSTONE)), DefaultBlockTemplates.CUBE, DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB));
	public static final MTBlockBundle SMOOTH_STONE_PAVING = bundle(new MTBlockBundle(new BlockCreator.Builder().name("smooth_stone_paving").settings(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)), DefaultBlockTemplates.CUBE, DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB));
	public static final MTBlockBundle CHISELED_PRISMARINE = bundle(new MTBlockBundle(new BlockCreator.Builder().name("chiseled_prismarine").settings(FabricBlockSettings.copyOf(Blocks.PRISMARINE)), DefaultBlockTemplates.CUBE, DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB, DefaultBlockTemplates.WALL));
	public static final MTBlockBundle PRISMARINE_BRICK_PAVING = bundle(new MTBlockBundle(new BlockCreator.Builder().name("prismarine_brick_paving").settings(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)), DefaultBlockTemplates.CUBE, DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB));
	public static final MTCBlockBundle STAINED_BRICK_BLOCKS = bundle(new MTCBlockBundle(new BlockCreator.Builder().name("bricks").settings(FabricBlockSettings.copyOf(Blocks.BRICKS)), DefaultBlockTemplates.CUBE, DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB, DefaultBlockTemplates.WALL));
	public static final MTBlockBundle BRICK_TILE_BLOCKS = bundle(new MTBlockBundle(new BlockCreator.Builder().name("brick_tiles").settings(FabricBlockSettings.copyOf(Blocks.BRICKS)), DefaultBlockTemplates.CUBE, DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB, DefaultBlockTemplates.WALL));
	public static final MTCBlockBundle STAINED_BRICK_TILE_BLOCKS = bundle(new MTCBlockBundle(new BlockCreator.Builder().name("brick_tiles").settings(FabricBlockSettings.copyOf(Blocks.BRICKS)), DefaultBlockTemplates.CUBE, DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB, DefaultBlockTemplates.WALL));
	public static final MTBlockBundle TERRACOTTA_BLOCKS = bundle(new MTBlockBundle(new BlockCreator.Builder().name("terracotta").settings(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)), DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB, DefaultBlockTemplates.WALL, DefaultBlockTemplates.STONE_PRESSURE_PLATE, DefaultBlockTemplates.STONE_BUTTON));
	public static final MTCBlockBundle STAINED_TERRACOTTA_BLOCKS = bundle(new MTCBlockBundle(new BlockCreator.Builder().name("terracotta").settings(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)), DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB, DefaultBlockTemplates.WALL, DefaultBlockTemplates.STONE_PRESSURE_PLATE, DefaultBlockTemplates.STONE_BUTTON));
	public static final MTBlockBundle TERRACOTTA_BRICKS = bundle(new MTBlockBundle(new BlockCreator.Builder().name("terracotta_bricks").settings(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)), DefaultBlockTemplates.CUBE, DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB, DefaultBlockTemplates.WALL));
	public static final MTCBlockBundle STAINED_TERRACOTTA_BRICKS = bundle(new MTCBlockBundle(new BlockCreator.Builder().name("terracotta_bricks").settings(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)), DefaultBlockTemplates.CUBE, DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB, DefaultBlockTemplates.WALL));
	public static final MTCBlockBundle STAINED_DARK_PRISMARINE_BLOCKS = bundle(new MTCBlockBundle(new BlockCreator.Builder().name("dark_prismarine").settings(FabricBlockSettings.copyOf(Blocks.DARK_PRISMARINE)), DefaultBlockTemplates.CUBE, DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB, DefaultBlockTemplates.WALL));
	public static final MTCBlockBundle CONCRETE_BLOCKS = bundle(new MTCBlockBundle(new BlockCreator.Builder().name("concrete").settings(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)), DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB, DefaultBlockTemplates.WALL, DefaultBlockTemplates.STONE_PRESSURE_PLATE, DefaultBlockTemplates.STONE_BUTTON));
	public static final MTCBlockBundle QUARTZ_PAVING_BLOCKS = bundle(new MTCBlockBundle(new BlockCreator.Builder().name("quartz_paving").settings(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)), DefaultBlockTemplates.CUBE, DefaultBlockTemplates.STAIRS, DefaultBlockTemplates.SLAB));

	public static final MOreBlocksBundle COAL_BLOCKS = bundle(new MOreBlocksBundle("coal", FabricBlockSettings.copyOf(Blocks.COAL_BLOCK)));
	public static final CopperBlocksBundle COPPER_BLOCKS = bundle(new CopperBlocksBundle());
	public static final MOreBlocksBundle IRON_BLOCKS = bundle(new MOreBlocksBundle("iron", FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
	public static final MOreBlocksBundle GOLD_BLOCKS = bundle(new MOreBlocksBundle("gold", FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
	public static final MOreBlocksBundle LAPIS_BLOCKS = bundle(new MOreBlocksBundle("lapis", FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK)));
	public static final MOreBlocksBundle REDSTONE_BLOCKS = bundle(new MOreBlocksBundle("redstone", FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK), RedstoneBlock::new));
	public static final MOreBlocksBundle EMERALD_BLOCKS = bundle(new MOreBlocksBundle("emerald", FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
	public static final MOreBlocksBundle DIAMOND_BLOCKS = bundle(new MOreBlocksBundle("diamond", FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
	public static final MOreBlocksBundle NETHERITE_BLOCKS = bundle(new MOreBlocksBundle("netherite", FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));

	public static void init() {
	}
}