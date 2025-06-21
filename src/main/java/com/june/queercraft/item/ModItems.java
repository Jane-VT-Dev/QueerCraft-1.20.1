package com.june.queercraft.item;

import com.june.queercraft.QueerCraft;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    public static final Item INGOT_1 = registerItem("ingot_1",new Item(new Item.Settings()));
    public static final Item INGOT_2 = registerItem("ingot_2",new Item(new Item.Settings()));
    public static final Item INGOT_3 = registerItem("ingot_3",new Item(new Item.Settings()));
    public static final Item INGOT_4 = registerItem("ingot_4",new Item(new Item.Settings()));
    public static final Item INGOT_5 = registerItem("ingot_5",new Item(new Item.Settings()));
    public static final Item INGOT_6 = registerItem("ingot_6",new Item(new Item.Settings()));
    public static final Item INGOT_7 = registerItem("ingot_7",new Item(new Item.Settings()));
    public static final Item INGOT_8 = registerItem("ingot_8",new Item(new Item.Settings()));
    public static final Item INGOT_9 = registerItem("ingot_9",new Item(new Item.Settings()));
    public static final Item INGOT_10 = registerItem("ingot_10",new Item(new Item.Settings()));
    public static final Item INGOT_11 = registerItem("ingot_11",new Item(new Item.Settings()));
    public static final Item INGOT_12 = registerItem("ingot_12",new Item(new Item.Settings()));
    public static final Item INGOT_13 = registerItem("ingot_13",new Item(new Item.Settings()));
    public static final Item INGOT_14 = registerItem("ingot_14",new Item(new Item.Settings()));
    public static final Item INGOT_15 = registerItem("ingot_15",new Item(new Item.Settings()));
    public static final Item INGOT_16 = registerItem("ingot_16",new Item(new Item.Settings()));

    public static final Item RAW_INGOT_1 = registerItem("raw_ingot_1",new Item(new Item.Settings()));
    public static final Item RAW_INGOT_2 = registerItem("raw_ingot_2",new Item(new Item.Settings()));
    public static final Item RAW_INGOT_3 = registerItem("raw_ingot_3",new Item(new Item.Settings()));
    public static final Item RAW_INGOT_4 = registerItem("raw_ingot_4",new Item(new Item.Settings()));
    public static final Item RAW_INGOT_5 = registerItem("raw_ingot_5",new Item(new Item.Settings()));
    public static final Item RAW_INGOT_6 = registerItem("raw_ingot_6",new Item(new Item.Settings()));
    public static final Item RAW_INGOT_7 = registerItem("raw_ingot_7",new Item(new Item.Settings()));
    public static final Item RAW_INGOT_8 = registerItem("raw_ingot_8",new Item(new Item.Settings()));
    public static final Item RAW_INGOT_9 = registerItem("raw_ingot_9",new Item(new Item.Settings()));
    public static final Item RAW_INGOT_10 = registerItem("raw_ingot_10",new Item(new Item.Settings()));
    public static final Item RAW_INGOT_11 = registerItem("raw_ingot_11",new Item(new Item.Settings()));
    public static final Item RAW_INGOT_12 = registerItem("raw_ingot_12",new Item(new Item.Settings()));
    public static final Item RAW_INGOT_13 = registerItem("raw_ingot_13",new Item(new Item.Settings()));
    public static final Item RAW_INGOT_14 = registerItem("raw_ingot_14",new Item(new Item.Settings()));
    public static final Item RAW_INGOT_15 = registerItem("raw_ingot_15",new Item(new Item.Settings()));
    public static final Item RAW_INGOT_16 = registerItem("raw_ingot_16",new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(QueerCraft.MOD_ID, name),item);
    }

    public static void registerModItems(){
        QueerCraft.LOGGER.info("Registering mod items for " + QueerCraft.MOD_ID);
    }
}
