package fr.hugman.artisanat.data.provider;

import fr.hugman.artisanat.Artisanat;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.Util;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ArtisanatEnglishLangProvider extends FabricLanguageProvider {
	private static final Set<String> DO_NOT_TITLE_CASE = Set.of(
			"of", "the", "and", "a", "an", "in", "on", "for", "to", "at", "by", "from", "with"
	);

	public ArtisanatEnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
		super(dataOutput, "en_us", registryLookup);
	}

	@Override
	public void generateTranslations(HolderLookup.Provider wrapperLookup, TranslationBuilder builder) {
		this.generateAutomaticTranslations(wrapperLookup, builder);

		builder.add("modmenu.descriptionTranslation.artisanat", "More building blocks! Includes new types of bricks and new shapes/colors of existing blocks!");
	}

	private void generateAutomaticTranslations(HolderLookup.Provider wrapperLookup, TranslationBuilder builder) {
		for (var block : getRegistryEntries(wrapperLookup, Registries.BLOCK)) {
			builder.add(block.value(), snakeToTitleCase(block.key().identifier().getPath()));
		}

		for (var itemGroup : getRegistryEntries(wrapperLookup, Registries.CREATIVE_MODE_TAB)) {
			var id = itemGroup.key().identifier();
			builder.add(Util.makeDescriptionId("item_group", id), snakeToTitleCase(id.getPath()));
		}
	}

	private static <O> List<Holder.Reference<O>> getRegistryEntries(HolderLookup.Provider wrapperLookup, ResourceKey<? extends Registry<O>> registryKey) {
		return wrapperLookup.lookupOrThrow(registryKey).listElements()
				.filter(entry -> entry.key().identifier().getNamespace().equals(Artisanat.MOD_ID))
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