package fr.hugman.artisanat.block;

import fr.hugman.artisanat.Artisanat;
import fr.hugman.artisanat.block.groups.*;
import fr.hugman.artisanat.block.helper.BlockBuilder;
import fr.hugman.artisanat.block.helper.BlockFactory;
import fr.hugman.artisanat.util.CustomRegisterable;
import fr.hugman.artisanat.block.type.ArtisanatBlockSetTypes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.RedstoneBlock;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class ArtisanatBlocks {
    public static final Block DARK_PRISMARINE_WALL = register("dark_prismarine_wall", BlockFactory.wall(Blocks.DARK_PRISMARINE));

    //TODO: add stripped variants
    public static final WoodBlocks OAK_WOOD_BLOCKS = register("oak_wood", WoodBlocks.of(Blocks.OAK_WOOD, ArtisanatBlockSetTypes.OAK_WOOD));
    public static final WoodBlocks SPRUCE_WOOD_BLOCKS = register("spruce_wood", WoodBlocks.of(Blocks.SPRUCE_WOOD, ArtisanatBlockSetTypes.SPRUCE_WOOD));
    public static final WoodBlocks BIRCH_WOOD_BLOCKS = register("birch_wood", WoodBlocks.of(Blocks.BIRCH_WOOD, ArtisanatBlockSetTypes.BIRCH_WOOD));
    public static final WoodBlocks JUNGLE_WOOD_BLOCKS = register("jungle_wood", WoodBlocks.of(Blocks.JUNGLE_WOOD, ArtisanatBlockSetTypes.JUNGLE_WOOD));
    public static final WoodBlocks ACACIA_WOOD_BLOCKS = register("acacia_wood", WoodBlocks.of(Blocks.ACACIA_WOOD, ArtisanatBlockSetTypes.ACACIA_WOOD));
    public static final WoodBlocks CHERRY_WOOD_BLOCKS = register("cherry_wood", WoodBlocks.of(Blocks.CHERRY_WOOD, ArtisanatBlockSetTypes.CHERRY_WOOD));
    public static final WoodBlocks DARK_OAK_WOOD_BLOCKS = register("dark_oak_wood", WoodBlocks.of(Blocks.DARK_OAK_WOOD, ArtisanatBlockSetTypes.DARK_OAK_WOOD));
    public static final WoodBlocks PALE_OAK_WOOD_BLOCKS = register("pale_oak_wood", WoodBlocks.of(Blocks.PALE_OAK_WOOD, ArtisanatBlockSetTypes.PALE_OAK_WOOD));
    public static final WoodBlocks MANGROVE_WOOD_BLOCKS = register("mangrove_wood", WoodBlocks.of(Blocks.MANGROVE_WOOD, ArtisanatBlockSetTypes.MANGROVE_WOOD));
    public static final WoodBlocks CRIMSON_HYPHAE_BLOCKS = register("crimson_hyphae", WoodBlocks.of(Blocks.CRIMSON_HYPHAE, ArtisanatBlockSetTypes.CRIMSON_HYPHAE));
    public static final WoodBlocks WARPED_HYPHAE_BLOCKS = register("warped_hyphae", WoodBlocks.of(Blocks.WARPED_HYPHAE, ArtisanatBlockSetTypes.WARPED_HYPHAE));

    public static final BSSWBlocks COBBLESTONE_BRICKS = register("cobblestone_bricks", BSSWBlocks.of(new BlockBuilder(Blocks.COBBLESTONE)));
    public static final BSSWBlocks MOSSY_COBBLESTONE_BRICKS = register("mossy_cobblestone_bricks", BSSWBlocks.of(new BlockBuilder(Blocks.MOSSY_COBBLESTONE)));

    public static final BSSWBlocks GRANITE_BRICKS = register("granite_bricks", BSSWBlocks.of(new BlockBuilder(Blocks.GRANITE)));
    public static final BSSWBlocks DIORITE_BRICKS = register("diorite_bricks", BSSWBlocks.of(new BlockBuilder(Blocks.DIORITE)));
    public static final BSSWBlocks ANDESITE_BRICKS = register("andesite_bricks", BSSWBlocks.of(new BlockBuilder(Blocks.ANDESITE)));

    public static final BSSWBlocks SANDSTONE_BRICKS = register("sandstone_bricks", BSSWBlocks.of(new BlockBuilder(Blocks.SANDSTONE)));
    public static final BSSBlocks POLISHED_SANDSTONE = register("polished_sandstone", BSSBlocks.of(new BlockBuilder(Blocks.SANDSTONE)));
    public static final BSSWBlocks RED_SANDSTONE_BRICKS = register("red_sandstone_bricks", BSSWBlocks.of(new BlockBuilder(Blocks.RED_SANDSTONE)));
    public static final BSSBlocks POLISHED_RED_SANDSTONE = register("polished_red_sandstone", BSSBlocks.of(new BlockBuilder(Blocks.RED_SANDSTONE)));
    public static final BSSBlocks SMOOTH_STONE_PAVING = register("smooth_stone_paving", BSSBlocks.of(new BlockBuilder(Blocks.SMOOTH_STONE)));
    public static final BSSWBlocks CHISELED_PRISMARINE = register("chiseled_prismarine", BSSWBlocks.of(new BlockBuilder(Blocks.PRISMARINE)));
    public static final BSSBlocks PRISMARINE_BRICK_PAVING = register("prismarine_brick_paving", BSSBlocks.of(new BlockBuilder(Blocks.PRISMARINE_BRICKS)));

    public static final StainedBSSWBlocks STAINED_BRICK_BLOCKS = register("bricks", StainedBSSWBlocks.of(Blocks.BRICKS));
    public static final BSSWBlocks BRICK_TILE_BLOCKS = register("brick_tiles", BSSWBlocks.of(Blocks.BRICKS));
    public static final StainedBSSWBlocks STAINED_BRICK_TILE_BLOCKS = register("brick_tiles", StainedBSSWBlocks.of(Blocks.BRICKS));

    public static final SSWPBBlocks TERRACOTTA_BLOCKS = register("terracotta", SSWPBBlocks.of(Blocks.TERRACOTTA));
    public static final StainedSSWPBBlocks STAINED_TERRACOTTA_BLOCKS = register("terracotta", StainedSSWPBBlocks.terracotta());
    public static final BSSWBlocks TERRACOTTA_BRICKS = register("terracotta_bricks", BSSWBlocks.of(new BlockBuilder(Blocks.TERRACOTTA)));
    public static final StainedBSSWBlocks STAINED_TERRACOTTA_BRICKS = register("terracotta_bricks", StainedBSSWBlocks.of(Blocks.TERRACOTTA));

    public static final StainedBSSWBlocks STAINED_DARK_PRISMARINE_BLOCKS = register("dark_prismarine", StainedBSSWBlocks.of(Blocks.DARK_PRISMARINE));

    public static final StainedSSWPBBlocks CONCRETE_BLOCKS = register("concrete", StainedSSWPBBlocks.concrete());
    public static final StainedBSSBlocks QUARTZ_PAVING_BLOCKS = register("quartz_paving", StainedBSSBlocks.of(Blocks.QUARTZ_BLOCK));

    public static final OreBlocks COAL_BLOCKS = register("coal", OreBlocks.of(Blocks.COAL_BLOCK));
    public static final OreBlocks IRON_BLOCKS = register("iron", OreBlocks.of(Blocks.IRON_BLOCK));
    public static final OreBlocks GOLD_BLOCKS = register("gold", OreBlocks.of(Blocks.GOLD_BLOCK));
    public static final OreBlocks LAPIS_BLOCKS = register("lapis", OreBlocks.of(Blocks.LAPIS_BLOCK));
    public static final OreBlocks REDSTONE_BLOCKS = register("redstone", OreBlocks.of(new BlockBuilder(Blocks.REDSTONE_BLOCK).factory(RedstoneBlock::new)));
    public static final OreBlocks EMERALD_BLOCKS = register("emerald", OreBlocks.of(Blocks.EMERALD_BLOCK));
    public static final OreBlocks DIAMOND_BLOCKS = register("diamond", OreBlocks.of(Blocks.DIAMOND_BLOCK));
    public static final OreBlocks NETHERITE_BLOCKS = register("netherite", OreBlocks.of(Blocks.NETHERITE_BLOCK));

    public static final CopperBlocks UNPLATED_COPPER_BLOCKS = register("", CopperBlocks.of("unplated", ""));
    public static final CopperBlocks COPPER_BRICKS = register("", CopperBlocks.of("", "bricks"));
    public static final CopperBlocks COPPER_TILES = register("", CopperBlocks.of("", "tiles"));

    public static RegistryKey<Block> keyOf(String id) {
        return RegistryKey.of(RegistryKeys.BLOCK, Artisanat.id(id));
    }

    private static Block register(RegistryKey<Block> key, BlockBuilder builder) {
        return builder.register(key);
    }

    private static Block register(String id, BlockBuilder builder) {
        return register(keyOf(id), builder);
    }

    private static <B> B register(String id, CustomRegisterable<B> registerable) {
        return registerable.register(id);
    }
}
