package net.midnight.clean_n_cleanse.datagen.recipe.create;

import com.simibubi.create.api.data.recipe.CuttingRecipeGen;
import net.midnight.clean_n_cleanse.ChemistryMod;
import net.midnight.clean_n_cleanse.block.ModBlocks;
import net.midnight.clean_n_cleanse.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class ModCuttingRecipeGen extends CuttingRecipeGen {
    public ModCuttingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, ChemistryMod.MOD_ID);
    }

    GeneratedRecipe

    WHITE_SPONGE = create("cut_white_sponge", b -> b.duration(20)
            .require(ModBlocks.WHITE_SPONGE_BLOCK.get())
            .output(ModItems.WHITE_SPONGE.get(), 9)),
    WET_WHITE_SPONGE = create("cut_wet_white_sponge", b -> b.duration(20)
            .require(ModBlocks.WET_WHITE_SPONGE_BLOCK.get())
            .output(ModItems.WET_WHITE_SPONGE.get(), 9)),
    RED_SPONGE = create("cut_red_sponge", b -> b.duration(20)
            .require(ModBlocks.RED_SPONGE_BLOCK.get())
            .output(ModItems.RED_SPONGE.get(), 9)),
    WET_RED_SPONGE = create("cut_wet_red_sponge", b -> b.duration(20)
            .require(ModBlocks.WET_RED_SPONGE_BLOCK.get())
            .output(ModItems.WET_RED_SPONGE.get(), 9)),
    YELLOW_SPONGE = create("cut_yellow_sponge", b -> b.duration(20)
            .require(Blocks.SPONGE)
            .output(ModItems.YELLOW_SPONGE.get(), 9)),
    WET_YELLOW_SPONGE = create("cut_wet_yellow_sponge", b -> b.duration(20)
            .require(Blocks.WET_SPONGE)
            .output(ModItems.WET_YELLOW_SPONGE.get(), 9)),
    LIME_SPONGE = create("cut_lime_sponge", b -> b.duration(20)
            .require(ModBlocks.LIME_SPONGE_BLOCK.get())
            .output(ModItems.LIME_SPONGE.get(), 9)),
    WET_LIME_SPONGE = create("cut_wet_lime_sponge", b -> b.duration(20)
            .require(ModBlocks.WET_LIME_SPONGE_BLOCK.get())
            .output(ModItems.WET_LIME_SPONGE.get(), 9)),
    LIGHT_BLUE_SPONGE = create("cut_light_blue_sponge", b -> b.duration(20)
            .require(ModBlocks.LIGHT_BLUE_SPONGE_BLOCK.get())
            .output(ModItems.LIGHT_BLUE_SPONGE.get(), 9)),
    WET_LIGHT_BLUE_SPONGE = create("cut_wet_light_blue_sponge", b -> b.duration(20)
            .require(ModBlocks.WET_LIGHT_BLUE_SPONGE_BLOCK.get())
            .output(ModItems.WET_LIGHT_BLUE_SPONGE.get(), 9))
    ;

}
