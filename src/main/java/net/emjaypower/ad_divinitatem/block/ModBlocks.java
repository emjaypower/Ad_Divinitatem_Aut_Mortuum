package net.emjaypower.ad_divinitatem.block;

import net.emjaypower.ad_divinitatem.AdDivinitatem;
import net.emjaypower.ad_divinitatem.block.custom.HallowedSoil;
import net.emjaypower.ad_divinitatem.block.custom.ProfanedSoil;
import net.emjaypower.ad_divinitatem.block.custom.PurplestoneDust;
import net.emjaypower.ad_divinitatem.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.PoweredBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AdDivinitatem.MODID);

    public static final RegistryObject<Block> Purplestone_Dust = registerBlock("purplestone_dust",
            () -> new PurplestoneDust(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> Purplestone_Block = registerBlock("purplestone_block",
            () -> new PoweredBlock(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> Profaned_Soil = registerBlock("profaned_soil",
            () -> new ProfanedSoil(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> Hallowed_Soil = registerBlock("hallowed_soil",
            () -> new HallowedSoil(BlockBehaviour.Properties.of()
                    ));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
