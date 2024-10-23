package com.emjaypower.ad_divinitatem.item.custom;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class DivineCoreDestructionItem extends Item {
    public DivineCoreDestructionItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        Block block = level.getBlockState(pContext.getClickedPos()).getBlock();

        if (!level.isClientSide()) {
            level.setBlockAndUpdate(pContext.getClickedPos(), Blocks.AIR.defaultBlockState());
            pContext.getItemInHand().shrink(1);
            level.playSound(null, pContext.getClickedPos(), SoundEvents.FIRE_EXTINGUISH, SoundSource.BLOCKS);
        }

        return InteractionResult.SUCCESS;
    }
}
