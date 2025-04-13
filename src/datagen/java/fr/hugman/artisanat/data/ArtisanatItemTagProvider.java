package fr.hugman.artisanat.data;

import fr.hugman.artisanat.block.ArtisanatBlocks;
import fr.hugman.artisanat.tag.ArtisanatBlockTags;
import fr.hugman.artisanat.tag.ArtisanatItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;


public class ArtisanatItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ArtisanatItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture, @Nullable BlockTagProvider blockTagProvider) {
        super(output, completableFuture, blockTagProvider);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        // Artisanat
        copy(ArtisanatBlockTags.STAINED_BRICK_BLOCKS, ArtisanatItemTags.STAINED_BRICK_BLOCKS);
        copy(ArtisanatBlockTags.STAINED_BRICK_SLABS, ArtisanatItemTags.STAINED_BRICK_SLABS);
        copy(ArtisanatBlockTags.STAINED_BRICK_STAIRS, ArtisanatItemTags.STAINED_BRICK_STAIRS);
        copy(ArtisanatBlockTags.STAINED_BRICK_WALLS, ArtisanatItemTags.STAINED_BRICK_WALLS);
        copy(ArtisanatBlockTags.BRICK_TILES, ArtisanatItemTags.BRICK_TILES);
        copy(ArtisanatBlockTags.BRICK_TILE_SLABS, ArtisanatItemTags.BRICK_TILE_SLABS);
        copy(ArtisanatBlockTags.BRICK_TILE_STAIRS, ArtisanatItemTags.BRICK_TILE_STAIRS);
        copy(ArtisanatBlockTags.BRICK_TILE_WALLS, ArtisanatItemTags.BRICK_TILE_WALLS);
        copy(ArtisanatBlockTags.TERRACOTTA_SLABS, ArtisanatItemTags.TERRACOTTA_SLABS);
        copy(ArtisanatBlockTags.TERRACOTTA_STAIRS, ArtisanatItemTags.TERRACOTTA_STAIRS);
        copy(ArtisanatBlockTags.TERRACOTTA_WALLS, ArtisanatItemTags.TERRACOTTA_WALLS);
        copy(ArtisanatBlockTags.TERRACOTTA_PRESSURE_PLATES, ArtisanatItemTags.TERRACOTTA_PRESSURE_PLATES);
        copy(ArtisanatBlockTags.TERRACOTTA_BUTTONS, ArtisanatItemTags.TERRACOTTA_BUTTONS);
        copy(ArtisanatBlockTags.TERRACOTTA_BRICKS, ArtisanatItemTags.TERRACOTTA_BRICKS);
        copy(ArtisanatBlockTags.TERRACOTTA_BRICK_SLABS, ArtisanatItemTags.TERRACOTTA_BRICK_SLABS);
        copy(ArtisanatBlockTags.TERRACOTTA_BRICK_STAIRS, ArtisanatItemTags.TERRACOTTA_BRICK_STAIRS);
        copy(ArtisanatBlockTags.TERRACOTTA_BRICK_WALLS, ArtisanatItemTags.TERRACOTTA_BRICK_WALLS);
        copy(ArtisanatBlockTags.STAINED_DARK_PRISMARINE_BLOCKS, ArtisanatItemTags.STAINED_DARK_PRISMARINE_BLOCKS);
        copy(ArtisanatBlockTags.STAINED_DARK_PRISMARINE_SLABS, ArtisanatItemTags.STAINED_DARK_PRISMARINE_SLABS);
        copy(ArtisanatBlockTags.STAINED_DARK_PRISMARINE_STAIRS, ArtisanatItemTags.STAINED_DARK_PRISMARINE_STAIRS);
        copy(ArtisanatBlockTags.STAINED_DARK_PRISMARINE_WALLS, ArtisanatItemTags.STAINED_DARK_PRISMARINE_WALLS);
        copy(ArtisanatBlockTags.CONCRETE_SLABS, ArtisanatItemTags.CONCRETE_SLABS);
        copy(ArtisanatBlockTags.CONCRETE_STAIRS, ArtisanatItemTags.CONCRETE_STAIRS);
        copy(ArtisanatBlockTags.CONCRETE_WALLS, ArtisanatItemTags.CONCRETE_WALLS);
        copy(ArtisanatBlockTags.CONCRETE_PRESSURE_PLATES, ArtisanatItemTags.CONCRETE_PRESSURE_PLATES);
        copy(ArtisanatBlockTags.CONCRETE_BUTTONS, ArtisanatItemTags.CONCRETE_BUTTONS);
        copy(ArtisanatBlockTags.QUARTZ_PAVINGS, ArtisanatItemTags.QUARTZ_PAVINGS);
        copy(ArtisanatBlockTags.QUARTZ_PAVING_SLABS, ArtisanatItemTags.QUARTZ_PAVING_SLABS);
        copy(ArtisanatBlockTags.QUARTZ_PAVING_STAIRS, ArtisanatItemTags.QUARTZ_PAVING_STAIRS);
        copy(ArtisanatBlockTags.COAL_BLOCKS, ArtisanatItemTags.COAL_BLOCKS);
        copy(ArtisanatBlockTags.IRON_BLOCKS, ArtisanatItemTags.IRON_BLOCKS);
        copy(ArtisanatBlockTags.COPPER_BLOCKS, ArtisanatItemTags.COPPER_BLOCKS);
        copy(ArtisanatBlockTags.GOLD_BLOCKS, ArtisanatItemTags.GOLD_BLOCKS);
        copy(ArtisanatBlockTags.LAPIS_BLOCKS, ArtisanatItemTags.LAPIS_BLOCKS);
        copy(ArtisanatBlockTags.REDSTONE_BLOCKS, ArtisanatItemTags.REDSTONE_BLOCKS);
        copy(ArtisanatBlockTags.EMERALD_BLOCKS, ArtisanatItemTags.EMERALD_BLOCKS);
        copy(ArtisanatBlockTags.DIAMOND_BLOCKS, ArtisanatItemTags.DIAMOND_BLOCKS);
        copy(ArtisanatBlockTags.NETHERITE_BLOCKS, ArtisanatItemTags.NETHERITE_BLOCKS);

        // Vanilla
        copy(BlockTags.SLABS, ItemTags.SLABS);
        copy(BlockTags.STAIRS, ItemTags.STAIRS);
        copy(BlockTags.WALLS, ItemTags.WALLS);
        copy(BlockTags.BUTTONS, ItemTags.BUTTONS);

        copy(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS);
        copy(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS);
        copy(BlockTags.WOODEN_BUTTONS, ItemTags.WOODEN_BUTTONS);

        getOrCreateTagBuilder(ItemTags.NON_FLAMMABLE_WOOD).add(
                ArtisanatBlocks.CRIMSON_HYPHAE_BLOCKS.stairs().asItem(),
                ArtisanatBlocks.CRIMSON_HYPHAE_BLOCKS.slab().asItem(),
                ArtisanatBlocks.CRIMSON_HYPHAE_BLOCKS.button().asItem(),
                ArtisanatBlocks.WARPED_HYPHAE_BLOCKS.button().asItem(),
                ArtisanatBlocks.WARPED_HYPHAE_BLOCKS.button().asItem(),
                ArtisanatBlocks.WARPED_HYPHAE_BLOCKS.button().asItem()
        );

        getOrCreateTagBuilder(ItemTags.PIGLIN_LOVED).addTag(ArtisanatItemTags.GOLD_BLOCKS);
    }
}