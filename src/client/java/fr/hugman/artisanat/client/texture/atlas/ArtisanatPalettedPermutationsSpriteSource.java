package fr.hugman.artisanat.client.texture.atlas;

import com.google.common.base.Suppliers;
import com.mojang.blaze3d.platform.NativeImage;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.texture.SpriteContents;
import net.minecraft.client.renderer.texture.atlas.SpriteResourceLoader;
import net.minecraft.client.renderer.texture.atlas.SpriteSource;
import net.minecraft.client.renderer.texture.atlas.sources.LazyLoadedImage;
import net.minecraft.client.resources.metadata.animation.FrameSize;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.util.ARGB;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.IntUnaryOperator;
import java.util.function.Supplier;

@Environment(EnvType.CLIENT)
public record ArtisanatPalettedPermutationsSpriteSource(
		Map<Identifier, OutputIdentifier> textures,
		Identifier paletteKey,
		Map<String, Identifier> permutations
) implements SpriteSource {
	static final Logger LOGGER = LogUtils.getLogger();
	public static final MapCodec<ArtisanatPalettedPermutationsSpriteSource> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group(
			Codec.unboundedMap(Identifier.CODEC, OutputIdentifier.CODEC).fieldOf("textures").forGetter(source -> source.textures),
			Identifier.CODEC.fieldOf("palette_key").forGetter(source -> source.paletteKey),
			Codec.unboundedMap(Codec.STRING, Identifier.CODEC).fieldOf("permutations").forGetter(source -> source.permutations)
	).apply(instance, ArtisanatPalettedPermutationsSpriteSource::new));

	@Override
	public void run(ResourceManager resourceManager, Output regions) {
		Supplier<int[]> supplier = Suppliers.memoize(() -> open(resourceManager, this.paletteKey));
		Map<String, Supplier<IntUnaryOperator>> map = new HashMap<>();
		this.permutations.forEach((key, texture) -> map.put(key, Suppliers.memoize(() -> toMapper(supplier.get(), open(resourceManager, texture)))));

		for (var textureOutput : this.textures.entrySet()) {
			var identifier = textureOutput.getKey();
			Identifier identifier2 = SpriteSource.TEXTURE_ID_CONVERTER.idToFile(identifier);
			Optional<Resource> optional = resourceManager.getResource(identifier2);
			if (optional.isEmpty()) {
				LOGGER.warn("Unable to find texture {}", identifier2);
			} else {
				LazyLoadedImage atlasSprite = new LazyLoadedImage(identifier2, optional.get(), map.size());

				for (Map.Entry<String, Supplier<IntUnaryOperator>> entry : map.entrySet()) {
					Identifier identifier3 = textureOutput.getValue().apply(entry.getKey());
					regions.add(identifier3, new PalettedSpriteRegion(atlasSprite, entry.getValue(), identifier3));
				}
			}
		}
	}

	private static IntUnaryOperator toMapper(int[] from, int[] to) {
		if (to.length != from.length) {
			LOGGER.warn("Palette mapping has different sizes: {} and {}", from.length, to.length);
			throw new IllegalArgumentException();
		} else {
			Int2IntMap int2IntMap = new Int2IntOpenHashMap(to.length);

			for (int i = 0; i < from.length; i++) {
				int j = from[i];
				if (ARGB.alpha(j) != 0) {
					int2IntMap.put(ARGB.transparent(j), to[i]);
				}
			}

			return color -> {
				int ix = ARGB.alpha(color);
				if (ix == 0) {
					return color;
				} else {
					int jx = ARGB.transparent(color);
					int k = int2IntMap.getOrDefault(jx, ARGB.opaque(jx));
					int l = ARGB.alpha(k);
					return ARGB.color(ix * l / 255, k);
				}
			};
		}
	}

	private static int[] open(ResourceManager resourceManager, Identifier texture) {
		Optional<Resource> optional = resourceManager.getResource(TEXTURE_ID_CONVERTER.idToFile(texture));
		if (optional.isEmpty()) {
			LOGGER.error("Failed to load palette image {}", texture);
			throw new IllegalArgumentException();
		} else {
			try {
				InputStream inputStream = optional.get().open();

				int[] var5;
				try (NativeImage nativeImage = NativeImage.read(inputStream)) {
					var5 = nativeImage.getPixels();
				} catch (Throwable var10) {
					if (inputStream != null) {
						try {
							inputStream.close();
						} catch (Throwable var7) {
							var10.addSuppressed(var7);
						}
					}

					throw var10;
				}

				if (inputStream != null) {
					inputStream.close();
				}

				return var5;
			} catch (Exception var11) {
				LOGGER.error("Couldn't load texture {}", texture, var11);
				throw new IllegalArgumentException();
			}
		}
	}

	@Override
	public MapCodec<? extends SpriteSource> codec() {
		return CODEC;
	}

	@Environment(EnvType.CLIENT)
	record PalettedSpriteRegion(
			LazyLoadedImage baseImage,
			Supplier<IntUnaryOperator> palette,
			Identifier permutationLocation
	) implements DiscardableLoader {
		@Nullable
		@Override
		public SpriteContents get(SpriteResourceLoader spriteOpener) {
			Object var3;
			try {
				NativeImage nativeImage = this.baseImage.get().mappedCopy(this.palette.get());
				return new SpriteContents(
						this.permutationLocation, new FrameSize(nativeImage.getWidth(), nativeImage.getHeight()), nativeImage
				);
			} catch (IllegalArgumentException | IOException var7) {
				ArtisanatPalettedPermutationsSpriteSource.LOGGER.error("unable to apply palette to {}", this.permutationLocation, var7);
				var3 = null;
			} finally {
				this.baseImage.release();
			}

			return (SpriteContents) var3;
		}

		@Override
		public void discard() {
			this.baseImage.release();
		}
	}
}