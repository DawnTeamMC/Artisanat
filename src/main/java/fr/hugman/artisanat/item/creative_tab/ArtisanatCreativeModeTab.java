package fr.hugman.artisanat.item.creative_tab;

import fr.hugman.artisanat.Artisanat;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackLinkedSet;

import java.util.Set;

public final class ArtisanatCreativeModeTab {
    public static void fill(CreativeModeTab.ItemDisplayParameters displayContext, CreativeModeTab.Output entries) {
        Set<ItemStack> set = ItemStackLinkedSet.createTypeAndComponentsSet();

        for (CreativeModeTab itemGroup : BuiltInRegistries.CREATIVE_MODE_TAB) {
            if (itemGroup.getType() != CreativeModeTab.Type.SEARCH) {
                for (var stack : itemGroup.getSearchTabDisplayItems()) {
                    if (isArtisanat(BuiltInRegistries.ITEM.wrapAsHolder(stack.getItem()))) {
                        set.add(stack);
                    }
                }
            }
        }

        entries.acceptAll(set);
    }

    private static boolean isArtisanat(Holder<?> entry) {
        return isArtisanat(entry.unwrapKey().orElseThrow());
    }

    private static boolean isArtisanat(ResourceKey<?> key) {
        return key.identifier().getNamespace().equals(Artisanat.MOD_ID);
    }
}
