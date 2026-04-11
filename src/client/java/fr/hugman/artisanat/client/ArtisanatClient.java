package fr.hugman.artisanat.client;

import com.google.common.reflect.Reflection;
import fr.hugman.artisanat.client.texture.atlas.ArtisanatSpriteSourceTypes;
import net.fabricmc.api.ClientModInitializer;

public class ArtisanatClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Reflection.initialize(ArtisanatSpriteSourceTypes.class);
    }
}
