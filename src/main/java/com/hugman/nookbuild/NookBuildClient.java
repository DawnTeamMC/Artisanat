package com.hugman.nookbuild;

import com.hugman.nookbuild.init.client.NookColorMaps;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class NookBuildClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		NookColorMaps.registerColors();
	}
}
