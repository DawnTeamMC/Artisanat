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
public record OreBlocks(
        Block platedBlock,
        Block cutBlock,
        Block bricks,
        Block tiles
) {
    public static Builder of(BlockBuilder baseBlock) {
        return new Builder(baseBlock);
    }

    public static Builder of(Block baseBlock) {
        return of(new BlockBuilder(baseBlock));
    }

    public static class Builder implements CustomRegisterable<OreBlocks> {
        private final BlockBuilder block;

        private Builder(BlockBuilder block) {
            this.block = block;
        }

        public OreBlocks register(String path) {
            return new OreBlocks(
                    block.register(ArtisanatBlocks.keyOf("plated_" + path + "_block")),
                    block.register(ArtisanatBlocks.keyOf("cut_" + path + "_block")),
                    block.register(ArtisanatBlocks.keyOf(path + "_bricks")),
                    block.register(ArtisanatBlocks.keyOf(path + "_tiles"))
            );
        }
    }
}
