package com.emjaypower.ad_divinitatem.datagen;

import com.emjaypower.ad_divinitatem.AdDivinitatem;
import com.emjaypower.ad_divinitatem.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> providerCompletableFuture) {
        super(pOutput, providerCompletableFuture);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        //Purplestone Block Recipe
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Purplestone_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.Purplestone_Dust.get())
                .unlockedBy(getHasName(ModBlocks.Purplestone_Dust.get()), has(ModBlocks.Purplestone_Dust.get()))
                .save(pRecipeOutput);

        //Purplestone Dust Recipes
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.Purplestone_Dust.get(), 2)
                .requires(Items.AMETHYST_SHARD)
                .requires(Items.REDSTONE)
                .unlockedBy(getHasName(Items.REDSTONE), has(Items.REDSTONE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.Purplestone_Dust.get(), 9)
                .requires(ModBlocks.Purplestone_Block.get())
                .unlockedBy(getHasName(ModBlocks.Purplestone_Block.get()), has(ModBlocks.Purplestone_Block.get()))
                .save(pRecipeOutput, AdDivinitatem.MODID + ":purplestone_dust_from_block");
    }
}
