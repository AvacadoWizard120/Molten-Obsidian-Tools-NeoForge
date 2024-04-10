package com.confusingfool.moltenobsidiantools.item;

import com.confusingfool.moltenobsidiantools.MoltenObsidianTools;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoltenObsidianTools.MODID);

    public static final Supplier<Item> MOLTEN_OBSIDIAN = ITEMS.registerItem(
            "molten_obsidian",
            Item::new,
            new Item.Properties()
    );
}
