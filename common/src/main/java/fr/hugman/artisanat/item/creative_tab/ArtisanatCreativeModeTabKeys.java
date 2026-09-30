package fr.hugman.artisanat.item.creative_tab;

import fr.hugman.artisanat.Artisanat;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;

public class ArtisanatCreativeModeTabKeys {
    public static final ResourceKey<CreativeModeTab> ARTISANAT = of("artisanat");

    private static ResourceKey<CreativeModeTab> of(String path) {
        return ResourceKey.create(Registries.CREATIVE_MODE_TAB, Artisanat.id(path));
    }
}
