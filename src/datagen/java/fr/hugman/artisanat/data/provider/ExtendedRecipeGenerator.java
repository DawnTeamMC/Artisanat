package fr.hugman.artisanat.data.provider;

import fr.hugman.artisanat.Artisanat;
import fr.hugman.artisanat.block.groups.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Oxidizable;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.DyeItem;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.DyeColor;

import java.util.Map;

public abstract class ExtendedRecipeGenerator extends RecipeGenerator {
    public ExtendedRecipeGenerator(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter) {
        super(registries, exporter);
    }

    public void offerWall(ItemConvertible output, ItemConvertible input) {
        this.createShaped(RecipeCategory.DECORATIONS, output, 6)
                .input('#', input)
                .pattern("###")
                .pattern("###")
                .criterion(hasItem(input), this.conditionsFromItem(input))
                .offerTo(this.exporter);
        //TODO: stonecutting
        //TODO group
    }

    public void offer2x2Craft(ItemConvertible output, ItemConvertible input) {
        this.createShaped(RecipeCategory.BUILDING_BLOCKS, output)
                .input('#', input)
                .pattern("##")
                .pattern("##")
                .criterion(hasItem(input), this.conditionsFromItem(input))
                .offerTo(this.exporter);
    }

    public void offer2x2MainBlockCraft(StainedBSSWBlocks stainedBssw, Map<DyeColor, Block> colorMap) {
        stainedBssw.colorMap().forEach((dyeColor, bsswBlocks) -> offer2x2Craft(bsswBlocks.block(), colorMap.get(dyeColor)));
    }

    public void offerColoringMix(ItemConvertible output, ItemConvertible input, DyeColor dyeColor) {
        this.createShaped(RecipeCategory.BUILDING_BLOCKS, output, 2)
                .input('#', input)
                .input('X', DyeItem.byColor(dyeColor))
                .pattern("X#")
                .pattern("#X")
                .criterion(hasItem(input), this.conditionsFromItem(input))
                .offerTo(this.exporter);
    }

    public void offer2x2MainBlockMixedCraft(StainedBSSBlocks stainedBss, Block baseBlock) {
        stainedBss.colorMap().forEach((dyeColor, bssBlocks) -> offerColoringMix(bssBlocks.block(), baseBlock, dyeColor));
    }

    public void offerColoring(RecipeCategory category, ItemConvertible output, ItemConvertible input, DyeColor dyeColor) {
        this.createShaped(category, output, 8)
                .input('#', input)
                .input('X', DyeItem.byColor(dyeColor))
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                //TODO group
                .criterion(hasItem(input), this.conditionsFromItem(input))
                .offerTo(this.exporter, Artisanat.id(getItemPath(output) + "_from_" + getItemPath(input)).toString());
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
        this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.slab(), bsswBlocks.block(), 2);
        this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.stairs(), bsswBlocks.block());
        this.offerStonecuttingRecipe(RecipeCategory.DECORATIONS, bsswBlocks.wall(), bsswBlocks.block());

        for (Block block : blocks) {
            this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.slab(), block, 2);
            this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.stairs(), block);
            this.offerStonecuttingRecipe(RecipeCategory.DECORATIONS, bsswBlocks.wall(), block);
        }
    }

    public void offferStonecutting(BSSBlocks bsswBlocks, Block... blocks) {
        this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.slab(), bsswBlocks.block(), 2);
        this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.stairs(), bsswBlocks.block());

        for (Block block : blocks) {
            this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.slab(), block, 2);
            this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, bsswBlocks.stairs(), block);
        }
    }

    public void offferStonecutting(SSWPBBlocks sswpbBlocks, Block... blocks) {
        for (Block block : blocks) {
            this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, sswpbBlocks.slab(), block, 2);
            this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, sswpbBlocks.stairs(), block);
            this.offerStonecuttingRecipe(RecipeCategory.DECORATIONS, sswpbBlocks.wall(), block);
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
        this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, oreBlocks.platedBlock(), block);
        this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, oreBlocks.cutBlock(), block);
        this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, oreBlocks.bricks(), block);
        this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, oreBlocks.tiles(), block);
    }

    public static Block getCopperBlock(Oxidizable.OxidationLevel level, boolean waxed) {
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