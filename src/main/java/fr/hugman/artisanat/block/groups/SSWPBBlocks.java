package fr.hugman.artisanat.block.groups;

import fr.hugman.artisanat.block.ArtisanatBlocks;
import fr.hugman.artisanat.block.helper.BlockFactory;
import fr.hugman.artisanat.util.CustomRegisterable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;

/**
 * Contains a slab, stairs, wall, pressure plate and button variants for a registered block.
 */
public record SSWPBBlocks(
        Block slab,
        Block stairs,
        Block wall,
        Block pressurePlate,
        Block button
) {
    /**
     * @param baseBlock block that MUST be registered
     */
    public static Builder of(Block baseBlock) {
        return new Builder(baseBlock);
    }

    public static class Builder implements CustomRegisterable<SSWPBBlocks> {
        private final Block baseBlock;
        private BlockSetType setType;

        private Builder(Block baseBlock) {
            this.baseBlock = baseBlock;
            this.setType = BlockSetType.STONE;
        }

        public Builder setType(BlockSetType setType) {
            this.setType = setType;
            return this;
        }

        public SSWPBBlocks register(String path) {
            return new SSWPBBlocks(
                    BlockFactory.slab(baseBlock).register(ArtisanatBlocks.keyOf(path + "_slab")),
                    BlockFactory.stairs(baseBlock).register(ArtisanatBlocks.keyOf(path + "_stairs")),
                    BlockFactory.wall(baseBlock).register(ArtisanatBlocks.keyOf(path + "_wall")),
                    BlockFactory.pressurePlate(baseBlock, setType).register(ArtisanatBlocks.keyOf(path + "_pressure_plate")),
                    BlockFactory.stoneButton(baseBlock, setType).register(ArtisanatBlocks.keyOf(path + "_button"))
            );
        }
    }
}
