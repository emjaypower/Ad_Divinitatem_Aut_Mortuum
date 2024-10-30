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
