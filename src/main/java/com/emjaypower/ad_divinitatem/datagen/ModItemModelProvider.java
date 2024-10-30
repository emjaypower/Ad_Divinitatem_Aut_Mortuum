package com.emjaypower.ad_divinitatem.datagen;

import com.emjaypower.ad_divinitatem.AdDivinitatem;
import com.emjaypower.ad_divinitatem.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AdDivinitatem.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.Divine_Fruit.get());

        handheldItem(ModItems.ADAM_Pickaxe_Tier_1);
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return this.withExistingParent(item.getId().getPath(),
                ResourceLocation.tryParse("item/handheld")).texture("layer0",
                ResourceLocation.m_339182_(AdDivinitatem.MODID, "item/" + item.getId().getPath()));
    }
}
