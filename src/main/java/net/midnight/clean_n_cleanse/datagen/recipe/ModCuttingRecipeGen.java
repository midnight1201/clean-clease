package net.midnight.clean_n_cleanse.datagen.recipe;

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

    WHITE_SPONGE = create(() -> ModBlocks.WHITE_SPONGE_BLOCK.get(), b -> b.duration(20)
            .output(ModItems.WHITE_SPONGE.get(), 9)),
    WET_WHITE_SPONGE = create(() -> ModBlocks.WET_WHITE_SPONGE_BLOCK.get(), b -> b.duration(20)
            .output(ModItems.WET_WHITE_SPONGE.get(), 9)),

    RED_SPONGE = create(() -> ModBlocks.RED_SPONGE_BLOCK.get(), b -> b.duration(20)
            .output(ModItems.RED_SPONGE.get(), 9)),
    WET_RED_SPONGE = create(() -> ModBlocks.WET_RED_SPONGE_BLOCK.get(), b -> b.duration(20)
            .output(ModItems.WET_RED_SPONGE.get(), 9)),

    YELLOW_SPONGE = create(() -> Blocks.SPONGE, b -> b.duration(20)
            .output(ModItems.YELLOW_SPONGE.get(), 9)),
    WET_YELLOW_SPONGE = create(() -> Blocks.WET_SPONGE, b -> b.duration(20)
            .output(ModItems.WET_YELLOW_SPONGE.get(), 9)),

    LIME_SPONGE = create(() -> ModBlocks.LIME_SPONGE_BLOCK.get(), b -> b.duration(20)
            .output(ModItems.LIME_SPONGE.get(), 9)),
    WET_LIME_SPONGE = create(() -> ModBlocks.WET_LIME_SPONGE_BLOCK.get(), b -> b.duration(20)
                    .output(ModItems.WET_LIME_SPONGE.get(), 9)),

    LIGHT_BLUE_SPONGE = create(() -> ModBlocks.LIGHT_BLUE_SPONGE_BLOCK.get(), b -> b.duration(20)
            .output(ModItems.LIGHT_BLUE_SPONGE.get(), 9)),
    WET_LIGHT_BLUE_SPONGE = create(() -> ModBlocks.WET_LIGHT_BLUE_SPONGE_BLOCK.get(), b -> b.duration(20)
                    .output(ModItems.WET_LIGHT_BLUE_SPONGE.get(), 9))
    ;

}
