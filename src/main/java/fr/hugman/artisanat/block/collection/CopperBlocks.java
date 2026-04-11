package fr.hugman.artisanat.block.collection;

import com.mojang.datafixers.util.Pair;
import fr.hugman.artisanat.block.ArtisanatBlocks;
import fr.hugman.artisanat.block.helper.BlockBuilder;
import fr.hugman.artisanat.util.CustomRegisterable;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.WeatheringCopperFullBlock;

import java.util.HashMap;
import java.util.Map;

public record CopperBlocks(
        Map<Pair<WeatheringCopper.WeatherState, Boolean>, Block> map
) {
    public static Builder of(String prefix, String suffix) {
        if (!prefix.isEmpty()) prefix = prefix + "_";
        if (!suffix.isEmpty()) suffix = "_" + suffix;
        return new Builder(prefix, suffix);
    }

    public Block get(WeatheringCopper.WeatherState level, boolean waxed) {
        return map.get(Pair.of(level, waxed));
    }

    public static class Builder implements CustomRegisterable<CopperBlocks> {
        private final String prefix;
        private final String suffix;

        public Builder(String prefix, String suffix) {
            this.prefix = prefix;
            this.suffix = suffix;
        }

        public CopperBlocks register(String path) {
            var map = new HashMap<Pair<WeatheringCopper.WeatherState, Boolean>, Block>();
            String[] oxidationLevels = {"copper", "exposed_copper", "weathered_copper", "oxidized_copper"};
            for (WeatheringCopper.WeatherState level : WeatheringCopper.WeatherState.values()) {
                for (boolean waxed : new boolean[]{true, false}) {
                    var defSuffix = (suffix.isEmpty() && level == WeatheringCopper.WeatherState.UNAFFECTED ? "_block" : suffix);
                    var name = (waxed ? "waxed_" : "") + prefix + oxidationLevels[level.ordinal()] + defSuffix;
                    map.put(Pair.of(level, waxed), makeBlock(level, waxed, name));
                }
            }
            return new CopperBlocks(map);
        }

        private Block makeBlock(WeatheringCopper.WeatherState level, boolean waxed, String name) {
            var builder = new BlockBuilder(switch (level) {
                case WeatheringCopper.WeatherState.UNAFFECTED -> Blocks.COPPER_BLOCK;
                case WeatheringCopper.WeatherState.EXPOSED -> Blocks.EXPOSED_COPPER;
                case WeatheringCopper.WeatherState.WEATHERED -> Blocks.WEATHERED_COPPER;
                case WeatheringCopper.WeatherState.OXIDIZED -> Blocks.OXIDIZED_COPPER;
            });

            if (!waxed) {
                builder.factory(s -> new WeatheringCopperFullBlock(level, s));
            }

            return builder.register(ArtisanatBlocks.keyOf(name));
        }
    }
}
