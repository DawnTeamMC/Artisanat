package fr.hugman.artisanat.neoforge;

import fr.hugman.artisanat.platform.ArtisanatPlatform;
import fr.hugman.artisanat.platform.CreativeModeTabOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

import java.util.*;
import java.util.function.Consumer;

/**
 * Collects the registrations the shared code makes during init, and hands them to NeoForge in its events.
 */
public class ArtisanatNeoForgePlatform implements ArtisanatPlatform {
    private final Map<ResourceKey<CreativeModeTab>, List<Consumer<CreativeModeTabOutput>>> tabModifiers = new HashMap<>();

    void subscribe(IEventBus modBus) {
        modBus.addListener(BuildCreativeModeTabContentsEvent.class, event -> {
            for (var modifier : this.tabModifiers.getOrDefault(event.getTabKey(), List.of())) {
                modifier.accept((anchor, items) -> {
                    insertAfter(event, event.getParentEntries(), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY, anchor, items);
                    insertAfter(event, event.getSearchEntries(), CreativeModeTab.TabVisibility.SEARCH_TAB_ONLY, anchor, items);
                });
            }
        });
    }

    @Override
    public CreativeModeTab.Builder creativeModeTabBuilder() {
        return CreativeModeTab.builder();
    }

    @Override
    public void modifyCreativeModeTab(ResourceKey<CreativeModeTab> tab, Consumer<CreativeModeTabOutput> modifier) {
        this.tabModifiers.computeIfAbsent(tab, k -> new ArrayList<>()).add(modifier);
    }

    /**
     * Mirrors Fabric's insertAfter: NeoForge's throws if the anchor is missing or the entry already exists.
     */
    private static void insertAfter(BuildCreativeModeTabContentsEvent event, SortedSet<ItemStack> entries,
                                    CreativeModeTab.TabVisibility visibility, ItemLike anchor, ItemLike... items) {
        ItemStack previous = new ItemStack(anchor);
        for (ItemLike item : items) {
            ItemStack stack = new ItemStack(item);
            if (entries.contains(stack)) continue;
            if (entries.contains(previous)) event.insertAfter(previous, stack, visibility);
            else event.accept(stack, visibility);
            previous = stack;
        }
    }
}
