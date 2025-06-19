package fr.hugman.artisanat.block.groups;

import fr.hugman.artisanat.block.helper.BlockBuilder;
import fr.hugman.artisanat.util.CustomRegisterable;
import net.minecraft.block.Block;
import net.minecraft.util.DyeColor;

import java.util.*;

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

    public Block[] all() {
        List<Block> blocks = new ArrayList<>();
        for (BSSWBlocks bsswBlocks : colorMap.values()) {
            blocks.addAll(Arrays.asList(bsswBlocks.all()));
        }
        return blocks.toArray(new Block[0]);
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
