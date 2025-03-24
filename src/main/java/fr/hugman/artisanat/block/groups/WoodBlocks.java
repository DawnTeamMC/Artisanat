package fr.hugman.artisanat.block.groups;

import fr.hugman.artisanat.block.ArtisanatBlocks;
import fr.hugman.artisanat.block.helper.BlockFactory;
import fr.hugman.artisanat.util.CustomRegisterable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;

/**
 * Contains wood blocks in other shapes.
 */
public record WoodBlocks(
        Block slab,
        Block stairs,
        Block button
) {
    /**
     * @param baseBlock block that MUST be registered
     * @param setType the wood block set type
     */
    public static Builder of(Block baseBlock, BlockSetType setType) {
        return new Builder(baseBlock, setType);
    }

    public static class Builder implements CustomRegisterable<WoodBlocks> {
        private final Block baseBlock;
        private final BlockSetType setType;

        private Builder(Block baseBlock, BlockSetType setType) {
            this.baseBlock = baseBlock;
            this.setType = setType;
        }

        public WoodBlocks register(String path) {
            return new WoodBlocks(
                    BlockFactory.slab(baseBlock).register(ArtisanatBlocks.keyOf(path + "_slab")),
                    BlockFactory.stairs(baseBlock).register(ArtisanatBlocks.keyOf(path + "_stairs")),
                    BlockFactory.woodenButton(baseBlock, setType).register(ArtisanatBlocks.keyOf(path + "_button"))
            );
        }
    }
}
