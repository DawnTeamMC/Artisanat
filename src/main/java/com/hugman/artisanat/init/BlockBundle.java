package com.hugman.artisanat.init;

import com.hugman.artisanat.creator.bundle.block.*;
import com.hugman.dawn.api.creator.BlockCreator;
import com.hugman.dawn.api.creator.bundle.block.BSSBundle;
import com.hugman.dawn.api.creator.bundle.block.BSSWBundle;
import com.hugman.dawn.api.util.DefaultBlockBuilders;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.RedstoneBlock;

public class BlockBundle extends ArtisanatBundle {
	public static final Block DARK_PRISMARINE_WALL = add(DefaultBlockBuilders.WALL.copy("dark_prismarine_wall").settings(FabricBlockSettings.copyOf(Blocks.DARK_PRISMARINE)).build());

	public static final WoodBlocksBundle OAK_WOOD_BLOCKS = creator(new WoodBlocksBundle(new BlockCreator.Builder().name("oak_wood").settings(FabricBlockSettings.copyOf(Blocks.OAK_WOOD))));
	public static final WoodBlocksBundle SPRUCE_WOOD_BLOCKS = creator(new WoodBlocksBundle(new BlockCreator.Builder().name("spruce_wood").settings(FabricBlockSettings.copyOf(Blocks.SPRUCE_WOOD))));
	public static final WoodBlocksBundle BIRCH_WOOD_BLOCKS = creator(new WoodBlocksBundle(new BlockCreator.Builder().name("birch_wood").settings(FabricBlockSettings.copyOf(Blocks.BIRCH_WOOD))));
	public static final WoodBlocksBundle JUNGLE_WOOD_BLOCKS = creator(new WoodBlocksBundle(new BlockCreator.Builder().name("jungle_wood").settings(FabricBlockSettings.copyOf(Blocks.JUNGLE_WOOD))));
	public static final WoodBlocksBundle ACACIA_WOOD_BLOCKS = creator(new WoodBlocksBundle(new BlockCreator.Builder().name("acacia_wood").settings(FabricBlockSettings.copyOf(Blocks.ACACIA_WOOD))));
	public static final WoodBlocksBundle DARK_OAK_WOOD_BLOCKS = creator(new WoodBlocksBundle(new BlockCreator.Builder().name("dark_oak_wood").settings(FabricBlockSettings.copyOf(Blocks.DARK_OAK_WOOD))));
	public static final WoodBlocksBundle CRIMSON_HYPHAE_BLOCKS = creator(new WoodBlocksBundle(new BlockCreator.Builder().name("crimson_hyphae").settings(FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE))));
	public static final WoodBlocksBundle WARPED_HYPHAE_BLOCKS = creator(new WoodBlocksBundle(new BlockCreator.Builder().name("warped_hyphae").settings(FabricBlockSettings.copyOf(Blocks.WARPED_HYPHAE))));

	public static final BSSWBundle COBBLESTONE_BRICKS = creator(new BSSWBundle(new BlockCreator.Builder().name("cobblestone_bricks").settings(FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE))));
	public static final BSSWBundle MOSSY_COBBLESTONE_BRICKS = creator(new BSSWBundle(new BlockCreator.Builder().name("mossy_cobblestone_bricks").settings(FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE))));

	public static final BSSWBundle GRANITE_BRICKS = creator(new BSSWBundle(new BlockCreator.Builder().name("granite_bricks").settings(FabricBlockSettings.copyOf(Blocks.GRANITE))));
	public static final BSSWBundle DIORITE_BRICKS = creator(new BSSWBundle(new BlockCreator.Builder().name("diorite_bricks").settings(FabricBlockSettings.copyOf(Blocks.DIORITE))));
	public static final BSSWBundle ANDESITE_BRICKS = creator(new BSSWBundle(new BlockCreator.Builder().name("andesite_bricks").settings(FabricBlockSettings.copyOf(Blocks.ANDESITE))));

	public static final BSSWBundle SANDSTONE_BRICKS = creator(new BSSWBundle(new BlockCreator.Builder().name("sandstone_bricks").settings(FabricBlockSettings.copyOf(Blocks.SANDSTONE))));
	public static final BSSBundle POLISHED_SANDSTONE = creator(new BSSBundle(new BlockCreator.Builder().name("polished_sandstone").settings(FabricBlockSettings.copyOf(Blocks.SANDSTONE))));
	public static final BSSWBundle RED_SANDSTONE_BRICKS = creator(new BSSWBundle(new BlockCreator.Builder().name("red_sandstone_bricks").settings(FabricBlockSettings.copyOf(Blocks.RED_SANDSTONE))));
	public static final BSSBundle POLISHED_RED_SANDSTONE = creator(new BSSBundle(new BlockCreator.Builder().name("polished_red_sandstone").settings(FabricBlockSettings.copyOf(Blocks.RED_SANDSTONE))));
	public static final BSSBundle SMOOTH_STONE_PAVING = creator(new BSSBundle(new BlockCreator.Builder().name("smooth_stone_paving").settings(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE))));
	public static final BSSWBundle CHISELED_PRISMARINE = creator(new BSSWBundle(new BlockCreator.Builder().name("chiseled_prismarine").settings(FabricBlockSettings.copyOf(Blocks.PRISMARINE))));
	public static final BSSBundle PRISMARINE_BRICK_PAVING = creator(new BSSBundle(new BlockCreator.Builder().name("prismarine_brick_paving").settings(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS))));

	public static final ColoredBSSWBundle STAINED_BRICK_BLOCKS = creator(new ColoredBSSWBundle(new BlockCreator.Builder().name("bricks").settings(FabricBlockSettings.copyOf(Blocks.BRICKS))));
	public static final BSSWBundle BRICK_TILE_BLOCKS = creator(new BSSWBundle(new BlockCreator.Builder().name("brick_tiles").settings(FabricBlockSettings.copyOf(Blocks.BRICKS))));
	public static final ColoredBSSWBundle STAINED_BRICK_TILE_BLOCKS = creator(new ColoredBSSWBundle(new BlockCreator.Builder().name("brick_tiles").settings(FabricBlockSettings.copyOf(Blocks.BRICKS))));

	public static final TerraconcreteBundle TERRACOTTA_BLOCKS = creator(new TerraconcreteBundle(new BlockCreator.Builder().name("terracotta").settings(FabricBlockSettings.copyOf(Blocks.TERRACOTTA))));
	public static final ColoredTerraconcreteBundle STAINED_TERRACOTTA_BLOCKS = creator(new ColoredTerraconcreteBundle(new BlockCreator.Builder().name("terracotta").settings(FabricBlockSettings.copyOf(Blocks.TERRACOTTA))));
	public static final BSSWBundle TERRACOTTA_BRICKS = creator(new BSSWBundle(new BlockCreator.Builder().name("terracotta_bricks").settings(FabricBlockSettings.copyOf(Blocks.TERRACOTTA))));
	public static final ColoredBSSWBundle STAINED_TERRACOTTA_BRICKS = creator(new ColoredBSSWBundle(new BlockCreator.Builder().name("terracotta_bricks").settings(FabricBlockSettings.copyOf(Blocks.TERRACOTTA))));

	public static final ColoredBSSWBundle STAINED_DARK_PRISMARINE_BLOCKS = creator(new ColoredBSSWBundle(new BlockCreator.Builder().name("dark_prismarine").settings(FabricBlockSettings.copyOf(Blocks.DARK_PRISMARINE))));

	public static final ColoredTerraconcreteBundle CONCRETE_BLOCKS = creator(new ColoredTerraconcreteBundle(new BlockCreator.Builder().name("concrete").settings(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE))));
	public static final ColoredBSSBundle QUARTZ_PAVING_BLOCKS = creator(new ColoredBSSBundle(new BlockCreator.Builder().name("quartz_paving").settings(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK))));

	public static final MOreBlocksBundle COAL_BLOCKS = creator(new MOreBlocksBundle("coal", FabricBlockSettings.copyOf(Blocks.COAL_BLOCK)));
	public static final CopperBlocksBundle COPPER_BLOCKS = creator(new CopperBlocksBundle());
	public static final MOreBlocksBundle IRON_BLOCKS = creator(new MOreBlocksBundle("iron", FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
	public static final MOreBlocksBundle GOLD_BLOCKS = creator(new MOreBlocksBundle("gold", FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
	public static final MOreBlocksBundle LAPIS_BLOCKS = creator(new MOreBlocksBundle("lapis", FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK)));
	public static final MOreBlocksBundle REDSTONE_BLOCKS = creator(new MOreBlocksBundle("redstone", FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK), RedstoneBlock::new));
	public static final MOreBlocksBundle EMERALD_BLOCKS = creator(new MOreBlocksBundle("emerald", FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
	public static final MOreBlocksBundle DIAMOND_BLOCKS = creator(new MOreBlocksBundle("diamond", FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
	public static final MOreBlocksBundle NETHERITE_BLOCKS = creator(new MOreBlocksBundle("netherite", FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
}