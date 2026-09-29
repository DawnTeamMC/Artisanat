package fr.hugman.artisanat.data.provider;

import fr.hugman.artisanat.block.ArtisanatBlocks;
import fr.hugman.artisanat.block.collection.*;
import fr.hugman.artisanat.tag.ArtisanatBlockTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.tags.TagAppender;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;


public class ArtisanatBlockTagProvider extends FabricTagsProvider.BlockTagsProvider {
    public ArtisanatBlockTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        // Artisanat
        fill(builder(ArtisanatBlockTags.STAINED_BRICK_BLOCKS), BSSWBlocks::block, ArtisanatBlocks.STAINED_BRICK_BLOCKS);
        fill(builder(ArtisanatBlockTags.STAINED_BRICK_SLABS), BSSWBlocks::slab, ArtisanatBlocks.STAINED_BRICK_BLOCKS);
        fill(builder(ArtisanatBlockTags.STAINED_BRICK_STAIRS), BSSWBlocks::stairs, ArtisanatBlocks.STAINED_BRICK_BLOCKS);
        fill(builder(ArtisanatBlockTags.STAINED_BRICK_WALLS), BSSWBlocks::wall, ArtisanatBlocks.STAINED_BRICK_BLOCKS);

        fill(builder(ArtisanatBlockTags.BRICK_TILES).add(keys(ArtisanatBlocks.BRICK_TILE_BLOCKS.block())), BSSWBlocks::block, ArtisanatBlocks.STAINED_BRICK_TILE_BLOCKS);
        fill(builder(ArtisanatBlockTags.BRICK_TILE_SLABS).add(keys(ArtisanatBlocks.BRICK_TILE_BLOCKS.slab())), BSSWBlocks::slab, ArtisanatBlocks.STAINED_BRICK_TILE_BLOCKS);
        fill(builder(ArtisanatBlockTags.BRICK_TILE_STAIRS).add(keys(ArtisanatBlocks.BRICK_TILE_BLOCKS.stairs())), BSSWBlocks::stairs, ArtisanatBlocks.STAINED_BRICK_TILE_BLOCKS);
        fill(builder(ArtisanatBlockTags.BRICK_TILE_WALLS).add(keys(ArtisanatBlocks.BRICK_TILE_BLOCKS.wall())), BSSWBlocks::wall, ArtisanatBlocks.STAINED_BRICK_TILE_BLOCKS);

        fill(builder(ArtisanatBlockTags.TERRACOTTA_SLABS).add(keys(ArtisanatBlocks.TERRACOTTA_BLOCKS.slab())), SSWPBBlocks::slab, ArtisanatBlocks.STAINED_TERRACOTTA_BLOCKS);
        fill(builder(ArtisanatBlockTags.TERRACOTTA_STAIRS).add(keys(ArtisanatBlocks.TERRACOTTA_BLOCKS.stairs())), SSWPBBlocks::stairs, ArtisanatBlocks.STAINED_TERRACOTTA_BLOCKS);
        fill(builder(ArtisanatBlockTags.TERRACOTTA_WALLS).add(keys(ArtisanatBlocks.TERRACOTTA_BLOCKS.wall())), SSWPBBlocks::wall, ArtisanatBlocks.STAINED_TERRACOTTA_BLOCKS);
        fill(builder(ArtisanatBlockTags.TERRACOTTA_PRESSURE_PLATES).add(keys(ArtisanatBlocks.TERRACOTTA_BLOCKS.pressurePlate())), SSWPBBlocks::pressurePlate, ArtisanatBlocks.STAINED_TERRACOTTA_BLOCKS);
        fill(builder(ArtisanatBlockTags.TERRACOTTA_BUTTONS).add(keys(ArtisanatBlocks.TERRACOTTA_BLOCKS.button())), SSWPBBlocks::button, ArtisanatBlocks.STAINED_TERRACOTTA_BLOCKS);

        fill(builder(ArtisanatBlockTags.TERRACOTTA_BRICKS).add(keys(ArtisanatBlocks.TERRACOTTA_BRICKS.block())), BSSWBlocks::block, ArtisanatBlocks.STAINED_TERRACOTTA_BRICKS);
        fill(builder(ArtisanatBlockTags.TERRACOTTA_BRICK_SLABS).add(keys(ArtisanatBlocks.TERRACOTTA_BRICKS.slab())), BSSWBlocks::slab, ArtisanatBlocks.STAINED_TERRACOTTA_BRICKS);
        fill(builder(ArtisanatBlockTags.TERRACOTTA_BRICK_STAIRS).add(keys(ArtisanatBlocks.TERRACOTTA_BRICKS.stairs())), BSSWBlocks::stairs, ArtisanatBlocks.STAINED_TERRACOTTA_BRICKS);
        fill(builder(ArtisanatBlockTags.TERRACOTTA_BRICK_WALLS).add(keys(ArtisanatBlocks.TERRACOTTA_BRICKS.wall())), BSSWBlocks::wall, ArtisanatBlocks.STAINED_TERRACOTTA_BRICKS);

        fill(builder(ArtisanatBlockTags.STAINED_DARK_PRISMARINE_BLOCKS), BSSWBlocks::block, ArtisanatBlocks.STAINED_DARK_PRISMARINE_BLOCKS);
        fill(builder(ArtisanatBlockTags.STAINED_DARK_PRISMARINE_SLABS), BSSWBlocks::slab, ArtisanatBlocks.STAINED_DARK_PRISMARINE_BLOCKS);
        fill(builder(ArtisanatBlockTags.STAINED_DARK_PRISMARINE_STAIRS), BSSWBlocks::stairs, ArtisanatBlocks.STAINED_DARK_PRISMARINE_BLOCKS);
        fill(builder(ArtisanatBlockTags.STAINED_DARK_PRISMARINE_WALLS), BSSWBlocks::wall, ArtisanatBlocks.STAINED_DARK_PRISMARINE_BLOCKS);

        fill(builder(ArtisanatBlockTags.CONCRETE_SLABS), SSWPBBlocks::slab, ArtisanatBlocks.CONCRETE_BLOCKS);
        fill(builder(ArtisanatBlockTags.CONCRETE_STAIRS), SSWPBBlocks::stairs, ArtisanatBlocks.CONCRETE_BLOCKS);
        fill(builder(ArtisanatBlockTags.CONCRETE_WALLS), SSWPBBlocks::wall, ArtisanatBlocks.CONCRETE_BLOCKS);
        fill(builder(ArtisanatBlockTags.CONCRETE_PRESSURE_PLATES), SSWPBBlocks::pressurePlate, ArtisanatBlocks.CONCRETE_BLOCKS);
        fill(builder(ArtisanatBlockTags.CONCRETE_BUTTONS), SSWPBBlocks::button, ArtisanatBlocks.CONCRETE_BLOCKS);

        fill(builder(ArtisanatBlockTags.CONCRETE_BRICKS), BSSWBlocks::block, ArtisanatBlocks.CONCRETE_BRICKS);
        fill(builder(ArtisanatBlockTags.CONCRETE_BRICK_SLABS), BSSWBlocks::slab, ArtisanatBlocks.CONCRETE_BRICKS);
        fill(builder(ArtisanatBlockTags.CONCRETE_BRICK_STAIRS), BSSWBlocks::stairs, ArtisanatBlocks.CONCRETE_BRICKS);
        fill(builder(ArtisanatBlockTags.CONCRETE_BRICK_WALLS), BSSWBlocks::wall, ArtisanatBlocks.CONCRETE_BRICKS);

        fill(builder(ArtisanatBlockTags.QUARTZ_PAVINGS), BSSBlocks::block, ArtisanatBlocks.QUARTZ_PAVING_BLOCKS);
        fill(builder(ArtisanatBlockTags.QUARTZ_PAVING_SLABS), BSSBlocks::slab, ArtisanatBlocks.QUARTZ_PAVING_BLOCKS);
        fill(builder(ArtisanatBlockTags.QUARTZ_PAVING_STAIRS), BSSBlocks::stairs, ArtisanatBlocks.QUARTZ_PAVING_BLOCKS);

        createOreTags(ArtisanatBlockTags.COAL_BLOCKS, ArtisanatBlocks.COAL_BLOCKS);
        createOreTags(ArtisanatBlockTags.IRON_BLOCKS, ArtisanatBlocks.IRON_BLOCKS);
        createOreTags(ArtisanatBlockTags.COPPER_BLOCKS, ArtisanatBlocks.UNPLATED_COPPER_BLOCKS, ArtisanatBlocks.COPPER_BRICKS, ArtisanatBlocks.COPPER_TILES);
        createOreTags(ArtisanatBlockTags.GOLD_BLOCKS, ArtisanatBlocks.GOLD_BLOCKS);
        createOreTags(ArtisanatBlockTags.LAPIS_BLOCKS, ArtisanatBlocks.LAPIS_BLOCKS);
        createOreTags(ArtisanatBlockTags.REDSTONE_BLOCKS, ArtisanatBlocks.REDSTONE_BLOCKS);
        createOreTags(ArtisanatBlockTags.EMERALD_BLOCKS, ArtisanatBlocks.EMERALD_BLOCKS);
        createOreTags(ArtisanatBlockTags.DIAMOND_BLOCKS, ArtisanatBlocks.DIAMOND_BLOCKS);
        createOreTags(ArtisanatBlockTags.NETHERITE_BLOCKS, ArtisanatBlocks.NETHERITE_BLOCKS);

        // Vanilla
        builder(BlockTags.SLABS)
                .add(keys(
						ArtisanatBlocks.POLISHED_STONE.slab(),
                        ArtisanatBlocks.COBBLESTONE_BRICKS.slab(),
                        ArtisanatBlocks.MOSSY_COBBLESTONE_BRICKS.slab(),
                        ArtisanatBlocks.GRANITE_BRICKS.slab(),
                        ArtisanatBlocks.DIORITE_BRICKS.slab(),
                        ArtisanatBlocks.ANDESITE_BRICKS.slab(),
                        ArtisanatBlocks.SNOW_BRICKS.slab(),
                        ArtisanatBlocks.SANDSTONE_BRICKS.slab(),
                        ArtisanatBlocks.POLISHED_SANDSTONE.slab(),
                        ArtisanatBlocks.RED_SANDSTONE_BRICKS.slab(),
                        ArtisanatBlocks.POLISHED_RED_SANDSTONE.slab(),
                        ArtisanatBlocks.SMOOTH_STONE_PAVING.slab(),
                        ArtisanatBlocks.CHISELED_PRISMARINE.slab(),
                        ArtisanatBlocks.PRISMARINE_BRICK_PAVING.slab()
                ))
                .addTag(ArtisanatBlockTags.STAINED_BRICK_SLABS)
                .addTag(ArtisanatBlockTags.BRICK_TILE_SLABS)
                .addTag(ArtisanatBlockTags.TERRACOTTA_SLABS)
                .addTag(ArtisanatBlockTags.TERRACOTTA_BRICK_SLABS)
                .addTag(ArtisanatBlockTags.STAINED_DARK_PRISMARINE_SLABS)
                .addTag(ArtisanatBlockTags.CONCRETE_SLABS)
                .addTag(ArtisanatBlockTags.CONCRETE_BRICK_SLABS)
                .addTag(ArtisanatBlockTags.QUARTZ_PAVING_SLABS)
        ;
        builder(BlockTags.STAIRS)
                .add(keys(
						ArtisanatBlocks.POLISHED_STONE.stairs(),
						ArtisanatBlocks.COBBLESTONE_BRICKS.stairs(),
						ArtisanatBlocks.MOSSY_COBBLESTONE_BRICKS.stairs(),
						ArtisanatBlocks.GRANITE_BRICKS.stairs(),
						ArtisanatBlocks.DIORITE_BRICKS.stairs(),
						ArtisanatBlocks.ANDESITE_BRICKS.stairs(),
                        ArtisanatBlocks.SNOW_BRICKS.stairs(),
						ArtisanatBlocks.SNOW_BRICKS.stairs(),
                        ArtisanatBlocks.SANDSTONE_BRICKS.stairs(),
                        ArtisanatBlocks.POLISHED_SANDSTONE.stairs(),
                        ArtisanatBlocks.RED_SANDSTONE_BRICKS.stairs(),
                        ArtisanatBlocks.POLISHED_RED_SANDSTONE.stairs(),
                        ArtisanatBlocks.SMOOTH_STONE_PAVING.stairs(),
                        ArtisanatBlocks.CHISELED_PRISMARINE.stairs(),
                        ArtisanatBlocks.PRISMARINE_BRICK_PAVING.stairs()
                ))
                .addTag(ArtisanatBlockTags.STAINED_BRICK_STAIRS)
                .addTag(ArtisanatBlockTags.BRICK_TILE_STAIRS)
                .addTag(ArtisanatBlockTags.TERRACOTTA_STAIRS)
                .addTag(ArtisanatBlockTags.TERRACOTTA_BRICK_STAIRS)
                .addTag(ArtisanatBlockTags.STAINED_DARK_PRISMARINE_STAIRS)
                .addTag(ArtisanatBlockTags.CONCRETE_STAIRS)
                .addTag(ArtisanatBlockTags.CONCRETE_BRICK_STAIRS)
                .addTag(ArtisanatBlockTags.QUARTZ_PAVING_STAIRS)
        ;
        builder(BlockTags.WALLS)
                .add(keys(
                        ArtisanatBlocks.COBBLESTONE_BRICKS.wall(),
                        ArtisanatBlocks.MOSSY_COBBLESTONE_BRICKS.wall(),
                        ArtisanatBlocks.GRANITE_BRICKS.wall(),
                        ArtisanatBlocks.DIORITE_BRICKS.wall(),
                        ArtisanatBlocks.ANDESITE_BRICKS.wall(),
                        ArtisanatBlocks.SNOW_BRICKS.wall(),
                        ArtisanatBlocks.SANDSTONE_BRICKS.wall(),
                        ArtisanatBlocks.RED_SANDSTONE_BRICKS.wall(),
                        ArtisanatBlocks.CHISELED_PRISMARINE.wall()
                ))
                .addTag(ArtisanatBlockTags.STAINED_BRICK_WALLS)
                .addTag(ArtisanatBlockTags.BRICK_TILE_WALLS)
                .addTag(ArtisanatBlockTags.TERRACOTTA_WALLS)
                .addTag(ArtisanatBlockTags.TERRACOTTA_BRICK_WALLS)
                .add(keys(ArtisanatBlocks.DARK_PRISMARINE_WALL))
                .addTag(ArtisanatBlockTags.STAINED_DARK_PRISMARINE_WALLS)
                .addTag(ArtisanatBlockTags.CONCRETE_WALLS)
                .addTag(ArtisanatBlockTags.CONCRETE_BRICK_WALLS)
                .addTag(ArtisanatBlockTags.QUARTZ_PAVINGS)
        ;
        builder(BlockTags.STONE_PRESSURE_PLATES)
                .addTag(ArtisanatBlockTags.TERRACOTTA_PRESSURE_PLATES)
                .addTag(ArtisanatBlockTags.CONCRETE_PRESSURE_PLATES)
        ;
        builder(BlockTags.BUTTONS)
                .addTag(ArtisanatBlockTags.TERRACOTTA_BUTTONS)
                .addTag(ArtisanatBlockTags.CONCRETE_BUTTONS)
        ;

        builder(BlockTags.WOODEN_SLABS).add(keys(
                ArtisanatBlocks.OAK_WOOD_BLOCKS.slab(),
                ArtisanatBlocks.SPRUCE_WOOD_BLOCKS.slab(),
                ArtisanatBlocks.BIRCH_WOOD_BLOCKS.slab(),
                ArtisanatBlocks.JUNGLE_WOOD_BLOCKS.slab(),
                ArtisanatBlocks.ACACIA_WOOD_BLOCKS.slab(),
                ArtisanatBlocks.CHERRY_WOOD_BLOCKS.slab(),
                ArtisanatBlocks.DARK_OAK_WOOD_BLOCKS.slab(),
                ArtisanatBlocks.PALE_OAK_WOOD_BLOCKS.slab(),
                ArtisanatBlocks.MANGROVE_WOOD_BLOCKS.slab(),
                ArtisanatBlocks.CRIMSON_HYPHAE_BLOCKS.slab(),
                ArtisanatBlocks.WARPED_HYPHAE_BLOCKS.slab()
        ));
        builder(BlockTags.WOODEN_STAIRS).add(keys(
                ArtisanatBlocks.OAK_WOOD_BLOCKS.stairs(),
                ArtisanatBlocks.SPRUCE_WOOD_BLOCKS.stairs(),
                ArtisanatBlocks.BIRCH_WOOD_BLOCKS.stairs(),
                ArtisanatBlocks.JUNGLE_WOOD_BLOCKS.stairs(),
                ArtisanatBlocks.ACACIA_WOOD_BLOCKS.stairs(),
                ArtisanatBlocks.CHERRY_WOOD_BLOCKS.stairs(),
                ArtisanatBlocks.DARK_OAK_WOOD_BLOCKS.stairs(),
                ArtisanatBlocks.PALE_OAK_WOOD_BLOCKS.stairs(),
                ArtisanatBlocks.MANGROVE_WOOD_BLOCKS.stairs(),
                ArtisanatBlocks.CRIMSON_HYPHAE_BLOCKS.stairs(),
                ArtisanatBlocks.WARPED_HYPHAE_BLOCKS.stairs()
        ));
        builder(BlockTags.WOODEN_BUTTONS).add(keys(
                ArtisanatBlocks.OAK_WOOD_BLOCKS.button(),
                ArtisanatBlocks.SPRUCE_WOOD_BLOCKS.button(),
                ArtisanatBlocks.BIRCH_WOOD_BLOCKS.button(),
                ArtisanatBlocks.JUNGLE_WOOD_BLOCKS.button(),
                ArtisanatBlocks.ACACIA_WOOD_BLOCKS.button(),
                ArtisanatBlocks.CHERRY_WOOD_BLOCKS.button(),
                ArtisanatBlocks.DARK_OAK_WOOD_BLOCKS.button(),
                ArtisanatBlocks.PALE_OAK_WOOD_BLOCKS.button(),
                ArtisanatBlocks.MANGROVE_WOOD_BLOCKS.button(),
                ArtisanatBlocks.CRIMSON_HYPHAE_BLOCKS.button(),
                ArtisanatBlocks.WARPED_HYPHAE_BLOCKS.button()
        ));

        builder(BlockTags.NEEDS_STONE_TOOL)
                .addTag(ArtisanatBlockTags.IRON_BLOCKS)
                .addTag(ArtisanatBlockTags.COPPER_BLOCKS)
                .addTag(ArtisanatBlockTags.LAPIS_BLOCKS);
        builder(BlockTags.NEEDS_IRON_TOOL)
                .addTag(ArtisanatBlockTags.GOLD_BLOCKS)
                .addTag(ArtisanatBlockTags.EMERALD_BLOCKS)
                .addTag(ArtisanatBlockTags.DIAMOND_BLOCKS);
        builder(BlockTags.NEEDS_DIAMOND_TOOL).addTag(ArtisanatBlockTags.NETHERITE_BLOCKS);
        builder(BlockTags.BEACON_BASE_BLOCKS)
                .addTag(ArtisanatBlockTags.IRON_BLOCKS)
                .addTag(ArtisanatBlockTags.GOLD_BLOCKS)
                .addTag(ArtisanatBlockTags.EMERALD_BLOCKS)
                .addTag(ArtisanatBlockTags.DIAMOND_BLOCKS)
                .addTag(ArtisanatBlockTags.NETHERITE_BLOCKS);

        builder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(keys(ArtisanatBlocks.POLISHED_STONE.all()))
                .add(keys(ArtisanatBlocks.COBBLESTONE_BRICKS.all()))
                .add(keys(ArtisanatBlocks.MOSSY_COBBLESTONE_BRICKS.all()))
                .add(keys(ArtisanatBlocks.GRANITE_BRICKS.all()))
                .add(keys(ArtisanatBlocks.DIORITE_BRICKS.all()))
                .add(keys(ArtisanatBlocks.ANDESITE_BRICKS.all()))
                .add(keys(ArtisanatBlocks.SANDSTONE_BRICKS.all()))
                .add(keys(ArtisanatBlocks.POLISHED_SANDSTONE.all()))
                .add(keys(ArtisanatBlocks.RED_SANDSTONE_BRICKS.all()))
                .add(keys(ArtisanatBlocks.POLISHED_RED_SANDSTONE.all()))
                .add(keys(ArtisanatBlocks.SMOOTH_STONE_PAVING.all()))
                .add(keys(ArtisanatBlocks.CHISELED_PRISMARINE.all()))
                .add(keys(ArtisanatBlocks.PRISMARINE_BRICK_PAVING.all()))
                .addTag(ArtisanatBlockTags.STAINED_BRICK_BLOCKS)
                .addTag(ArtisanatBlockTags.STAINED_BRICK_SLABS)
                .addTag(ArtisanatBlockTags.STAINED_BRICK_STAIRS)
                .addTag(ArtisanatBlockTags.STAINED_BRICK_WALLS)
                .addTag(ArtisanatBlockTags.BRICK_TILES)
                .addTag(ArtisanatBlockTags.BRICK_TILE_SLABS)
                .addTag(ArtisanatBlockTags.BRICK_TILE_STAIRS)
                .addTag(ArtisanatBlockTags.BRICK_TILE_WALLS)
                .addTag(ArtisanatBlockTags.TERRACOTTA_SLABS)
                .addTag(ArtisanatBlockTags.TERRACOTTA_STAIRS)
                .addTag(ArtisanatBlockTags.TERRACOTTA_PRESSURE_PLATES)
                .addTag(ArtisanatBlockTags.TERRACOTTA_BRICKS)
                .addTag(ArtisanatBlockTags.TERRACOTTA_BRICK_SLABS)
                .addTag(ArtisanatBlockTags.TERRACOTTA_BRICK_STAIRS)
                .addTag(ArtisanatBlockTags.TERRACOTTA_BRICK_WALLS)
                .add(keys(ArtisanatBlocks.DARK_PRISMARINE_WALL))
                .addTag(ArtisanatBlockTags.STAINED_DARK_PRISMARINE_BLOCKS)
                .addTag(ArtisanatBlockTags.STAINED_DARK_PRISMARINE_SLABS)
                .addTag(ArtisanatBlockTags.STAINED_DARK_PRISMARINE_STAIRS)
                .addTag(ArtisanatBlockTags.CONCRETE_SLABS)
                .addTag(ArtisanatBlockTags.CONCRETE_STAIRS)
                .addTag(ArtisanatBlockTags.CONCRETE_PRESSURE_PLATES)
                .addTag(ArtisanatBlockTags.CONCRETE_BRICKS)
                .addTag(ArtisanatBlockTags.CONCRETE_BRICK_SLABS)
                .addTag(ArtisanatBlockTags.CONCRETE_BRICK_STAIRS)
                .addTag(ArtisanatBlockTags.CONCRETE_BRICK_WALLS)
                .addTag(ArtisanatBlockTags.QUARTZ_PAVINGS)
                .addTag(ArtisanatBlockTags.QUARTZ_PAVING_SLABS)
                .addTag(ArtisanatBlockTags.QUARTZ_PAVING_STAIRS)
                .addTag(ArtisanatBlockTags.COAL_BLOCKS)
                .addTag(ArtisanatBlockTags.IRON_BLOCKS)
                .addTag(ArtisanatBlockTags.COPPER_BLOCKS)
                .addTag(ArtisanatBlockTags.GOLD_BLOCKS)
                .addTag(ArtisanatBlockTags.LAPIS_BLOCKS)
                .addTag(ArtisanatBlockTags.REDSTONE_BLOCKS)
                .addTag(ArtisanatBlockTags.EMERALD_BLOCKS)
                .addTag(ArtisanatBlockTags.DIAMOND_BLOCKS)
                .addTag(ArtisanatBlockTags.NETHERITE_BLOCKS)
        ;
        builder(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(keys(ArtisanatBlocks.SNOW_BRICKS.all()))
		;
    }

    private void fill(TagAppender<Block> tagBuilder, Function<SSWPBBlocks, Block> consumer, StainedSSWPBBlocks... stainedSswpbs) {
        for (var stainedSswpb : stainedSswpbs) {
            for (var block : stainedSswpb.colorMap().values()) {
                tagBuilder.add(keys(consumer.apply(block)));
            }
        }
    }

    private void fill(TagAppender<Block> tagBuilder, Function<BSSWBlocks, Block> consumer, StainedBSSWBlocks... stainedBssws) {
        for (var stainedBssw : stainedBssws) {
            for (var block : stainedBssw.colorMap().values()) {
                tagBuilder.add(keys(consumer.apply(block)));
            }
        }
    }

    private void fill(TagAppender<Block> tagBuilder, Function<BSSBlocks, Block> consumer, StainedBSSBlocks... stainedBsss) {
        for (var stainedBss : stainedBsss) {
            for (var block : stainedBss.colorMap().values()) {
                tagBuilder.add(keys(consumer.apply(block)));
            }
        }
    }

    private void createOreTags(TagKey<Block> tag, OreBlocks oreBlocks) {
        builder(tag).add(keys(
                oreBlocks.platedBlock(),
                oreBlocks.cutBlock(),
                oreBlocks.bricks(),
                oreBlocks.tiles()
        ));
    }


    private void createOreTags(TagKey<Block> tag, CopperBlocks... copperBlocks) {
        var tagBuilder = builder(tag);
        for (CopperBlocks copperBlock : copperBlocks) {
            tagBuilder.add(keys(copperBlock.map().values().toArray(new Block[0])));
        }
    }

    @SuppressWarnings("unchecked")
    private static ResourceKey<Block>[] keys(Block... blocks) {
        return Arrays.stream(blocks).map(block -> block.builtInRegistryHolder().key()).toArray(ResourceKey[]::new);
    }
}
