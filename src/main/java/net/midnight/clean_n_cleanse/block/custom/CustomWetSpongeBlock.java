package net.midnight.clean_n_cleanse.block.custom;

import net.midnight.clean_n_cleanse.block.custom.util.SpongeColor;
import net.midnight.clean_n_cleanse.block.custom.util.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.WetSpongeBlock;
import net.minecraft.world.level.block.state.BlockState;

public class CustomWetSpongeBlock extends WetSpongeBlock {
    private SpongeColor color;
    public CustomWetSpongeBlock(Properties properties, SpongeColor color) {
        super(properties);
        this.color = color;
    }

    @Override
    protected void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean isMoving) {
        if (level.dimensionType().ultraWarm()) {
            level.setBlock(pos, Util.SPONGES.get(color).getA().get().defaultBlockState(), 3);
            level.levelEvent(2009, pos, 0);
            level.playSound((Player)null, pos, SoundEvents.WET_SPONGE_DRIES, SoundSource.BLOCKS, 1.0F, (1.0F + level.getRandom().nextFloat() * 0.2F) * 0.7F);
        }
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        super.animateTick(state, level, pos, random);
    }
}
