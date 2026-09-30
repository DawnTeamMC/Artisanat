package fr.hugman.artisanat.data.provider;

import fr.hugman.artisanat.block.ArtisanatBlocks;
import fr.hugman.artisanat.block.collection.*;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.concurrent.CompletableFuture;

public class ArtisanatBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ArtisanatBlockLootTableProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generate() {
        add(ArtisanatBlocks.OAK_WOOD_BLOCKS);
        add(ArtisanatBlocks.SPRUCE_WOOD_BLOCKS);
        add(ArtisanatBlocks.BIRCH_WOOD_BLOCKS);
        add(ArtisanatBlocks.JUNGLE_WOOD_BLOCKS);
        add(ArtisanatBlocks.ACACIA_WOOD_BLOCKS);
        add(ArtisanatBlocks.CHERRY_WOOD_BLOCKS);
        add(ArtisanatBlocks.DARK_OAK_WOOD_BLOCKS);
        add(ArtisanatBlocks.PALE_OAK_WOOD_BLOCKS);
        add(ArtisanatBlocks.MANGROVE_WOOD_BLOCKS);
        add(ArtisanatBlocks.CRIMSON_HYPHAE_BLOCKS);
        add(ArtisanatBlocks.WARPED_HYPHAE_BLOCKS);

        add(ArtisanatBlocks.POLISHED_STONE);

        add(ArtisanatBlocks.COBBLESTONE_BRICKS);
        add(ArtisanatBlocks.MOSSY_COBBLESTONE_BRICKS);

        add(ArtisanatBlocks.GRANITE_BRICKS);
        add(ArtisanatBlocks.DIORITE_BRICKS);
        add(ArtisanatBlocks.ANDESITE_BRICKS);

        add(ArtisanatBlocks.SNOW_BRICKS.block(), (block) -> this.createSingleItemTableWithSilkTouch(block, Items.SNOWBALL, ConstantValue.exactly(4.0F)));
        add(ArtisanatBlocks.SNOW_BRICKS.slab(), (block) -> this.createSingleItemTableWithSilkTouch(block, Items.SNOWBALL, ConstantValue.exactly(2.0F)));
        add(ArtisanatBlocks.SNOW_BRICKS.stairs(), (block) -> this.createSingleItemTableWithSilkTouch(block, Items.SNOWBALL, ConstantValue.exactly(6.0F)));
        add(ArtisanatBlocks.SNOW_BRICKS.wall(), (block) -> this.createSingleItemTableWithSilkTouch(block, Items.SNOWBALL, ConstantValue.exactly(4.0F)));

        add(ArtisanatBlocks.SANDSTONE_BRICKS);
        add(ArtisanatBlocks.POLISHED_SANDSTONE);
        add(ArtisanatBlocks.RED_SANDSTONE_BRICKS);
        add(ArtisanatBlocks.POLISHED_RED_SANDSTONE);
        add(ArtisanatBlocks.SMOOTH_STONE_PAVING);
        add(ArtisanatBlocks.CHISELED_PRISMARINE);
        add(ArtisanatBlocks.PRISMARINE_BRICK_PAVING);

        add(ArtisanatBlocks.STAINED_BRICK_BLOCKS);
        add(ArtisanatBlocks.BRICK_TILE_BLOCKS);
        add(ArtisanatBlocks.STAINED_BRICK_TILE_BLOCKS);

        add(ArtisanatBlocks.TERRACOTTA_BLOCKS);
        add(ArtisanatBlocks.STAINED_TERRACOTTA_BLOCKS);
        add(ArtisanatBlocks.TERRACOTTA_BRICKS);
        add(ArtisanatBlocks.STAINED_TERRACOTTA_BRICKS);

        dropSelf(ArtisanatBlocks.DARK_PRISMARINE_WALL);
        add(ArtisanatBlocks.STAINED_DARK_PRISMARINE_BLOCKS);

        add(ArtisanatBlocks.CONCRETE_BLOCKS);
        add(ArtisanatBlocks.CONCRETE_BRICKS);

        add(ArtisanatBlocks.QUARTZ_PAVING_BLOCKS);

        add(ArtisanatBlocks.COAL_BLOCKS);
        add(ArtisanatBlocks.IRON_BLOCKS);
        add(ArtisanatBlocks.GOLD_BLOCKS);
        add(ArtisanatBlocks.LAPIS_BLOCKS);
        add(ArtisanatBlocks.REDSTONE_BLOCKS);
        add(ArtisanatBlocks.EMERALD_BLOCKS);
        add(ArtisanatBlocks.DIAMOND_BLOCKS);
        add(ArtisanatBlocks.NETHERITE_BLOCKS);

        add(ArtisanatBlocks.UNPLATED_COPPER_BLOCKS);
        add(ArtisanatBlocks.COPPER_BRICKS);
        add(ArtisanatBlocks.COPPER_TILES);
    }

    public void add(WoodBlocks blocks) {
        this.add(blocks.slab(), this::createSlabItemTable);
        this.dropSelf(blocks.stairs());
        this.dropSelf(blocks.button());
    }

    public void add(BSSBlocks blocks) {
        this.dropSelf(blocks.block());
        this.add(blocks.slab(), this::createSlabItemTable);
        this.dropSelf(blocks.stairs());
    }

    public void add(SSWPBBlocks blocks) {
        this.add(blocks.slab(), this::createSlabItemTable);
        this.dropSelf(blocks.stairs());
        this.dropSelf(blocks.wall());
        this.dropSelf(blocks.pressurePlate());
        this.dropSelf(blocks.button());
    }

    public void add(OreBlocks blocks) {
        this.dropSelf(blocks.platedBlock());
        this.dropSelf(blocks.cutBlock());
        this.dropSelf(blocks.bricks());
        this.dropSelf(blocks.tiles());
    }

    public void add(BSSWBlocks blocks) {
        this.dropSelf(blocks.block());
        this.add(blocks.slab(), this::createSlabItemTable);
        this.dropSelf(blocks.stairs());
        this.dropSelf(blocks.wall());
    }

    public void add(CopperBlocks blocks) {
        for (var blockz : blocks.map().values()) {
            this.dropSelf(blockz);
        }
    }

    public void add(StainedBSSBlocks blocks) {
        for (var blockz : blocks.colorMap().values()) {
            this.add(blockz);
        }
    }

    public void add(StainedBSSWBlocks blocks) {
        for (var blockz : blocks.colorMap().values()) {
            this.add(blockz);
        }
    }

    public void add(StainedSSWPBBlocks blocks) {
        for (var blockz : blocks.colorMap().values()) {
            this.add(blockz);
        }
    }
}