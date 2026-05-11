package net.midnight.clean_n_cleanse.datagen;

import net.midnight.clean_n_cleanse.ChemistryMod;
import net.midnight.clean_n_cleanse.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ChemistryMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.WET_WHITE_SPONGE.get());
        basicItem(ModItems.WHITE_SPONGE.get());

        basicItem(ModItems.WET_RED_SPONGE.get());
        basicItem(ModItems.RED_SPONGE.get());

        basicItem(ModItems.WET_YELLOW_SPONGE.get());
        basicItem(ModItems.YELLOW_SPONGE.get());

        basicItem(ModItems.WET_LIME_SPONGE.get());
        basicItem(ModItems.LIME_SPONGE.get());

        basicItem(ModItems.WET_LIGHT_BLUE_SPONGE.get());
        basicItem(ModItems.LIGHT_BLUE_SPONGE.get());
    }
}
