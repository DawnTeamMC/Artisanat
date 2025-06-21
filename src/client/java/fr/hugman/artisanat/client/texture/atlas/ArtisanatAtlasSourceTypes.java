package fr.hugman.artisanat.client.texture.atlas;

import com.mojang.serialization.MapCodec;
import fr.hugman.artisanat.Artisanat;
import net.fabricmc.fabric.api.client.rendering.v1.AtlasSourceRegistry;
import net.minecraft.client.texture.atlas.AtlasSource;

public class ArtisanatAtlasSourceTypes {
    public static final MapCodec<ArtisanatPalettedPermutationsAtlasSource> PALETTED_PERMUTATIONS = of("paletted_permutations", ArtisanatPalettedPermutationsAtlasSource.CODEC);

    public static <S extends AtlasSource> MapCodec<S> of(String id, MapCodec<S> codec) {
        AtlasSourceRegistry.register(Artisanat.id(id), codec);
        return codec;
    }
}
