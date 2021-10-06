package com.hugman.artisanat.object.block;

import com.hugman.artisanat.util.CopperMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Oxidizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

import java.util.Optional;
import java.util.Random;

public class MappedOxidizableBlock extends Block implements Oxidizable {

    private final OxidizationLevel oxidizationLevel;

    public MappedOxidizableBlock(OxidizationLevel oxidizationLevel, Settings settings) {
        super(settings);
        this.oxidizationLevel = oxidizationLevel;
    }

    @Override
    public Optional<BlockState> getDegradationResult(BlockState state) {
        return CopperMap.getIncreasedBlock(state.getBlock()).map((block) -> block.getStateWithProperties(state));
    }

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.tickDegradation(state, world, pos, random);
    }

    public boolean hasRandomTicks(BlockState state) {
        return CopperMap.getIncreasedBlock(state.getBlock()).isPresent();
    }

    @Override
    public OxidizationLevel getDegradationLevel() {
        return this.oxidizationLevel;
    }
}