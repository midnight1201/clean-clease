package net.midnight.clean_n_cleanse.datagen;

import net.midnight.clean_n_cleanse.ChemistryMod;
import net.midnight.clean_n_cleanse.block.ModBlocks;
import net.midnight.clean_n_cleanse.block.custom.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ChemistryMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_HOE)
                .add(ModBlocks.WHITE_SPONGE_BLOCK.get())
                .add(ModBlocks.WET_WHITE_SPONGE_BLOCK.get())

                .add(ModBlocks.RED_SPONGE_BLOCK.get())
                .add(ModBlocks.WET_RED_SPONGE_BLOCK.get())

                .add(ModBlocks.LIME_SPONGE_BLOCK.get())
                .add(ModBlocks.WET_LIME_SPONGE_BLOCK.get())

                .add(ModBlocks.LIGHT_BLUE_SPONGE_BLOCK.get())
                .add(ModBlocks.WET_LIGHT_BLUE_SPONGE_BLOCK.get());

        tag(ModTags.Blocks.SPONGE_BLOCKS)
                .add(ModBlocks.WHITE_SPONGE_BLOCK.get())
                .add(ModBlocks.RED_SPONGE_BLOCK.get())
                .add(Blocks.SPONGE)
                .add(ModBlocks.LIME_SPONGE_BLOCK.get())
                .add(ModBlocks.LIGHT_BLUE_SPONGE_BLOCK.get());

        tag(ModTags.Blocks.WET_SPONGE_BLOCKS)
                .add(ModBlocks.WET_WHITE_SPONGE_BLOCK.get())
                .add(ModBlocks.WET_RED_SPONGE_BLOCK.get())
                .add(Blocks.WET_SPONGE)
                .add(ModBlocks.WET_LIME_SPONGE_BLOCK.get())
                .add(ModBlocks.WET_LIGHT_BLUE_SPONGE_BLOCK.get());
    }
}
