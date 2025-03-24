package fr.hugman.artisanat.itemgroup;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class ArtisanatItemGroupAdditions {
    public static void registerEvents() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {

        });
    }
}
