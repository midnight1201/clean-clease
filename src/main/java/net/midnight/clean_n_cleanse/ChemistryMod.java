package net.midnight.clean_n_cleanse;

import net.midnight.clean_n_cleanse.block.ModBlocks;
import net.midnight.clean_n_cleanse.item.ModCreativeModeTabs;
import net.midnight.clean_n_cleanse.item.ModItems;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.common.NeoForge;

@Mod(ChemistryMod.MOD_ID)
public class ChemistryMod {
    public static final String MOD_ID = "clean_n_cleanse";

    public ChemistryMod(IEventBus modEventBus, ModContainer modContainer) {
        NeoForge.EVENT_BUS.register(this);
        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
    }
}
