package com.hugman.nookbuild.init;

import com.hugman.dawn.api.creator.BlockCreator;
import com.hugman.dawn.api.creator.pack.block.MSBlockPack;
import com.hugman.dawn.api.creator.pack.block.MSCBlockPack;
import com.hugman.dawn.api.object.block.PlantPileBlock;
import com.hugman.dawn.api.util.BlockSettings;
import com.hugman.dawn.api.util.DefaultBlockGetter;
import com.hugman.nookbuild.object.block.WitherRosePileBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MaterialColor;
import net.minecraft.item.ItemGroup;

public class NookBlockPack extends NookPack {
	public static final MSBlockPack OAK_WOOD_BLOCKS = register(new MSBlockPack.Builder("oak_wood", Blocks.OAK_WOOD, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WOOD_BUTTON));
	public static final MSBlockPack SPRUCE_WOOD_BLOCKS = register(new MSBlockPack.Builder("spruce_wood", Blocks.SPRUCE_WOOD, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WOOD_BUTTON));
	public static final MSBlockPack BIRCH_WOOD_BLOCKS = register(new MSBlockPack.Builder("birch_wood", Blocks.BIRCH_WOOD, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WOOD_BUTTON));
	public static final MSBlockPack JUNGLE_WOOD_BLOCKS = register(new MSBlockPack.Builder("jungle_wood", Blocks.JUNGLE_WOOD, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WOOD_BUTTON));
	public static final MSBlockPack ACACIA_WOOD_BLOCKS = register(new MSBlockPack.Builder("acacia_wood", Blocks.ACACIA_WOOD, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WOOD_BUTTON));
	public static final MSBlockPack DARK_OAK_WOOD_BLOCKS = register(new MSBlockPack.Builder("dark_oak_wood", Blocks.DARK_OAK_WOOD, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WOOD_BUTTON));
	public static final MSBlockPack CRIMSON_HYPHAE_BLOCKS = register(new MSBlockPack.Builder("crimson_hyphae", Blocks.CRIMSON_HYPHAE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WOOD_BUTTON));
	public static final MSBlockPack WARPED_HYPHAE_BLOCKS = register(new MSBlockPack.Builder("warped_hyphae", Blocks.WARPED_HYPHAE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WOOD_BUTTON));

	public static final MSBlockPack COBBLESTONE_BRICKS = register(new MSBlockPack.Builder("cobblestone_bricks", Blocks.MOSSY_COBBLESTONE, DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL));
	public static final MSBlockPack MOSSY_COBBLESTONE_BRICKS = register(new MSBlockPack.Builder("mossy_cobblestone_bricks", Blocks.MOSSY_COBBLESTONE, DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL));
	public static final MSBlockPack GRANITE_BRICKS = register(new MSBlockPack.Builder("granite_bricks", Blocks.GRANITE, DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL));
	public static final MSBlockPack DIORITE_BRICKS = register(new MSBlockPack.Builder("diorite_bricks", Blocks.DIORITE, DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL));
	public static final MSBlockPack ANDESITE_BRICKS = register(new MSBlockPack.Builder("andesite_bricks", Blocks.ANDESITE, DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL));

	public static final MSBlockPack SANDSTONE_BRICKS = register(new MSBlockPack.Builder("sandstone_bricks", Blocks.SANDSTONE, DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL));
	public static final MSBlockPack POLISHED_SANDSTONE = register(new MSBlockPack.Builder("polished_sandstone", Blocks.SANDSTONE, DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB));
	public static final MSBlockPack RED_SANDSTONE_BRICKS = register(new MSBlockPack.Builder("red_sandstone_bricks", Blocks.RED_SANDSTONE, DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL));
	public static final MSBlockPack POLISHED_RED_SANDSTONE = register(new MSBlockPack.Builder("polished_red_sandstone", Blocks.RED_SANDSTONE, DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB));

	public static final MSBlockPack SMOOTH_STONE_PAVING = register(new MSBlockPack.Builder("smooth_stone_paving", Blocks.SMOOTH_STONE, DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB));
	public static final MSBlockPack CHISELED_PRISMARINE = register(new MSBlockPack.Builder("chiseled_prismarine", Blocks.PRISMARINE, DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL));
	public static final MSBlockPack PRISMARINE_BRICK_PAVING = register(new MSBlockPack.Builder("prismarine_brick_paving", Blocks.PRISMARINE_BRICKS, DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB));

	public static final MSCBlockPack STAINED_BRICK_BLOCKS = register(new MSCBlockPack.Builder("bricks", Blocks.BRICKS, DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL));
	public static final MSBlockPack TERRACOTTA_BLOCKS = register(new MSBlockPack.Builder("terracotta", Blocks.TERRACOTTA, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL, DefaultBlockGetter.STONE_PRESSURE_PLATE, DefaultBlockGetter.STONE_BUTTON));
	public static final MSCBlockPack STAINED_TERRACOTTA_BLOCKS = register(new MSCBlockPack.Builder("terracotta", Blocks.TERRACOTTA, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL, DefaultBlockGetter.STONE_PRESSURE_PLATE, DefaultBlockGetter.STONE_BUTTON));
	public static final MSCBlockPack DARK_PRISMARINE_BLOCKS = register(new MSCBlockPack.Builder("dark_prismarine", Blocks.DARK_PRISMARINE, DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL));
	public static final MSCBlockPack CONCRETE_BLOCKS = register(new MSCBlockPack.Builder("concrete", Blocks.BLUE_CONCRETE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL, DefaultBlockGetter.STONE_PRESSURE_PLATE, DefaultBlockGetter.STONE_BUTTON));
	public static final MSCBlockPack QUARTZ_PAVING_BLOCKS = register(new MSCBlockPack.Builder("quartz_paving", Blocks.QUARTZ_BLOCK, DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB));

	public static final MSBlockPack BLUNITE_BLOCKS = register(new MSBlockPack.Builder("blunite", FabricBlockSettings.copyOf(Blocks.ANDESITE).materialColor(MaterialColor.LIGHT_BLUE_TERRACOTTA), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL).copy(Blocks.ANDESITE));
	public static final MSBlockPack CARBONITE_BLOCKS = register(new MSBlockPack.Builder("carbonite", FabricBlockSettings.copyOf(Blocks.ANDESITE).materialColor(MaterialColor.BLACK), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB, DefaultBlockGetter.WALL).copy(Blocks.ANDESITE));
	public static final MSBlockPack POLISHED_BLUNITE = register(new MSBlockPack.Builder("polished_blunite", BLUNITE_BLOCKS.getBlock(DefaultBlockGetter.CUBE), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB));
	public static final MSBlockPack POLISHED_CARBONITE = register(new MSBlockPack.Builder("polished_carbonite", CARBONITE_BLOCKS.getBlock(DefaultBlockGetter.CUBE), DefaultBlockGetter.CUBE, DefaultBlockGetter.STAIRS, DefaultBlockGetter.SLAB, DefaultBlockGetter.VERTICAL_SLAB));

	public static final Block DANDELION_PILE = register(new BlockCreator.Builder("dandelion_pile", new PlantPileBlock(BlockSettings.FLOWER_PILE.noCollision())).setItemGroup(ItemGroup.DECORATIONS).setFlammability(60, 100));
	public static final Block POPPY_PILE = register(new BlockCreator.Builder("poppy_pile", new PlantPileBlock(BlockSettings.FLOWER_PILE.noCollision())).setItemGroup(ItemGroup.DECORATIONS).setFlammability(60, 100));
	public static final Block BLUE_ORCHID_PILE = register(new BlockCreator.Builder("blue_orchid_pile", new PlantPileBlock(BlockSettings.FLOWER_PILE.noCollision())).setItemGroup(ItemGroup.DECORATIONS).setFlammability(60, 100));
	public static final Block ALLIUM_PILE = register(new BlockCreator.Builder("allium_pile", new PlantPileBlock(BlockSettings.FLOWER_PILE.noCollision())).setItemGroup(ItemGroup.DECORATIONS).setFlammability(60, 100));
	public static final Block AZURE_BLUET_PILE = register(new BlockCreator.Builder("azure_bluet_pile", new PlantPileBlock(BlockSettings.FLOWER_PILE.noCollision())).setItemGroup(ItemGroup.DECORATIONS).setFlammability(60, 100));
	public static final Block RED_TULIP_PILE = register(new BlockCreator.Builder("red_tulip_pile", new PlantPileBlock(BlockSettings.FLOWER_PILE.noCollision())).setItemGroup(ItemGroup.DECORATIONS).setFlammability(60, 100));
	public static final Block ORANGE_TULIP_PILE = register(new BlockCreator.Builder("orange_tulip_pile", new PlantPileBlock(BlockSettings.FLOWER_PILE.noCollision())).setItemGroup(ItemGroup.DECORATIONS).setFlammability(60, 100));
	public static final Block WHITE_TULIP_PILE = register(new BlockCreator.Builder("white_tulip_pile", new PlantPileBlock(BlockSettings.FLOWER_PILE.noCollision())).setItemGroup(ItemGroup.DECORATIONS).setFlammability(60, 100));
	public static final Block PINK_TULIP_PILE = register(new BlockCreator.Builder("pink_tulip_pile", new PlantPileBlock(BlockSettings.FLOWER_PILE.noCollision())).setItemGroup(ItemGroup.DECORATIONS).setFlammability(60, 100));
	public static final Block OXEYE_DAISY_PILE = register(new BlockCreator.Builder("oxeye_daisy_pile", new PlantPileBlock(BlockSettings.FLOWER_PILE.noCollision())).setItemGroup(ItemGroup.DECORATIONS).setFlammability(60, 100));
	public static final Block CORNFLOWER_PILE = register(new BlockCreator.Builder("cornflower_pile", new PlantPileBlock(BlockSettings.FLOWER_PILE.noCollision())).setItemGroup(ItemGroup.DECORATIONS).setFlammability(60, 100));
	public static final Block LILY_OF_THE_VALLEY_PILE = register(new BlockCreator.Builder("lily_of_the_valley_pile", new PlantPileBlock(BlockSettings.FLOWER_PILE.noCollision())).setItemGroup(ItemGroup.DECORATIONS).setFlammability(60, 100));
	public static final Block WITHER_ROSE_PILE = register(new BlockCreator.Builder("wither_rose_pile", new WitherRosePileBlock(BlockSettings.FLOWER_PILE.noCollision())).setItemGroup(ItemGroup.DECORATIONS).setFlammability(60, 100));
}
