package com.emjaypower.ad_divinitatem.datagen;

import com.emjaypower.ad_divinitatem.AdDivinitatem;
import com.emjaypower.ad_divinitatem.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, AdDivinitatem.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.Purplestone_Block);
        blockWithItem(ModBlocks.Hallowed_Soil);
        blockWithItem(ModBlocks.Profaned_Soil);
    }

    private void blockWithItem(RegistryObject<Block> pRegistryBlock) {
        simpleBlockWithItem(pRegistryBlock.get(), cubeAll(pRegistryBlock.get()));
    }
}
