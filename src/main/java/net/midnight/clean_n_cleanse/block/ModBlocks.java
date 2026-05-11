package net.midnight.clean_n_cleanse.block;

import net.midnight.clean_n_cleanse.ChemistryMod;
import net.midnight.clean_n_cleanse.block.custom.*;
import net.midnight.clean_n_cleanse.block.custom.util.SpongeColor;
import net.midnight.clean_n_cleanse.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static  final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(ChemistryMod.MOD_ID);

    public static final DeferredBlock<Block> WHITE_SPONGE_BLOCK = registerBlock("white_sponge_block",
            () -> new CustomSpongeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPONGE), SpongeColor.WHITE));
    public static final DeferredBlock<Block> WET_WHITE_SPONGE_BLOCK = registerBlock("wet_white_sponge_block",
            () -> new CustomWetSpongeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WET_SPONGE), SpongeColor.WHITE));

    public static final DeferredBlock<Block> RED_SPONGE_BLOCK = registerBlock("red_sponge_block",
            () -> new CustomSpongeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPONGE), SpongeColor.RED));
    public static final DeferredBlock<Block> WET_RED_SPONGE_BLOCK = registerBlock("wet_red_sponge_block",
            () -> new CustomWetSpongeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WET_SPONGE), SpongeColor.RED));

    public static final DeferredBlock<Block> LIME_SPONGE_BLOCK = registerBlock("lime_sponge_block",
            () -> new CustomSpongeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPONGE), SpongeColor.LIME));
    public static final DeferredBlock<Block> WET_LIME_SPONGE_BLOCK = registerBlock("wet_lime_sponge_block",
            () -> new CustomWetSpongeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WET_SPONGE), SpongeColor.LIME));

    public static final DeferredBlock<Block> LIGHT_BLUE_SPONGE_BLOCK = registerBlock("light_blue_sponge_block",
            () -> new CustomSpongeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPONGE), SpongeColor.LIGHT_BLUE));
    public static final DeferredBlock<Block> WET_LIGHT_BLUE_SPONGE_BLOCK = registerBlock("wet_light_blue_sponge_block",
            () -> new CustomWetSpongeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WET_SPONGE), SpongeColor.LIGHT_BLUE));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}