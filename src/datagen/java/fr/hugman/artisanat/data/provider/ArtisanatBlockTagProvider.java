package fr.hugman.artisanat.data.provider;

import fr.hugman.artisanat.block.ArtisanatBlocks;
import fr.hugman.artisanat.block.groups.*;
import fr.hugman.artisanat.tag.ArtisanatBlockTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.data.tag.ProvidedTagBuilder;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;


public class ArtisanatBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ArtisanatBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        // Artisanat
        fill(valueLookupBuilder(ArtisanatBlockTags.STAINED_BRICK_BLOCKS), BSSWBlocks::block, ArtisanatBlocks.STAINED_BRICK_BLOCKS);
        fill(valueLookupBuilder(ArtisanatBlockTags.STAINED_BRICK_SLABS), BSSWBlocks::slab, ArtisanatBlocks.STAINED_BRICK_BLOCKS);
        fill(valueLookupBuilder(ArtisanatBlockTags.STAINED_BRICK_STAIRS), BSSWBlocks::stairs, ArtisanatBlocks.STAINED_BRICK_BLOCKS);
        fill(valueLookupBuilder(ArtisanatBlockTags.STAINED_BRICK_WALLS), BSSWBlocks::wall, ArtisanatBlocks.STAINED_BRICK_BLOCKS);

        fill(valueLookupBuilder(ArtisanatBlockTags.BRICK_TILES).add(ArtisanatBlocks.BRICK_TILE_BLOCKS.block()), BSSWBlocks::block, ArtisanatBlocks.STAINED_BRICK_TILE_BLOCKS);
        fill(valueLookupBuilder(ArtisanatBlockTags.BRICK_TILE_SLABS).add(ArtisanatBlocks.BRICK_TILE_BLOCKS.slab()), BSSWBlocks::slab, ArtisanatBlocks.STAINED_BRICK_TILE_BLOCKS);
        fill(valueLookupBuilder(ArtisanatBlockTags.BRICK_TILE_STAIRS).add(ArtisanatBlocks.BRICK_TILE_BLOCKS.stairs()), BSSWBlocks::stairs, ArtisanatBlocks.STAINED_BRICK_TILE_BLOCKS);
        fill(valueLookupBuilder(ArtisanatBlockTags.BRICK_TILE_WALLS).add(ArtisanatBlocks.BRICK_TILE_BLOCKS.wall()), BSSWBlocks::wall, ArtisanatBlocks.STAINED_BRICK_TILE_BLOCKS);

        fill(valueLookupBuilder(ArtisanatBlockTags.TERRACOTTA_SLABS).add(ArtisanatBlocks.TERRACOTTA_BLOCKS.slab()), SSWPBBlocks::slab, ArtisanatBlocks.STAINED_TERRACOTTA_BLOCKS);
        fill(valueLookupBuilder(ArtisanatBlockTags.TERRACOTTA_STAIRS).add(ArtisanatBlocks.TERRACOTTA_BLOCKS.stairs()), SSWPBBlocks::stairs, ArtisanatBlocks.STAINED_TERRACOTTA_BLOCKS);
        fill(valueLookupBuilder(ArtisanatBlockTags.TERRACOTTA_WALLS).add(ArtisanatBlocks.TERRACOTTA_BLOCKS.wall()), SSWPBBlocks::wall, ArtisanatBlocks.STAINED_TERRACOTTA_BLOCKS);
        fill(valueLookupBuilder(ArtisanatBlockTags.TERRACOTTA_PRESSURE_PLATES).add(ArtisanatBlocks.TERRACOTTA_BLOCKS.pressurePlate()), SSWPBBlocks::pressurePlate, ArtisanatBlocks.STAINED_TERRACOTTA_BLOCKS);
        fill(valueLookupBuilder(ArtisanatBlockTags.TERRACOTTA_BUTTONS).add(ArtisanatBlocks.TERRACOTTA_BLOCKS.button()), SSWPBBlocks::button, ArtisanatBlocks.STAINED_TERRACOTTA_BLOCKS);

        fill(valueLookupBuilder(ArtisanatBlockTags.TERRACOTTA_BRICKS).add(ArtisanatBlocks.TERRACOTTA_BRICKS.block()), BSSWBlocks::block, ArtisanatBlocks.STAINED_TERRACOTTA_BRICKS);
        fill(valueLookupBuilder(ArtisanatBlockTags.TERRACOTTA_BRICK_SLABS).add(ArtisanatBlocks.TERRACOTTA_BRICKS.slab()), BSSWBlocks::slab, ArtisanatBlocks.STAINED_TERRACOTTA_BRICKS);
        fill(valueLookupBuilder(ArtisanatBlockTags.TERRACOTTA_BRICK_STAIRS).add(ArtisanatBlocks.TERRACOTTA_BRICKS.stairs()), BSSWBlocks::stairs, ArtisanatBlocks.STAINED_TERRACOTTA_BRICKS);
        fill(valueLookupBuilder(ArtisanatBlockTags.TERRACOTTA_BRICK_WALLS).add(ArtisanatBlocks.TERRACOTTA_BRICKS.wall()), BSSWBlocks::wall, ArtisanatBlocks.STAINED_TERRACOTTA_BRICKS);

        fill(valueLookupBuilder(ArtisanatBlockTags.STAINED_DARK_PRISMARINE_BLOCKS), BSSWBlocks::block, ArtisanatBlocks.STAINED_DARK_PRISMARINE_BLOCKS);
        fill(valueLookupBuilder(ArtisanatBlockTags.STAINED_DARK_PRISMARINE_SLABS), BSSWBlocks::slab, ArtisanatBlocks.STAINED_DARK_PRISMARINE_BLOCKS);
        fill(valueLookupBuilder(ArtisanatBlockTags.STAINED_DARK_PRISMARINE_STAIRS), BSSWBlocks::stairs, ArtisanatBlocks.STAINED_DARK_PRISMARINE_BLOCKS);
        fill(valueLookupBuilder(ArtisanatBlockTags.STAINED_DARK_PRISMARINE_WALLS), BSSWBlocks::wall, ArtisanatBlocks.STAINED_DARK_PRISMARINE_BLOCKS);

        fill(valueLookupBuilder(ArtisanatBlockTags.CONCRETE_SLABS), SSWPBBlocks::slab, ArtisanatBlocks.CONCRETE_BLOCKS);
        fill(valueLookupBuilder(ArtisanatBlockTags.CONCRETE_STAIRS), SSWPBBlocks::stairs, ArtisanatBlocks.CONCRETE_BLOCKS);
        fill(valueLookupBuilder(ArtisanatBlockTags.CONCRETE_WALLS), SSWPBBlocks::wall, ArtisanatBlocks.CONCRETE_BLOCKS);
        fill(valueLookupBuilder(ArtisanatBlockTags.CONCRETE_PRESSURE_PLATES), SSWPBBlocks::pressurePlate, ArtisanatBlocks.CONCRETE_BLOCKS);
        fill(valueLookupBuilder(ArtisanatBlockTags.CONCRETE_BUTTONS), SSWPBBlocks::button, ArtisanatBlocks.CONCRETE_BLOCKS);

        fill(valueLookupBuilder(ArtisanatBlockTags.CONCRETE_BRICKS), BSSWBlocks::block, ArtisanatBlocks.CONCRETE_BRICKS);
        fill(valueLookupBuilder(ArtisanatBlockTags.CONCRETE_BRICK_SLABS), BSSWBlocks::slab, ArtisanatBlocks.CONCRETE_BRICKS);
        fill(valueLookupBuilder(ArtisanatBlockTags.CONCRETE_BRICK_STAIRS), BSSWBlocks::stairs, ArtisanatBlocks.CONCRETE_BRICKS);
        fill(valueLookupBuilder(ArtisanatBlockTags.CONCRETE_BRICK_WALLS), BSSWBlocks::wall, ArtisanatBlocks.CONCRETE_BRICKS);

        fill(valueLookupBuilder(ArtisanatBlockTags.QUARTZ_PAVINGS), BSSBlocks::block, ArtisanatBlocks.QUARTZ_PAVING_BLOCKS);
        fill(valueLookupBuilder(ArtisanatBlockTags.QUARTZ_PAVING_SLABS), BSSBlocks::slab, ArtisanatBlocks.QUARTZ_PAVING_BLOCKS);
        fill(valueLookupBuilder(ArtisanatBlockTags.QUARTZ_PAVING_STAIRS), BSSBlocks::stairs, ArtisanatBlocks.QUARTZ_PAVING_BLOCKS);

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
        valueLookupBuilder(BlockTags.SLABS)
                .add(
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
                )
                .addTag(ArtisanatBlockTags.STAINED_BRICK_SLABS)
                .addTag(ArtisanatBlockTags.BRICK_TILE_SLABS)
                .addTag(ArtisanatBlockTags.TERRACOTTA_SLABS)
                .addTag(ArtisanatBlockTags.TERRACOTTA_BRICK_SLABS)
                .addTag(ArtisanatBlockTags.STAINED_DARK_PRISMARINE_SLABS)
                .addTag(ArtisanatBlockTags.CONCRETE_SLABS)
                .addTag(ArtisanatBlockTags.CONCRETE_BRICK_SLABS)
                .addTag(ArtisanatBlockTags.QUARTZ_PAVING_SLABS)
        ;
        valueLookupBuilder(BlockTags.STAIRS)
                .add(
                        ArtisanatBlocks.COBBLESTONE_BRICKS.stairs(),
                        ArtisanatBlocks.MOSSY_COBBLESTONE_BRICKS.stairs(),
                        ArtisanatBlocks.GRANITE_BRICKS.stairs(),
                        ArtisanatBlocks.DIORITE_BRICKS.stairs(),
                        ArtisanatBlocks.ANDESITE_BRICKS.stairs(),
                        ArtisanatBlocks.SNOW_BRICKS.stairs(),
                        ArtisanatBlocks.SANDSTONE_BRICKS.stairs(),
                        ArtisanatBlocks.POLISHED_SANDSTONE.stairs(),
                        ArtisanatBlocks.RED_SANDSTONE_BRICKS.stairs(),
                        ArtisanatBlocks.POLISHED_RED_SANDSTONE.stairs(),
                        ArtisanatBlocks.SMOOTH_STONE_PAVING.stairs(),
                        ArtisanatBlocks.CHISELED_PRISMARINE.stairs(),
                        ArtisanatBlocks.PRISMARINE_BRICK_PAVING.stairs()
                )
                .addTag(ArtisanatBlockTags.STAINED_BRICK_STAIRS)
                .addTag(ArtisanatBlockTags.BRICK_TILE_STAIRS)
                .addTag(ArtisanatBlockTags.TERRACOTTA_STAIRS)
                .addTag(ArtisanatBlockTags.TERRACOTTA_BRICK_STAIRS)
                .addTag(ArtisanatBlockTags.STAINED_DARK_PRISMARINE_STAIRS)
                .addTag(ArtisanatBlockTags.CONCRETE_STAIRS)
                .addTag(ArtisanatBlockTags.CONCRETE_BRICK_STAIRS)
                .addTag(ArtisanatBlockTags.QUARTZ_PAVING_STAIRS)
        ;
        valueLookupBuilder(BlockTags.WALLS)
                .add(
                        ArtisanatBlocks.COBBLESTONE_BRICKS.wall(),
                        ArtisanatBlocks.MOSSY_COBBLESTONE_BRICKS.wall(),
                        ArtisanatBlocks.GRANITE_BRICKS.wall(),
                        ArtisanatBlocks.DIORITE_BRICKS.wall(),
                        ArtisanatBlocks.ANDESITE_BRICKS.wall(),
                        ArtisanatBlocks.SNOW_BRICKS.wall(),
                        ArtisanatBlocks.SANDSTONE_BRICKS.wall(),
                        ArtisanatBlocks.RED_SANDSTONE_BRICKS.wall(),
                        ArtisanatBlocks.CHISELED_PRISMARINE.wall()
                )
                .addTag(ArtisanatBlockTags.STAINED_BRICK_WALLS)
                .addTag(ArtisanatBlockTags.BRICK_TILE_WALLS)
                .addTag(ArtisanatBlockTags.TERRACOTTA_WALLS)
                .addTag(ArtisanatBlockTags.TERRACOTTA_BRICK_WALLS)
                .add(ArtisanatBlocks.DARK_PRISMARINE_WALL)
                .addTag(ArtisanatBlockTags.STAINED_DARK_PRISMARINE_WALLS)
                .addTag(ArtisanatBlockTags.CONCRETE_WALLS)
                .addTag(ArtisanatBlockTags.CONCRETE_BRICK_WALLS)
                .addTag(ArtisanatBlockTags.QUARTZ_PAVINGS)
        ;
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES)
                .addTag(ArtisanatBlockTags.TERRACOTTA_PRESSURE_PLATES)
                .addTag(ArtisanatBlockTags.CONCRETE_PRESSURE_PLATES)
        ;
        valueLookupBuilder(BlockTags.BUTTONS)
                .addTag(ArtisanatBlockTags.TERRACOTTA_BUTTONS)
                .addTag(ArtisanatBlockTags.CONCRETE_BUTTONS)
        ;

        valueLookupBuilder(BlockTags.WOODEN_SLABS).add(
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
        );
        valueLookupBuilder(BlockTags.WOODEN_STAIRS).add(
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
        );
        valueLookupBuilder(BlockTags.WOODEN_BUTTONS).add(
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
        );

        valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL)
                .addTag(ArtisanatBlockTags.IRON_BLOCKS)
                .addTag(ArtisanatBlockTags.COPPER_BLOCKS)
                .addTag(ArtisanatBlockTags.LAPIS_BLOCKS);
        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL)
                .addTag(ArtisanatBlockTags.GOLD_BLOCKS)
                .addTag(ArtisanatBlockTags.EMERALD_BLOCKS)
                .addTag(ArtisanatBlockTags.DIAMOND_BLOCKS);
        valueLookupBuilder(BlockTags.NEEDS_DIAMOND_TOOL).addTag(ArtisanatBlockTags.NETHERITE_BLOCKS);
        valueLookupBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .addTag(ArtisanatBlockTags.IRON_BLOCKS)
                .addTag(ArtisanatBlockTags.GOLD_BLOCKS)
                .addTag(ArtisanatBlockTags.EMERALD_BLOCKS)
                .addTag(ArtisanatBlockTags.DIAMOND_BLOCKS)
                .addTag(ArtisanatBlockTags.NETHERITE_BLOCKS);

        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ArtisanatBlocks.COBBLESTONE_BRICKS.all())
                .add(ArtisanatBlocks.MOSSY_COBBLESTONE_BRICKS.all())
                .add(ArtisanatBlocks.GRANITE_BRICKS.all())
                .add(ArtisanatBlocks.DIORITE_BRICKS.all())
                .add(ArtisanatBlocks.ANDESITE_BRICKS.all())
                .add(ArtisanatBlocks.SANDSTONE_BRICKS.all())
                .add(ArtisanatBlocks.POLISHED_SANDSTONE.all())
                .add(ArtisanatBlocks.RED_SANDSTONE_BRICKS.all())
                .add(ArtisanatBlocks.POLISHED_RED_SANDSTONE.all())
                .add(ArtisanatBlocks.SMOOTH_STONE_PAVING.all())
                .add(ArtisanatBlocks.CHISELED_PRISMARINE.all())
                .add(ArtisanatBlocks.PRISMARINE_BRICK_PAVING.all())
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
                .add(ArtisanatBlocks.DARK_PRISMARINE_WALL)
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
		valueLookupBuilder(BlockTags.SHOVEL_MINEABLE)
				.add(ArtisanatBlocks.SNOW_BRICKS.all())
		;
    }

    private void fill(ProvidedTagBuilder<Block, Block> tagBuilder, Function<SSWPBBlocks, Block> consumer, StainedSSWPBBlocks... stainedSswpbs) {
        for (var stainedSswpb : stainedSswpbs) {
            for (var block : stainedSswpb.colorMap().values()) {
                tagBuilder.add(consumer.apply(block));
            }
        }
    }

    private void fill(ProvidedTagBuilder<Block, Block> tagBuilder, Function<BSSWBlocks, Block> consumer, StainedBSSWBlocks... stainedBssws) {
        for (var stainedBssw : stainedBssws) {
            for (var block : stainedBssw.colorMap().values()) {
                tagBuilder.add(consumer.apply(block));
            }
        }
    }

    private void fill(ProvidedTagBuilder<Block, Block> tagBuilder, Function<BSSBlocks, Block> consumer, StainedBSSBlocks... stainedBsss) {
        for (var stainedBss : stainedBsss) {
            for (var block : stainedBss.colorMap().values()) {
                tagBuilder.add(consumer.apply(block));
            }
        }
    }

    private void createOreTags(TagKey<Block> tag, OreBlocks oreBlocks) {
        valueLookupBuilder(tag).add(
                oreBlocks.platedBlock(),
                oreBlocks.cutBlock(),
                oreBlocks.bricks(),
                oreBlocks.tiles()
        );
    }


    private void createOreTags(TagKey<Block> tag, CopperBlocks... copperBlocks) {
        var tagBuilder = valueLookupBuilder(tag);
        for (CopperBlocks copperBlock : copperBlocks) {
            tagBuilder.add(copperBlock.map().values().toArray(new Block[0]));
        }
    }

}