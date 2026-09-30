package fr.hugman.artisanat.neoforge.client;

import fr.hugman.artisanat.Artisanat;
import fr.hugman.artisanat.client.texture.atlas.ArtisanatSpriteSourceTypes;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.RegisterSpriteSourcesEvent;

@Mod(value = Artisanat.MOD_ID, dist = Dist.CLIENT)
public class ArtisanatNeoForgeClient {
    public ArtisanatNeoForgeClient(IEventBus modBus) {
        modBus.addListener(RegisterSpriteSourcesEvent.class, event -> ArtisanatSpriteSourceTypes.register(event::register));
    }
}
