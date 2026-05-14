package net.midnight.clean_n_cleanse.datagen.recipe.create;

import com.simibubi.create.api.data.recipe.WashingRecipeGen;
import net.midnight.clean_n_cleanse.ChemistryMod;
import net.midnight.clean_n_cleanse.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class ModWashingRecipeGen extends WashingRecipeGen {
    public ModWashingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, ChemistryMod.MOD_ID);
    }

    GeneratedRecipe

    WHITE_SPONGE = create("wash_white_sponge", b -> b
            .require(ModBlocks.WHITE_SPONGE_BLOCK.get())
            .output(ModBlocks.WET_WHITE_SPONGE_BLOCK.get())),
    RED_SPONGE = create("wash_red_sponge", b -> b
            .require(ModBlocks.RED_SPONGE_BLOCK.get())
            .output(ModBlocks.RED_SPONGE_BLOCK.get())),
    YELLOW_SPONGE = create("wash_yellow_sponge", b -> b
            .require(Blocks.SPONGE)
            .output(Blocks.WET_SPONGE)),
    LIME_SPONGE = create("wash_lime_sponge", b -> b
            .require(ModBlocks.LIME_SPONGE_BLOCK.get())
            .output(ModBlocks.WET_LIME_SPONGE_BLOCK.get())),
    LIGHT_BLUE_SPONGE = create("wash_light_blue_sponge", b -> b
            .require(ModBlocks.LIGHT_BLUE_SPONGE_BLOCK.get())
            .output(ModBlocks.WET_LIGHT_BLUE_SPONGE_BLOCK.get()))
    ;

}
