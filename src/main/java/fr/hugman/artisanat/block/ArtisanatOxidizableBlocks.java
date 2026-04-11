package fr.hugman.artisanat.block;

import fr.hugman.artisanat.block.collection.CopperBlocks;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.world.level.block.WeatheringCopper;

public class ArtisanatOxidizableBlocks {
    public static void register() {
        register(ArtisanatBlocks.UNPLATED_COPPER_BLOCKS);
        register(ArtisanatBlocks.COPPER_BRICKS);
        register(ArtisanatBlocks.COPPER_TILES);
    }

    private static void register(CopperBlocks blocks) {
        OxidizableBlocksRegistry.registerOxidizableBlockPair(blocks.get(WeatheringCopper.WeatherState.UNAFFECTED, false), blocks.get(WeatheringCopper.WeatherState.EXPOSED, false));
        OxidizableBlocksRegistry.registerOxidizableBlockPair(blocks.get(WeatheringCopper.WeatherState.EXPOSED, false), blocks.get(WeatheringCopper.WeatherState.WEATHERED, false));
        OxidizableBlocksRegistry.registerOxidizableBlockPair(blocks.get(WeatheringCopper.WeatherState.WEATHERED, false), blocks.get(WeatheringCopper.WeatherState.OXIDIZED, false));

        for (var level : WeatheringCopper.WeatherState.values()) {
            OxidizableBlocksRegistry.registerWaxableBlockPair(blocks.get(level, false), blocks.get(level, true));
        }
    }
}
