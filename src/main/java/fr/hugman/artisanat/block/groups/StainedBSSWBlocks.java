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
public record StainedBSSWBlocks(Map<DyeColor, BSSWBlocks> colorMap) {
    public static Builder of(BlockBuilder baseBlock) {
        return new Builder(baseBlock);
    }

    public static Builder of(Block baseBlock) {
        return of(new BlockBuilder(baseBlock));
    }

    public static class Builder implements CustomRegisterable<StainedBSSWBlocks> {
        private final BlockBuilder block;

        private Builder(BlockBuilder block) {
            this.block = block;
        }

        public StainedBSSWBlocks register(String path) {
            var colorMap = new HashMap<DyeColor, BSSWBlocks>();
            for (DyeColor color : DyeColor.values()) {
                String blockPath = color.getName() + "_" + path;
                colorMap.put(color, BSSWBlocks.of(block).register(blockPath));
            }
            return new StainedBSSWBlocks(colorMap);
        }
    }

    public Block get(DyeColor color) {
        return colorMap.get(color).block();
    }
}
