package fr.hugman.artisanat.itemgroup;

import fr.hugman.artisanat.Artisanat;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class ArtisanatItemGroupKeys {
    public static final RegistryKey<ItemGroup> ARTISANAT = of("artisanat");

    private static RegistryKey<ItemGroup> of(String path) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Artisanat.id(path));
    }
}
