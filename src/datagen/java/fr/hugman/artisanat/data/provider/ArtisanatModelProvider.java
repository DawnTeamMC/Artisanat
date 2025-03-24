package fr.hugman.artisanat.data.provider;

import fr.hugman.artisanat.block.ArtisanatBlocks;
import fr.hugman.artisanat.block.groups.CopperBlocks;
import fr.hugman.artisanat.block.groups.OreBlocks;
import fr.hugman.artisanat.data.ArtisanatBlockFamilies;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.client.data.TexturedModel;
import net.minecraft.data.family.BlockFamily;

public class ArtisanatModelProvider extends FabricModelProvider {
    public ArtisanatModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator gen) {
        //TODO: filter out families that should not have the base block done (the vanilla ones)
        ArtisanatBlockFamilies.getFamilies().filter(BlockFamily::shouldGenerateModels).forEach(family -> gen.registerCubeAllModelTexturePool(family.getBaseBlock()).family(family));

        registerWall(gen, ArtisanatBlocks.DARK_PRISMARINE_WALL, Blocks.DARK_PRISMARINE);

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

    private void registerWall(BlockStateModelGenerator gen, Block wallBlock, Block baseBlock) {
        var textures = TexturedModel.CUBE_ALL.get(baseBlock).getTextures();
        gen.blockStateCollector.accept(BlockStateModelGenerator.createWallBlockState(wallBlock,
                Models.TEMPLATE_WALL_POST.upload(wallBlock, textures, gen.modelCollector),
                Models.TEMPLATE_WALL_SIDE.upload(wallBlock, textures, gen.modelCollector),
                Models.TEMPLATE_WALL_SIDE_TALL.upload(wallBlock, textures, gen.modelCollector)));
        gen.registerParentedItemModel(wallBlock, Models.WALL_INVENTORY.upload(wallBlock, textures, gen.modelCollector));
    }

    private void registerOreBlocks(BlockStateModelGenerator gen, OreBlocks oreBlocks) {
        gen.registerSimpleCubeAll(oreBlocks.platedBlock());
        gen.registerSimpleCubeAll(oreBlocks.cutBlock());
        gen.registerSimpleCubeAll(oreBlocks.bricks());
        gen.registerSimpleCubeAll(oreBlocks.tiles());
    }

    private void registerOreBlocks(BlockStateModelGenerator gen, CopperBlocks copperBlocks) {
        copperBlocks.map().forEach((oxidationLevelBooleanPair, block) -> gen.registerSimpleCubeAll(block));
    }

    @Override
    public void generateItemModels(ItemModelGenerator gen) {
        // Nothing to do here :D
    }
}
