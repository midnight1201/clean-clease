package net.midnight.clean_n_cleanse.datagen.recipe.create;

import com.simibubi.create.api.data.recipe.FillingRecipeGen;
import net.midnight.clean_n_cleanse.ChemistryMod;
import net.midnight.clean_n_cleanse.block.ModBlocks;
import net.midnight.clean_n_cleanse.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Fluids;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class ModFillingRecipeGen extends FillingRecipeGen {
    public ModFillingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, ChemistryMod.MOD_ID);
    }

    GeneratedRecipe

    WET_WHITE_SPONGE = create("fill_white_sponge", b -> b
            .require(Fluids.WATER, 250)
            .require(ModItems.WHITE_SPONGE.get())
            .output(ModItems.WET_WHITE_SPONGE.get())),

    WET_WHITE_SPONGE_BLOCK = create("fill_white_sponge_block", b -> b
            .require(Fluids.WATER, 1000)
            .require(ModBlocks.WHITE_SPONGE_BLOCK.get())
            .output(ModBlocks.WET_WHITE_SPONGE_BLOCK.get())),

    WET_RED_SPONGE = create("fill_red_sponge", b -> b
            .require(Fluids.WATER, 250)
            .require(ModItems.RED_SPONGE.get())
            .output(ModItems.WET_RED_SPONGE.get())),

    WET_RED_SPONGE_BLOCK = create("fill_red_sponge_block", b -> b
            .require(Fluids.WATER, 1000)
            .require(ModBlocks.RED_SPONGE_BLOCK.get())
            .output(ModBlocks.WET_RED_SPONGE_BLOCK.get())),

    WET_YELLOW_SPONGE = create("fill_yellow_sponge", b -> b
            .require(Fluids.WATER, 250)
            .require(ModItems.YELLOW_SPONGE.get())
            .output(ModItems.WET_YELLOW_SPONGE.get())),

    WET_YELLOW_SPONGE_BLOCK = create("fill_yellow_sponge_block", b -> b
            .require(Fluids.WATER, 1000)
            .require(Blocks.SPONGE)
            .output(Blocks.WET_SPONGE)),

    WET_LIME_SPONGE = create("fill_lime_sponge", b -> b
            .require(Fluids.WATER, 250)
            .require(ModItems.LIME_SPONGE.get())
            .output(ModItems.WET_LIME_SPONGE.get())),

    WET_LIME_SPONGE_BLOCK = create("fill_lime_sponge_block", b -> b
            .require(Fluids.WATER, 1000)
            .require(ModBlocks.LIME_SPONGE_BLOCK.get())
            .output(ModBlocks.WET_LIME_SPONGE_BLOCK.get())),

    WET_LIGHT_BLUE_SPONGE = create("fill_light_blue_sponge", b -> b
            .require(Fluids.WATER, 250)
            .require(ModItems.LIGHT_BLUE_SPONGE.get())
            .output(ModItems.WET_LIGHT_BLUE_SPONGE.get())),

    WET_LIGHT_BLUE_SPONGE_BLOCK = create("fill_light_blue_sponge_block", b -> b
            .require(Fluids.WATER, 1000)
            .require(ModBlocks.LIGHT_BLUE_SPONGE_BLOCK.get())
            .output(ModBlocks.WET_LIGHT_BLUE_SPONGE_BLOCK.get()))

    ;


}
