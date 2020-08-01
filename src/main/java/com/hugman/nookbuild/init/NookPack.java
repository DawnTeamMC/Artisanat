package com.hugman.nookbuild.init;

import com.hugman.dawn.api.creator.pack.Pack;
import com.hugman.dawn.api.creator.pack.PackBuilder;
import com.hugman.dawn.api.util.CreatorBuilder;
import com.hugman.nookbuild.NookBuild;

public abstract class NookPack extends Pack {
	protected static <V, B extends CreatorBuilder> V register(B creatorBuilder) {
		return add(creatorBuilder, NookBuild.MOD_DATA);
	}

	protected static <P extends Pack, B extends PackBuilder> P register(B packBuilder) {
		return add(packBuilder, NookBuild.MOD_DATA);
	}
}
