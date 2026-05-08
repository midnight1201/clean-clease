package net.midnight.clean_n_cleanse.datagen;

import net.midnight.clean_n_cleanse.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.WHITE_SPONGE_BLOCK.get());
        dropSelf(ModBlocks.WET_WHITE_SPONGE_BLOCK.get());

        dropSelf(ModBlocks.RED_SPONGE_BLOCK.get());
        dropSelf(ModBlocks.WET_RED_SPONGE_BLOCK.get());

        dropSelf(ModBlocks.LIME_SPONGE_BLOCK.get());
        dropSelf(ModBlocks.WET_LIME_SPONGE_BLOCK.get());

        dropSelf(ModBlocks.LIGHT_BLUE_SPONGE_BLOCK.get());
        dropSelf(ModBlocks.WET_LIGHT_BLUE_SPONGE_BLOCK.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
