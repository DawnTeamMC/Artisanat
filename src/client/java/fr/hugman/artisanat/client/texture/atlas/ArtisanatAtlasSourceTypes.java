package fr.hugman.artisanat.client.texture.atlas;

import com.mojang.serialization.MapCodec;
import fr.hugman.artisanat.Artisanat;
import net.fabricmc.fabric.api.client.rendering.v1.AtlasSourceTypeRegistry;
import net.minecraft.client.texture.atlas.AtlasSource;
import net.minecraft.client.texture.atlas.AtlasSourceType;

public class ArtisanatAtlasSourceTypes {
    public static final AtlasSourceType PALETTED_PERMUTATIONS = of("paletted_permutations", ArtisanatPalettedPermutationsAtlasSource.CODEC);

    public static AtlasSourceType of(String id, MapCodec<? extends AtlasSource> codec) {
        var atlasSourceType = new AtlasSourceType(codec);
        AtlasSourceTypeRegistry.register(Artisanat.id(id), atlasSourceType);
        return atlasSourceType;
    }
}
