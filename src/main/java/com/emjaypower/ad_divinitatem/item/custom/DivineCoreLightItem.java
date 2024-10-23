package com.emjaypower.ad_divinitatem.item.custom;

import com.emjaypower.ad_divinitatem.block.ModBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class DivineCoreLightItem extends Item {
    public DivineCoreLightItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        Block block = level.getBlockState(pContext.getClickedPos()).getBlock();

        if (!level.isClientSide()) {
            if (block == Blocks.DIRT) {
                level.setBlockAndUpdate(pContext.getClickedPos(), ModBlocks.Hallowed_Soil.get().defaultBlockState());
                pContext.getItemInHand().shrink(1);
                level.playSound(null, pContext.getClickedPos(), SoundEvents.AMETHYST_BLOCK_RESONATE, SoundSource.BLOCKS);
                return InteractionResult.SUCCESS;
            }
        }

        return InteractionResult.FAIL;
    }
}