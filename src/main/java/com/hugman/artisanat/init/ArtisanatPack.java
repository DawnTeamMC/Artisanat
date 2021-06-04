package com.hugman.artisanat.init;

import com.hugman.dawn.api.creator.Creator;
import com.hugman.dawn.api.creator.pack.Pack;
import com.hugman.artisanat.Artisanat;

public abstract class ArtisanatPack extends Pack {
	protected static <V, B extends Creator.Builder<V>> V register(B creatorBuilder) {
		return add(creatorBuilder, Artisanat.MOD_DATA);
	}

	protected static <P extends Pack, B extends Pack.Builder> P register(B packBuilder) {
		return add(packBuilder, Artisanat.MOD_DATA);
	}
}
