package com.hugman.nookbuild.init;

import com.hugman.dawn.api.creator.BlockCreator;
import com.hugman.dawn.api.creator.pack.block.MSBlockPack;
import com.hugman.dawn.api.creator.pack.block.MSCBlockPack;
import com.hugman.dawn.api.util.BlockSettings;
import com.hugman.dawn.api.util.DefaultBlockGetter;
import com.hugman.nookbuild.object.block.WitherRosePileBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MaterialColor;
import net.minecraft.item.ItemGroup;

public class NookBlockPack extends NookPack {
	public static final Block OAK_VERTICAL_SLAB = register(new BlockCreator.Builder("oak", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.OAK_SLAB)).flammability(5, 20));
	public static final Block SPRUCE_VERTICAL_SLAB = register(new BlockCreator.Builder("spruce", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.SPRUCE_SLAB)).flammability(5, 20));
	public static final Block BIRCH_VERTICAL_SLAB = register(new BlockCreator.Builder("birch", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.BIRCH_SLAB)).flammability(5, 20));
	public static final Block JUNGLE_VERTICAL_SLAB = register(new BlockCreator.Builder("jungle", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.JUNGLE_SLAB)).flammability(5, 20));
	public static final Block ACACIA_VERTICAL_SLAB = register(new BlockCreator.Builder("acacia", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.ACACIA_SLAB)).flammability(5, 20));
	public static final Block DARK_OAK_VERTICAL_SLAB = register(new BlockCreator.Builder("dark_oak", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.DARK_OAK_SLAB)).flammability(5, 20));
	public static final Block CRIMSON_VERTICAL_SLAB = register(new BlockCreator.Builder("crimson", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.CRIMSON_SLAB)));
	public static final Block WARPED_VERTICAL_SLAB = register(new BlockCreator.Builder("warped", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.WARPED_SLAB)));
	public static final Block STONE_VERTICAL_SLAB = register(new BlockCreator.Builder("stone", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block SMOOTH_STONE_VERTICAL_SLAB = register(new BlockCreator.Builder("smooth_stone", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
	public static final Block COBBLESTONE_VERTICAL_SLAB = register(new BlockCreator.Builder("cobblestone", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block MOSSY_COBBLESTONE_VERTICAL_SLAB = register(new BlockCreator.Builder("mossy_cobblestone", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE_SLAB)));
	public static final Block STONE_BRICK_VERTICAL_SLAB = register(new BlockCreator.Builder("stone_brick", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
	public static final Block MOSSY_STONE_BRICK_VERTICAL_SLAB = register(new BlockCreator.Builder("mossy_stone_brick", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_SLAB)));
	public static final Block GRANITE_VERTICAL_SLAB = register(new BlockCreator.Builder("granite", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.GRANITE_SLAB)));
	public static final Block POLISHED_GRANITE_VERTICAL_SLAB = register(new BlockCreator.Builder("polished_granite", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE_SLAB)));
	public static final Block DIORITE_VERTICAL_SLAB = register(new BlockCreator.Builder("diorite", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.DIORITE_SLAB)));
	public static final Block POLISHED_DIORITE_VERTICAL_SLAB = register(new BlockCreator.Builder("polished_diorite", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE_SLAB)));
	public static final Block ANDESITE_VERTICAL_SLAB = register(new BlockCreator.Builder("andesite", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.ANDESITE_SLAB)));
	public static final Block POLISHED_ANDESITE_VERTICAL_SLAB = register(new BlockCreator.Builder("polished_andesite", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE_SLAB)));
	public static final Block BRICK_VERTICAL_SLAB = register(new BlockCreator.Builder("brick", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.BRICK_SLAB)));
	public static final Block SANDSTONE_VERTICAL_SLAB = register(new BlockCreator.Builder("sandstone", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.SANDSTONE_SLAB)));
	public static final Block CUT_SANDSTONE_VERTICAL_SLAB = register(new BlockCreator.Builder("cut_sandstone", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE_SLAB)));
	public static final Block SMOOTH_SANDSTONE_VERTICAL_SLAB = register(new BlockCreator.Builder("smooth_sandstone", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE_SLAB)));
	public static final Block RED_SANDSTONE_VERTICAL_SLAB = register(new BlockCreator.Builder("red_sandstone", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.RED_SANDSTONE_SLAB)));
	public static final Block CUT_RED_SANDSTONE_VERTICAL_SLAB = register(new BlockCreator.Builder("cut_red_sandstone", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE_SLAB)));
	public static final Block SMOOTH_RED_SANDSTONE_VERTICAL_SLAB = register(new BlockCreator.Builder("smooth_red_sandstone", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.SMOOTH_RED_SANDSTONE_SLAB)));
	public static final Block NETHER_BRICK_VERTICAL_SLAB = register(new BlockCreator.Builder("nether_brick", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.NETHER_BRICK_SLAB)));
	public static final Block RED_NETHER_BRICK_VERTICAL_SLAB = register(new BlockCreator.Builder("red_nether_brick", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICK_SLAB)));
	public static final Block QUARTZ_VERTICAL_SLAB = register(new BlockCreator.Builder("quartz", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.QUARTZ_SLAB)));
	public static final Block SMOOTH_QUARTZ_VERTICAL_SLAB = register(new BlockCreator.Builder("smooth_quartz", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.SMOOTH_QUARTZ_SLAB)));
	public static final Block END_STONE_BRICK_VERTICAL_SLAB = register(new BlockCreator.Builder("end_stone_brick", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.END_STONE_BRICK_SLAB)));
	public static final Block PURPUR_VERTICAL_SLAB = register(new BlockCreator.Builder("purpur", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.PURPUR_SLAB)));
	public static final Block PRISMARINE_VERTICAL_SLAB = register(new BlockCreator.Builder("prismarine", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.PRISMARINE_SLAB)));
	public static final Block PRISMARINE_BRICK_VERTICAL_SLAB = register(new BlockCreator.Builder("prismarine_brick", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICK_SLAB)));
	public static final Block DARK_PRISMARINE_VERTICAL_SLAB = register(new BlockCreator.Builder("dark_prismarine", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.DARK_PRISMARINE_SLAB)));
	public static final Block BLACKSTONE_VERTICAL_SLAB = register(new BlockCreator.Builder("blackstone", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.BLACKSTONE_SLAB)));
	public static final Block POLISHED_BLACKSTONE_VERTICAL_SLAB = register(new BlockCreator.Builder("polished_blackstone", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_SLAB)));
	public static final Block POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB = register(new BlockCreator.Builder("polished_blackstone_brick", DefaultBlockGetter.VERTICAL_SLAB, FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB)));

	public static final Block DARK_PRISMARINE_WALL = register(new BlockCreator.Builder("dark_prismarine", DefaultBlockGetter.WALL, FabricBlockSettings.copyOf(Blocks.DARK_PRISMARINE)));

	public static final MSBlockPack OAK_WOOD_BLOCKS = register(new MSBlockPack.Builder("oak_wood", FabricBlockSettings.copyOf(Blocks.OAK_WOOD), DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WOOD_BUTTON));
	public static final MSBlockPack SPRUCE_WOOD_BLOCKS = register(new MSBlockPack.Builder("spruce_wood", FabricBlockSettings.copyOf(Blocks.SPRUCE_WOOD), DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WOOD_BUTTON));
	public static final MSBlockPack BIRCH_WOOD_BLOCKS = register(new MSBlockPack.Builder("birch_wood", FabricBlockSettings.copyOf(Blocks.BIRCH_WOOD), DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WOOD_BUTTON));
	public static final MSBlockPack JUNGLE_WOOD_BLOCKS = register(new MSBlockPack.Builder("jungle_wood", FabricBlockSettings.copyOf(Blocks.JUNGLE_WOOD), DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WOOD_BUTTON));
	public static final MSBlockPack ACACIA_WOOD_BLOCKS = register(new MSBlockPack.Builder("acacia_wood", FabricBlockSettings.copyOf(Blocks.ACACIA_WOOD), DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WOOD_BUTTON));
	public static final MSBlockPack DARK_OAK_WOOD_BLOCKS = register(new MSBlockPack.Builder("dark_oak_wood", FabricBlockSettings.copyOf(Blocks.DARK_OAK_WOOD), DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WOOD_BUTTON));
	public static final MSBlockPack CRIMSON_HYPHAE_BLOCKS = register(new MSBlockPack.Builder("crimson_hyphae", FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE), DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WOOD_BUTTON));
	public static final MSBlockPack WARPED_HYPHAE_BLOCKS = register(new MSBlockPack.Builder("warped_hyphae", FabricBlockSettings.copyOf(Blocks.WARPED_HYPHAE), DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WOOD_BUTTON));

	public static final MSBlockPack COBBLESTONE_BRICKS = register(new MSBlockPack.Builder("cobblestone_bricks", FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL));
	public static final MSBlockPack MOSSY_COBBLESTONE_BRICKS = register(new MSBlockPack.Builder("mossy_cobblestone_bricks", FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL));
	public static final MSBlockPack GRANITE_BRICKS = register(new MSBlockPack.Builder("granite_bricks", FabricBlockSettings.copyOf(Blocks.GRANITE), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL));
	public static final MSBlockPack DIORITE_BRICKS = register(new MSBlockPack.Builder("diorite_bricks", FabricBlockSettings.copyOf(Blocks.DIORITE), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL));
	public static final MSBlockPack ANDESITE_BRICKS = register(new MSBlockPack.Builder("andesite_bricks", FabricBlockSettings.copyOf(Blocks.ANDESITE), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL));

	public static final MSBlockPack SANDSTONE_BRICKS = register(new MSBlockPack.Builder("sandstone_bricks", FabricBlockSettings.copyOf(Blocks.SANDSTONE), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL));
	public static final MSBlockPack POLISHED_SANDSTONE = register(new MSBlockPack.Builder("polished_sandstone", FabricBlockSettings.copyOf(Blocks.SANDSTONE), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB));
	public static final MSBlockPack RED_SANDSTONE_BRICKS = register(new MSBlockPack.Builder("red_sandstone_bricks", FabricBlockSettings.copyOf(Blocks.RED_SANDSTONE), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL));
	public static final MSBlockPack POLISHED_RED_SANDSTONE = register(new MSBlockPack.Builder("polished_red_sandstone", FabricBlockSettings.copyOf(Blocks.RED_SANDSTONE), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB));

	public static final MSBlockPack SMOOTH_STONE_PAVING = register(new MSBlockPack.Builder("smooth_stone_paving", FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB));
	public static final MSBlockPack CHISELED_PRISMARINE = register(new MSBlockPack.Builder("chiseled_prismarine", FabricBlockSettings.copyOf(Blocks.PRISMARINE), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL));
	public static final MSBlockPack PRISMARINE_BRICK_PAVING = register(new MSBlockPack.Builder("prismarine_brick_paving", FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB));

	public static final MSCBlockPack STAINED_BRICK_BLOCKS = register(new MSCBlockPack.Builder("bricks", Blocks.BRICKS, DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL));
	public static final MSBlockPack TERRACOTTA_BLOCKS = register(new MSBlockPack.Builder("terracotta", FabricBlockSettings.copyOf(Blocks.TERRACOTTA), DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL, DefaultBlockGetter.STONE_PRESSURE_PLATE, DefaultBlockGetter.STONE_BUTTON));
	public static final MSCBlockPack STAINED_TERRACOTTA_BLOCKS = register(new MSCBlockPack.Builder("terracotta", Blocks.TERRACOTTA, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL, DefaultBlockGetter.STONE_PRESSURE_PLATE, DefaultBlockGetter.STONE_BUTTON));
	public static final MSCBlockPack DARK_PRISMARINE_BLOCKS = register(new MSCBlockPack.Builder("dark_prismarine", Blocks.DARK_PRISMARINE, DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL));
	public static final MSCBlockPack CONCRETE_BLOCKS = register(new MSCBlockPack.Builder("concrete", Blocks.BLUE_CONCRETE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL, DefaultBlockGetter.STONE_PRESSURE_PLATE, DefaultBlockGetter.STONE_BUTTON));
	public static final MSCBlockPack QUARTZ_PAVING_BLOCKS = register(new MSCBlockPack.Builder("quartz_paving", Blocks.QUARTZ_BLOCK, DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB));

	public static final MSBlockPack BLUNITE_BLOCKS = register(new MSBlockPack.Builder("blunite", FabricBlockSettings.copyOf(Blocks.ANDESITE).materialColor(MaterialColor.LIGHT_BLUE_TERRACOTTA), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL));
	public static final MSBlockPack CARBONITE_BLOCKS = register(new MSBlockPack.Builder("carbonite", FabricBlockSettings.copyOf(Blocks.ANDESITE).materialColor(MaterialColor.BLACK), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL));
	public static final MSBlockPack POLISHED_BLUNITE = register(new MSBlockPack.Builder("polished_blunite", FabricBlockSettings.copyOf(BLUNITE_BLOCKS.getBlock(DefaultBlockGetter.CUBE)), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB));
	public static final MSBlockPack POLISHED_CARBONITE = register(new MSBlockPack.Builder("polished_carbonite", FabricBlockSettings.copyOf(CARBONITE_BLOCKS.getBlock(DefaultBlockGetter.CUBE)), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB));

	public static final Block OAK_LEAF_PILE = register(new BlockCreator.Builder("oak", DefaultBlockGetter.LEAF_PILE, BlockSettings.LEAF_PILE).flammability(30, 60));
	public static final Block SPRUCE_LEAF_PILE = register(new BlockCreator.Builder("spruce", DefaultBlockGetter.LEAF_PILE, BlockSettings.LEAF_PILE).flammability(30, 60));
	public static final Block BIRCH_LEAF_PILE = register(new BlockCreator.Builder("birch", DefaultBlockGetter.LEAF_PILE, BlockSettings.LEAF_PILE).flammability(30, 60));
	public static final Block JUNGLE_LEAF_PILE = register(new BlockCreator.Builder("jungle", DefaultBlockGetter.LEAF_PILE, BlockSettings.LEAF_PILE).flammability(30, 60));
	public static final Block ACACIA_LEAF_PILE = register(new BlockCreator.Builder("acacia", DefaultBlockGetter.LEAF_PILE, BlockSettings.LEAF_PILE).flammability(30, 60));
	public static final Block DARK_OAK_LEAF_PILE = register(new BlockCreator.Builder("dark_oak", DefaultBlockGetter.LEAF_PILE, BlockSettings.LEAF_PILE).flammability(30, 60));

	public static final Block DANDELION_PILE = register(new BlockCreator.Builder("dandelion", DefaultBlockGetter.PLANT_PILE, BlockSettings.FLOWER_PILE).flammability(60, 100));
	public static final Block POPPY_PILE = register(new BlockCreator.Builder("poppy", DefaultBlockGetter.PLANT_PILE, BlockSettings.FLOWER_PILE).flammability(60, 100));
	public static final Block BLUE_ORCHID_PILE = register(new BlockCreator.Builder("blue_orchid", DefaultBlockGetter.PLANT_PILE, BlockSettings.FLOWER_PILE).flammability(60, 100));
	public static final Block ALLIUM_PILE = register(new BlockCreator.Builder("allium", DefaultBlockGetter.PLANT_PILE, BlockSettings.FLOWER_PILE).flammability(60, 100));
	public static final Block AZURE_BLUET_PILE = register(new BlockCreator.Builder("azure_bluet", DefaultBlockGetter.PLANT_PILE, BlockSettings.FLOWER_PILE).flammability(60, 100));
	public static final Block RED_TULIP_PILE = register(new BlockCreator.Builder("red_tulip", DefaultBlockGetter.PLANT_PILE, BlockSettings.FLOWER_PILE).flammability(60, 100));
	public static final Block ORANGE_TULIP_PILE = register(new BlockCreator.Builder("orange_tulip", DefaultBlockGetter.PLANT_PILE, BlockSettings.FLOWER_PILE).flammability(60, 100));
	public static final Block WHITE_TULIP_PILE = register(new BlockCreator.Builder("white_tulip", DefaultBlockGetter.PLANT_PILE, BlockSettings.FLOWER_PILE).flammability(60, 100));
	public static final Block PINK_TULIP_PILE = register(new BlockCreator.Builder("pink_tulip", DefaultBlockGetter.PLANT_PILE, BlockSettings.FLOWER_PILE).flammability(60, 100));
	public static final Block OXEYE_DAISY_PILE = register(new BlockCreator.Builder("oxeye_daisy", DefaultBlockGetter.PLANT_PILE, BlockSettings.FLOWER_PILE).flammability(60, 100));
	public static final Block CORNFLOWER_PILE = register(new BlockCreator.Builder("cornflower", DefaultBlockGetter.PLANT_PILE, BlockSettings.FLOWER_PILE).flammability(60, 100));
	public static final Block LILY_OF_THE_VALLEY_PILE = register(new BlockCreator.Builder("lily_of_the_valley", DefaultBlockGetter.PLANT_PILE, BlockSettings.FLOWER_PILE).flammability(60, 100));
	public static final Block WITHER_ROSE_PILE = register(new BlockCreator.Builder("wither_rose_pile", new WitherRosePileBlock(BlockSettings.FLOWER_PILE)).itemGroup(ItemGroup.DECORATIONS).flammability(60, 100).render(BlockCreator.Render.CUTOUT_MIPPED));
}
