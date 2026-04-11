package fr.hugman.artisanat.data.provider;

import fr.hugman.artisanat.block.ArtisanatBlocks;
import fr.hugman.artisanat.block.collection.*;
import fr.hugman.artisanat.data.ArtisanatBlockFamilies;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.data.BlockFamily;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import java.util.Map;

import static net.minecraft.client.data.models.BlockModelGenerators.plainVariant;

public class ArtisanatModelProvider extends FabricModelProvider {
    public ArtisanatModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators gen) {
        ArtisanatBlockFamilies.getFamilies().filter(BlockFamily::shouldGenerateModel)
                .forEach(family -> gen.family(family.getBaseBlock()).generateFor(family));

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

        registerWall(gen, ArtisanatBlocks.DARK_PRISMARINE_WALL, TexturedModel.CUBE.get(Blocks.DARK_PRISMARINE).getMapping());

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

    private void register(BlockModelGenerators gen, WoodBlocks woodBlocks, Block woodBlock, Block logBlock) {
        Identifier identifier = ModelLocationUtils.getModelLocation(woodBlock);
        var textures = TexturedModel.CUBE.get(logBlock).getMapping();

        registerSlab(gen, woodBlocks.slab(), textures, identifier);
        registerStairs(gen, woodBlocks.stairs(), textures);
        registerButton(gen, woodBlocks.button(), textures);
    }


    private void register(BlockModelGenerators gen, SSWPBBlocks sswpb, Block baseBlock) {
        Identifier identifier = ModelLocationUtils.getModelLocation(baseBlock);
        var textures = TexturedModel.CUBE.get(baseBlock).getMapping();

        registerSlab(gen, sswpb.slab(), textures, identifier);
        registerStairs(gen, sswpb.stairs(), textures);
        registerWall(gen, sswpb.wall(), textures);
        registerButton(gen, sswpb.button(), textures);
        registerPressurePlate(gen, sswpb.pressurePlate(), textures);
    }

    private void register(BlockModelGenerators gen, StainedSSWPBBlocks stainedSswpb, Map<DyeColor, Block> colorMap) {
        stainedSswpb.colorMap().forEach((dyeColor, sswpBlocks) -> register(gen, sswpBlocks, colorMap.get(dyeColor)));
    }

    private void registerSlab(BlockModelGenerators gen, Block slabBlock, TextureMapping textures, Identifier fullModelId) {
        var bottomSlabModelId = ModelTemplates.SLAB_BOTTOM.create(slabBlock, textures, gen.modelOutput);
        gen.blockStateOutput.accept(BlockModelGenerators.createSlab(slabBlock,
                plainVariant(bottomSlabModelId),
                plainVariant(ModelTemplates.SLAB_TOP.create(slabBlock, textures, gen.modelOutput)),
                plainVariant(fullModelId)
        ));
        gen.registerSimpleItemModel(slabBlock, bottomSlabModelId);
    }

    private void registerStairs(BlockModelGenerators gen, Block stairsBlock, TextureMapping textures) {
        var stairsModelId = ModelTemplates.STAIRS_STRAIGHT.create(stairsBlock, textures, gen.modelOutput);
        gen.blockStateOutput.accept(BlockModelGenerators.createStairs(stairsBlock,
                plainVariant(ModelTemplates.STAIRS_INNER.create(stairsBlock, textures, gen.modelOutput)),
                plainVariant(stairsModelId),
                plainVariant(ModelTemplates.STAIRS_OUTER.create(stairsBlock, textures, gen.modelOutput))
        ));
        gen.registerSimpleItemModel(stairsBlock, stairsModelId);
    }

    private void registerWall(BlockModelGenerators gen, Block wallBlock, TextureMapping textures) {
        gen.blockStateOutput.accept(BlockModelGenerators.createWall(wallBlock,
                plainVariant(ModelTemplates.WALL_POST.create(wallBlock, textures, gen.modelOutput)),
                plainVariant(ModelTemplates.WALL_LOW_SIDE.create(wallBlock, textures, gen.modelOutput)),
                plainVariant(ModelTemplates.WALL_TALL_SIDE.create(wallBlock, textures, gen.modelOutput))));
        gen.registerSimpleItemModel(wallBlock, ModelTemplates.WALL_INVENTORY.create(wallBlock, textures, gen.modelOutput));
    }

    private void registerPressurePlate(BlockModelGenerators gen, Block pressurePlateBlock, TextureMapping textures) {
        Identifier identifier = ModelTemplates.PRESSURE_PLATE_UP.create(pressurePlateBlock, textures, gen.modelOutput);
        Identifier identifier2 = ModelTemplates.PRESSURE_PLATE_DOWN.create(pressurePlateBlock, textures, gen.modelOutput);
        gen.blockStateOutput
                .accept(BlockModelGenerators.createPressurePlate(pressurePlateBlock, plainVariant(identifier), plainVariant(identifier2)));
    }

    private void registerButton(BlockModelGenerators gen, Block buttonBlock, TextureMapping textures) {
        Identifier identifier = ModelTemplates.BUTTON.create(buttonBlock, textures, gen.modelOutput);
        Identifier identifier2 = ModelTemplates.BUTTON_PRESSED.create(buttonBlock, textures, gen.modelOutput);
        gen.blockStateOutput.accept(BlockModelGenerators.createButton(buttonBlock, plainVariant(identifier), plainVariant(identifier2)));
        Identifier identifier3 = ModelTemplates.BUTTON_INVENTORY.create(buttonBlock, textures, gen.modelOutput);
        gen.registerSimpleItemModel(buttonBlock, identifier3);
    }

    private void registerOreBlocks(BlockModelGenerators gen, OreBlocks oreBlocks) {
        gen.createTrivialCube(oreBlocks.platedBlock());
        gen.createTrivialCube(oreBlocks.cutBlock());
        gen.createTrivialCube(oreBlocks.bricks());
        gen.createTrivialCube(oreBlocks.tiles());
    }

    private void registerOreBlocks(BlockModelGenerators gen, CopperBlocks copperBlocks) {
        copperBlocks.map().forEach((oxidationLevelBooleanPair, block) -> {
            var waxed = oxidationLevelBooleanPair.getSecond();
            if (!waxed) {
                gen.createTrivialCube(block);
            } else {
                var unwaxedBlock = copperBlocks.get(oxidationLevelBooleanPair.getFirst(), false);

                gen.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, plainVariant(ModelLocationUtils.getModelLocation(unwaxedBlock))));
                gen.itemModelOutput.copy(unwaxedBlock.asItem(), block.asItem());
            }
        });
    }

    @Override
    public void generateItemModels(ItemModelGenerators gen) {
        // Nothing to do here :D
    }
}
