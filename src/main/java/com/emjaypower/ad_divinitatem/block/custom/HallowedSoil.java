package com.emjaypower.ad_divinitatem.block.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.FarmBlock;

import java.util.List;

public class HallowedSoil extends FarmBlock {
    public HallowedSoil(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, Item.TooltipContext tooltipContext, List<Component> pTooltip, TooltipFlag pFlag) {
        pTooltip.add(Component.translatable("tooltip.ad_divinitatem.hallowed_soil.tooltip"));
        super.appendHoverText(pStack, tooltipContext, pTooltip, pFlag);
    }
}
