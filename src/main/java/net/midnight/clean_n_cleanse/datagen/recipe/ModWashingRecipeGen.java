package net.midnight.clean_n_cleanse.datagen.recipe;

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

    WHITE_SPONGE = create(ModBlocks.WHITE_SPONGE_BLOCK::get, b -> b.output(ModBlocks.WET_WHITE_SPONGE_BLOCK)),
    RED_SPONGE = create(ModBlocks.RED_SPONGE_BLOCK::get, b -> b.output(ModBlocks.WET_RED_SPONGE_BLOCK)),
    YELLOW_SPONGE = create(() -> Blocks.SPONGE, b -> b.output(Blocks.WET_SPONGE)),
    LIME_SPONGE = create(ModBlocks.LIME_SPONGE_BLOCK::get, b -> b.output(ModBlocks.WET_LIME_SPONGE_BLOCK)),
    LIGHT_BLUE_SPONGE = create(ModBlocks.LIGHT_BLUE_SPONGE_BLOCK::get, b -> b.output(ModBlocks.WET_LIGHT_BLUE_SPONGE_BLOCK))

    ;

}
