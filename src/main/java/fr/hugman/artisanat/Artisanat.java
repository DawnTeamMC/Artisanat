package fr.hugman.artisanat;

import fr.hugman.artisanat.registry.content.ArtisanatBlocks;
import fr.hugman.dawn.Registrar;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Artisanat implements ModInitializer {
    public static final Registrar REGISTRAR = new Registrar("artisanat");
    public static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void onInitialize() {
        ArtisanatBlocks.register(REGISTRAR);

        if (FabricLoader.getInstance().isModLoaded("columns")) {
            LOGGER.warn("Columns compatibility has not yet been implemented");
        }

    }
}
