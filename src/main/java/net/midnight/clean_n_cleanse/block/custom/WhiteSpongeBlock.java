package net.midnight.clean_n_cleanse.block.custom;

import net.midnight.clean_n_cleanse.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;

public class WhiteSpongeBlock extends SpongeBlock {
    private static final Direction[] ALL_DIRECTIONS = Direction.values();
    public WhiteSpongeBlock(Properties properties) {
        super(properties);
    }


    @Override
    protected void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean isMoving) {
        super.onPlace(state, level, pos, oldState, isMoving);
    }

    @Override
    protected void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        super.neighborChanged(state, level, pos, block, fromPos, isMoving);
    }

    @Override
    protected void tryAbsorbWater(Level level, BlockPos pos) {
        if(removeWaterBreadthFirstSearch(level, pos)){
            level.setBlock(pos, ModBlocks.WET_WHITE_SPONGE_BLOCK.get().defaultBlockState(), 2);
            level.playSound(null, pos, SoundEvents.SPONGE_ABSORB, SoundSource.BLOCKS, 1.0F, 1.0F);
        }
    }

    private boolean removeWaterBreadthFirstSearch(Level level, BlockPos pos) {
        BlockState spongeState = level.getBlockState(pos);
        return BlockPos.breadthFirstTraversal(pos, 6, 65, (p_277519_, p_277492_) -> {
            Direction[] var2 = ALL_DIRECTIONS;
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                Direction direction = var2[var4];
                p_277492_.accept(p_277519_.relative(direction));
            }

        }, (p_294069_) -> {
            if (p_294069_.equals(pos)) {
                return true;
            } else {
                BlockState blockstate = level.getBlockState(p_294069_);
                FluidState fluidstate = level.getFluidState(p_294069_);
                if (!spongeState.canBeHydrated(level, pos, fluidstate, p_294069_)) {
                    return false;
                } else {
                    Block patt0$temp = blockstate.getBlock();
                    if (patt0$temp instanceof BucketPickup) {
                        BucketPickup bucketpickup = (BucketPickup)patt0$temp;
                        if (!bucketpickup.pickupBlock((Player)null, level, p_294069_, blockstate).isEmpty()) {
                            return true;
                        }
                    }

                    if (blockstate.getBlock() instanceof LiquidBlock) {
                        level.setBlock(p_294069_, Blocks.AIR.defaultBlockState(), 3);
                    } else {
                        if (!blockstate.is(Blocks.KELP) && !blockstate.is(Blocks.KELP_PLANT) && !blockstate.is(Blocks.SEAGRASS) && !blockstate.is(Blocks.TALL_SEAGRASS)) {
                            return false;
                        }

                        BlockEntity blockentity = blockstate.hasBlockEntity() ? level.getBlockEntity(p_294069_) : null;
                        dropResources(blockstate, level, p_294069_, blockentity);
                        level.setBlock(p_294069_, Blocks.AIR.defaultBlockState(), 3);
                    }

                    return true;
                }
            }
        }) > 1;
    }


}
