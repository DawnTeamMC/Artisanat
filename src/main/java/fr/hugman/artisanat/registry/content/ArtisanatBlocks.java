package fr.hugman.artisanat.registry.content;

import fr.hugman.artisanat.block.*;
import fr.hugman.dawn.Registrar;
import fr.hugman.dawn.block.DawnBlockSettings;
import fr.hugman.dawn.item.ItemGroupHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallBlock;
import net.minecraft.item.ItemGroups;

public class ArtisanatBlocks {
    public static final Block DARK_PRISMARINE_WALL = new WallBlock(DawnBlockSettings.copy(Blocks.DARK_PRISMARINE).item().solid());

    public static final WoodBlocks OAK_WOOD_BLOCKS = new WoodBlocks("oak_wood", Blocks.OAK_WOOD, BlockSetType.OAK);
    public static final WoodBlocks SPRUCE_WOOD_BLOCKS = new WoodBlocks("spruce_wood", Blocks.SPRUCE_WOOD, BlockSetType.SPRUCE);
    public static final WoodBlocks BIRCH_WOOD_BLOCKS = new WoodBlocks("birch_wood", Blocks.BIRCH_WOOD, BlockSetType.BIRCH);
    public static final WoodBlocks JUNGLE_WOOD_BLOCKS = new WoodBlocks("jungle_wood", Blocks.JUNGLE_WOOD, BlockSetType.JUNGLE);
    public static final WoodBlocks ACACIA_WOOD_BLOCKS = new WoodBlocks("acacia_wood", Blocks.ACACIA_WOOD, BlockSetType.ACACIA);
    public static final WoodBlocks DARK_OAK_WOOD_BLOCKS = new WoodBlocks("dark_oak_wood", Blocks.DARK_OAK_WOOD, BlockSetType.DARK_OAK);
    public static final WoodBlocks MANGROVE_WOOD_BLOCKS = new WoodBlocks("mangrove_wood", Blocks.MANGROVE_WOOD, BlockSetType.MANGROVE);
    public static final WoodBlocks CHERRY_WOOD_BLOCKS = new WoodBlocks("cherry_wood", Blocks.CHERRY_WOOD, BlockSetType.CHERRY);
    public static final WoodBlocks CRIMSON_HYPHAE_BLOCKS = new WoodBlocks("crimson_hyphae", Blocks.CRIMSON_HYPHAE, BlockSetType.CRIMSON);
    public static final WoodBlocks WARPED_HYPHAE_BLOCKS = new WoodBlocks("warped_hyphae", Blocks.WARPED_HYPHAE, BlockSetType.WARPED);

    public static final BSSW COBBLESTONE_BRICKS = new BSSW("cobblestone_bricks", DawnBlockSettings.copy(Blocks.MOSSY_COBBLESTONE));
    public static final BSSW MOSSY_COBBLESTONE_BRICKS = new BSSW("mossy_cobblestone_bricks", DawnBlockSettings.copy(Blocks.MOSSY_COBBLESTONE));

    public static final BSSW GRANITE_BRICKS = new BSSW("granite_bricks", DawnBlockSettings.copy(Blocks.GRANITE));
    public static final BSSW DIORITE_BRICKS = new BSSW("diorite_bricks", DawnBlockSettings.copy(Blocks.DIORITE));
    public static final BSSW ANDESITE_BRICKS = new BSSW("andesite_bricks", DawnBlockSettings.copy(Blocks.ANDESITE));

    public static final BSSW SANDSTONE_BRICKS = new BSSW("sandstone_bricks", DawnBlockSettings.copy(Blocks.SANDSTONE));
    public static final BSS POLISHED_SANDSTONE = new BSS("polished_sandstone", DawnBlockSettings.copy(Blocks.SANDSTONE));
    public static final BSSW RED_SANDSTONE_BRICKS = new BSSW("red_sandstone_bricks", DawnBlockSettings.copy(Blocks.RED_SANDSTONE));
    public static final BSS POLISHED_RED_SANDSTONE = new BSS("polished_red_sandstone", DawnBlockSettings.copy(Blocks.RED_SANDSTONE));
    public static final BSS SMOOTH_STONE_PAVING = new BSS("smooth_stone_paving", DawnBlockSettings.copy(Blocks.SMOOTH_STONE));
    public static final BSSW CHISELED_PRISMARINE = new BSSW("chiseled_prismarine", DawnBlockSettings.copy(Blocks.PRISMARINE));
    public static final BSS PRISMARINE_BRICK_PAVING = new BSS("prismarine_brick_paving", DawnBlockSettings.copy(Blocks.PRISMARINE_BRICKS));

    public static final ColoredBSSW STAINED_BRICK_BLOCKS = new ColoredBSSW("bricks", DawnBlockSettings.copy(Blocks.BRICKS));
    public static final BSSW BRICK_TILE_BLOCKS = new BSSW("brick_tiles", DawnBlockSettings.copy(Blocks.BRICKS));
    public static final ColoredBSSW STAINED_BRICK_TILE_BLOCKS = new ColoredBSSW("brick_tiles", DawnBlockSettings.copy(Blocks.BRICKS));

    public static final Terraconcrete TERRACOTTA_BLOCKS = new Terraconcrete("terracotta", DawnBlockSettings.copy(Blocks.TERRACOTTA));
    public static final ColoredTerraconcrete STAINED_TERRACOTTA_BLOCKS = new ColoredTerraconcrete("terracotta", DawnBlockSettings.copy(Blocks.TERRACOTTA));

    public static final BSSW TERRACOTTA_BRICKS = new BSSW("terracotta_bricks", DawnBlockSettings.copy(Blocks.TERRACOTTA));
    public static final ColoredBSSW STAINED_TERRACOTTA_BRICKS = new ColoredBSSW("terracotta_bricks", DawnBlockSettings.copy(Blocks.TERRACOTTA));

    public static final ColoredBSSW STAINED_DARK_PRISMARINE_BLOCKS = new ColoredBSSW("dark_prismarine", DawnBlockSettings.copy(Blocks.DARK_PRISMARINE));

    public static final ColoredTerraconcrete CONCRETE_BLOCKS = new ColoredTerraconcrete("concrete", DawnBlockSettings.copy(Blocks.BLUE_CONCRETE));
    public static final ColoredBSS QUARTZ_PAVING_BLOCKS = new ColoredBSS("quartz_paving", DawnBlockSettings.copy(Blocks.QUARTZ_BLOCK));

    public static final MOreBlocks COAL_BLOCKS = new MOreBlocks("coal", DawnBlockSettings.copy(Blocks.COAL_BLOCK));
    public static final CopperBlocks COPPER_BLOCKS = new CopperBlocks();
    public static final MOreBlocks IRON_BLOCKS = new MOreBlocks("iron", DawnBlockSettings.copy(Blocks.IRON_BLOCK));
    public static final MOreBlocks GOLD_BLOCKS = new MOreBlocks("gold", DawnBlockSettings.copy(Blocks.GOLD_BLOCK));
    public static final MOreBlocks LAPIS_BLOCKS = new MOreBlocks("lapis", DawnBlockSettings.copy(Blocks.LAPIS_BLOCK));
    public static final MOreBlocks REDSTONE_BLOCKS = new MOreBlocks("redstone", DawnBlockSettings.copy(Blocks.REDSTONE_BLOCK));
    public static final MOreBlocks EMERALD_BLOCKS = new MOreBlocks("emerald", DawnBlockSettings.copy(Blocks.EMERALD_BLOCK));
    public static final MOreBlocks DIAMOND_BLOCKS = new MOreBlocks("diamond", DawnBlockSettings.copy(Blocks.DIAMOND_BLOCK));
    public static final MOreBlocks NETHERITE_BLOCKS = new MOreBlocks("netherite", DawnBlockSettings.copy(Blocks.NETHERITE_BLOCK));

    public static void register(Registrar r) {
        r.add("dark_prismarine_wall", DARK_PRISMARINE_WALL);
        ItemGroupHelper.append(ItemGroups.BUILDING_BLOCKS, e -> e.addAfter(Blocks.DARK_PRISMARINE_SLAB, DARK_PRISMARINE_WALL));

        OAK_WOOD_BLOCKS.register(r);
        SPRUCE_WOOD_BLOCKS.register(r);
        BIRCH_WOOD_BLOCKS.register(r);
        JUNGLE_WOOD_BLOCKS.register(r);
        ACACIA_WOOD_BLOCKS.register(r);
        DARK_OAK_WOOD_BLOCKS.register(r);
        MANGROVE_WOOD_BLOCKS.register(r);
        CHERRY_WOOD_BLOCKS.register(r);
        CRIMSON_HYPHAE_BLOCKS.register(r);
        WARPED_HYPHAE_BLOCKS.register(r);

        COBBLESTONE_BRICKS.register(r);
        MOSSY_COBBLESTONE_BRICKS.register(r);

        GRANITE_BRICKS.register(r);
        DIORITE_BRICKS.register(r);
        ANDESITE_BRICKS.register(r);

        SANDSTONE_BRICKS.register(r);
        POLISHED_SANDSTONE.register(r);
        RED_SANDSTONE_BRICKS.register(r);
        POLISHED_RED_SANDSTONE.register(r);
        SMOOTH_STONE_PAVING.register(r);
        CHISELED_PRISMARINE.register(r);
        PRISMARINE_BRICK_PAVING.register(r);

        STAINED_BRICK_BLOCKS.register(r);
        BRICK_TILE_BLOCKS.register(r);
        STAINED_BRICK_TILE_BLOCKS.register(r);

        TERRACOTTA_BLOCKS.register(r);
        STAINED_TERRACOTTA_BLOCKS.register(r);

        TERRACOTTA_BRICKS.register(r);
        STAINED_TERRACOTTA_BRICKS.register(r);

        STAINED_DARK_PRISMARINE_BLOCKS.register(r);

        CONCRETE_BLOCKS.register(r);
        QUARTZ_PAVING_BLOCKS.register(r);

        COAL_BLOCKS.register(r);
        COPPER_BLOCKS.register(r);
        IRON_BLOCKS.register(r);
        GOLD_BLOCKS.register(r);
        LAPIS_BLOCKS.register(r);
        REDSTONE_BLOCKS.register(r);
        EMERALD_BLOCKS.register(r);
        DIAMOND_BLOCKS.register(r);
        NETHERITE_BLOCKS.register(r);
    }
}
