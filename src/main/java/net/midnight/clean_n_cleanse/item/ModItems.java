package net.midnight.clean_n_cleanse.item;

import net.midnight.clean_n_cleanse.ChemistryMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ChemistryMod.MOD_ID);

    public static final DeferredItem<Item> WHITE_SPONGE = ITEMS.register("white_sponge",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WET_WHITE_SPONGE = ITEMS.register("wet_white_sponge",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RED_SPONGE = ITEMS.register("red_sponge",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WET_RED_SPONGE = ITEMS.register("wet_red_sponge",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> YELLOW_SPONGE = ITEMS.register("yellow_sponge",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WET_YELLOW_SPONGE = ITEMS.register("wet_yellow_sponge",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> LIME_SPONGE = ITEMS.register("lime_sponge",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WET_LIME_SPONGE = ITEMS.register("wet_lime_sponge",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> LIGHT_BLUE_SPONGE = ITEMS.register("light_blue_sponge",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WET_LIGHT_BLUE_SPONGE = ITEMS.register("wet_light_blue_sponge",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
