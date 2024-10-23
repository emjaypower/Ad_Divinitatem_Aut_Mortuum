package com.emjaypower.ad_divinitatem.item.custom;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class DivineCoreCreationItem extends Item {
    public DivineCoreCreationItem(Properties pProperties){
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        BlockState block = level.getBlockState(pContext.getClickedPos());
        if (!level.isClientSide()) {
            if (level.getBlockState(pContext.getClickedPos().above()).getBlock() == Blocks.AIR) {
                level.setBlockAndUpdate(pContext.getClickedPos().above(), block);
                pContext.getItemInHand().shrink(1);
                level.playSound(null, pContext.getClickedPos(), SoundEvents.ANVIL_PLACE, SoundSource.BLOCKS);
            }
        }

        return InteractionResult.SUCCESS;
    }
}
