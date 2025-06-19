package fr.hugman.artisanat.itemgroup;

import fr.hugman.artisanat.Artisanat;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemStackSet;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;

import java.util.Set;

public final class ArtisanatItemGroup {
    public static void fill(ItemGroup.DisplayContext displayContext, ItemGroup.Entries entries) {
        Set<ItemStack> set = ItemStackSet.create();

        for (ItemGroup itemGroup : Registries.ITEM_GROUP) {
            if (itemGroup.getType() != ItemGroup.Type.SEARCH) {
                for (var stack : itemGroup.getSearchTabStacks()) {
                    if (isArtisanat(Registries.ITEM.getEntry(stack.getItem()))) {
                        set.add(stack);
                    }
                }
            }
        }

        entries.addAll(set);
    }

    private static boolean isArtisanat(RegistryEntry<?> entry) {
        return isArtisanat(entry.getKey().orElseThrow());
    }

    private static boolean isArtisanat(RegistryKey<?> key) {
        return key.getValue().getNamespace().equals(Artisanat.MOD_ID);
    }
}
