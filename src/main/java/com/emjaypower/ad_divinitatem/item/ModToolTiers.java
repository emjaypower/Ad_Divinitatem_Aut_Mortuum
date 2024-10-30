package com.emjaypower.ad_divinitatem.item;

import com.emjaypower.ad_divinitatem.block.ModBlocks;
import com.emjaypower.ad_divinitatem.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {
    public static final Tier ADAM_TIER_1 = new ForgeTier(111, 8.5f, 3.5f,15,
            ModTags.Blocks.NeedsAdDivinitatemToolTier1, () -> Ingredient.of(ModBlocks.Purplestone_Dust.get()),
            ModTags.Blocks.IncorrectForAdDivinitatemToolTier1);
}
