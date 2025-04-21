package fr.hugman.artisanat.data.provider;

import fr.hugman.artisanat.Artisanat;
import fr.hugman.artisanat.client.texture.atlas.ArtisanatPalettedPermutationsAtlasSource;
import fr.hugman.artisanat.client.texture.atlas.OutputIdentifier;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricCodecDataProvider;
import net.minecraft.client.texture.atlas.AtlasSource;
import net.minecraft.client.texture.atlas.AtlasSourceManager;
import net.minecraft.data.DataOutput;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class ArtisanatAtlasProvider extends FabricCodecDataProvider<List<AtlasSource>> {
    public ArtisanatAtlasProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(dataOutput, registriesFuture, DataOutput.OutputType.RESOURCE_PACK, "atlases", AtlasSourceManager.LIST_CODEC);
    }

    @Override
    protected void configure(BiConsumer<Identifier, List<AtlasSource>> provider, RegistryWrapper.WrapperLookup lookup) {
        provider.accept(Identifier.ofVanilla("blocks"), List.of(
                new ArtisanatPalettedPermutationsAtlasSource(
                        Map.of(
                                Identifier.ofVanilla("block/bricks"), OutputIdentifier.of("artisanat:block/", "_bricks"),
                                Artisanat.id("block/brick_tiles"), OutputIdentifier.of("artisanat:block/", "_brick_tiles"),
                                Artisanat.id("block/brick_dark_prismarine"), OutputIdentifier.of("artisanat:block/", "_dark_prismarine")
                        ),
                        Artisanat.id("palettes/brick"),
                        dyesPalettes("brick")
                ),
        new ArtisanatPalettedPermutationsAtlasSource(
                Map.of(
                        Artisanat.id("block/quartz_paving"), OutputIdentifier.of("artisanat:block/", "_quartz_paving"),
                        Artisanat.id("block/concrete_bricks"), OutputIdentifier.of("artisanat:block/", "_concrete_bricks")
                ),
                Artisanat.id("palettes/concrete"),
                dyesPalettes("concrete")
        )
        ));
    }

    public static Map<String, Identifier> dyesPalettes(String path) {
        var map = new HashMap<String, Identifier>();
        for (DyeColor color : DyeColor.values()) {
            map.put(color.getName(), Artisanat.id("palettes/" + path + "/" + color.getName()));
        }
        return map;
    }

    @Override
    public String getName() {
        return "Atlases";
    }
}
