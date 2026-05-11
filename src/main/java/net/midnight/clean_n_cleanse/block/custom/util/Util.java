package net.midnight.clean_n_cleanse.block.custom.util;

import net.midnight.clean_n_cleanse.block.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import oshi.util.tuples.Pair;

import java.util.Map;

public class Util {
    public static Map<SpongeColor, Pair<DeferredBlock<Block>, DeferredBlock<Block>>>
            SPONGES = Map.of(
            SpongeColor.WHITE, new Pair<>(
                    ModBlocks.WHITE_SPONGE_BLOCK,
                    ModBlocks.WET_WHITE_SPONGE_BLOCK
            ),
            SpongeColor.RED, new Pair<>(
                    ModBlocks.RED_SPONGE_BLOCK,
                    ModBlocks.WET_RED_SPONGE_BLOCK
            ),
            SpongeColor.LIME, new Pair<>(
                    ModBlocks.LIME_SPONGE_BLOCK,
                    ModBlocks.WET_LIME_SPONGE_BLOCK
            ),
            SpongeColor.LIGHT_BLUE, new Pair<>(
                    ModBlocks.LIGHT_BLUE_SPONGE_BLOCK,
                    ModBlocks.WET_LIGHT_BLUE_SPONGE_BLOCK
            )
    );

}

