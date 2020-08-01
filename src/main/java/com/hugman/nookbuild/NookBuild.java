package com.hugman.nookbuild;

import com.hugman.dawn.api.creator.ModData;
import com.hugman.dawn.init.DawnBlockPack;
import com.hugman.nookbuild.init.NookBlockPack;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NookBuild implements ModInitializer {
	public static final ModData MOD_DATA = new ModData("nookbuild");
	public static final Logger LOGGER = LogManager.getLogger();

	@Override
	public void onInitialize() {
		new NookBlockPack();
	}
}