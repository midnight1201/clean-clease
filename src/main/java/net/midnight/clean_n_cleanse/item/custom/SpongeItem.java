package net.midnight.clean_n_cleanse.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BucketPickup;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

public class SpongeItem extends Item {

    private final Item transformItem;

    public SpongeItem(Properties properties, Item transformItem) {
        super(properties);
        this.transformItem = transformItem;
    }

    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        BlockHitResult blockhitresult = getPlayerPOVHitResult(level, player, ClipContext.Fluid.SOURCE_ONLY);
        if (blockhitresult.getType() == HitResult.Type.MISS) {
            return InteractionResultHolder.pass(itemstack);
        } else if (blockhitresult.getType() != HitResult.Type.BLOCK) {
            return InteractionResultHolder.pass(itemstack);
        } else {
            BlockPos blockpos = blockhitresult.getBlockPos();
            Direction direction = blockhitresult.getDirection();
            BlockPos blockpos1 = blockpos.relative(direction);
            if (level.mayInteract(player, blockpos) && player.mayUseItemAt(blockpos1, direction, itemstack)) {
                BlockState blockstate1;
                ItemStack itemstack3;
                    blockstate1 = level.getBlockState(blockpos);
                    Block var14 = blockstate1.getBlock();
                    if (var14 instanceof BucketPickup bucketpickup) {
                        itemstack3 = bucketpickup.pickupBlock(player, level, blockpos, blockstate1);
                        if (!itemstack3.isEmpty()) {
                            player.awardStat(Stats.ITEM_USED.get(this));
                            level.playSound(player, player.getX(), player.getY(), player.getZ(),
                                    SoundEvents.SPONGE_ABSORB, SoundSource.NEUTRAL, 1.0F, 1.0F);
                            level.gameEvent(player, GameEvent.FLUID_PICKUP, blockpos);
                            ItemStack transformedItem = new ItemStack(transformItem);

                            return InteractionResultHolder.sidedSuccess(this.turnDryIntoWet(itemstack, player,
                                    transformedItem), level.isClientSide());
                        }
                    }

            }
            return InteractionResultHolder.fail(itemstack);
        }
    }

    protected ItemStack turnDryIntoWet(ItemStack spongeStack, Player player, ItemStack filledSpongeStack) {
        player.awardStat(Stats.ITEM_USED.get(this));
        return ItemUtils.createFilledResult(spongeStack, player, filledSpongeStack);
    }
}
