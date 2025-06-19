package fr.hugman.artisanat.client.texture.atlas;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.Identifier;

import java.util.Optional;

public record OutputIdentifier(Optional<String> prefix, Optional<String> suffix) {
    public static final Codec<OutputIdentifier> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.STRING.optionalFieldOf("prefix").forGetter(source -> source.prefix),
            Codec.STRING.optionalFieldOf("suffix").forGetter(source -> source.suffix)
    ).apply(instance, OutputIdentifier::new));

    public static OutputIdentifier of(String prefix, String suffix) {
        return new OutputIdentifier(Optional.of(prefix), Optional.of(suffix));
    }

    public static OutputIdentifier prefix(String prefix) {
        return new OutputIdentifier(Optional.of(prefix), Optional.empty());
    }

    public static OutputIdentifier suffix(String suffix) {
        return new OutputIdentifier(Optional.empty(), Optional.of(suffix));
    }

    public Identifier apply(String path) {
        if (prefix.isPresent()) {
            path = prefix.get() + path;
        }
        if (suffix.isPresent()) {
            path = path + suffix.get();
        }
        return Identifier.of(path);
    }
}
