package net.midnight.clean_n_cleanse.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

public class CustomSpongeItem extends Item {

    private final Item transformItem;

    public CustomSpongeItem(Properties properties, Item transformItem) {
        super(properties);
        this.transformItem = transformItem;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        ItemStack itemStack = player.getItemInHand(usedHand);

        BlockHitResult blockHitResult = getPlayerPOVHitResult(level, player, ClipContext.Fluid.SOURCE_ONLY);
        if (blockHitResult.getType() != HitResult.Type.MISS) {
            if (blockHitResult.getType() == HitResult.Type.BLOCK) {
                BlockPos blockPos = blockHitResult.getBlockPos();
                if (!level.mayInteract(player, blockPos)) {
                    return InteractionResultHolder.pass(itemStack);
                }

                if (level.getFluidState(blockPos).is(FluidTags.WATER)) {
                    if (!level.isClientSide) {
                        level.setBlock(blockPos, Fluids.EMPTY.defaultFluidState().createLegacyBlock(), 3);
                        level.playSound(player, player.getX(), player.getY(), player.getZ(),
                                SoundEvents.SPONGE_ABSORB, SoundSource.NEUTRAL, 1.0F, 1.0F);
                        level.gameEvent(player, GameEvent.FLUID_PICKUP, blockPos);
                        ItemStack transformedItem = new ItemStack(transformItem);
                        return InteractionResultHolder.sidedSuccess(this.turnDryIntoWet(itemStack, player,
                                transformedItem), level.isClientSide());
                    }
                }
            }

        }
        return InteractionResultHolder.pass(itemStack);
    }

    protected ItemStack turnDryIntoWet(ItemStack spongeStack, Player player, ItemStack filledSpongeStack) {
        player.awardStat(Stats.ITEM_USED.get(this));
        return ItemUtils.createFilledResult(spongeStack, player, filledSpongeStack);
    }
}
