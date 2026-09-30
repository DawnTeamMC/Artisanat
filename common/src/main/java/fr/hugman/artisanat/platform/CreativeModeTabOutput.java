package fr.hugman.artisanat.platform;

import net.minecraft.world.level.ItemLike;

/**
 * The part of a loader's creative tab contents event that the shared code uses.
 */
public interface CreativeModeTabOutput {
    /**
     * Inserts the items in order after the anchor, or appends them if the tab lacks the anchor.
     */
    void insertAfter(ItemLike anchor, ItemLike... items);
}
