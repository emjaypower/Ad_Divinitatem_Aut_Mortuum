package com.emjaypower.ad_divinitatem.block.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;

import java.util.List;

public class PurplestoneDust extends Block {
    public PurplestoneDust(Properties pProperties){
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, Item.TooltipContext tooltipContext, List<Component> pTooltip, TooltipFlag pFlag) {
        pTooltip.add(Component.translatable("tooltip.ad_divinitatem.purplestone_dust.tooltip"));
        super.appendHoverText(pStack, tooltipContext, pTooltip, pFlag);
    }
}