package net.midnight.clean_n_cleanse.datagen.recipe;

import com.simibubi.create.api.data.recipe.CompactingRecipeGen;
import net.midnight.clean_n_cleanse.ChemistryMod;
import net.midnight.clean_n_cleanse.block.ModBlocks;
import net.midnight.clean_n_cleanse.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Fluids;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class ModCompactingRecipeGen extends CompactingRecipeGen {
    public ModCompactingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, ChemistryMod.MOD_ID);
    }

    GeneratedRecipe

    //WHITE

    WHITE_SPONGE = create("compact_white_sponge", b -> b
                    .require(ModItems.WET_WHITE_SPONGE.get())
                    .output(Fluids.WATER, 250)
                    .output(ModItems.WHITE_SPONGE.get())),

    WHITE_SPONGE_BLOCK = create("compact_white_sponge_block", b -> b
                    .require(ModBlocks.WET_WHITE_SPONGE_BLOCK.get())
                    .output(ModBlocks.WHITE_SPONGE_BLOCK.get())
                    .output(Fluids.WATER, 1000)),

    //RED

    RED_SPONGE = create("compact_red_sponge", b -> b
            .require(ModItems.WET_RED_SPONGE.get())
            .output(Fluids.WATER, 250)
            .output(ModItems.RED_SPONGE.get())),

    RED_SPONGE_BLOCK = create("compact_red_sponge_block", b -> b
            .require(ModBlocks.WET_RED_SPONGE_BLOCK.get())
            .output(ModBlocks.RED_SPONGE_BLOCK.get())
            .output(Fluids.WATER, 1000)),

    //YELLOW

    YELLOW_SPONGE = create("compact_yellow_sponge", b -> b
            .require(ModItems.WET_YELLOW_SPONGE.get())
            .output(Fluids.WATER, 250)
            .output(ModItems.YELLOW_SPONGE.get())),

    YELLOW_SPONGE_BLOCK = create("compact_yellow_sponge_block", b -> b
            .require(Blocks.WET_SPONGE)
            .output(Blocks.SPONGE)
            .output(Fluids.WATER, 1000)),

    //LIME

    LIME_SPONGE = create("compact_lime_sponge", b -> b
            .require(ModItems.WET_LIME_SPONGE.get())
            .output(Fluids.WATER, 250)
            .output(ModItems.LIME_SPONGE.get())),

    LIME_SPONGE_BLOCK = create("compact_lime_sponge_block", b -> b
            .require(ModBlocks.WET_LIME_SPONGE_BLOCK.get())
            .output(ModBlocks.LIME_SPONGE_BLOCK.get())
            .output(Fluids.WATER, 1000)),

    //LIGHT BLUE

    LIGHT_BLUE_SPONGE = create("compact_light_blue_sponge", b -> b
            .require(ModItems.WET_LIGHT_BLUE_SPONGE.get())
            .output(Fluids.WATER, 250)
            .output(ModItems.LIGHT_BLUE_SPONGE.get())),

    LIGHT_BLUE_SPONGE_BLOCK = create("compact_light_blue_sponge_block", b -> b
            .require(ModBlocks.WET_LIGHT_BLUE_SPONGE_BLOCK.get())
            .output(ModBlocks.LIGHT_BLUE_SPONGE_BLOCK.get())
            .output(Fluids.WATER, 1000))

    ;

}
