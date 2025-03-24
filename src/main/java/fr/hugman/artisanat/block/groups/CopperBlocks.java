package fr.hugman.artisanat.block.groups;

import com.mojang.datafixers.util.Pair;
import fr.hugman.artisanat.block.ArtisanatBlocks;
import fr.hugman.artisanat.block.helper.BlockBuilder;
import fr.hugman.artisanat.block.helper.BlockFactory;
import fr.hugman.artisanat.util.CustomRegisterable;
import net.minecraft.block.*;

import java.util.HashMap;
import java.util.Map;

//TODO: register to the oxidizable registry
public record CopperBlocks(
        Map<Pair<Oxidizable.OxidationLevel, Boolean>, Block> map
) {
    public static Builder of(String prefix, String suffix) {
        if(!prefix.isEmpty()) prefix = prefix + "_";
        if(!suffix.isEmpty()) suffix = "_" + suffix;
        return new Builder(prefix, suffix);
    }

    public static class Builder implements CustomRegisterable<CopperBlocks> {
        private final String prefix;
        private final String suffix;

        public Builder(String prefix, String suffix) {
            this.prefix = prefix;
            this.suffix = suffix;
        }

        public CopperBlocks register(String path) {
            var map = new HashMap<Pair<Oxidizable.OxidationLevel, Boolean>, Block>();
            String[] oxidationLevels = {"copper", "exposed_copper", "weathered_copper", "oxidized_copper"};
            for (Oxidizable.OxidationLevel level : Oxidizable.OxidationLevel.values()) {
                for (boolean waxed : new boolean[]{true, false}) {
                    var defSuffix = (suffix.isEmpty() && level == Oxidizable.OxidationLevel.UNAFFECTED ? "_block" : suffix);
                    var name = (waxed ? "waxed_" : "") + prefix + oxidationLevels[level.ordinal()] + defSuffix;
                    map.put(Pair.of(level, waxed), makeBlock(level, waxed, name));
                }
            }
            return new CopperBlocks(map);
        }

        private Block makeBlock(Oxidizable.OxidationLevel level, boolean waxed, String name) {
            var builder = new BlockBuilder(switch (level) {
                case Oxidizable.OxidationLevel.UNAFFECTED -> Blocks.COPPER_BLOCK;
                case Oxidizable.OxidationLevel.EXPOSED -> Blocks.EXPOSED_COPPER;
                case Oxidizable.OxidationLevel.WEATHERED -> Blocks.WEATHERED_COPPER;
                case Oxidizable.OxidationLevel.OXIDIZED -> Blocks.OXIDIZED_COPPER;
            });

            if (waxed) {
                builder.factory(s -> new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, s));
            }

            return builder.register(ArtisanatBlocks.keyOf(name));
        }
    }
}
