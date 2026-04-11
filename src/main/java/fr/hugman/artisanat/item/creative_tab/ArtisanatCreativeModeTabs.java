package fr.hugman.artisanat.item.creative_tab;

import fr.hugman.artisanat.block.ArtisanatBlocks;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;

public class ArtisanatCreativeModeTabs {
    public static final CreativeModeTab ARTISANAT = of(ArtisanatCreativeModeTabKeys.ARTISANAT, FabricCreativeModeTab.builder()
            .title(Component.translatable("item_group.artisanat.artisanat"))
            .icon(() -> new ItemStack(ArtisanatBlocks.STAINED_BRICK_BLOCKS.get(DyeColor.LIGHT_BLUE)))
            .displayItems(ArtisanatCreativeModeTab::fill)
            .build());

    private static CreativeModeTab of(ResourceKey<CreativeModeTab> key, CreativeModeTab itemGroup) {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, key, itemGroup);
    }
}
