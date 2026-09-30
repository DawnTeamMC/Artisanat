package fr.hugman.artisanat.platform;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;

import java.util.ServiceLoader;
import java.util.function.Consumer;

/**
 * Everything the shared code needs from the mod loader.
 * Each loader project provides one implementation, declared in META-INF/services.
 * Registrations that loaders deliver through their own events take a registrar instead.
 */
public interface ArtisanatPlatform {
    ArtisanatPlatform INSTANCE = ServiceLoader.load(ArtisanatPlatform.class, ArtisanatPlatform.class.getClassLoader())
            .findFirst()
            .orElseThrow(() -> new IllegalStateException("No Artisanat platform implementation found"));

    CreativeModeTab.Builder creativeModeTabBuilder();

    void modifyCreativeModeTab(ResourceKey<CreativeModeTab> tab, Consumer<CreativeModeTabOutput> modifier);
}
