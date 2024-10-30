package com.emjaypower.ad_divinitatem.item;

import com.emjaypower.ad_divinitatem.AdDivinitatem;
import com.emjaypower.ad_divinitatem.item.custom.*;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AdDivinitatem.MODID);

    public static final RegistryObject<Item> Divine_Core_Creation = ITEMS.register("divine_core_creation",
            () -> new DivineCoreCreationItem(new Item.Properties()));
    public static  final RegistryObject<Item> Divine_Core_Destruction = ITEMS.register("divine_core_destruction",
            () -> new DivineCoreDestructionItem(new Item.Properties()));
    public static  final RegistryObject<Item> Divine_Core_Light = ITEMS.register("divine_core_light",
            () -> new DivineCoreLightItem(new Item.Properties()));
    public static  final RegistryObject<Item> Divine_Core_Darkness = ITEMS.register("divine_core_darkness",
            () -> new DivineCoreDarknessItem(new Item.Properties()));

    public static final RegistryObject<Item> Divine_Fruit = ITEMS.register("divine_fruit",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DivineFruit)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext tooltipContext, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("tooltip.ad_divinitatem.divine_fruit.tooltip"));
                    super.appendHoverText(pStack, tooltipContext, pTooltipComponents, pIsAdvanced);
                }
            });

    public static final RegistryObject<Item> ADAM_Pickaxe_Tier_1 = ITEMS.register("adam_pickaxe_tier_1",
            () -> new PickaxeItem(ModToolTiers.ADAM_TIER_1, new Item.Properties()
                    .m_324699_(PickaxeItem.m_320415_(ModToolTiers.ADAM_TIER_1, 1, 2.8f))));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
