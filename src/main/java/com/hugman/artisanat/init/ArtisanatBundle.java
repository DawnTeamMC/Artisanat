package com.hugman.artisanat.init;

import com.hugman.artisanat.Artisanat;
import com.hugman.dawn.api.creator.Creator;
import com.hugman.dawn.api.creator.SimpleCreator;
import com.hugman.dawn.api.creator.bundle.Bundle;

public abstract class ArtisanatBundle extends Bundle {
	protected static <O, V extends SimpleCreator<O>> O add(V creator) {
		Artisanat.MOD_DATA.addCreator(creator);
		return creator.getValue();
	}

	protected static <V extends Creator> V creator(V creator) {
		Artisanat.MOD_DATA.addCreator(creator);
		return creator;
	}

	protected static <V extends Bundle> V bundle(V bundle) {
		Artisanat.MOD_DATA.addBundle(bundle);
		return bundle;
	}
}
