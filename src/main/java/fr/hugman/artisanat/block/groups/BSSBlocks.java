package fr.hugman.artisanat.block.groups;

import fr.hugman.artisanat.block.ArtisanatBlocks;
import fr.hugman.artisanat.block.helper.BlockBuilder;
import fr.hugman.artisanat.block.helper.BlockFactory;
import fr.hugman.artisanat.util.CustomRegisterable;
import fr.hugman.artisanat.util.NameUtil;
import net.minecraft.block.Block;

/**
 * Contains a block and its slab and stairs variants.
 */
public record BSSBlocks(
        Block block,
        Block slab,
        Block stairs
) {
    public static Builder of(BlockBuilder baseBlock) {
        return new Builder(baseBlock);
    }

    public static Builder of(Block baseBlock) {
        return of(new BlockBuilder(baseBlock));
    }

    public static class Builder implements CustomRegisterable<BSSBlocks> {
        private final BlockBuilder block;

        private Builder(BlockBuilder block) {
            this.block = block;
        }

        public BSSBlocks register(String path) {
            var block = this.block.register(ArtisanatBlocks.keyOf(path));
            var singularName = NameUtil.parsePluralBlock(path);
            return new BSSBlocks(
                    block,
                    BlockFactory.slab(block).register(ArtisanatBlocks.keyOf(singularName + "_slab")),
                    BlockFactory.stairs(block).register(ArtisanatBlocks.keyOf(singularName + "_stairs"))
            );
        }
    }
}
