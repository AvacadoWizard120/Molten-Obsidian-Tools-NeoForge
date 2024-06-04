package com.confusingfool.moltenobsidiantools.item;

import com.confusingfool.moltenobsidiantools.MoltenObsidianTools;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.function.Supplier;

public class ModItems
{
    private static final ChatFormatting TITLE_FORMATTING = ChatFormatting.GRAY;
    private static final ChatFormatting DESCRIPTION_FORMATTING = ChatFormatting.BLUE;

    private static final Component MOLTEN_UPGRADE_APPLIES_TO_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(MoltenObsidianTools.MODID, "smithing_template.molten_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMATTING);
    private static final Component REINFORCED_UPGRADE_APPLIES_TO_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(MoltenObsidianTools.MODID, "smithing_template.reinforced_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMATTING);

    private static final Component MOLTEN_UPGRADE_INGREDIENTS_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(MoltenObsidianTools.MODID, "smithing_template.molten_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMATTING);
    private static final Component REINFORCED_UPGRADE_INGREDIENTS_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(MoltenObsidianTools.MODID, "smithing_template.reinforced_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMATTING);

    private static final Component MOLTEN_UPGRADE_TEXT= Component.translatable(Util.makeDescriptionId("upgrade", new ResourceLocation(MoltenObsidianTools.MODID, "molten_upgrade"))).withStyle(TITLE_FORMATTING);
    private static final Component REINFORCED_UPGRADE_TEXT= Component.translatable(Util.makeDescriptionId("upgrade", new ResourceLocation(MoltenObsidianTools.MODID, "reinforced_upgrade"))).withStyle(TITLE_FORMATTING);

    private static final Component MOLTEN_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(MoltenObsidianTools.MODID, "smithing_template.molten_upgrade.base_slot_description")));
    private static final Component REINFORCED_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(MoltenObsidianTools.MODID, "smithing_template.reinforced_upgrade.base_slot_description")));
    private static final Component MOLTEN_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(MoltenObsidianTools.MODID, "smithing_template.molten_upgrade.additions_slot_description")));
    private static final Component REINFORCED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(MoltenObsidianTools.MODID, "smithing_template.reinforced_upgrade.additions_slot_description")));
    private static final ResourceLocation EMPTY_SLOT_PICKAXE_TEXTURE = new ResourceLocation("item/empty_slot_pickaxe");
    private static final ResourceLocation EMPTY_SLOT_AXE_TEXTURE = new ResourceLocation("item/empty_slot_axe");
    private static final ResourceLocation EMPTY_SLOT_HOE_TEXTURE = new ResourceLocation("item/empty_slot_hoe");
    private static final ResourceLocation EMPTY_SLOT_SHOVEL_TEXTURE = new ResourceLocation("item/empty_slot_shovel");
    private static final ResourceLocation EMPTY_SLOT_MOLTEN_TEXTURE = new ResourceLocation(MoltenObsidianTools.MODID, "item/empty_slot_molten");
    private static final ResourceLocation EMPTY_SLOT_REINFORCED_TEXTURE = new ResourceLocation(MoltenObsidianTools.MODID, "item/empty_slot_reinforced");
    
    
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
            "molten_obsidian_axe", () -> new AxeItem(ModTiers.MOLTEN, (new Item.Properties()).attributes(AxeItem.createAttributes(ModTiers.MOLTEN, 10, -1f))));

    public static final Supplier<PickaxeItem> MOLTEN_OBSIDIAN_PICKAXE = ITEMS.register(
            "molten_obsidian_pickaxe", () -> new PickaxeItem(ModTiers.MOLTEN, (new Item.Properties()).attributes(PickaxeItem.createAttributes(ModTiers.MOLTEN, 4, -1f))));

    public static final Supplier<ShovelItem> MOLTEN_OBSIDIAN_SHOVEL = ITEMS.register(
            "molten_obsidian_shovel", () -> new ShovelItem(ModTiers.MOLTEN,(new Item.Properties()).attributes(ShovelItem.createAttributes(ModTiers.MOLTEN, 3, -1f))));

    public static final Supplier<HoeItem> MOLTEN_OBSIDIAN_HOE = ITEMS.register(
            "molten_obsidian_hoe", () -> new HoeItem(ModTiers.MOLTEN,(new Item.Properties()).attributes(HoeItem.createAttributes(ModTiers.MOLTEN, 2, -1f))));

    public static final Supplier<AxeItem> REINFORCED_OBSIDIAN_AXE = ITEMS.register(
            "reinforced_obsidian_axe", () -> new AxeItem(ModTiers.REINFORCED, (new Item.Properties()).attributes(AxeItem.createAttributes(ModTiers.REINFORCED, 10, -1f))));

    public static final Supplier<PickaxeItem> REINFORCED_OBSIDIAN_PICKAXE = ITEMS.register(
            "reinforced_obsidian_pickaxe", () -> new PickaxeItem(ModTiers.REINFORCED, (new Item.Properties()).attributes(PickaxeItem.createAttributes(ModTiers.REINFORCED, 4, -1f))));

    public static final Supplier<ShovelItem> REINFORCED_OBSIDIAN_SHOVEL = ITEMS.register(
            "reinforced_obsidian_shovel", () -> new ShovelItem(ModTiers.REINFORCED,(new Item.Properties()).attributes(ShovelItem.createAttributes(ModTiers.REINFORCED, 3, -1f))));

    public static final Supplier<HoeItem> REINFORCED_OBSIDIAN_HOE = ITEMS.register(
            "reinforced_obsidian_hoe", () -> new HoeItem(ModTiers.REINFORCED,(new Item.Properties()).attributes(HoeItem.createAttributes(ModTiers.REINFORCED, 2, -1f))));

    public static final Supplier<SmithingTemplateItem> MOLTEN_UPGRADE_TEMPLATE = ITEMS.register(
            "molten_upgrade_template", () -> new SmithingTemplateItem(MOLTEN_UPGRADE_APPLIES_TO_TEXT, MOLTEN_UPGRADE_INGREDIENTS_TEXT, MOLTEN_UPGRADE_TEXT, MOLTEN_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, MOLTEN_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, getMoltenUpgradeEmptyBaseSlotTextures(), getMoltenUpgradeEmptyAdditionsSlotTextures())
    );
    public static final Supplier<SmithingTemplateItem> REINFORCED_UPGRADE_TEMPLATE = ITEMS.register(
            "reinforced_upgrade_template", () -> new SmithingTemplateItem(REINFORCED_UPGRADE_APPLIES_TO_TEXT, REINFORCED_UPGRADE_INGREDIENTS_TEXT, REINFORCED_UPGRADE_TEXT, REINFORCED_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, REINFORCED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, getMoltenUpgradeEmptyBaseSlotTextures(), getReinforcedUpgradeEmptyAdditionsSlotTextures())
    );

    private static List<ResourceLocation> getMoltenUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_SLOT_PICKAXE_TEXTURE, EMPTY_SLOT_AXE_TEXTURE, EMPTY_SLOT_HOE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE);
    }

    private static List<ResourceLocation> getMoltenUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_MOLTEN_TEXTURE);
    }

    private static List<ResourceLocation> getReinforcedUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_REINFORCED_TEXTURE);
    }


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
