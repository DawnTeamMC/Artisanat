package fr.hugman.artisanat.block.groups;

import fr.hugman.artisanat.block.helper.BlockBuilder;
import fr.hugman.artisanat.util.CustomRegisterable;
import net.minecraft.block.Block;
import net.minecraft.util.DyeColor;

import java.util.*;

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

    public Block[] all() {
        List<Block> blocks = new ArrayList<>();
        for (BSSBlocks bssBlocks : colorMap.values()) {
            blocks.addAll(Arrays.asList(bssBlocks.all()));
        }
        return blocks.toArray(new Block[0]);
    }

    public static class Builder implements CustomRegisterable<StainedBSSBlocks> {
        private final BlockBuilder block;

        private Builder(BlockBuilder block) {
            this.block = block;
        }

        public StainedBSSBlocks register(String path) {
            var colorMap = new HashMap<DyeColor, BSSBlocks>();
            for (DyeColor color : DyeColor.values()) {
                String blockPath = color.getId() + "_" + path;
                colorMap.put(color, BSSBlocks.of(block).register(blockPath));
            }
            return new StainedBSSBlocks(colorMap);
        }
    }
}
