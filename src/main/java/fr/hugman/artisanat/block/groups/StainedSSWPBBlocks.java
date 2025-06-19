package fr.hugman.artisanat.block.groups;

import com.google.common.collect.ImmutableMap;
import fr.hugman.artisanat.util.CustomRegisterable;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.DyeColor;

import java.util.*;

public record StainedSSWPBBlocks(Map<DyeColor, SSWPBBlocks> colorMap) {
    public static final Map<DyeColor, Block> TERRACOTTA_MAP = ImmutableMap.<DyeColor, Block>builder()
            .put(DyeColor.WHITE, Blocks.WHITE_TERRACOTTA)
            .put(DyeColor.ORANGE, Blocks.ORANGE_TERRACOTTA)
            .put(DyeColor.MAGENTA, Blocks.MAGENTA_TERRACOTTA)
            .put(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_TERRACOTTA)
            .put(DyeColor.YELLOW, Blocks.YELLOW_TERRACOTTA)
            .put(DyeColor.LIME, Blocks.LIME_TERRACOTTA)
            .put(DyeColor.PINK, Blocks.PINK_TERRACOTTA)
            .put(DyeColor.GRAY, Blocks.GRAY_TERRACOTTA)
            .put(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_TERRACOTTA)
            .put(DyeColor.CYAN, Blocks.CYAN_TERRACOTTA)
            .put(DyeColor.PURPLE, Blocks.PURPLE_TERRACOTTA)
            .put(DyeColor.BLUE, Blocks.BLUE_TERRACOTTA)
            .put(DyeColor.BROWN, Blocks.BROWN_TERRACOTTA)
            .put(DyeColor.GREEN, Blocks.GREEN_TERRACOTTA)
            .put(DyeColor.RED, Blocks.RED_TERRACOTTA)
            .put(DyeColor.BLACK, Blocks.BLACK_TERRACOTTA)
            .build();
    public static final Map<DyeColor, Block> CONCRETE_MAP = ImmutableMap.<DyeColor, Block>builder()
            .put(DyeColor.WHITE, Blocks.WHITE_CONCRETE)
            .put(DyeColor.ORANGE, Blocks.ORANGE_CONCRETE)
            .put(DyeColor.MAGENTA, Blocks.MAGENTA_CONCRETE)
            .put(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_CONCRETE)
            .put(DyeColor.YELLOW, Blocks.YELLOW_CONCRETE)
            .put(DyeColor.LIME, Blocks.LIME_CONCRETE)
            .put(DyeColor.PINK, Blocks.PINK_CONCRETE)
            .put(DyeColor.GRAY, Blocks.GRAY_CONCRETE)
            .put(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_CONCRETE)
            .put(DyeColor.CYAN, Blocks.CYAN_CONCRETE)
            .put(DyeColor.PURPLE, Blocks.PURPLE_CONCRETE)
            .put(DyeColor.BLUE, Blocks.BLUE_CONCRETE)
            .put(DyeColor.BROWN, Blocks.BROWN_CONCRETE)
            .put(DyeColor.GREEN, Blocks.GREEN_CONCRETE)
            .put(DyeColor.RED, Blocks.RED_CONCRETE)
            .put(DyeColor.BLACK, Blocks.BLACK_CONCRETE)
            .build();

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
