package fr.hugman.artisanat.block.collection;

import com.google.common.collect.ImmutableMap;
import fr.hugman.artisanat.util.CustomRegisterable;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ColorCollection;

import java.util.*;

public record StainedSSWPBBlocks(Map<DyeColor, SSWPBBlocks> colorMap) {
    public static final Map<DyeColor, Block> TERRACOTTA_MAP = toMap(Blocks.DYED_TERRACOTTA);
    public static final Map<DyeColor, Block> CONCRETE_MAP = toMap(Blocks.CONCRETE);

    private static Map<DyeColor, Block> toMap(ColorCollection<Block> blocks) {
        var builder = ImmutableMap.<DyeColor, Block>builder();
        ColorCollection.zipApply(ColorCollection.VALUES, blocks, builder::put);
        return builder.build();
    }

    public static Builder of(Map<DyeColor, Block> baseBlockColorMap) {
        return new Builder(baseBlockColorMap);
    }

    public static Builder terracotta() {
        return of(TERRACOTTA_MAP);
    }

    public static Builder concrete() {
        return of(CONCRETE_MAP);
    }

    public Block[] all() {
        List<Block> blocks = new ArrayList<>();
        for (SSWPBBlocks sswpbBlocks : colorMap.values()) {
            blocks.addAll(Arrays.asList(sswpbBlocks.all()));
        }
        return blocks.toArray(new Block[0]);
    }

    public static class Builder implements CustomRegisterable<StainedSSWPBBlocks> {
        private final Map<DyeColor, Block> baseBlockColorMap;

        private Builder(Map<DyeColor, Block> baseBlockColorMap) {
            this.baseBlockColorMap = baseBlockColorMap;
        }

        public StainedSSWPBBlocks register(String path) {
            var colorMap = new HashMap<DyeColor, SSWPBBlocks>();
            for (DyeColor color : DyeColor.values()) {
                String blockPath = color.getName() + "_" + path;
                colorMap.put(color, SSWPBBlocks.of(this.baseBlockColorMap.get(color)).register(blockPath));
            }
            return new StainedSSWPBBlocks(colorMap);
        }
    }
}
