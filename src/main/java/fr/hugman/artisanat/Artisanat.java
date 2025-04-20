package fr.hugman.artisanat;

import com.google.common.reflect.Reflection;
import fr.hugman.artisanat.block.ArtisanatBlocks;
import fr.hugman.artisanat.itemgroup.ArtisanatItemGroupAdditions;
import fr.hugman.artisanat.itemgroup.ArtisanatItemGroups;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Artisanat implements ModInitializer {
    public static final String MOD_ID = "artisanat";
    public static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void onInitialize() {
        Reflection.initialize(ArtisanatBlocks.class);

        Reflection.initialize(ArtisanatItemGroups.class);
        ArtisanatItemGroupAdditions.registerEvents();
    }

    public static Identifier id(String path) {
        return Identifier.of(MOD_ID, path);
    }
}