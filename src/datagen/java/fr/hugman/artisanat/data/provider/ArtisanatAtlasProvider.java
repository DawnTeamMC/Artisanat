package fr.hugman.artisanat.data.provider;

import fr.hugman.artisanat.Artisanat;
import fr.hugman.artisanat.client.texture.atlas.ArtisanatPalettedPermutationsAtlasSource;
import fr.hugman.artisanat.client.texture.atlas.OutputIdentifier;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricCodecDataProvider;
import net.minecraft.client.renderer.texture.atlas.SpriteSource;
import net.minecraft.client.renderer.texture.atlas.SpriteSources;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.DyeColor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class ArtisanatAtlasProvider extends FabricCodecDataProvider<List<SpriteSource>> {
    public ArtisanatAtlasProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(dataOutput, registriesFuture, PackOutput.Target.RESOURCE_PACK, "atlases", SpriteSources.FILE_CODEC);
    }

    @Override
    protected void configure(BiConsumer<Identifier, List<SpriteSource>> provider, HolderLookup.Provider lookup) {
        provider.accept(Identifier.withDefaultNamespace("blocks"), List.of(
                new ArtisanatPalettedPermutationsAtlasSource(
                        Map.of(
                                Identifier.withDefaultNamespace("block/bricks"), OutputIdentifier.of("artisanat:block/", "_bricks"),
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
