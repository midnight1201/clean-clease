package net.midnight.clean_n_cleanse.datagen.recipe;

import net.midnight.clean_n_cleanse.block.ModBlocks;
import net.midnight.clean_n_cleanse.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        //WHITE

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WHITE_SPONGE_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.WHITE_SPONGE.get())
                .unlockedBy("has_white_sponge", has(ModItems.WHITE_SPONGE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WET_WHITE_SPONGE_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.WET_WHITE_SPONGE.get())
                .unlockedBy("has_wet_white_sponge", has(ModItems.WET_WHITE_SPONGE)).save(recipeOutput);

        //RED

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RED_SPONGE_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.RED_SPONGE.get())
                .unlockedBy("has_red_sponge", has(ModItems.RED_SPONGE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WET_RED_SPONGE_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.WET_RED_SPONGE.get())
                .unlockedBy("has_wet_red_sponge", has(ModItems.WET_RED_SPONGE)).save(recipeOutput);

        //YELLOW

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.SPONGE)
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.YELLOW_SPONGE.get())
                .unlockedBy("has_yellow_sponge", has(ModItems.YELLOW_SPONGE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.WET_SPONGE)
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.WET_YELLOW_SPONGE.get())
                .unlockedBy("has_wet_yellow_sponge", has(ModItems.WET_YELLOW_SPONGE)).save(recipeOutput);

        //LIME

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIME_SPONGE_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.LIME_SPONGE.get())
                .unlockedBy("has_lime_sponge", has(ModItems.LIME_SPONGE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WET_LIME_SPONGE_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.WET_LIME_SPONGE.get())
                .unlockedBy("has_wet_lime_sponge", has(ModItems.WET_LIME_SPONGE)).save(recipeOutput);

        //LIGHT BLUE

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_SPONGE_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.LIGHT_BLUE_SPONGE.get())
                .unlockedBy("has_light_blue_sponge", has(ModItems.LIGHT_BLUE_SPONGE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WET_LIGHT_BLUE_SPONGE_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.WET_LIGHT_BLUE_SPONGE.get())
                .unlockedBy("has_wet_light_blue_sponge", has(ModItems.WET_LIGHT_BLUE_SPONGE)).save(recipeOutput);

        //SMELT

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.WET_WHITE_SPONGE_BLOCK.get()), RecipeCategory.MISC,
                        ModBlocks.WHITE_SPONGE_BLOCK.get(), 0.15f, 200)
                .unlockedBy("has_wet_white_sponge", has(ModBlocks.WET_WHITE_SPONGE_BLOCK))
                .save(recipeOutput, "smelt_white_sponge");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.WET_RED_SPONGE_BLOCK.get()), RecipeCategory.MISC,
                        ModBlocks.RED_SPONGE_BLOCK.get(), 0.15f, 200)
                .unlockedBy("has_wet_red_sponge", has(ModBlocks.WET_RED_SPONGE_BLOCK))
                .save(recipeOutput, "smelt_red_sponge");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.WET_SPONGE), RecipeCategory.MISC,
                        Blocks.SPONGE, 0.15f, 200)
                .unlockedBy("has_sponge", has(Blocks.WET_SPONGE))
                .save(recipeOutput, "smelt_sponge");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.WET_LIME_SPONGE_BLOCK.get()), RecipeCategory.MISC,
                        ModBlocks.LIME_SPONGE_BLOCK.get(), 0.15f, 200)
                .unlockedBy("has_wet_lime_sponge", has(ModBlocks.WET_LIME_SPONGE_BLOCK))
                .save(recipeOutput, "smelt_lime_sponge");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.WET_LIGHT_BLUE_SPONGE_BLOCK.get()), RecipeCategory.MISC,
                        ModBlocks.LIGHT_BLUE_SPONGE_BLOCK.get(), 0.15f, 200)
                .unlockedBy("has_wet_light_blue_sponge", has(ModBlocks.WET_LIGHT_BLUE_SPONGE_BLOCK))
                .save(recipeOutput, "smelt_light_blue_sponge");

    }

}
