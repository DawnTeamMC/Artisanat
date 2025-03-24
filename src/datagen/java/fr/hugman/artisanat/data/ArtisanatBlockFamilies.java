package fr.hugman.artisanat.data;

import com.google.common.collect.Maps;
import fr.hugman.artisanat.block.ArtisanatBlocks;
import fr.hugman.artisanat.block.groups.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.registry.Registries;
import net.minecraft.util.DyeColor;

import java.util.Map;
import java.util.stream.Stream;

public class ArtisanatBlockFamilies {
    private static final Map<Block, BlockFamily> BASE_BLOCKS_TO_FAMILIES = Maps.newHashMap();

    public static void registerAll() {
        register(ArtisanatBlocks.OAK_WOOD_BLOCKS, Blocks.OAK_WOOD);
        register(ArtisanatBlocks.SPRUCE_WOOD_BLOCKS, Blocks.SPRUCE_WOOD);
        register(ArtisanatBlocks.BIRCH_WOOD_BLOCKS, Blocks.BIRCH_WOOD);
        register(ArtisanatBlocks.JUNGLE_WOOD_BLOCKS, Blocks.JUNGLE_WOOD);
        register(ArtisanatBlocks.ACACIA_WOOD_BLOCKS, Blocks.ACACIA_WOOD);
        register(ArtisanatBlocks.CHERRY_WOOD_BLOCKS, Blocks.CHERRY_WOOD);
        register(ArtisanatBlocks.DARK_OAK_WOOD_BLOCKS, Blocks.DARK_OAK_WOOD);
        register(ArtisanatBlocks.PALE_OAK_WOOD_BLOCKS, Blocks.PALE_OAK_WOOD);
        register(ArtisanatBlocks.MANGROVE_WOOD_BLOCKS, Blocks.MANGROVE_WOOD);
        register(ArtisanatBlocks.CRIMSON_HYPHAE_BLOCKS, Blocks.CRIMSON_HYPHAE);
        register(ArtisanatBlocks.WARPED_HYPHAE_BLOCKS, Blocks.WARPED_HYPHAE);
        register(ArtisanatBlocks.COBBLESTONE_BRICKS);
        register(ArtisanatBlocks.MOSSY_COBBLESTONE_BRICKS);
        register(ArtisanatBlocks.GRANITE_BRICKS);
        register(ArtisanatBlocks.DIORITE_BRICKS);
        register(ArtisanatBlocks.ANDESITE_BRICKS);
        register(ArtisanatBlocks.SANDSTONE_BRICKS);
        register(ArtisanatBlocks.POLISHED_SANDSTONE);
        register(ArtisanatBlocks.RED_SANDSTONE_BRICKS);
        register(ArtisanatBlocks.POLISHED_RED_SANDSTONE);
        register(ArtisanatBlocks.SMOOTH_STONE_PAVING);
        register(ArtisanatBlocks.CHISELED_PRISMARINE);
        register(ArtisanatBlocks.PRISMARINE_BRICK_PAVING);

        register(ArtisanatBlocks.STAINED_BRICK_BLOCKS);
        register(ArtisanatBlocks.BRICK_TILE_BLOCKS);
        register(ArtisanatBlocks.STAINED_BRICK_TILE_BLOCKS);
        register(ArtisanatBlocks.TERRACOTTA_BLOCKS, Blocks.TERRACOTTA);
        register(ArtisanatBlocks.STAINED_TERRACOTTA_BLOCKS, StainedSSWPBBlocks.TERRACOTTA_MAP);
        register(ArtisanatBlocks.TERRACOTTA_BRICKS);
        register(ArtisanatBlocks.STAINED_TERRACOTTA_BRICKS);
        register(ArtisanatBlocks.STAINED_DARK_PRISMARINE_BLOCKS);
        register(ArtisanatBlocks.CONCRETE_BLOCKS, StainedSSWPBBlocks.CONCRETE_MAP);
        register(ArtisanatBlocks.QUARTZ_PAVING_BLOCKS);
    }

    public static void register(WoodBlocks woodBlocks, Block baseBlock) {
        register(baseBlock)
                .stairs(woodBlocks.stairs())
                .slab(woodBlocks.slab())
                .button(woodBlocks.button())
                .build();
    }

    public static void register(BSSWBlocks bssw) {
        register(bssw.block())
                .stairs(bssw.stairs())
                .slab(bssw.slab())
                .wall(bssw.wall())
                .build();
    }

    public static void register(BSSBlocks bss) {
        register(bss.block())
                .stairs(bss.stairs())
                .slab(bss.slab())
                .build();
    }

    public static void register(SSWPBBlocks sswpb, Block baseBlock) {
        register(baseBlock)
                .stairs(sswpb.stairs())
                .slab(sswpb.slab())
                .wall(sswpb.wall())
                .pressurePlate(sswpb.pressurePlate())
                .button(sswpb.button())
                .build();
    }

    public static void register(StainedBSSWBlocks stainedBssw) {
        stainedBssw.colorMap().forEach((dyeColor, bsswBlocks) -> register(bsswBlocks));
    }

    public static void register(StainedBSSBlocks stainedBss) {
        stainedBss.colorMap().forEach((dyeColor, bssBlocks) -> register(bssBlocks));
    }

    public static void register(StainedSSWPBBlocks stainedSswpb, Map<DyeColor, Block> colorMap) {
        stainedSswpb.colorMap().forEach((dyeColor, sswpBlocks) -> register(sswpBlocks, colorMap.get(dyeColor)));
    }

    public static BlockFamily.Builder register(Block baseBlock) {
        BlockFamily.Builder builder = new BlockFamily.Builder(baseBlock);
        BlockFamily blockFamily = BASE_BLOCKS_TO_FAMILIES.put(baseBlock, builder.build());
        if (blockFamily != null) {
            throw new IllegalStateException("Duplicate family definition for " + Registries.BLOCK.getId(baseBlock));
        } else {
            return builder;
        }
    }

    public static Stream<BlockFamily> getFamilies() {
        return BASE_BLOCKS_TO_FAMILIES.values().stream();
    }
}
