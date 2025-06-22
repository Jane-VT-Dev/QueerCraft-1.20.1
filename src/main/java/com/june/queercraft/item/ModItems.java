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


    public static final Item RAW_INGOT_1 = registerItem("raw_ingot_1",new Item(new FabricItemSettings()));


    public static final Item PICKAXE_INGOT_1 = registerItem("pickaxe_ingot_1",
            new PickaxeItem(ModToolMaterial.INGOT_1, 2, -3f, new FabricItemSettings()));

    public static final Item PICKAXE_INGOT_2 = registerItem("pickaxe_ingot_2",
            new PickaxeItem(ModToolMaterial.INGOT_2, 2, -2.8f, new FabricItemSettings()));

    public static final Item PICKAXE_INGOT_3 = registerItem("pickaxe_ingot_3",
            new PickaxeItem(ModToolMaterial.INGOT_3, 2, -2.8f, new FabricItemSettings()));

    public static final Item PICKAXE_INGOT_4 = registerItem("pickaxe_ingot_4",
            new PickaxeItem(ModToolMaterial.INGOT_4, 2, -2.8f, new FabricItemSettings()));

    public static final Item PICKAXE_INGOT_5 = registerItem("pickaxe_ingot_5",
            new PickaxeItem(ModToolMaterial.INGOT_5, 2, -2.8f, new FabricItemSettings()));

    public static final Item PICKAXE_INGOT_6 = registerItem("pickaxe_ingot_6",
            new PickaxeItem(ModToolMaterial.INGOT_6, 2, -2.8f, new FabricItemSettings()));

    public static final Item PICKAXE_INGOT_7 = registerItem("pickaxe_ingot_7",
            new PickaxeItem(ModToolMaterial.INGOT_7, 2, -2.8f, new FabricItemSettings()));

    public static final Item PICKAXE_INGOT_8 = registerItem("pickaxe_ingot_8",
            new PickaxeItem(ModToolMaterial.INGOT_8, 2, -2.8f, new FabricItemSettings()));

    public static final Item PICKAXE_INGOT_9 = registerItem("pickaxe_ingot_9",
            new PickaxeItem(ModToolMaterial.INGOT_9, 2, -2.8f, new FabricItemSettings()));

    public static final Item PICKAXE_INGOT_10 = registerItem("pickaxe_ingot_10",
            new PickaxeItem(ModToolMaterial.INGOT_10, 2, -2.8f, new FabricItemSettings()));

    public static final Item PICKAXE_INGOT_11 = registerItem("pickaxe_ingot_11",
            new PickaxeItem(ModToolMaterial.INGOT_11, 2, -2.8f, new FabricItemSettings()));

    public static final Item PICKAXE_INGOT_12 = registerItem("pickaxe_ingot_12",
            new PickaxeItem(ModToolMaterial.INGOT_12, 2, -2.8f, new FabricItemSettings()));

    public static final Item PICKAXE_INGOT_13 = registerItem("pickaxe_ingot_13",
            new PickaxeItem(ModToolMaterial.INGOT_13, 2, -2.8f, new FabricItemSettings()));

    public static final Item PICKAXE_INGOT_14 = registerItem("pickaxe_ingot_14",
            new PickaxeItem(ModToolMaterial.INGOT_14, 2, -2.8f, new FabricItemSettings()));

    public static final Item PICKAXE_INGOT_15 = registerItem("pickaxe_ingot_15",
            new PickaxeItem(ModToolMaterial.INGOT_15, 2, -2.8f, new FabricItemSettings()));

    public static final Item PICKAXE_INGOT_16 = registerItem("pickaxe_ingot_16",
            new PickaxeItem(ModToolMaterial.INGOT_16, 2, -2.8f, new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(QueerCraft.MOD_ID, name),item);
    }

    public static void registerModItems(){
        QueerCraft.LOGGER.info("Registering mod items for " + QueerCraft.MOD_ID);
    }
}
