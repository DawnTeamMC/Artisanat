package fr.hugman.artisanat.block.groups;

import fr.hugman.artisanat.block.ArtisanatBlocks;
import fr.hugman.artisanat.block.helper.BlockBuilder;
import fr.hugman.artisanat.block.helper.BlockFactory;
import fr.hugman.artisanat.util.CustomRegisterable;
import fr.hugman.artisanat.util.NameUtil;
import net.minecraft.block.Block;

/**
 * Contains a block and its slab, stairs and wall variants.
 */
public record BSSWBlocks(
        Block block,
        Block slab,
        Block stairs,
        Block wall
) {
    public static Builder of(BlockBuilder baseBlock) {
        return new Builder(baseBlock);
    }

    public static Builder of(Block baseBlock) {
        return of(new BlockBuilder(baseBlock));
    }

    public Block[] all() {
        return new Block[]{block, slab, stairs, wall};
    }

    public static class Builder implements CustomRegisterable<BSSWBlocks> {
        private final BlockBuilder block;

        private Builder(BlockBuilder block) {
            this.block = block;
        }

        public BSSWBlocks register(String path) {
            var block = this.block.register(ArtisanatBlocks.keyOf(path));
            var singularName = NameUtil.parsePluralBlock(path);
            return new BSSWBlocks(
                    block,
                    BlockFactory.slab(block).register(ArtisanatBlocks.keyOf(singularName + "_slab")),
                    BlockFactory.stairs(block).register(ArtisanatBlocks.keyOf(singularName + "_stairs")),
                    BlockFactory.wall(block).register(ArtisanatBlocks.keyOf(singularName + "_wall"))
            );
        }
    }
}
