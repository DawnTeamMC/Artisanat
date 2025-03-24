package fr.hugman.artisanat.block.groups;

import fr.hugman.artisanat.block.helper.BlockBuilder;
import fr.hugman.artisanat.util.CustomRegisterable;
import net.minecraft.block.Block;
import net.minecraft.util.DyeColor;

import java.util.HashMap;
import java.util.Map;

/**
 * Contains stained blocks and their slabs, stairs and walls variants.
 */
public record StainedBSSBlocks(Map<DyeColor, BSSBlocks> colorMap) {
    public static Builder of(BlockBuilder baseBlock) {
        return new Builder(baseBlock);
    }

    public static Builder of(Block baseBlock) {
        return of(new BlockBuilder(baseBlock));
    }

    public static class Builder implements CustomRegisterable<StainedBSSBlocks> {
        private final BlockBuilder block;

        private Builder(BlockBuilder block) {
            this.block = block;
        }

        public StainedBSSBlocks register(String path) {
            var colorMap = new HashMap<DyeColor, BSSBlocks>();
            for (DyeColor color : DyeColor.values()) {
                String blockPath = color.getName() + "_" + path;
                colorMap.put(color, BSSBlocks.of(block).register(blockPath));
            }
            return new StainedBSSBlocks(colorMap);
        }
    }
}
