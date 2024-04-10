package com.confusingfool.moltenobsidiantools.item;

import com.confusingfool.moltenobsidiantools.MoltenObsidianTools;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTab
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoltenObsidianTools.MODID);

    public static final Supplier<CreativeModeTab> MOLTEN_TAB = CREATIVE_MODE_TABS.register("molten_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + MoltenObsidianTools.MODID + ".molten_tab"))
            .icon(() -> new ItemStack(ModItems.MOLTEN_OBSIDIAN.get()))
            .displayItems((params, output) -> {
                output.accept(ModItems.MOLTEN_OBSIDIAN.get());
                output.accept(ModItems.MOLTEN_OBSIDIAN_SHOVEL.get());
                output.accept(ModItems.MOLTEN_OBSIDIAN_PICKAXE.get());
                output.accept(ModItems.MOLTEN_OBSIDIAN_AXE.get());
                output.accept(ModItems.MOLTEN_OBSIDIAN_HOE.get());
                output.accept(ModItems.REINFORCED_MOLTEN_OBSIDIAN.get());
                output.accept(ModItems.REINFORCED_OBSIDIAN_SHOVEL.get());
                output.accept(ModItems.REINFORCED_OBSIDIAN_PICKAXE.get());
                output.accept(ModItems.REINFORCED_OBSIDIAN_AXE.get());
                output.accept(ModItems.REINFORCED_OBSIDIAN_HOE.get());
            })
            .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}