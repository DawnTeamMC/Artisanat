package fr.hugman.artisanat.data;

import fr.hugman.artisanat.block.ArtisanatBlocks;
import fr.hugman.artisanat.block.groups.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ArtisanatBlockLootTableProvider extends FabricBlockLootTableProvider {
    public ArtisanatBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ArtisanatBlocks.OAK_WOOD_BLOCKS);
        addDrop(ArtisanatBlocks.SPRUCE_WOOD_BLOCKS);
        addDrop(ArtisanatBlocks.BIRCH_WOOD_BLOCKS);
        addDrop(ArtisanatBlocks.JUNGLE_WOOD_BLOCKS);
        addDrop(ArtisanatBlocks.ACACIA_WOOD_BLOCKS);
        addDrop(ArtisanatBlocks.CHERRY_WOOD_BLOCKS);
        addDrop(ArtisanatBlocks.DARK_OAK_WOOD_BLOCKS);
        addDrop(ArtisanatBlocks.PALE_OAK_WOOD_BLOCKS);
        addDrop(ArtisanatBlocks.MANGROVE_WOOD_BLOCKS);
        addDrop(ArtisanatBlocks.CRIMSON_HYPHAE_BLOCKS);
        addDrop(ArtisanatBlocks.WARPED_HYPHAE_BLOCKS);

        addDrop(ArtisanatBlocks.COBBLESTONE_BRICKS);
        addDrop(ArtisanatBlocks.MOSSY_COBBLESTONE_BRICKS);

        addDrop(ArtisanatBlocks.GRANITE_BRICKS);
        addDrop(ArtisanatBlocks.DIORITE_BRICKS);
        addDrop(ArtisanatBlocks.ANDESITE_BRICKS);

        addDrop(ArtisanatBlocks.SANDSTONE_BRICKS);
        addDrop(ArtisanatBlocks.POLISHED_SANDSTONE);
        addDrop(ArtisanatBlocks.RED_SANDSTONE_BRICKS);
        addDrop(ArtisanatBlocks.POLISHED_RED_SANDSTONE);
        addDrop(ArtisanatBlocks.SMOOTH_STONE_PAVING);
        addDrop(ArtisanatBlocks.CHISELED_PRISMARINE);
        addDrop(ArtisanatBlocks.PRISMARINE_BRICK_PAVING);

        addDrop(ArtisanatBlocks.STAINED_BRICK_BLOCKS);
        addDrop(ArtisanatBlocks.BRICK_TILE_BLOCKS);
        addDrop(ArtisanatBlocks.STAINED_BRICK_TILE_BLOCKS);

        addDrop(ArtisanatBlocks.TERRACOTTA_BLOCKS);
        addDrop(ArtisanatBlocks.STAINED_TERRACOTTA_BLOCKS);
        addDrop(ArtisanatBlocks.TERRACOTTA_BRICKS);
        addDrop(ArtisanatBlocks.STAINED_TERRACOTTA_BRICKS);

        addDrop(ArtisanatBlocks.DARK_PRISMARINE_WALL);
        addDrop(ArtisanatBlocks.STAINED_DARK_PRISMARINE_BLOCKS);

        addDrop(ArtisanatBlocks.CONCRETE_BLOCKS);
        addDrop(ArtisanatBlocks.QUARTZ_PAVING_BLOCKS);

        addDrop(ArtisanatBlocks.COAL_BLOCKS);
        addDrop(ArtisanatBlocks.IRON_BLOCKS);
        addDrop(ArtisanatBlocks.GOLD_BLOCKS);
        addDrop(ArtisanatBlocks.LAPIS_BLOCKS);
        addDrop(ArtisanatBlocks.REDSTONE_BLOCKS);
        addDrop(ArtisanatBlocks.EMERALD_BLOCKS);
        addDrop(ArtisanatBlocks.DIAMOND_BLOCKS);
        addDrop(ArtisanatBlocks.NETHERITE_BLOCKS);

        addDrop(ArtisanatBlocks.UNPLATED_COPPER_BLOCKS);
        addDrop(ArtisanatBlocks.COPPER_BRICKS);
        addDrop(ArtisanatBlocks.COPPER_TILES);

        this.lootTables.forEach((id, lootTable) -> lootTable.randomSequenceId(id.getValue()));
    }

    public void addDrop(WoodBlocks blocks) {
        this.addDrop(blocks.slab(), this::slabDrops);
        this.addDrop(blocks.stairs());
        this.addDrop(blocks.button());
    }

    public void addDrop(BSSBlocks blocks) {
        this.addDrop(blocks.block());
        this.addDrop(blocks.slab(), this::slabDrops);
        this.addDrop(blocks.stairs());
    }

    public void addDrop(SSWPBBlocks blocks) {
        this.addDrop(blocks.slab(), this::slabDrops);
        this.addDrop(blocks.stairs());
        this.addDrop(blocks.wall());
        this.addDrop(blocks.pressurePlate());
        this.addDrop(blocks.button());
    }

    public void addDrop(OreBlocks blocks) {
        this.addDrop(blocks.platedBlock());
        this.addDrop(blocks.cutBlock());
        this.addDrop(blocks.bricks());
        this.addDrop(blocks.tiles());
    }

    public void addDrop(BSSWBlocks blocks) {
        this.addDrop(blocks.block());
        this.addDrop(blocks.slab(), this::slabDrops);
        this.addDrop(blocks.stairs());
        this.addDrop(blocks.wall());
    }

    public void addDrop(CopperBlocks blocks) {
        for (var blockz : blocks.map().values()) {
            this.addDrop(blockz);
        }
    }

    public void addDrop(StainedBSSBlocks blocks) {
        for (var blockz : blocks.colorMap().values()) {
            this.addDrop(blockz);
        }
    }

    public void addDrop(StainedBSSWBlocks blocks) {
        for (var blockz : blocks.colorMap().values()) {
            this.addDrop(blockz);
        }
    }

    public void addDrop(StainedSSWPBBlocks blocks) {
        for (var blockz : blocks.colorMap().values()) {
            this.addDrop(blockz);
        }
    }
}