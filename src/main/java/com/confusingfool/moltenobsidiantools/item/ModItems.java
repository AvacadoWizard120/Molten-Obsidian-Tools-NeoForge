package com.confusingfool.moltenobsidiantools.item;

import com.confusingfool.moltenobsidiantools.MoltenObsidianTools;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoltenObsidianTools.MODID);

    public static final Supplier<Item> MOLTEN_OBSIDIAN = ITEMS.registerItem(
            "molten_obsidian",
            Item::new,
            new Item.Properties().stacksTo(4)
    );

    public static final Supplier<Item> REINFORCED_MOLTEN_OBSIDIAN = ITEMS.registerItem(
            "reinforced_molten_obsidian",
            Item::new,
            new Item.Properties().stacksTo(1)
    );

    public static final Supplier<AxeItem> MOLTEN_OBSIDIAN_AXE = ITEMS.register(
            "molten_obsidian_axe", () -> new AxeItem(ModTiers.MOLTEN, 10, -1f, new Item.Properties())
    );

    public static final Supplier<PickaxeItem> MOLTEN_OBSIDIAN_PICKAXE = ITEMS.register(
            "molten_obsidian_axe", () -> new PickaxeItem(ModTiers.MOLTEN, 4, -1f, new Item.Properties())
    );

    public static final Supplier<ShovelItem> MOLTEN_OBSIDIAN_SHOVEL = ITEMS.register(
            "molten_obsidian_shovel", () -> new ShovelItem(ModTiers.MOLTEN, 3, -1f, new Item.Properties())
    );
    public static final Supplier<HoeItem> MOLTEN_OBSIDIAN_HOE = ITEMS.register(
            "molten_obsidian_hoe", () -> new HoeItem(ModTiers.MOLTEN, 2, -1f, new Item.Properties())
    );
    public static final Supplier<AxeItem> REINFORCED_OBSIDIAN_AXE = ITEMS.register(
            "reinforced_obsidian_axe", () -> new AxeItem(ModTiers.MOLTEN, 10, -1f, new Item.Properties())
    );

    public static final Supplier<PickaxeItem> REINFORCED_OBSIDIAN_PICKAXE = ITEMS.register(
            "reinforced_obsidian_axe", () -> new PickaxeItem(ModTiers.MOLTEN, 4, -1f, new Item.Properties())
    );

    public static final Supplier<ShovelItem> REINFORCED_OBSIDIAN_SHOVEL = ITEMS.register(
            "reinforced_obsidian_shovel", () -> new ShovelItem(ModTiers.MOLTEN, 3, -1f, new Item.Properties())
    );
    public static final Supplier<HoeItem> REINFORCED_OBSIDIAN_HOE = ITEMS.register(
            "reinforced_obsidian_hoe", () -> new HoeItem(ModTiers.MOLTEN, 2, -1f, new Item.Properties())
    );


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
