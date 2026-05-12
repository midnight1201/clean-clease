package net.midnight.clean_n_cleanse.item.custom;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;

public class CustomSpongeItem extends Item {

    private final Item transformItem;

    public CustomSpongeItem(Properties properties, Item transformItem) {
        super(properties);
        this.transformItem = transformItem;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);

        BlockHitResult hit = getPlayerPOVHitResult(world, player, ClipContext.Fluid.SOURCE_ONLY);

        if (hit.getType() == BlockHitResult.Type.BLOCK) {
            BlockPos pos = hit.getBlockPos();
            BlockState state = world.getBlockState(pos);

            if (state.getFluidState().getType() == Fluids.WATER && state.getFluidState().isSource()) {
                if (!world.isClientSide) {

                    world.setBlock(pos, Fluids.EMPTY.defaultFluidState().createLegacyBlock(), 3);
                    world.playSound(null, pos, SoundEvents.SPONGE_ABSORB, SoundSource.PLAYERS, 1.0F, 1.0F);

                    ItemStack transformedItem = new ItemStack(transformItem);

                    if (!player.getInventory().add(transformedItem)) {
                        player.drop(transformedItem, false);
                    }
                    if (!player.isCreative()) {
                        itemStack.shrink(1);
                    }
                }
                return InteractionResultHolder.sidedSuccess(itemStack, world.isClientSide());
            }
        }
        return InteractionResultHolder.pass(itemStack);
    }
}