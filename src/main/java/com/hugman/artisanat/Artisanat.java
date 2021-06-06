package com.hugman.artisanat;

import com.hugman.artisanat.compat.init.ArtisanatColumns;
import com.hugman.artisanat.init.ArtisanatBlocks;
import com.hugman.dawn.api.object.ModData;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Artisanat implements ModInitializer {
	public static final ModData MOD_DATA = new ModData("artisanat");
	public static final Logger LOGGER = LogManager.getLogger();

	@Override
	public void onInitialize() {
		ArtisanatBlocks.init();
		if(FabricLoader.getInstance().isModLoaded("columns")) {
			ArtisanatColumns.init();
		}
		MOD_DATA.registerCreators();
	}
}