package com.emjaypower.ad_divinitatem.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.Tool;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import java.util.List;

public class DivinePickItem extends PickaxeItem {
    public DivinePickItem(Tier pTier, Properties pProperties, Integer maxDivinity, Integer divinity) {
        super(pTier, pProperties);
        this.Divinity = divinity;
        this.MaxDivinity = maxDivinity;
    }
    private Integer MaxDivinity;
    private Integer Divinity;

    @Override
    public boolean mineBlock(ItemStack pStack, Level pLevel, BlockState pState, BlockPos pPos, LivingEntity pMiningEntity) {
        Tool tool = pStack.m_323252_(DataComponents.f_314833_);
        if (tool == null) {
            return false;
        } else {
            if (!pLevel.isClientSide && pState.getDestroySpeed(pLevel, pPos) != 0.0F && tool.f_315325_() > 0) {
                subtractDivinity();
            }

            return true;
        }
    }

    public void subtractDivinity() {
        Integer integer = 32;
        if ((Divinity += integer) <= 0) {
            Divinity = 0;
        } else {
            Divinity -= integer;
        }
    }
    public void addDivinity(Integer integer) {
        if ((Divinity += integer) >= MaxDivinity) {
            Divinity = MaxDivinity;
        } else {
            Divinity += integer;
        }
    }

    @Override
    public void appendHoverText(ItemStack pStack, TooltipContext tooltipContext, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.literal("Divinity: " + Divinity + "/" + MaxDivinity + "mb"));
        super.appendHoverText(pStack, tooltipContext, pTooltipComponents, pIsAdvanced);
    }
}
