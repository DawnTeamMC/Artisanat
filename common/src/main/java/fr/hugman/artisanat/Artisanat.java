package fr.hugman.artisanat;

import com.google.common.reflect.Reflection;
import fr.hugman.artisanat.block.ArtisanatBlocks;
import fr.hugman.artisanat.item.creative_tab.ArtisanatCreativeModeTabAdditions;
import fr.hugman.artisanat.item.creative_tab.ArtisanatCreativeModeTabs;
import net.minecraft.resources.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Artisanat {
    public static final String MOD_ID = "artisanat";
    public static final Logger LOGGER = LogManager.getLogger();

    /**
     * Registers everything. Called once by each loader's entrypoint.
     */
    public static void init() {
        Reflection.initialize(ArtisanatBlocks.class);

        Reflection.initialize(ArtisanatCreativeModeTabs.class);
        ArtisanatCreativeModeTabAdditions.registerEvents();
    }

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}