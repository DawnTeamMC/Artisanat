package fr.hugman.artisanat.itemgroup;

import fr.hugman.artisanat.block.ArtisanatBlocks;
import fr.hugman.artisanat.block.groups.*;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroups;
import net.minecraft.util.DyeColor;

import java.util.Map;

public class ArtisanatItemGroupAdditions {
    public static void registerEvents() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            add(entries, ArtisanatBlocks.OAK_WOOD_BLOCKS, Blocks.OAK_WOOD);
            add(entries, ArtisanatBlocks.SPRUCE_WOOD_BLOCKS, Blocks.SPRUCE_WOOD);
            add(entries, ArtisanatBlocks.BIRCH_WOOD_BLOCKS, Blocks.BIRCH_WOOD);
            add(entries, ArtisanatBlocks.JUNGLE_WOOD_BLOCKS, Blocks.JUNGLE_WOOD);
            add(entries, ArtisanatBlocks.ACACIA_WOOD_BLOCKS, Blocks.ACACIA_WOOD);
            add(entries, ArtisanatBlocks.CHERRY_WOOD_BLOCKS, Blocks.CHERRY_WOOD);
            add(entries, ArtisanatBlocks.DARK_OAK_WOOD_BLOCKS, Blocks.DARK_OAK_WOOD);
            add(entries, ArtisanatBlocks.PALE_OAK_WOOD_BLOCKS, Blocks.PALE_OAK_WOOD);
            add(entries, ArtisanatBlocks.MANGROVE_WOOD_BLOCKS, Blocks.MANGROVE_WOOD);
            add(entries, ArtisanatBlocks.CRIMSON_HYPHAE_BLOCKS, Blocks.CRIMSON_HYPHAE);
            add(entries, ArtisanatBlocks.WARPED_HYPHAE_BLOCKS, Blocks.WARPED_HYPHAE);

            add(entries, ArtisanatBlocks.COBBLESTONE_BRICKS, Blocks.COBBLESTONE_WALL);
            add(entries, ArtisanatBlocks.MOSSY_COBBLESTONE_BRICKS, Blocks.MOSSY_COBBLESTONE_WALL);
            add(entries, ArtisanatBlocks.GRANITE_BRICKS, Blocks.GRANITE_WALL);
            add(entries, ArtisanatBlocks.DIORITE_BRICKS, Blocks.DIORITE_WALL);
            add(entries, ArtisanatBlocks.ANDESITE_BRICKS, Blocks.ANDESITE_WALL);
            add(entries, ArtisanatBlocks.SANDSTONE_BRICKS, Blocks.SANDSTONE_WALL);
            add(entries, ArtisanatBlocks.POLISHED_SANDSTONE, Blocks.SMOOTH_SANDSTONE_SLAB);
            add(entries, ArtisanatBlocks.RED_SANDSTONE_BRICKS, Blocks.RED_SANDSTONE_WALL);
            add(entries, ArtisanatBlocks.POLISHED_RED_SANDSTONE, Blocks.SMOOTH_RED_SANDSTONE_SLAB);
            add(entries, ArtisanatBlocks.SMOOTH_STONE_PAVING, Blocks.SMOOTH_STONE_SLAB);
            add(entries, ArtisanatBlocks.CHISELED_PRISMARINE, Blocks.PRISMARINE_WALL);
            add(entries, ArtisanatBlocks.PRISMARINE_BRICK_PAVING, Blocks.PRISMARINE_BRICK_SLAB);
            add(entries, ArtisanatBlocks.BRICK_TILE_BLOCKS, Blocks.BRICK_WALL);
            entries.addAfter(Blocks.DARK_PRISMARINE_SLAB, ArtisanatBlocks.DARK_PRISMARINE_WALL);

            add(entries, ArtisanatBlocks.IRON_BLOCKS, Blocks.IRON_BLOCK);
            add(entries, ArtisanatBlocks.GOLD_BLOCKS, Blocks.GOLD_BLOCK);
            add(entries, ArtisanatBlocks.REDSTONE_BLOCKS, Blocks.REDSTONE_BLOCK);
            add(entries, ArtisanatBlocks.LAPIS_BLOCKS, Blocks.LAPIS_BLOCK);
            add(entries, ArtisanatBlocks.REDSTONE_BLOCKS, Blocks.REDSTONE_BLOCK);
            add(entries, ArtisanatBlocks.EMERALD_BLOCKS, Blocks.EMERALD_BLOCK);
            add(entries, ArtisanatBlocks.DIAMOND_BLOCKS, Blocks.DIAMOND_BLOCK);
            add(entries, ArtisanatBlocks.NETHERITE_BLOCKS, Blocks.NETHERITE_BLOCK);
            //TODO: copper blocks

        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
            add(entries, ArtisanatBlocks.STAINED_BRICK_TILE_BLOCKS, Blocks.PINK_CARPET);
            add(entries, ArtisanatBlocks.STAINED_BRICK_BLOCKS, Blocks.PINK_CARPET);

            add(entries, ArtisanatBlocks.TERRACOTTA_BRICKS, Blocks.PINK_TERRACOTTA);
            add(entries, ArtisanatBlocks.STAINED_TERRACOTTA_BRICKS, ArtisanatBlocks.TERRACOTTA_BRICKS.wall());
            add(entries, ArtisanatBlocks.TERRACOTTA_BLOCKS, Blocks.TERRACOTTA);
            add(entries, ArtisanatBlocks.STAINED_TERRACOTTA_BLOCKS, StainedSSWPBBlocks.TERRACOTTA_MAP);
            add(entries, ArtisanatBlocks.STAINED_DARK_PRISMARINE_BLOCKS, Blocks.PINK_CONCRETE_POWDER);

            add(entries, ArtisanatBlocks.CONCRETE_BRICKS, Blocks.PINK_CONCRETE);
            add(entries, ArtisanatBlocks.CONCRETE_BLOCKS, StainedSSWPBBlocks.CONCRETE_MAP);

            add(entries, ArtisanatBlocks.QUARTZ_PAVING_BLOCKS, Blocks.PINK_CONCRETE_POWDER);
        });

    }

    private static void add(FabricItemGroupEntries entries, WoodBlocks woodBlocks, ItemConvertible baseBlock) {
        entries.addAfter(baseBlock, woodBlocks.all());
    }

    private static void add(FabricItemGroupEntries entries, BSSBlocks bss, ItemConvertible baseBlock) {
        entries.addAfter(baseBlock, bss.all());
    }

    private static void add(FabricItemGroupEntries entries, BSSWBlocks bssw, ItemConvertible baseBlock) {
        entries.addAfter(baseBlock, bssw.all());
    }

    private static void add(FabricItemGroupEntries entries, StainedBSSBlocks stainedBSSBlocks, ItemConvertible baseBlock) {
        //TODO: fix sorting colors
        stainedBSSBlocks.colorMap().forEach((dyeColor, bss) -> add(entries, bss, baseBlock));
    }

    private static void add(FabricItemGroupEntries entries, StainedBSSWBlocks stainedBSSWBlocks, ItemConvertible baseBlock) {
        //TODO: fix sorting colors
        stainedBSSWBlocks.colorMap().forEach((dyeColor, bssw) -> add(entries, bssw, baseBlock));
    }

    private static void add(FabricItemGroupEntries entries, SSWPBBlocks sswpb, ItemConvertible baseBlock) {
        entries.addAfter(baseBlock, sswpb.all());
    }

    public static void add(FabricItemGroupEntries entries, StainedSSWPBBlocks stainedSswpb, Map<DyeColor, Block> colorMap) {
        stainedSswpb.colorMap().forEach((dyeColor, sswpBlocks) -> add(entries, sswpBlocks, colorMap.get(dyeColor)));
    }

    private static void add(FabricItemGroupEntries entries, OreBlocks oreBlocks, ItemConvertible baseBlock) {
        entries.addAfter(baseBlock, oreBlocks.all());
    }
}
