package fr.hugman.artisanat.data.provider;

import fr.hugman.artisanat.Artisanat;
import fr.hugman.artisanat.block.collection.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WeatheringCopper;

import java.util.HashMap;
import java.util.Map;

public abstract class ExtendedRecipeGenerator extends RecipeProvider {
    private Map<DyeColor, Item> dyes;

    public ExtendedRecipeGenerator(HolderLookup.Provider registries, RecipeOutput exporter) {
        super(registries, exporter);

        this.dyes = new HashMap<>();
        this.dyes.put(DyeColor.WHITE, Items.WHITE_DYE);
        this.dyes.put(DyeColor.ORANGE, Items.ORANGE_DYE);
        this.dyes.put(DyeColor.MAGENTA, Items.MAGENTA_DYE);
        this.dyes.put(DyeColor.LIGHT_BLUE, Items.LIGHT_BLUE_DYE);
        this.dyes.put(DyeColor.YELLOW, Items.YELLOW_DYE);
        this.dyes.put(DyeColor.LIME, Items.LIME_DYE);
        this.dyes.put(DyeColor.PINK, Items.PINK_DYE);
        this.dyes.put(DyeColor.GRAY, Items.GRAY_DYE);
        this.dyes.put(DyeColor.LIGHT_GRAY, Items.LIGHT_GRAY_DYE);
        this.dyes.put(DyeColor.CYAN, Items.CYAN_DYE);
        this.dyes.put(DyeColor.PURPLE, Items.PURPLE_DYE);
        this.dyes.put(DyeColor.BLUE, Items.BLUE_DYE);
        this.dyes.put(DyeColor.BROWN, Items.BROWN_DYE);
        this.dyes.put(DyeColor.GREEN, Items.GREEN_DYE);
        this.dyes.put(DyeColor.RED, Items.RED_DYE);
        this.dyes.put(DyeColor.BLACK, Items.BLACK_DYE);
    }

    public void offerWall(ItemLike output, ItemLike input) {
        this.shaped(RecipeCategory.DECORATIONS, output, 6)
                .define('#', input)
                .pattern("###")
                .pattern("###")
                .unlockedBy(getHasName(input), this.has(input))
                .save(this.output);
        //TODO: stonecutting
        //TODO group
    }

    public void offer2x2Craft(ItemLike output, ItemLike input) {
        this.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .define('#', input)
                .pattern("##")
                .pattern("##")
                .unlockedBy(getHasName(input), this.has(input))
                .save(this.output);
    }

    public void offer2x2MainBlockCraft(StainedBSSWBlocks stainedBssw, Map<DyeColor, Block> colorMap) {
        stainedBssw.colorMap().forEach((dyeColor, bsswBlocks) -> offer2x2Craft(bsswBlocks.block(), colorMap.get(dyeColor)));
    }

    public void offerColoringMix(ItemLike output, ItemLike input, DyeColor dyeColor) {
        this.shaped(RecipeCategory.BUILDING_BLOCKS, output, 2)
                .define('#', input)
                .define('X', this.dyes.get(dyeColor))
                .pattern("X#")
                .pattern("#X")
                .unlockedBy(getHasName(input), this.has(input))
                .save(this.output);
    }

    public void offer2x2MainBlockMixedCraft(StainedBSSBlocks stainedBss, Block baseBlock) {
        stainedBss.colorMap().forEach((dyeColor, bssBlocks) -> offerColoringMix(bssBlocks.block(), baseBlock, dyeColor));
    }

    public void offerColoring(RecipeCategory category, ItemLike output, ItemLike input, DyeColor dyeColor) {
        this.shaped(category, output, 8)
                .define('#', input)
                .define('X', this.dyes.get(dyeColor))
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                //TODO group
                .unlockedBy(getHasName(input), this.has(input))
                .save(this.output, Artisanat.id(getItemName(output) + "_from_" + getItemName(input)).toString());
    }

    // Groups

    public void offerColoring(StainedBSSWBlocks stainedBsswBlocks, BSSWBlocks baseBlocks) {
        stainedBsswBlocks.colorMap().forEach((key, blocks) -> {
            offerColoring(RecipeCategory.BUILDING_BLOCKS, blocks.block(), baseBlocks.block(), key);
            offerColoring(RecipeCategory.BUILDING_BLOCKS, blocks.slab(), baseBlocks.slab(), key);
            offerColoring(RecipeCategory.BUILDING_BLOCKS, blocks.stairs(), baseBlocks.stairs(), key);
            offerColoring(RecipeCategory.BUILDING_BLOCKS, blocks.wall(), baseBlocks.wall(), key);
        });
    }

    public void offerColoring(StainedSSWPBBlocks stainedBsswBlocks, SSWPBBlocks baseBlocks) {
        stainedBsswBlocks.colorMap().forEach((key, blocks) -> {
            offerColoring(RecipeCategory.BUILDING_BLOCKS, blocks.slab(), baseBlocks.slab(), key);
            offerColoring(RecipeCategory.BUILDING_BLOCKS, blocks.stairs(), baseBlocks.stairs(), key);
            offerColoring(RecipeCategory.BUILDING_BLOCKS, blocks.wall(), baseBlocks.wall(), key);
            offerColoring(RecipeCategory.BUILDING_BLOCKS, blocks.pressurePlate(), baseBlocks.pressurePlate(), key);
            offerColoring(RecipeCategory.BUILDING_BLOCKS, blocks.button(), baseBlocks.button(), key);
        });
    }


    public void offerColoring(StainedBSSWBlocks stainedBsswBlocks, Block baseBlock) {
        stainedBsswBlocks.colorMap().forEach((key, value) -> offerColoring(RecipeCategory.BUILDING_BLOCKS, value.block(), baseBlock, key));
    }

    public void offferStonecutting(BSSWBlocks bsswBlocks, Block... blocks) {
        this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.slab(), bsswBlocks.block(), 2);
        this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.stairs(), bsswBlocks.block());
        this.stonecutterResultFromBase(RecipeCategory.DECORATIONS, bsswBlocks.wall(), bsswBlocks.block());

        for (Block block : blocks) {
            this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.block(), block, 2);
            this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.slab(), block, 2);
            this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.stairs(), block);
            this.stonecutterResultFromBase(RecipeCategory.DECORATIONS, bsswBlocks.wall(), block);
        }
    }

    public void offferStonecutting(BSSBlocks bsswBlocks, Block... blocks) {
        this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.slab(), bsswBlocks.block(), 2);
        this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.stairs(), bsswBlocks.block());

        for (Block block : blocks) {
            this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.block(), block, 2);
            this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.slab(), block, 2);
            this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.stairs(), block);
        }
    }

    public void offferStonecutting(SSWPBBlocks sswpbBlocks, Block... blocks) {
        for (Block block : blocks) {
            this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, sswpbBlocks.slab(), block, 2);
            this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, sswpbBlocks.stairs(), block);
            this.stonecutterResultFromBase(RecipeCategory.DECORATIONS, sswpbBlocks.wall(), block);
        }
    }

    public void offferStonecutting(StainedSSWPBBlocks stainedSswpb, Map<DyeColor, Block> colorMap) {
        stainedSswpb.colorMap().forEach((dyeColor, sswpBlocks) -> offferStonecutting(sswpBlocks, colorMap.get(dyeColor)));
    }

    public void offferStonecutting(StainedBSSWBlocks stainedBSSWBlocks, Map<DyeColor, Block> colorMap) {
        stainedBSSWBlocks.colorMap().forEach((dyeColor, bsswBlocks) -> offferStonecutting(bsswBlocks, colorMap.get(dyeColor)));
    }

    public void offferStonecutting(StainedBSSWBlocks stainedBSSWBlocks) {
        stainedBSSWBlocks.colorMap().forEach((dyeColor, sswpBlocks) -> offferStonecutting(sswpBlocks));
    }

    public void offferStonecutting(StainedBSSBlocks stainedBSSBlocks) {
        stainedBSSBlocks.colorMap().forEach((dyeColor, sswpBlocks) -> offferStonecutting(sswpBlocks));
    }

    public void offferStonecutting(OreBlocks oreBlocks, Block block) {
        this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, oreBlocks.platedBlock(), block);
        this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, oreBlocks.cutBlock(), block);
        this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, oreBlocks.bricks(), block);
        this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, oreBlocks.tiles(), block);
    }

    public static Block getCopperBlock(WeatheringCopper.WeatherState level, boolean waxed) {
        if (!waxed) {
            return switch (level) {
                case UNAFFECTED -> Blocks.COPPER_BLOCK;
                case EXPOSED -> Blocks.EXPOSED_COPPER;
                case WEATHERED -> Blocks.WEATHERED_COPPER;
                case OXIDIZED -> Blocks.OXIDIZED_COPPER;
            };
        } else {
            return switch (level) {
                case UNAFFECTED -> Blocks.WAXED_COPPER_BLOCK;
                case EXPOSED -> Blocks.WAXED_EXPOSED_COPPER;
                case WEATHERED -> Blocks.WAXED_WEATHERED_COPPER;
                case OXIDIZED -> Blocks.WAXED_OXIDIZED_COPPER;
            };
        }
    }
}