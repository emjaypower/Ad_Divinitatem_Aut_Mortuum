package com.emjaypower.ad_divinitatem.datagen;

import com.emjaypower.ad_divinitatem.AdDivinitatem;
import com.emjaypower.ad_divinitatem.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AdDivinitatem.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.Divine_Fruit.get());
    }
}
