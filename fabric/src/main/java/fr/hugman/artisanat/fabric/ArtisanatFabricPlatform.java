package fr.hugman.artisanat.fabric;

import fr.hugman.artisanat.platform.ArtisanatPlatform;
import fr.hugman.artisanat.platform.CreativeModeTabOutput;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;

import java.util.function.Consumer;

public class ArtisanatFabricPlatform implements ArtisanatPlatform {
    @Override
    public CreativeModeTab.Builder creativeModeTabBuilder() {
        return FabricCreativeModeTab.builder();
    }

    @Override
    public void modifyCreativeModeTab(ResourceKey<CreativeModeTab> tab, Consumer<CreativeModeTabOutput> modifier) {
        CreativeModeTabEvents.modifyOutputEvent(tab).register(output -> modifier.accept(output::insertAfter));
    }
}
