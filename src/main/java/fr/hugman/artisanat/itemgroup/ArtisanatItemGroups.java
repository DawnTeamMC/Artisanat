package fr.hugman.artisanat.itemgroup;

import fr.hugman.artisanat.block.ArtisanatBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.DyeColor;

public class ArtisanatItemGroups {
    public static final ItemGroup ARTISANAT = of(ArtisanatItemGroupKeys.ARTISANAT, FabricItemGroup.builder()
            .displayName(Text.translatable("item_group.artisanat.artisanat"))
            .icon(() -> new ItemStack(ArtisanatBlocks.STAINED_BRICK_BLOCKS.get(DyeColor.LIGHT_BLUE)))
            .entries(ArtisanatItemGroup::fill)
            .build());

    private static ItemGroup of(RegistryKey<ItemGroup> key, ItemGroup itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, key, itemGroup);
    }
}
