package fr.hugman.artisanat.data.provider;

import fr.hugman.artisanat.Artisanat;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Util;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ArtisanatEnglishLangProvider extends FabricLanguageProvider {
	private static final Set<String> DO_NOT_TITLE_CASE = Set.of(
			"of", "the", "and", "a", "an", "in", "on", "for", "to", "at", "by", "from", "with"
	);

	public ArtisanatEnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
		super(dataOutput, "en_us", registryLookup);
	}

	@Override
	public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder builder) {
		this.generateAutomaticTranslations(wrapperLookup, builder);

		builder.add("modmenu.descriptionTranslation.artisanat", "More building blocks! Includes new types of bricks and new shapes/colors of existing blocks!");
	}

	private void generateAutomaticTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder builder) {
		for (var block : getRegistryEntries(wrapperLookup, RegistryKeys.BLOCK)) {
			builder.add(block.value(), snakeToTitleCase(block.registryKey().getValue().getPath()));
		}

		for (var itemGroup : getRegistryEntries(wrapperLookup, RegistryKeys.ITEM_GROUP)) {
			var id = itemGroup.registryKey().getValue();
			builder.add(Util.createTranslationKey("item_group", id), snakeToTitleCase(id.getPath()));
		}
	}

	private static <O> List<RegistryEntry.Reference<O>> getRegistryEntries(RegistryWrapper.WrapperLookup wrapperLookup, RegistryKey<? extends Registry<O>> registryKey) {
		return wrapperLookup.getOrThrow(registryKey).streamEntries()
				.filter(entry -> entry.registryKey().getValue().getNamespace().equals(Artisanat.MOD_ID))
				.toList();
	}

	private static String snakeToTitleCase(String str) {
		String[] words = str.split("_");
		StringBuilder titleCase = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			if (word.isEmpty()) {
				continue;
			}
			if (i != 0 && DO_NOT_TITLE_CASE.contains(word.toLowerCase())) {
				titleCase.append(word.toLowerCase());
			} else {
				titleCase.append(Character.toUpperCase(word.charAt(0)))
						.append(word.substring(1).toLowerCase());
			}
			if (i < words.length - 1) {
				titleCase.append(" ");
			}
		}
		return titleCase.toString();
	}
}