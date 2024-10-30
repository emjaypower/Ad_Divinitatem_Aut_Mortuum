package com.emjaypower.ad_divinitatem.datagen;

import com.emjaypower.ad_divinitatem.AdDivinitatem;
import com.emjaypower.ad_divinitatem.block.ModBlocks;
import com.emjaypower.ad_divinitatem.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                               @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, AdDivinitatem.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.Hallowed_Soil.get())
                .add(ModBlocks.Profaned_Soil.get());

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.Purplestone_Block.get());

        tag(ModTags.Blocks.CreationCoreBlocks)
                .add(Blocks.ANCIENT_DEBRIS)
                .add(Blocks.IRON_ORE)
                .add(Blocks.GOLD_ORE)
                .add(Blocks.LAPIS_ORE)
                .add(Blocks.DIAMOND_ORE)
                .add(Blocks.REDSTONE_ORE)
                .add(Blocks.DEEPSLATE_IRON_ORE)
                .add(Blocks.DEEPSLATE_GOLD_ORE)
                .add(Blocks.DEEPSLATE_LAPIS_ORE)
                .add(Blocks.DEEPSLATE_DIAMOND_ORE)
                .add(Blocks.DEEPSLATE_REDSTONE_ORE)
                .add(Blocks.COPPER_ORE)
                .add(Blocks.DEEPSLATE_COPPER_ORE)
                .add(Blocks.EMERALD_ORE)
                .add(Blocks.DEEPSLATE_EMERALD_ORE)
                .add(Blocks.COAL_ORE)
                .add(Blocks.DEEPSLATE_COAL_ORE)
                .add(Blocks.NETHER_QUARTZ_ORE);
    }
}
