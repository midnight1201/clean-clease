package net.midnight.clean_n_cleanse.datagen.recipe;

import com.simibubi.create.api.data.recipe.EmptyingRecipeGen;
import net.midnight.clean_n_cleanse.ChemistryMod;
import net.midnight.clean_n_cleanse.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.material.Fluids;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class ModEmptyingRecipeGen extends EmptyingRecipeGen {
    public ModEmptyingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, ChemistryMod.MOD_ID);
    }

    GeneratedRecipe

    WHITE_SPONGE = create("empty_white_sponge", b -> b
            .require(ModItems.WET_WHITE_SPONGE.get())
            .output(Fluids.WATER, 250)
            .output(ModItems.WHITE_SPONGE.get())),

    RED_SPONGE = create("empty_red_sponge", b -> b
            .require(ModItems.WET_RED_SPONGE.get())
            .output(Fluids.WATER, 250)
            .output(ModItems.RED_SPONGE.get())),

    YELLOW_SPONGE = create("empty_yellow_sponge", b -> b
            .require(ModItems.WET_YELLOW_SPONGE.get())
            .output(Fluids.WATER, 250)
            .output(ModItems.YELLOW_SPONGE.get())),

    LIME_SPONGE = create("empty_lime_sponge", b -> b
            .require(ModItems.WET_LIME_SPONGE.get())
            .output(Fluids.WATER, 250)
            .output(ModItems.LIME_SPONGE.get())),

    LIGHT_BLUE_SPONGE = create("empty_light_blue_sponge", b -> b
            .require(ModItems.WET_LIGHT_BLUE_SPONGE.get())
            .output(Fluids.WATER, 250)
            .output(ModItems.LIGHT_BLUE_SPONGE.get()))

    ;
}
