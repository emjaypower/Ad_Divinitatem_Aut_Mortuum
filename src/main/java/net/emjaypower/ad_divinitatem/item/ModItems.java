package net.emjaypower.ad_divinitatem.item;

import net.emjaypower.ad_divinitatem.AdDivinitatem;
import net.emjaypower.ad_divinitatem.item.custom.DivineCoreCreationItem;
import net.emjaypower.ad_divinitatem.item.custom.DivineCoreDarknessItem;
import net.emjaypower.ad_divinitatem.item.custom.DivineCoreDestructionItem;
import net.emjaypower.ad_divinitatem.item.custom.DivineCoreLightItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AdDivinitatem.MODID);

    public static final RegistryObject<Item> Purplestone_Dust = ITEMS.register("purplestone_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Divine_Core_Creation = ITEMS.register("divine_core_creation",
            () -> new DivineCoreCreationItem(new Item.Properties()));
    public static  final RegistryObject<Item> Divine_Core_Destruction = ITEMS.register("divine_core_destruction",
            () -> new DivineCoreDestructionItem(new Item.Properties()));
    public static  final RegistryObject<Item> Divine_Core_Light = ITEMS.register("divine_core_light",
            () -> new DivineCoreLightItem(new Item.Properties()));
    public static  final RegistryObject<Item> Divine_Core_Darkness = ITEMS.register("divine_core_darkness",
            () -> new DivineCoreDarknessItem(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
