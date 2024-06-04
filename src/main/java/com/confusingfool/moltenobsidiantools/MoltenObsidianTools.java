package com.confusingfool.moltenobsidiantools;

import com.confusingfool.moltenobsidiantools.item.ModCreativeModeTab;
import com.confusingfool.moltenobsidiantools.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(MoltenObsidianTools.MODID)
public class MoltenObsidianTools
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "moltenobsidiantools";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "moltenobsidiantools" namespace


    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public MoltenObsidianTools(IEventBus modEventBus)
    {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        NeoForge.EVENT_BUS.register(this);
        ModCreativeModeTab.register(modEventBus);
        ModItems.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS)
        {
            event.accept(ModItems.MOLTEN_OBSIDIAN.get());
            event.accept(ModItems.REINFORCED_MOLTEN_OBSIDIAN.get());
            event.accept(ModItems.MOLTEN_UPGRADE_TEMPLATE.get());
            event.accept(ModItems.REINFORCED_UPGRADE_TEMPLATE.get());
        }

        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES)
        {
            event.accept(ModItems.MOLTEN_OBSIDIAN_SHOVEL.get());
            event.accept(ModItems.MOLTEN_OBSIDIAN_PICKAXE.get());
            event.accept(ModItems.MOLTEN_OBSIDIAN_AXE.get());
            event.accept(ModItems.MOLTEN_OBSIDIAN_HOE.get());
            event.accept(ModItems.REINFORCED_OBSIDIAN_SHOVEL.get());
            event.accept(ModItems.REINFORCED_OBSIDIAN_PICKAXE.get());
            event.accept(ModItems.REINFORCED_OBSIDIAN_AXE.get());
            event.accept(ModItems.REINFORCED_OBSIDIAN_HOE.get());
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("Molten Obsidian Tools loading...");
    }
}
