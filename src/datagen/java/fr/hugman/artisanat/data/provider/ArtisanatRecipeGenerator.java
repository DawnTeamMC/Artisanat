package fr.hugman.artisanat.data.provider;

import fr.hugman.artisanat.block.ArtisanatBlocks;
import fr.hugman.artisanat.block.collection.StainedSSWPBBlocks;
import fr.hugman.artisanat.data.ArtisanatBlockFamilies;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.BlockFamily;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WeatheringCopper;
import java.util.concurrent.CompletableFuture;

public class ArtisanatRecipeGenerator extends ExtendedRecipeGenerator {
    public ArtisanatRecipeGenerator(HolderLookup.Provider registries, RecipeOutput exporter) {
        super(registries, exporter);
    }

    @Override
    public void buildRecipes() {
        ArtisanatBlockFamilies.getFamilies().filter(BlockFamily::shouldGenerateRecipe).forEach(family -> this.generateRecipes(family, FeatureFlagSet.of(FeatureFlags.VANILLA)));

        //TODO: add wood blocks recipes

        offer2x2Craft(ArtisanatBlocks.TERRACOTTA_BRICKS.block(), Blocks.TERRACOTTA);
        offer2x2MainBlockCraft(ArtisanatBlocks.STAINED_TERRACOTTA_BRICKS, StainedSSWPBBlocks.TERRACOTTA_MAP);
        offer2x2MainBlockMixedCraft(ArtisanatBlocks.QUARTZ_PAVING_BLOCKS, Blocks.QUARTZ_BLOCK);
        offer2x2MainBlockCraft(ArtisanatBlocks.CONCRETE_BRICKS, StainedSSWPBBlocks.CONCRETE_MAP);
		offer2x2Craft(ArtisanatBlocks.SNOW_BRICKS.block(), Blocks.SNOW_BLOCK);

        offerColoring(ArtisanatBlocks.STAINED_BRICK_BLOCKS, Blocks.BRICKS);
        offerColoring(ArtisanatBlocks.STAINED_BRICK_TILE_BLOCKS, ArtisanatBlocks.BRICK_TILE_BLOCKS);
        offerColoring(ArtisanatBlocks.STAINED_TERRACOTTA_BLOCKS, ArtisanatBlocks.TERRACOTTA_BLOCKS);
        offerColoring(ArtisanatBlocks.STAINED_TERRACOTTA_BRICKS, ArtisanatBlocks.TERRACOTTA_BRICKS);
        offerColoring(ArtisanatBlocks.STAINED_DARK_PRISMARINE_BLOCKS, Blocks.DARK_PRISMARINE);

		offferStonecutting(ArtisanatBlocks.POLISHED_STONE, Blocks.STONE);

        offferStonecutting(ArtisanatBlocks.COBBLESTONE_BRICKS, Blocks.COBBLESTONE);
        offferStonecutting(ArtisanatBlocks.MOSSY_COBBLESTONE_BRICKS, Blocks.MOSSY_COBBLESTONE);
        offferStonecutting(ArtisanatBlocks.GRANITE_BRICKS, Blocks.GRANITE);
        offferStonecutting(ArtisanatBlocks.DIORITE_BRICKS, Blocks.DIORITE);
        offferStonecutting(ArtisanatBlocks.ANDESITE_BRICKS, Blocks.ANDESITE);

        offferStonecutting(ArtisanatBlocks.SANDSTONE_BRICKS, Blocks.SANDSTONE);
        offferStonecutting(ArtisanatBlocks.POLISHED_SANDSTONE, Blocks.SANDSTONE);
        offferStonecutting(ArtisanatBlocks.RED_SANDSTONE_BRICKS, Blocks.RED_SANDSTONE);
        offferStonecutting(ArtisanatBlocks.POLISHED_RED_SANDSTONE, Blocks.RED_SANDSTONE);
        offferStonecutting(ArtisanatBlocks.SMOOTH_STONE_PAVING, Blocks.SMOOTH_STONE);
        offferStonecutting(ArtisanatBlocks.CHISELED_PRISMARINE, Blocks.PRISMARINE);
        offferStonecutting(ArtisanatBlocks.PRISMARINE_BRICK_PAVING, Blocks.PRISMARINE_BRICKS);

        offferStonecutting(ArtisanatBlocks.STAINED_BRICK_BLOCKS);
        offferStonecutting(ArtisanatBlocks.BRICK_TILE_BLOCKS, Blocks.BRICKS);
        offferStonecutting(ArtisanatBlocks.STAINED_BRICK_TILE_BLOCKS);

        offferStonecutting(ArtisanatBlocks.TERRACOTTA_BLOCKS, Blocks.TERRACOTTA);
        offferStonecutting(ArtisanatBlocks.STAINED_TERRACOTTA_BLOCKS, StainedSSWPBBlocks.TERRACOTTA_MAP);
        offferStonecutting(ArtisanatBlocks.TERRACOTTA_BRICKS, Blocks.TERRACOTTA);
        offferStonecutting(ArtisanatBlocks.STAINED_TERRACOTTA_BRICKS, StainedSSWPBBlocks.TERRACOTTA_MAP);

        offerWall(ArtisanatBlocks.DARK_PRISMARINE_WALL, Blocks.DARK_PRISMARINE);
        stonecutterResultFromBase(RecipeCategory.DECORATIONS, ArtisanatBlocks.DARK_PRISMARINE_WALL, Blocks.DARK_PRISMARINE);
        offferStonecutting(ArtisanatBlocks.STAINED_DARK_PRISMARINE_BLOCKS);

        offferStonecutting(ArtisanatBlocks.CONCRETE_BLOCKS, StainedSSWPBBlocks.CONCRETE_MAP);
        offferStonecutting(ArtisanatBlocks.CONCRETE_BRICKS, StainedSSWPBBlocks.CONCRETE_MAP);
        offferStonecutting(ArtisanatBlocks.QUARTZ_PAVING_BLOCKS);

        offferStonecutting(ArtisanatBlocks.COAL_BLOCKS, Blocks.COAL_BLOCK);
        offferStonecutting(ArtisanatBlocks.IRON_BLOCKS, Blocks.IRON_BLOCK);
        offferStonecutting(ArtisanatBlocks.GOLD_BLOCKS, Blocks.GOLD_BLOCK);
        offferStonecutting(ArtisanatBlocks.LAPIS_BLOCKS, Blocks.LAPIS_BLOCK);
        offferStonecutting(ArtisanatBlocks.REDSTONE_BLOCKS, Blocks.REDSTONE_BLOCK);
        offferStonecutting(ArtisanatBlocks.EMERALD_BLOCKS, Blocks.EMERALD_BLOCK);
        offferStonecutting(ArtisanatBlocks.DIAMOND_BLOCKS, Blocks.DIAMOND_BLOCK);
        offferStonecutting(ArtisanatBlocks.NETHERITE_BLOCKS, Blocks.NETHERITE_BLOCK);

        for (WeatheringCopper.WeatherState level : WeatheringCopper.WeatherState.values()) {
            stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ArtisanatBlocks.UNPLATED_COPPER_BLOCKS.get(level, false), getCopperBlock(level, false));
            stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ArtisanatBlocks.UNPLATED_COPPER_BLOCKS.get(level, true), getCopperBlock(level, true));
            stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ArtisanatBlocks.COPPER_BRICKS.get(level, false), getCopperBlock(level, false));
            stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ArtisanatBlocks.COPPER_BRICKS.get(level, true), getCopperBlock(level, true));
            stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ArtisanatBlocks.COPPER_TILES.get(level, false), getCopperBlock(level, false));
            stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ArtisanatBlocks.COPPER_TILES.get(level, true), getCopperBlock(level, true));
        }
    }

    public static FabricRecipeProvider create(FabricDataOutput fabricDataOutput, CompletableFuture<HolderLookup.Provider> completableFuture) {
        return new FabricRecipeProvider(fabricDataOutput, completableFuture) {
            @Override
            protected RecipeProvider createRecipeProvider(HolderLookup.Provider wrapperLookup, RecipeOutput recipeExporter) {
                return new ArtisanatRecipeGenerator(wrapperLookup, recipeExporter);
            }

            @Override
            public String getName() {
                return "Recipes";
            }
        };
    }
}