package fr.hugman.artisanat.fabric.client;

import fr.hugman.artisanat.client.texture.atlas.ArtisanatSpriteSourceTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.SpriteSourceRegistry;

public class ArtisanatFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ArtisanatSpriteSourceTypes.register(SpriteSourceRegistry::register);
    }
}
