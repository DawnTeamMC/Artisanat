package fr.hugman.artisanat.data;

import fr.hugman.artisanat.Artisanat;
import fr.hugman.artisanat.data.provider.*;
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
        pack.addProvider(ArtisanatAtlasProvider::new);

        // Data Pack
        // - Loot tables
        pack.addProvider(ArtisanatBlockLootTableProvider::new);

        // - Tags
        var blockTagProvider = pack.addProvider(ArtisanatBlockTagProvider::new);
        pack.addProvider((output, lookup) -> new ArtisanatItemTagProvider(output, lookup, blockTagProvider));

        // - Recipes
        pack.addProvider(ArtisanatRecipeGenerator::create);
    }

    @Override
    @Nullable
    public String getEffectiveModId() {
        return Artisanat.MOD_ID;
    }
}
