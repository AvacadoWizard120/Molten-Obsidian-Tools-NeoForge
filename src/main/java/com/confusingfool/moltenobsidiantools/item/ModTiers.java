package com.confusingfool.moltenobsidiantools.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModTiers
{
    public static final Tier MOLTEN = new SimpleTier(
            3,
            1900,
            9.4f,
            3.5f,
            3,
            BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.MOLTEN_OBSIDIAN.get())
    );
    public static final Tier REINFORCED = new SimpleTier(
            4,
            3000,
            20F,
            4.0F,
            20,
            BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.MOLTEN_OBSIDIAN.get())
    );
}
