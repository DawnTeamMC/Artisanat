package fr.hugman.artisanat.data;

import fr.hugman.artisanat.Artisanat;
import fr.hugman.artisanat.data.provider.ArtisanatModelProvider;
import fr.hugman.artisanat.data.provider.ArtisanatRecipeGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.jetbrains.annotations.Nullable;

public class ArtisanatDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        ArtisanatBlockFamilies.registerAll();

        // Resource Pack
        pack.addProvider(ArtisanatModelProvider::new);

        // - Recipes
        pack.addProvider(ArtisanatRecipeGenerator::create);
    }

    @Override
    @Nullable
    public String getEffectiveModId() {
        return Artisanat.MOD_ID;
    }
}
