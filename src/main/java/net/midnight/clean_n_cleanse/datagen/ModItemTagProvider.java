package net.midnight.clean_n_cleanse.datagen;

import net.midnight.clean_n_cleanse.ChemistryMod;
import net.midnight.clean_n_cleanse.block.ModBlocks;
import net.midnight.clean_n_cleanse.block.custom.util.ModTags;
import net.midnight.clean_n_cleanse.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, ChemistryMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.SPONGE_ITEMS)
                .add(ModItems.WHITE_SPONGE.get())
                .add(ModItems.RED_SPONGE.get())
                .add(ModItems.YELLOW_SPONGE.get())
                .add(ModItems.LIME_SPONGE.get())
                .add(ModItems.LIGHT_BLUE_SPONGE.get());

        tag(ModTags.Items.WET_SPONGE_ITEMS)
                .add(ModItems.WET_WHITE_SPONGE.get())
                .add(ModItems.WET_RED_SPONGE.get())
                .add(ModItems.WET_YELLOW_SPONGE.get())
                .add(ModItems.WET_LIME_SPONGE.get())
                .add(ModItems.WET_LIGHT_BLUE_SPONGE.get());
    }
}
