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

        // Get the block the player is looking at
        BlockHitResult hit = getPlayerPOVHitResult(world, player, ClipContext.Fluid.SOURCE_ONLY);

        if (hit.getType() == BlockHitResult.Type.BLOCK) {
            BlockPos pos = hit.getBlockPos();
            BlockState state = world.getBlockState(pos);

            // Check if it's a water source block
            if (state.getFluidState().getType() == Fluids.WATER && state.getFluidState().isSource()) {
                if (!world.isClientSide) {
                    // Replace water source with air
                    world.setBlock(pos, Fluids.EMPTY.defaultFluidState().createLegacyBlock(), 3);

                    // Play sound at the block position
                    world.playSound(null, pos, SoundEvents.SPONGE_ABSORB, SoundSource.PLAYERS, 1.0F, 1.0F);

                    // Consume the item
                    itemStack.shrink(1);

                    // Give the player the transformed item
                    ItemStack transformedItem = new ItemStack(transformItem);
                    if (!player.addItem(transformedItem)) {
                        // If inventory is full, drop the item at player's feet
                        player.drop(transformedItem, false);
                    }
                }
                return InteractionResultHolder.sidedSuccess(itemStack, world.isClientSide());
            }
        }
        return InteractionResultHolder.pass(itemStack);
    }
}
