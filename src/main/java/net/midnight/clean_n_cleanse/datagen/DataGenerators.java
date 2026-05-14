package net.midnight.clean_n_cleanse.datagen;

import net.midnight.clean_n_cleanse.ChemistryMod;
import net.midnight.clean_n_cleanse.datagen.block.ModBlockStateProvider;
import net.midnight.clean_n_cleanse.datagen.block.ModBlockTagProvider;
import net.midnight.clean_n_cleanse.datagen.item.ModItemModelProvider;
import net.midnight.clean_n_cleanse.datagen.item.ModItemTagProvider;
import net.midnight.clean_n_cleanse.datagen.recipe.*;
import net.midnight.clean_n_cleanse.datagen.recipe.create.ModCuttingRecipeGen;
import net.midnight.clean_n_cleanse.datagen.recipe.create.ModEmptyingRecipeGen;
import net.midnight.clean_n_cleanse.datagen.recipe.create.ModFillingRecipeGen;
import net.midnight.clean_n_cleanse.datagen.recipe.create.ModWashingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = ChemistryMod.MOD_ID)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(),
                List.of(new LootTableProvider.SubProviderEntry(ModBlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));
        generator.addProvider(event.includeServer(), new ModRecipeProvider(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new ModFillingRecipeGen(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new ModEmptyingRecipeGen(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new ModCuttingRecipeGen(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new ModWashingRecipeGen(packOutput, lookupProvider));

        BlockTagsProvider blockTagsProvider = new ModBlockTagProvider(packOutput, lookupProvider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new ModItemTagProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));

        generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModBlockStateProvider(packOutput, existingFileHelper));
    }
}
