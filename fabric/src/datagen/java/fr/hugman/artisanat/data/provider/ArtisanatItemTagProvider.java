package fr.hugman.artisanat.data.provider;

import fr.hugman.artisanat.block.ArtisanatBlocks;
import fr.hugman.artisanat.tag.ArtisanatBlockTags;
import fr.hugman.artisanat.tag.ArtisanatItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockItemTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

public class ArtisanatItemTagProvider extends FabricTagsProvider.ItemTagsProvider {
    public ArtisanatItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture, @Nullable BlockTagsProvider blockTags) {
        super(output, completableFuture, blockTags);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
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
        copy(ArtisanatBlockTags.CONCRETE_BRICKS, ArtisanatItemTags.CONCRETE_BRICKS);
        copy(ArtisanatBlockTags.CONCRETE_BRICK_SLABS, ArtisanatItemTags.CONCRETE_BRICK_SLABS);
        copy(ArtisanatBlockTags.CONCRETE_BRICK_STAIRS, ArtisanatItemTags.CONCRETE_BRICK_STAIRS);
        copy(ArtisanatBlockTags.CONCRETE_BRICK_WALLS, ArtisanatItemTags.CONCRETE_BRICK_WALLS);
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
        copy(BlockItemTags.SLABS.block(), BlockItemTags.SLABS.item());
        copy(BlockItemTags.STAIRS.block(), BlockItemTags.STAIRS.item());
        copy(BlockItemTags.WALLS.block(), BlockItemTags.WALLS.item());
        copy(BlockItemTags.BUTTONS.block(), BlockItemTags.BUTTONS.item());

        copy(BlockItemTags.WOODEN_SLABS.block(), BlockItemTags.WOODEN_SLABS.item());
        copy(BlockItemTags.WOODEN_STAIRS.block(), BlockItemTags.WOODEN_STAIRS.item());
        copy(BlockItemTags.WOODEN_BUTTONS.block(), BlockItemTags.WOODEN_BUTTONS.item());

        builder(ItemTags.NON_FLAMMABLE_WOOD).add(keys(
                ArtisanatBlocks.CRIMSON_HYPHAE_BLOCKS.stairs(),
                ArtisanatBlocks.CRIMSON_HYPHAE_BLOCKS.slab(),
                ArtisanatBlocks.CRIMSON_HYPHAE_BLOCKS.button(),
                ArtisanatBlocks.WARPED_HYPHAE_BLOCKS.button(),
                ArtisanatBlocks.WARPED_HYPHAE_BLOCKS.button(),
                ArtisanatBlocks.WARPED_HYPHAE_BLOCKS.button()
        ));

        builder(ItemTags.PIGLIN_LOVED).addTag(ArtisanatItemTags.GOLD_BLOCKS);
    }

    @SuppressWarnings("unchecked")
    private static ResourceKey<Item>[] keys(ItemLike... items) {
        return Arrays.stream(items).map(item -> item.asItem().builtInRegistryHolder().key()).toArray(ResourceKey[]::new);
    }
}
