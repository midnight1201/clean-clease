package net.midnight.clean_n_cleanse.datagen;

import net.midnight.clean_n_cleanse.ChemistryMod;
import net.midnight.clean_n_cleanse.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ChemistryMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.WHITE_SPONGE_BLOCK);
        blockWithItem(ModBlocks.WET_WHITE_SPONGE_BLOCK);

        blockWithItem(ModBlocks.RED_SPONGE_BLOCK);
        blockWithItem(ModBlocks.WET_RED_SPONGE_BLOCK);

        blockWithItem(ModBlocks.LIME_SPONGE_BLOCK);
        blockWithItem(ModBlocks.WET_LIME_SPONGE_BLOCK);

        blockWithItem(ModBlocks.LIGHT_BLUE_SPONGE_BLOCK);
        blockWithItem(ModBlocks.WET_LIGHT_BLUE_SPONGE_BLOCK);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

}
