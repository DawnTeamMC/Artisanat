package fr.hugman.artisanat.tag;

import fr.hugman.artisanat.Artisanat;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class ArtisanatBlockTags {
    public static final TagKey<Block> STAINED_BRICK_BLOCKS = of("stained_brick_blocks");
    public static final TagKey<Block> STAINED_BRICK_SLABS = of("stained_brick_slabs");
    public static final TagKey<Block> STAINED_BRICK_STAIRS = of("stained_brick_stairs");
    public static final TagKey<Block> STAINED_BRICK_WALLS = of("stained_brick_walls");

    public static final TagKey<Block> BRICK_TILES = of("brick_tiles");
    public static final TagKey<Block> BRICK_TILE_SLABS = of("brick_tile_slabs");
    public static final TagKey<Block> BRICK_TILE_STAIRS = of("brick_tile_stairs");
    public static final TagKey<Block> BRICK_TILE_WALLS = of("brick_tile_walls");

    public static final TagKey<Block> TERRACOTTA_SLABS = of("terracotta_slabs");
    public static final TagKey<Block> TERRACOTTA_STAIRS = of("terracotta_stairs");
    public static final TagKey<Block> TERRACOTTA_WALLS = of("terracotta_walls");
    public static final TagKey<Block> TERRACOTTA_PRESSURE_PLATES = of("terracotta_pressure_plates");
    public static final TagKey<Block> TERRACOTTA_BUTTONS = of("terracotta_buttons");

    public static final TagKey<Block> TERRACOTTA_BRICKS = of("terracotta_bricks");
    public static final TagKey<Block> TERRACOTTA_BRICK_SLABS = of("terracotta_brick_slabs");
    public static final TagKey<Block> TERRACOTTA_BRICK_STAIRS = of("terracotta_brick_stairs");
    public static final TagKey<Block> TERRACOTTA_BRICK_WALLS = of("terracotta_brick_walls");

    public static final TagKey<Block> STAINED_DARK_PRISMARINE_BLOCKS = of("stained_dark_prismarine_blocks");
    public static final TagKey<Block> STAINED_DARK_PRISMARINE_SLABS = of("stained_dark_prismarine_slabs");
    public static final TagKey<Block> STAINED_DARK_PRISMARINE_STAIRS = of("stained_dark_prismarine_stairs");
    public static final TagKey<Block> STAINED_DARK_PRISMARINE_WALLS = of("stained_dark_prismarine_walls");

    public static final TagKey<Block> CONCRETE_SLABS = of("concrete_slabs");
    public static final TagKey<Block> CONCRETE_STAIRS = of("concrete_stairs");
    public static final TagKey<Block> CONCRETE_WALLS = of("concrete_walls");
    public static final TagKey<Block> CONCRETE_PRESSURE_PLATES = of("concrete_pressure_plates");
    public static final TagKey<Block> CONCRETE_BUTTONS = of("concrete_buttons");

    public static final TagKey<Block> CONCRETE_BRICKS = of("concrete_bricks");
    public static final TagKey<Block> CONCRETE_BRICK_SLABS = of("concrete_brick_slabs");
    public static final TagKey<Block> CONCRETE_BRICK_STAIRS = of("concrete_brick_stairs");
    public static final TagKey<Block> CONCRETE_BRICK_WALLS = of("concrete_brick_walls");

    public static final TagKey<Block> QUARTZ_PAVINGS = of("quartz_pavings");
    public static final TagKey<Block> QUARTZ_PAVING_SLABS = of("quartz_paving_slabs");
    public static final TagKey<Block> QUARTZ_PAVING_STAIRS = of("quartz_paving_stairs");

    public static final TagKey<Block> COAL_BLOCKS = of("coal_blocks");
    public static final TagKey<Block> IRON_BLOCKS = of("iron_blocks");
    public static final TagKey<Block> COPPER_BLOCKS = of("copper_blocks");
    public static final TagKey<Block> GOLD_BLOCKS = of("gold_blocks");
    public static final TagKey<Block> LAPIS_BLOCKS = of("lapis_blocks");
    public static final TagKey<Block> REDSTONE_BLOCKS = of("redstone_blocks");
    public static final TagKey<Block> EMERALD_BLOCKS = of("emerald_blocks");
    public static final TagKey<Block> DIAMOND_BLOCKS = of("diamond_blocks");
    public static final TagKey<Block> NETHERITE_BLOCKS = of("netherite_blocks");

    public static TagKey<Block> of(String path) {
        return TagKey.of(RegistryKeys.BLOCK, Artisanat.id(path));
    }
}
