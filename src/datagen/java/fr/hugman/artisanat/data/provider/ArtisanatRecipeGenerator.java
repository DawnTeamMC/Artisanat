package fr.hugman.artisanat.data.provider;

import fr.hugman.artisanat.block.ArtisanatBlocks;
import fr.hugman.artisanat.block.groups.*;
import fr.hugman.artisanat.data.ArtisanatBlockFamilies;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.util.DyeColor;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ArtisanatRecipeGenerator extends RecipeGenerator {
    public ArtisanatRecipeGenerator(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter) {
        super(registries, exporter);
    }

    @Override
    public void generate() {
        ArtisanatBlockFamilies.getFamilies().filter(BlockFamily::shouldGenerateRecipes).forEach(family -> this.generateFamily(family, FeatureSet.of(FeatureFlags.VANILLA)));

        // TODO: coloring recipes

        registerStonecutting(ArtisanatBlocks.COBBLESTONE_BRICKS, Blocks.COBBLESTONE);
        registerStonecutting(ArtisanatBlocks.MOSSY_COBBLESTONE_BRICKS, Blocks.MOSSY_COBBLESTONE);
        registerStonecutting(ArtisanatBlocks.GRANITE_BRICKS, Blocks.GRANITE);
        registerStonecutting(ArtisanatBlocks.DIORITE_BRICKS, Blocks.DIORITE);
        registerStonecutting(ArtisanatBlocks.ANDESITE_BRICKS, Blocks.ANDESITE);

        registerStonecutting(ArtisanatBlocks.SANDSTONE_BRICKS, Blocks.SANDSTONE);
        registerStonecutting(ArtisanatBlocks.POLISHED_SANDSTONE, Blocks.SANDSTONE);
        registerStonecutting(ArtisanatBlocks.RED_SANDSTONE_BRICKS, Blocks.RED_SANDSTONE);
        registerStonecutting(ArtisanatBlocks.POLISHED_RED_SANDSTONE, Blocks.RED_SANDSTONE);
        registerStonecutting(ArtisanatBlocks.SMOOTH_STONE_PAVING, Blocks.SMOOTH_STONE);
        registerStonecutting(ArtisanatBlocks.CHISELED_PRISMARINE, Blocks.PRISMARINE);
        registerStonecutting(ArtisanatBlocks.PRISMARINE_BRICK_PAVING, Blocks.PRISMARINE_BRICKS);

        registerStonecutting(ArtisanatBlocks.STAINED_BRICK_BLOCKS);
        registerStonecutting(ArtisanatBlocks.BRICK_TILE_BLOCKS, Blocks.BRICKS);
        registerStonecutting(ArtisanatBlocks.STAINED_BRICK_TILE_BLOCKS);

        registerStonecutting(ArtisanatBlocks.TERRACOTTA_BLOCKS, Blocks.TERRACOTTA);
        registerStonecutting(ArtisanatBlocks.STAINED_TERRACOTTA_BLOCKS, StainedSSWPBBlocks.TERRACOTTA_MAP);
        registerStonecutting(ArtisanatBlocks.TERRACOTTA_BRICKS, Blocks.TERRACOTTA);
        registerStonecutting(ArtisanatBlocks.STAINED_TERRACOTTA_BRICKS);

        registerStonecutting(ArtisanatBlocks.STAINED_DARK_PRISMARINE_BLOCKS);

        registerStonecutting(ArtisanatBlocks.CONCRETE_BLOCKS, StainedSSWPBBlocks.CONCRETE_MAP);
        registerStonecutting(ArtisanatBlocks.QUARTZ_PAVING_BLOCKS);

        registerStonecutting(ArtisanatBlocks.COAL_BLOCKS, Blocks.COAL_BLOCK);
        registerStonecutting(ArtisanatBlocks.IRON_BLOCKS, Blocks.IRON_BLOCK);
        registerStonecutting(ArtisanatBlocks.GOLD_BLOCKS, Blocks.GOLD_BLOCK);
        registerStonecutting(ArtisanatBlocks.LAPIS_BLOCKS, Blocks.LAPIS_BLOCK);
        registerStonecutting(ArtisanatBlocks.REDSTONE_BLOCKS, Blocks.REDSTONE_BLOCK);
        registerStonecutting(ArtisanatBlocks.EMERALD_BLOCKS, Blocks.EMERALD_BLOCK);
        registerStonecutting(ArtisanatBlocks.DIAMOND_BLOCKS, Blocks.DIAMOND_BLOCK);
        registerStonecutting(ArtisanatBlocks.NETHERITE_BLOCKS, Blocks.NETHERITE_BLOCK);

        //TODO: copper blocks
    }

    private void registerStonecutting(BSSWBlocks bsswBlocks, Block... blocks) {
        this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.slab(), bsswBlocks.block(), 2);
        this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.stairs(), bsswBlocks.block());
        this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.wall(), bsswBlocks.block());

        for (Block block : blocks) {
            this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.slab(), block, 2);
            this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.stairs(), block);
            this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.wall(), block);
        }
    }

    private void registerStonecutting(BSSBlocks bsswBlocks, Block... blocks) {
        this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.slab(), bsswBlocks.block(), 2);
        this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.stairs(), bsswBlocks.block());

        for (Block block : blocks) {
            this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.slab(), block, 2);
            this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.stairs(), block);
        }
    }

    private void registerStonecutting(SSWPBBlocks sswpbBlocks, Block... blocks) {
        for (Block block : blocks) {
            this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, sswpbBlocks.slab(), block, 2);
            this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, sswpbBlocks.stairs(), block);
            this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, sswpbBlocks.wall(), block);
        }
    }

    private void registerStonecutting(StainedSSWPBBlocks stainedSswpb, Map<DyeColor, Block> colorMap) {
        stainedSswpb.colorMap().forEach((dyeColor, sswpBlocks) -> registerStonecutting(sswpBlocks, colorMap.get(dyeColor)));
    }

    private void registerStonecutting(StainedBSSWBlocks stainedBSSWBlocks) {
        stainedBSSWBlocks.colorMap().forEach((dyeColor, sswpBlocks) -> registerStonecutting(sswpBlocks));
    }

    private void registerStonecutting(StainedBSSBlocks stainedBSSBlocks) {
        stainedBSSBlocks.colorMap().forEach((dyeColor, sswpBlocks) -> registerStonecutting(sswpBlocks));
    }

    private void registerStonecutting(OreBlocks oreBlocks, Block block) {
        this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, oreBlocks.platedBlock(), block);
        this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, oreBlocks.cutBlock(), block);
        this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, oreBlocks.bricks(), block);
        this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, oreBlocks.tiles(), block);
    }

    public static FabricRecipeProvider create(FabricDataOutput fabricDataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        return new FabricRecipeProvider(fabricDataOutput, completableFuture) {
            @Override
            protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
                return new ArtisanatRecipeGenerator(wrapperLookup, recipeExporter);
            }

            @Override
            public String getName() {
                return "Recipes";
            }
        };
    }
}