package net.midnight.clean_n_cleanse.mixin;

import com.llamalad7.mixinextras.expression.Definition;
import com.llamalad7.mixinextras.expression.Expression;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.midnight.clean_n_cleanse.block.ModBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(AbstractFurnaceBlockEntity.class)
public class SpongeSmelting {

    @Definition(id = "is", method = "Lnet/minecraft/world/item/ItemStack;is(Lnet/minecraft/world/item/Item;)Z")
    @Definition(id = "WET_SPONGE", field = "Lnet/minecraft/world/level/block/Blocks;WET_SPONGE:Lnet/minecraft/world/level/block/Block;")
    @Definition(id = "asItem", method = "Lnet/minecraft/world/level/block/Block;asItem()Lnet/minecraft/world/item/Item;")
    @Expression("?.is(WET_SPONGE.asItem())")
    @WrapOperation(method = "burn", at = @At("MIXINEXTRAS:EXPRESSION"))
    private static boolean addWetWhiteSponge(ItemStack instance, Item item, Operation<Boolean> original) {
        return original.call(instance, item) || instance.is(ModBlocks.WET_WHITE_SPONGE_BLOCK.asItem());
    }

}