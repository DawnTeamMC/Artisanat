package com.hugman.artisanat.util;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CopperMap {
    private static final Map<Block, Block> INCREASES = new HashMap<>();
    private static final Map<Block, Block> DECREASES = new HashMap<>();

    private static final Map<Block, Block> WAXED = new HashMap<>();
    private static final Map<Block, Block> UNWAXED = new HashMap<>();

    public static void put(Block block, @Nullable Block oxidized, Block waxed) {
        if (oxidized != null) {
            INCREASES.put(block, oxidized);
            DECREASES.put(oxidized, block);
        }
        WAXED.put(block, waxed);
        UNWAXED.put(waxed, block);
    }

    public static Optional<BlockState> getIncreasedState(BlockState state) {
        return getIncreasedBlock(state.getBlock()).map((block) -> block.getStateWithProperties(state));
    }

    public static Optional<Block> getIncreasedBlock(Block block) {
        return Optional.ofNullable(INCREASES.get(block));
    }

    public static Optional<BlockState> getDecreasedState(BlockState state) {
        return getDecreasedBlock(state.getBlock()).map((block) -> block.getStateWithProperties(state));
    }

    public static Optional<Block> getDecreasedBlock(Block block) {
        return Optional.ofNullable(DECREASES.get(block));
    }

    public static Optional<BlockState> getWaxedState(BlockState state) {
        return getWaxedBlock(state.getBlock()).map((block) -> {
            return block.getStateWithProperties(state);
        });
    }

    public static Optional<Block> getWaxedBlock(Block block) {
        return Optional.ofNullable(WAXED.get(block));
    }

    public static Optional<BlockState> getUnwaxedState(BlockState state) {
        return getUnwaxedBlock(state.getBlock()).map((block) -> {
            return block.getStateWithProperties(state);
        });
    }

    public static Optional<Block> getUnwaxedBlock(Block block) {
        return Optional.ofNullable(UNWAXED.get(block));
    }
}