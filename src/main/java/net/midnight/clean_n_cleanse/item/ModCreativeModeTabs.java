package net.midnight.clean_n_cleanse.item;

import net.midnight.clean_n_cleanse.ChemistryMod;
import net.midnight.clean_n_cleanse.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChemistryMod.MOD_ID);

    public static final Supplier<CreativeModeTab> MOD_ITEMS_TAB = CREATIVE_MODE_TAB.register("mod_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.YELLOW_SPONGE.get()))
                    .title(Component.translatable("creativetab.chemistrymod.mod_items"))
                    .displayItems(((itemDisplayParameters, output) -> {

                        //SPONGE BLOCKS

                        output.accept(ModBlocks.WHITE_SPONGE_BLOCK);
                        output.accept(ModBlocks.WET_WHITE_SPONGE_BLOCK);

                        output.accept(ModBlocks.RED_SPONGE_BLOCK);
                        output.accept(ModBlocks.WET_RED_SPONGE_BLOCK);

                        output.accept(Items.SPONGE);
                        output.accept(Items.WET_SPONGE);

                        output.accept(ModBlocks.LIME_SPONGE_BLOCK);
                        output.accept(ModBlocks.WET_LIME_SPONGE_BLOCK);

                        output.accept(ModBlocks.LIGHT_BLUE_SPONGE_BLOCK);
                        output.accept(ModBlocks.WET_LIGHT_BLUE_SPONGE_BLOCK);

                        //SPONGE ITEMS

                        output.accept(ModItems.WHITE_SPONGE);
                        output.accept(ModItems.WET_WHITE_SPONGE);

                        output.accept(ModItems.RED_SPONGE);
                        output.accept(ModItems.WET_RED_SPONGE);

                        output.accept(ModItems.YELLOW_SPONGE);
                        output.accept(ModItems.WET_YELLOW_SPONGE);

                        output.accept(ModItems.LIME_SPONGE);
                        output.accept(ModItems.WET_LIME_SPONGE);

                        output.accept(ModItems.LIGHT_BLUE_SPONGE);
                        output.accept(ModItems.WET_LIGHT_BLUE_SPONGE);

                    })).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
