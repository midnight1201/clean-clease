package net.midnight.clean_n_cleanse.util;

import net.midnight.clean_n_cleanse.ChemistryMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> SPONGE_BLOCKS = createTag("sponge_blocks");
        public static final TagKey<Block> WET_SPONGE_BLOCKS = createTag("wet_sponge_blocks");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(ChemistryMod.MOD_ID, name));
        }

    }

    public static class Items {
        public static final TagKey<Item> SPONGE_ITEMS = createTag("sponge_items");
        public static final TagKey<Item> WET_SPONGE_ITEMS = createTag("wet_sponge_items");
        public static final TagKey<Item> SPONGE_BLOCKS = createTag("sponge_blocks");
        public static final TagKey<Item> WET_SPONGE_BLOCKS = createTag("wet_sponge_blocks");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(ChemistryMod.MOD_ID, name));
        }

    }

}
