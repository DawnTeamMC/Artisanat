package fr.hugman.artisanat.block;

import fr.hugman.artisanat.Artisanat;
import fr.hugman.artisanat.block.groups.CopperBlocks;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.block.Oxidizable;

public class ArtisanatOxidizableBlocks {
    public static void register() {
        register(ArtisanatBlocks.UNPLATED_COPPER_BLOCKS);
        register(ArtisanatBlocks.COPPER_BRICKS);
        register(ArtisanatBlocks.COPPER_TILES);
    }

    private static void register(CopperBlocks blocks) {
        OxidizableBlocksRegistry.registerOxidizableBlockPair(blocks.get(Oxidizable.OxidationLevel.UNAFFECTED, false), blocks.get(Oxidizable.OxidationLevel.EXPOSED, false));
        OxidizableBlocksRegistry.registerOxidizableBlockPair(blocks.get(Oxidizable.OxidationLevel.EXPOSED, false), blocks.get(Oxidizable.OxidationLevel.WEATHERED, false));
        OxidizableBlocksRegistry.registerOxidizableBlockPair(blocks.get(Oxidizable.OxidationLevel.WEATHERED, false), blocks.get(Oxidizable.OxidationLevel.OXIDIZED, false));

        for (var level : Oxidizable.OxidationLevel.values()) {
            OxidizableBlocksRegistry.registerWaxableBlockPair(blocks.get(level, false), blocks.get(level, true));
            Artisanat.LOGGER.info(blocks.get(level, false).getClass().getSimpleName() + ": " + blocks.get(level, false));
        }

    }
}
