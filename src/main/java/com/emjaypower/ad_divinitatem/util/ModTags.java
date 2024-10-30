package com.emjaypower.ad_divinitatem.util;

import com.emjaypower.ad_divinitatem.AdDivinitatem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> CreationCoreBlocks = createTag("creation_core_blocks");
        public static final TagKey<Block> NeedsAdDivinitatemToolTier1 = createTag("needs_ad_divinitatem_tool_tier_1");
        public static final TagKey<Block> IncorrectForAdDivinitatemToolTier1 = createTag("incorrect_for_ad_divinitatem_tool_tier_1");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.m_339182_(AdDivinitatem.MODID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.m_339182_(AdDivinitatem.MODID, name));
        }
    }
}
