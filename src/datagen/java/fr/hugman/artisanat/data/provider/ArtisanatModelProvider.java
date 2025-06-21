package fr.hugman.artisanat.data.provider;

import fr.hugman.artisanat.block.ArtisanatBlocks;
import fr.hugman.artisanat.block.groups.*;
import fr.hugman.artisanat.data.ArtisanatBlockFamilies;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.*;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

import java.util.Map;

import static net.minecraft.client.data.BlockStateModelGenerator.createWeightedVariant;

public class ArtisanatModelProvider extends FabricModelProvider {
    public ArtisanatModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator gen) {
        ArtisanatBlockFamilies.getFamilies().filter(BlockFamily::shouldGenerateModels)
                .forEach(family -> gen.registerCubeAllModelTexturePool(family.getBaseBlock()).family(family));

        register(gen, ArtisanatBlocks.OAK_WOOD_BLOCKS, Blocks.OAK_WOOD, Blocks.OAK_LOG);
        register(gen, ArtisanatBlocks.SPRUCE_WOOD_BLOCKS, Blocks.SPRUCE_WOOD, Blocks.SPRUCE_LOG);
        register(gen, ArtisanatBlocks.BIRCH_WOOD_BLOCKS, Blocks.BIRCH_WOOD, Blocks.BIRCH_LOG);
        register(gen, ArtisanatBlocks.JUNGLE_WOOD_BLOCKS, Blocks.JUNGLE_WOOD, Blocks.JUNGLE_LOG);
        register(gen, ArtisanatBlocks.ACACIA_WOOD_BLOCKS, Blocks.ACACIA_WOOD, Blocks.ACACIA_LOG);
        register(gen, ArtisanatBlocks.CHERRY_WOOD_BLOCKS, Blocks.CHERRY_WOOD, Blocks.CHERRY_LOG);
        register(gen, ArtisanatBlocks.DARK_OAK_WOOD_BLOCKS, Blocks.DARK_OAK_WOOD, Blocks.DARK_OAK_LOG);
        register(gen, ArtisanatBlocks.PALE_OAK_WOOD_BLOCKS, Blocks.PALE_OAK_WOOD, Blocks.PALE_OAK_LOG);
        register(gen, ArtisanatBlocks.MANGROVE_WOOD_BLOCKS, Blocks.MANGROVE_WOOD, Blocks.MANGROVE_LOG);
        register(gen, ArtisanatBlocks.CRIMSON_HYPHAE_BLOCKS, Blocks.CRIMSON_HYPHAE, Blocks.CRIMSON_STEM);
        register(gen, ArtisanatBlocks.WARPED_HYPHAE_BLOCKS, Blocks.WARPED_HYPHAE, Blocks.WARPED_STEM);

        register(gen, ArtisanatBlocks.TERRACOTTA_BLOCKS, Blocks.TERRACOTTA);
        register(gen, ArtisanatBlocks.STAINED_TERRACOTTA_BLOCKS, StainedSSWPBBlocks.TERRACOTTA_MAP);
        register(gen, ArtisanatBlocks.CONCRETE_BLOCKS, StainedSSWPBBlocks.CONCRETE_MAP);

        registerWall(gen, ArtisanatBlocks.DARK_PRISMARINE_WALL, TexturedModel.CUBE_ALL.get(Blocks.DARK_PRISMARINE).getTextures());

        registerOreBlocks(gen, ArtisanatBlocks.COAL_BLOCKS);
        registerOreBlocks(gen, ArtisanatBlocks.IRON_BLOCKS);
        registerOreBlocks(gen, ArtisanatBlocks.GOLD_BLOCKS);
        registerOreBlocks(gen, ArtisanatBlocks.LAPIS_BLOCKS);
        registerOreBlocks(gen, ArtisanatBlocks.REDSTONE_BLOCKS);
        registerOreBlocks(gen, ArtisanatBlocks.EMERALD_BLOCKS);
        registerOreBlocks(gen, ArtisanatBlocks.DIAMOND_BLOCKS);
        registerOreBlocks(gen, ArtisanatBlocks.NETHERITE_BLOCKS);

        registerOreBlocks(gen, ArtisanatBlocks.UNPLATED_COPPER_BLOCKS);
        registerOreBlocks(gen, ArtisanatBlocks.COPPER_BRICKS);
        registerOreBlocks(gen, ArtisanatBlocks.COPPER_TILES);

    }

    private void register(BlockStateModelGenerator gen, WoodBlocks woodBlocks, Block woodBlock, Block logBlock) {
        Identifier identifier = ModelIds.getBlockModelId(woodBlock);
        var textures = TexturedModel.CUBE_ALL.get(logBlock).getTextures();

        registerSlab(gen, woodBlocks.slab(), textures, identifier);
        registerStairs(gen, woodBlocks.stairs(), textures);
        registerButton(gen, woodBlocks.button(), textures);
    }


    private void register(BlockStateModelGenerator gen, SSWPBBlocks sswpb, Block baseBlock) {
        Identifier identifier = ModelIds.getBlockModelId(baseBlock);
        var textures = TexturedModel.CUBE_ALL.get(baseBlock).getTextures();

        registerSlab(gen, sswpb.slab(), textures, identifier);
        registerStairs(gen, sswpb.stairs(), textures);
        registerWall(gen, sswpb.wall(), textures);
        registerButton(gen, sswpb.button(), textures);
        registerPressurePlate(gen, sswpb.pressurePlate(), textures);
    }

    private void register(BlockStateModelGenerator gen, StainedSSWPBBlocks stainedSswpb, Map<DyeColor, Block> colorMap) {
        stainedSswpb.colorMap().forEach((dyeColor, sswpBlocks) -> register(gen, sswpBlocks, colorMap.get(dyeColor)));
    }


    private void registerSlab(BlockStateModelGenerator gen, Block slabBlock, TextureMap textures, Identifier fullModelId) {
        var bottomSlabModelId = Models.SLAB.upload(slabBlock, textures, gen.modelCollector);
        gen.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(slabBlock,
                createWeightedVariant(bottomSlabModelId),
                createWeightedVariant(Models.SLAB_TOP.upload(slabBlock, textures, gen.modelCollector)),
                createWeightedVariant(fullModelId)
        ));
        gen.registerParentedItemModel(slabBlock, bottomSlabModelId);
    }

    private void registerStairs(BlockStateModelGenerator gen, Block stairsBlock, TextureMap textures) {
        var stairsModelId = Models.STAIRS.upload(stairsBlock, textures, gen.modelCollector);
        gen.blockStateCollector.accept(BlockStateModelGenerator.createStairsBlockState(stairsBlock,
                createWeightedVariant(Models.INNER_STAIRS.upload(stairsBlock, textures, gen.modelCollector)),
                createWeightedVariant(stairsModelId),
                createWeightedVariant(Models.OUTER_STAIRS.upload(stairsBlock, textures, gen.modelCollector))
        ));
        gen.registerParentedItemModel(stairsBlock, stairsModelId);
    }

    private void registerWall(BlockStateModelGenerator gen, Block wallBlock, TextureMap textures) {
        gen.blockStateCollector.accept(BlockStateModelGenerator.createWallBlockState(wallBlock,
                createWeightedVariant(Models.TEMPLATE_WALL_POST.upload(wallBlock, textures, gen.modelCollector)),
                createWeightedVariant(Models.TEMPLATE_WALL_SIDE.upload(wallBlock, textures, gen.modelCollector)),
                createWeightedVariant(Models.TEMPLATE_WALL_SIDE_TALL.upload(wallBlock, textures, gen.modelCollector))));
        gen.registerParentedItemModel(wallBlock, Models.WALL_INVENTORY.upload(wallBlock, textures, gen.modelCollector));
    }

    private void registerPressurePlate(BlockStateModelGenerator gen, Block pressurePlateBlock, TextureMap textures) {
        Identifier identifier = Models.PRESSURE_PLATE_UP.upload(pressurePlateBlock, textures, gen.modelCollector);
        Identifier identifier2 = Models.PRESSURE_PLATE_DOWN.upload(pressurePlateBlock, textures, gen.modelCollector);
        gen.blockStateCollector
                .accept(BlockStateModelGenerator.createPressurePlateBlockState(pressurePlateBlock, createWeightedVariant(identifier), createWeightedVariant(identifier2)));
    }

    private void registerButton(BlockStateModelGenerator gen, Block buttonBlock, TextureMap textures) {
        Identifier identifier = Models.BUTTON.upload(buttonBlock, textures, gen.modelCollector);
        Identifier identifier2 = Models.BUTTON_PRESSED.upload(buttonBlock, textures, gen.modelCollector);
        gen.blockStateCollector.accept(BlockStateModelGenerator.createButtonBlockState(buttonBlock, createWeightedVariant(identifier), createWeightedVariant(identifier2)));
        Identifier identifier3 = Models.BUTTON_INVENTORY.upload(buttonBlock, textures, gen.modelCollector);
        gen.registerParentedItemModel(buttonBlock, identifier3);
    }

    private void registerOreBlocks(BlockStateModelGenerator gen, OreBlocks oreBlocks) {
        gen.registerSimpleCubeAll(oreBlocks.platedBlock());
        gen.registerSimpleCubeAll(oreBlocks.cutBlock());
        gen.registerSimpleCubeAll(oreBlocks.bricks());
        gen.registerSimpleCubeAll(oreBlocks.tiles());
    }

    private void registerOreBlocks(BlockStateModelGenerator gen, CopperBlocks copperBlocks) {
        copperBlocks.map().forEach((oxidationLevelBooleanPair, block) -> {
            var waxed = oxidationLevelBooleanPair.getSecond();
            if (!waxed) {
                gen.registerSimpleCubeAll(block);
            } else {
                var unwaxedBlock = copperBlocks.get(oxidationLevelBooleanPair.getFirst(), false);

                gen.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(block, createWeightedVariant(ModelIds.getBlockModelId(unwaxedBlock))));
                gen.itemModelOutput.acceptAlias(unwaxedBlock.asItem(), block.asItem());
            }
        });
    }

    @Override
    public void generateItemModels(ItemModelGenerator gen) {
        // Nothing to do here :D
    }
}
