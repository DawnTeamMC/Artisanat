package fr.hugman.artisanat.block.helper;

import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;

import java.util.function.Function;

public final class BlockFactory {
    public static BlockBuilder of(Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        return new BlockBuilder(factory, settings);
    }

    public static BlockBuilder of(AbstractBlock.Settings settings) {
        return new BlockBuilder(settings);
    }

    public static BlockBuilder copy(Block block) {
        return new BlockBuilder(block);
    }

    public static BlockBuilder slab(Block baseBlock) {
        return copy(baseBlock).factory(SlabBlock::new);
    }

    public static BlockBuilder stairs(Block baseBlock) {
        return copy(baseBlock).factory(s -> new StairsBlock(baseBlock.getDefaultState(), s));
    }

    public static BlockBuilder wall(Block baseBlock) {
        return copy(baseBlock).factory(WallBlock::new).settings(AbstractBlock.Settings.copyShallow(baseBlock).solid());
    }

    public static BlockBuilder fence(Block baseBlock) {
        return copy(baseBlock).factory(FenceBlock::new).settings(AbstractBlock.Settings.copyShallow(baseBlock));
    }

    public static BlockBuilder fenceGate(Block baseBlock, WoodType woodType) {
        return copy(baseBlock).factory(s -> new FenceGateBlock(woodType, s)).settings(AbstractBlock.Settings.copyShallow(baseBlock).solid());
    }

    public static BlockBuilder trapdoor(Block baseBlock, BlockSetType setType) {
        return copy(baseBlock).factory(s -> new TrapdoorBlock(setType, s)).settings(AbstractBlock.Settings.copyShallow(baseBlock)
                .strength(3.0f)
                .nonOpaque()
                .allowsSpawning(Blocks::never));
    }

    public static BlockBuilder door(Block baseBlock, BlockSetType setType) {
        return copy(baseBlock).factory(s -> new DoorBlock(setType, s)).settings(AbstractBlock.Settings.copyShallow(baseBlock)
                .strength(3.0f)
                .nonOpaque()
                .pistonBehavior(PistonBehavior.DESTROY));
    }

    public static BlockBuilder woodenButton(Block baseBlock, BlockSetType setType) {
        return copy(baseBlock).factory(s -> new ButtonBlock(setType, 30, s)).settings(AbstractBlock.Settings.create()
                .strength(0.5f)
                .noCollision()
                .pistonBehavior(PistonBehavior.DESTROY)
                .sounds(baseBlock.getDefaultState().getSoundGroup()));
    }

    public static BlockBuilder stoneButton(Block baseBlock, BlockSetType setType) {
        return copy(baseBlock).factory(s -> new ButtonBlock(setType, 30, s)).settings(AbstractBlock.Settings.create()
                .strength(0.5f)
                .noCollision()
                .pistonBehavior(PistonBehavior.DESTROY)
                .sounds(baseBlock.getDefaultState().getSoundGroup()));
    }

    public static BlockBuilder pressurePlate(Block baseBlock, BlockSetType setType) {
        return copy(baseBlock).factory(s -> new PressurePlateBlock(setType, s)).settings(AbstractBlock.Settings.copyShallow(baseBlock)
                .solid()
                .instrument(NoteBlockInstrument.BASEDRUM)
                .strength(0.5f)
                .pistonBehavior(PistonBehavior.DESTROY)
                .requiresTool()
                .noCollision());
    }
}
