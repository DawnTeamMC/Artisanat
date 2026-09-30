package fr.hugman.artisanat.client.texture.atlas;

import com.mojang.serialization.MapCodec;
import fr.hugman.artisanat.Artisanat;
import net.minecraft.client.renderer.texture.atlas.SpriteSource;
import net.minecraft.resources.Identifier;

import java.util.function.BiConsumer;

public class ArtisanatSpriteSourceTypes {
    public static void register(BiConsumer<Identifier, MapCodec<? extends SpriteSource>> registrar) {
        registrar.accept(Artisanat.id("paletted_permutations"), ArtisanatPalettedPermutationsSpriteSource.CODEC);
    }
}
