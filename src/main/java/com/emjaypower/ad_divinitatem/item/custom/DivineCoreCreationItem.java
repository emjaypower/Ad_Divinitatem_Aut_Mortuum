package com.emjaypower.ad_divinitatem.item.custom;

import com.emjaypower.ad_divinitatem.util.ModTags;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import java.util.List;

public class DivineCoreCreationItem extends Item {
    public DivineCoreCreationItem(Properties pProperties){
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        BlockState block = level.getBlockState(pContext.getClickedPos());
        if (!level.isClientSide()) {
            if (level.getBlockState(pContext.getClickedPos().above()).getBlock() == Blocks.AIR
                && block.is(ModTags.Blocks.CreationCoreBlocks)) {
                level.setBlockAndUpdate(pContext.getClickedPos().above(), block);
                pContext.getItemInHand().shrink(1);
                level.playSound(null, pContext.getClickedPos(), SoundEvents.ANVIL_PLACE, SoundSource.BLOCKS);
            }
        }

        return InteractionResult.SUCCESS;
    }

    @Override
    public void appendHoverText(ItemStack pStack, TooltipContext tooltipContext, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.ad_divinitatem.divine_core_creation.tooltip"));
        super.appendHoverText(pStack, tooltipContext, pTooltipComponents, pIsAdvanced);
    }
}
