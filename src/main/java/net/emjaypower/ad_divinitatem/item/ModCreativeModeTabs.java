package net.emjaypower.ad_divinitatem.item;

import net.emjaypower.ad_divinitatem.AdDivinitatem;
import net.emjaypower.ad_divinitatem.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AdDivinitatem.MODID);

    public static final RegistryObject<CreativeModeTab> Ad_Divinitatem_Tab = CREATIVE_MODE_TABS.register("ad_divinitatem_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.Purplestone_Block.get()))
                    .title(Component.translatable("creativetab.ad_divinitatem.ad_divinitatem_tab"))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
