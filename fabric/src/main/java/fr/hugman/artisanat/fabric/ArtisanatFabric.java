package fr.hugman.artisanat.fabric;

import fr.hugman.artisanat.Artisanat;
import fr.hugman.artisanat.block.ArtisanatOxidizableBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;

public class ArtisanatFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Artisanat.init();
        ArtisanatOxidizableBlocks.register(OxidizableBlocksRegistry::registerNextStage, OxidizableBlocksRegistry::registerWaxable);
    }
}
