package com.june.queercraft.item;

import com.june.queercraft.QueerCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item AROACE_INGOT = registerItem("aroace_ingot",new Item(new FabricItemSettings()));
    public static final Item BASE_INGOT = registerItem("base_ingot",new Item(new FabricItemSettings()));
    public static final Item BI_INGOT = registerItem("bi_ingot",new Item(new FabricItemSettings()));
    public static final Item BLACK_INGOT = registerItem("black_ingot",new Item(new FabricItemSettings()));
    public static final Item BLUE_INGOT = registerItem("blue_ingot",new Item(new FabricItemSettings()));
    public static final Item CYAN_INGOT = registerItem("cyan_ingot",new Item(new FabricItemSettings()));
    public static final Item DEMIGENDER_INGOT = registerItem("demigender_ingot",new Item(new FabricItemSettings()));
    public static final Item GENDERFLUID_INGOT = registerItem("genderfluid_ingot",new Item(new FabricItemSettings()));
    public static final Item GREEN_INGOT = registerItem("green_ingot",new Item(new FabricItemSettings()));
    public static final Item GREY_INGOT = registerItem("grey_ingot",new Item(new FabricItemSettings()));
    public static final Item LESBIAN_INGOT = registerItem("lesbian_ingot",new Item(new FabricItemSettings()));
    public static final Item LIGHT_BLUE_INGOT = registerItem("light_blue_ingot",new Item(new FabricItemSettings()));
    public static final Item LIGHT_GREY_INGOT = registerItem("light_grey_ingot",new Item(new FabricItemSettings()));
    public static final Item LIME_INGOT = registerItem("lime_ingot",new Item(new FabricItemSettings()));
    public static final Item MAGENTA_INGOT = registerItem("magenta_ingot",new Item(new FabricItemSettings()));
    public static final Item MLM_INGOT = registerItem("mlm_ingot",new Item(new FabricItemSettings()));
    public static final Item NONBINARY_INGOT = registerItem("nonbinary_ingot",new Item(new FabricItemSettings()));
    public static final Item ORANGE_INGOT = registerItem("orange_ingot",new Item(new FabricItemSettings()));
    public static final Item PAN_INGOT = registerItem("pan_ingot",new Item(new FabricItemSettings()));
    public static final Item PINK_INGOT = registerItem("pink_ingot",new Item(new FabricItemSettings()));
    public static final Item PURPLE_INGOT = registerItem("purple_ingot",new Item(new FabricItemSettings()));
    public static final Item QUEER_INGOT = registerItem("queer_ingot",new Item(new FabricItemSettings()));
    public static final Item RED_INGOT = registerItem("red_ingot",new Item(new FabricItemSettings()));
    public static final Item TRANS_INGOT = registerItem("trans_ingot",new Item(new FabricItemSettings()));
    public static final Item WHITE_INGOT = registerItem("white_ingot",new Item(new FabricItemSettings()));
    public static final Item YELLOW_INGOT = registerItem("yellow_ingot",new Item(new FabricItemSettings()));

    //================================================================================

    public static final Item RAW_BROWN_ORE = registerItem("raw_brown_ore",new Item(new FabricItemSettings()));

    //================================================================================

    public static final Item AROACE_PICKAXE = registerItem("aroace_pickaxe",
            new PickaxeItem(ModToolMaterial.AROACE, 1, 1f, new FabricItemSettings()));

    public static final Item BI_PICKAXE = registerItem("bi_pickaxe",
            new PickaxeItem(ModToolMaterial.BI, 1, 1f, new FabricItemSettings()));

    public static final Item DEMIGENDER_PICKAXE = registerItem("demigender_pickaxe",
            new PickaxeItem(ModToolMaterial.DEMIGENDER, 1, 1f, new FabricItemSettings()));

    public static final Item GENDERFLUID_PICKAXE = registerItem("genderfluid_pickaxe",
            new PickaxeItem(ModToolMaterial.GENDERFLUID, 1, 1f, new FabricItemSettings()));

    public static final Item LESBIAN_PICKAXE = registerItem("lesbian_pickaxe",
            new PickaxeItem(ModToolMaterial.LESBIAN, 1, 1f, new FabricItemSettings()));

    public static final Item MLM_PICKAXE = registerItem("mlm_pickaxe",
            new PickaxeItem(ModToolMaterial.MLM, 1, 1f, new FabricItemSettings()));

    public static final Item NONBINARY_PICKAXE = registerItem("nonbinary_pickaxe",
            new PickaxeItem(ModToolMaterial.NONBINARY, 1, 1f, new FabricItemSettings()));

    public static final Item PAN_PICKAXE = registerItem("pan_pickaxe",
            new PickaxeItem(ModToolMaterial.PAN, 1, 1f, new FabricItemSettings()));

    public static final Item QUEER_PICKAXE = registerItem("queer_pickaxe",
            new PickaxeItem(ModToolMaterial.QUEER, 1, 1f, new FabricItemSettings()));

    public static final Item TRANS_PICKAXE = registerItem("trans_pickaxe",
            new PickaxeItem(ModToolMaterial.TRANS, 1, 1f, new FabricItemSettings()));

    //================================================================================

    public static final Item AROACE_AXE = registerItem("aroace_axe",
            new AxeItem(ModToolMaterial.AROACE, 1, 1f, new FabricItemSettings()));

    public static final Item BI_AXE = registerItem("bi_axe",
            new AxeItem(ModToolMaterial.BI, 1, 1f, new FabricItemSettings()));

    public static final Item DEMIGENDER_AXE = registerItem("demigender_axe",
            new AxeItem(ModToolMaterial.DEMIGENDER, 1, 1f, new FabricItemSettings()));

    public static final Item GENDERFLUID_AXE = registerItem("genderfluid_axe",
            new AxeItem(ModToolMaterial.GENDERFLUID, 1, 1f, new FabricItemSettings()));

    public static final Item LESBIAN_AXE = registerItem("lesbian_axe",
            new AxeItem(ModToolMaterial.LESBIAN, 1, 1f, new FabricItemSettings()));

    public static final Item MLM_AXE = registerItem("mlm_axe",
            new AxeItem(ModToolMaterial.MLM, 1, 1f, new FabricItemSettings()));

    public static final Item NONBINARY_AXE = registerItem("nonbinary_axe",
            new AxeItem(ModToolMaterial.NONBINARY, 1, 1f, new FabricItemSettings()));

    public static final Item PAN_AXE = registerItem("pan_axe",
            new AxeItem(ModToolMaterial.PAN, 1, 1f, new FabricItemSettings()));

    public static final Item QUEER_AXE = registerItem("queer_axe",
            new AxeItem(ModToolMaterial.QUEER, 1, 1f, new FabricItemSettings()));

    public static final Item TRANS_AXE = registerItem("trans_axe",
            new AxeItem(ModToolMaterial.TRANS, 1, 1f, new FabricItemSettings()));

    //================================================================================

    public static final Item AROACE_SHOVEL = registerItem("aroace_shovel",
            new ShovelItem(ModToolMaterial.AROACE, 1, 1f, new FabricItemSettings()));

    public static final Item BI_SHOVEL = registerItem("bi_shovel",
            new ShovelItem(ModToolMaterial.BI, 1, 1f, new FabricItemSettings()));

    public static final Item DEMIGENDER_SHOVEL= registerItem("demigender_shovel",
            new ShovelItem(ModToolMaterial.DEMIGENDER, 1, 1f, new FabricItemSettings()));

    public static final Item GENDERFLUID_SHOVEL= registerItem("genderfluid_shovel",
            new ShovelItem(ModToolMaterial.GENDERFLUID, 1, 1f, new FabricItemSettings()));

    public static final Item LESBIAN_SHOVEL = registerItem("lesbian_shovel",
            new ShovelItem(ModToolMaterial.LESBIAN, 1, 1f, new FabricItemSettings()));

    public static final Item MLM_SHOVEL = registerItem("mlm_shovel",
            new ShovelItem(ModToolMaterial.MLM, 1, 1f, new FabricItemSettings()));

    public static final Item NONBINARY_SHOVEL = registerItem("nonbinary_shovel",
            new ShovelItem(ModToolMaterial.NONBINARY, 1, 1f, new FabricItemSettings()));

    public static final Item PAN_SHOVEL = registerItem("pan_shovel",
            new ShovelItem(ModToolMaterial.PAN, 1, 1f, new FabricItemSettings()));

    public static final Item QUEER_SHOVEL = registerItem("queer_shovel",
            new ShovelItem(ModToolMaterial.QUEER, 1, 1f, new FabricItemSettings()));

    public static final Item TRANS_SHOVEL = registerItem("trans_shovel",
            new ShovelItem(ModToolMaterial.TRANS, 1, 1f, new FabricItemSettings()));

    //================================================================================

    public static final Item AROACE_HOE = registerItem("aroace_hoe",
            new HoeItem(ModToolMaterial.AROACE, 1, 1f, new FabricItemSettings()));

    public static final Item BI_HOE = registerItem("bi_hoe",
            new HoeItem(ModToolMaterial.BI, 1, 1f, new FabricItemSettings()));

    public static final Item DEMIGENDER_HOE = registerItem("demigender_hoe",
            new HoeItem(ModToolMaterial.DEMIGENDER, 1, 1f, new FabricItemSettings()));

    public static final Item GENDERFLUID_HOE = registerItem("genderfluid_hoe",
            new HoeItem(ModToolMaterial.GENDERFLUID, 1, 1f, new FabricItemSettings()));

    public static final Item LESBIAN_HOE = registerItem("lesbian_hoe",
            new HoeItem(ModToolMaterial.LESBIAN, 1, 1f, new FabricItemSettings()));

    public static final Item MLM_HOE = registerItem("mlm_hoe",
            new HoeItem(ModToolMaterial.MLM, 1, 1f, new FabricItemSettings()));

    public static final Item NONBINARY_HOE = registerItem("nonbinary_hoe",
            new HoeItem(ModToolMaterial.NONBINARY, 1, 1f, new FabricItemSettings()));

    public static final Item PAN_HOE = registerItem("pan_hoe",
            new HoeItem(ModToolMaterial.PAN, 1, 1f, new FabricItemSettings()));

    public static final Item QUEER_HOE = registerItem("queer_hoe",
            new HoeItem(ModToolMaterial.QUEER, 1, 1f, new FabricItemSettings()));

    public static final Item TRANS_HOE = registerItem("trans_hoe",
            new HoeItem(ModToolMaterial.TRANS, 1, 1f, new FabricItemSettings()));

    //================================================================================

    public static final Item AROACE_SWORD = registerItem("aroace_sword",
            new SwordItem(ModToolMaterial.AROACE, 1, 1f, new FabricItemSettings()));

    public static final Item BI_SWORD = registerItem("bi_sword",
            new SwordItem(ModToolMaterial.BI, 1, 1f, new FabricItemSettings()));

    public static final Item DEMIGENDER_SWORD = registerItem("demigender_sword",
            new SwordItem(ModToolMaterial.DEMIGENDER, 1, 1f, new FabricItemSettings()));

    public static final Item GENDERFLUID_SWORD = registerItem("genderfluid_sword",
            new SwordItem(ModToolMaterial.GENDERFLUID, 1, 1f, new FabricItemSettings()));

    public static final Item LESBIAN_SWORD = registerItem("lesbian_sword",
            new SwordItem(ModToolMaterial.LESBIAN, 1, 1f, new FabricItemSettings()));

    public static final Item MLM_SWORD = registerItem("mlm_sword",
            new SwordItem(ModToolMaterial.MLM, 1, 1f, new FabricItemSettings()));

    public static final Item NONBINARY_SWORD = registerItem("nonbinary_sword",
            new SwordItem(ModToolMaterial.NONBINARY, 1, 1f, new FabricItemSettings()));

    public static final Item PAN_SWORD = registerItem("pan_sword",
            new SwordItem(ModToolMaterial.PAN, 1, 1f, new FabricItemSettings()));

    public static final Item QUEER_SWORD = registerItem("queer_sword",
            new SwordItem(ModToolMaterial.QUEER, 1, 1f, new FabricItemSettings()));

    public static final Item TRANS_SWORD = registerItem("trans_sword",
            new SwordItem(ModToolMaterial.TRANS, 1, 1f, new FabricItemSettings()));

    //================================================================================
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(QueerCraft.MOD_ID, name),item);
    }

    public static void registerModItems(){
        QueerCraft.LOGGER.info("Registering mod items for " + QueerCraft.MOD_ID);
    }
}
