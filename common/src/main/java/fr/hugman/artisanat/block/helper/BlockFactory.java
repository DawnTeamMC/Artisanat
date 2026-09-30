package fr.hugman.artisanat.block.helper;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Function;

public final class BlockFactory {
    public static BlockBuilder of(Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        return new BlockBuilder(factory, settings);
    }

    public static BlockBuilder of(BlockBehaviour.Properties settings) {
        return new BlockBuilder(settings);
    }

    public static BlockBuilder copy(Block block) {
        return new BlockBuilder(block);
    }

    public static BlockBuilder slab(Block baseBlock) {
        return copy(baseBlock).factory(SlabBlock::new);
    }

    public static BlockBuilder stairs(Block baseBlock) {
        return copy(baseBlock).factory(s -> new StairBlock(baseBlock.defaultBlockState(), s));
    }

    public static BlockBuilder wall(Block baseBlock) {
        return copy(baseBlock).factory(WallBlock::new).settings(BlockBehaviour.Properties.ofLegacyCopy(baseBlock).forceSolidOn());
    }

    public static BlockBuilder fence(Block baseBlock) {
        return copy(baseBlock).factory(FenceBlock::new).settings(BlockBehaviour.Properties.ofLegacyCopy(baseBlock));
    }

    public static BlockBuilder fenceGate(Block baseBlock, WoodType woodType) {
        return copy(baseBlock).factory(s -> new FenceGateBlock(woodType, s)).settings(BlockBehaviour.Properties.ofLegacyCopy(baseBlock).forceSolidOn());
    }

    public static BlockBuilder trapdoor(Block baseBlock, BlockSetType setType) {
        return copy(baseBlock).factory(s -> new TrapDoorBlock(setType, s)).settings(BlockBehaviour.Properties.ofLegacyCopy(baseBlock)
                .strength(3.0f)
                .noOcclusion()
                .isValidSpawn(Blocks::never));
    }

    public static BlockBuilder door(Block baseBlock, BlockSetType setType) {
        return copy(baseBlock).factory(s -> new DoorBlock(setType, s)).settings(BlockBehaviour.Properties.ofLegacyCopy(baseBlock)
                .strength(3.0f)
                .noOcclusion()
                .pushReaction(PushReaction.DESTROY));
    }

    public static BlockBuilder woodenButton(Block baseBlock, BlockSetType setType) {
        return copy(baseBlock).factory(s -> new ButtonBlock(setType, 30, s)).settings(BlockBehaviour.Properties.of()
                .strength(0.5f)
                .noCollision()
                .pushReaction(PushReaction.DESTROY)
                .sound(baseBlock.defaultBlockState().getSoundType()));
    }

    public static BlockBuilder stoneButton(Block baseBlock, BlockSetType setType) {
        return copy(baseBlock).factory(s -> new ButtonBlock(setType, 30, s)).settings(BlockBehaviour.Properties.of()
                .strength(0.5f)
                .noCollision()
                .pushReaction(PushReaction.DESTROY)
                .sound(baseBlock.defaultBlockState().getSoundType()));
    }

    public static BlockBuilder pressurePlate(Block baseBlock, BlockSetType setType) {
        return copy(baseBlock).factory(s -> new PressurePlateBlock(setType, s)).settings(BlockBehaviour.Properties.ofLegacyCopy(baseBlock)
                .forceSolidOn()
                .instrument(NoteBlockInstrument.BASEDRUM)
                .strength(0.5f)
                .pushReaction(PushReaction.DESTROY)
                .requiresCorrectToolForDrops()
                .noCollision());
    }
}
