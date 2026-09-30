package fr.hugman.artisanat.block;

import fr.hugman.artisanat.block.collection.CopperBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WeatheringCopper;

import java.util.function.BiConsumer;

/**
 * Oxidation stages and waxed variants. Fabric registers them through Fabric API;
 * NeoForge reads them from data maps generated from this class.
 */
public class ArtisanatOxidizableBlocks {
    public static void register(BiConsumer<Block, Block> nextStage, BiConsumer<Block, Block> waxed) {
        register(ArtisanatBlocks.UNPLATED_COPPER_BLOCKS, nextStage, waxed);
        register(ArtisanatBlocks.COPPER_BRICKS, nextStage, waxed);
        register(ArtisanatBlocks.COPPER_TILES, nextStage, waxed);
    }

    private static void register(CopperBlocks blocks, BiConsumer<Block, Block> nextStage, BiConsumer<Block, Block> waxed) {
        nextStage.accept(blocks.get(WeatheringCopper.WeatherState.UNAFFECTED, false), blocks.get(WeatheringCopper.WeatherState.EXPOSED, false));
        nextStage.accept(blocks.get(WeatheringCopper.WeatherState.EXPOSED, false), blocks.get(WeatheringCopper.WeatherState.WEATHERED, false));
        nextStage.accept(blocks.get(WeatheringCopper.WeatherState.WEATHERED, false), blocks.get(WeatheringCopper.WeatherState.OXIDIZED, false));

        for (var level : WeatheringCopper.WeatherState.values()) {
            waxed.accept(blocks.get(level, false), blocks.get(level, true));
        }
    }
}
