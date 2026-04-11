package fr.hugman.artisanat.client.texture.atlas;

import com.mojang.serialization.MapCodec;
import fr.hugman.artisanat.Artisanat;
import net.fabricmc.fabric.api.client.rendering.v1.SpriteSourceRegistry;
import net.minecraft.client.renderer.texture.atlas.SpriteSource;

public class ArtisanatSpriteSourceTypes {
    public static final MapCodec<ArtisanatPalettedPermutationsSpriteSource> PALETTED_PERMUTATIONS = of("paletted_permutations", ArtisanatPalettedPermutationsSpriteSource.CODEC);

    public static <S extends SpriteSource> MapCodec<S> of(String id, MapCodec<S> codec) {
        SpriteSourceRegistry.register(Artisanat.id(id), codec);
        return codec;
    }
}
