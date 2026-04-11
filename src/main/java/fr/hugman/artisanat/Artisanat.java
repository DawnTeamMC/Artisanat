package fr.hugman.artisanat;

import com.google.common.reflect.Reflection;
import fr.hugman.artisanat.block.ArtisanatBlocks;
import fr.hugman.artisanat.block.ArtisanatOxidizableBlocks;
import fr.hugman.artisanat.item.creative_tab.ArtisanatCreativeModeTabAdditions;
import fr.hugman.artisanat.item.creative_tab.ArtisanatCreativeModeTabs;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Artisanat implements ModInitializer {
    public static final String MOD_ID = "artisanat";
    public static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void onInitialize() {
        Reflection.initialize(ArtisanatBlocks.class);

        Reflection.initialize(ArtisanatCreativeModeTabs.class);
        ArtisanatCreativeModeTabAdditions.registerEvents();

        ArtisanatOxidizableBlocks.register();
    }

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}