package com.june.queercraft.item;

import com.june.queercraft.QueerCraft;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {



    public static final Item TEST_ITEM_1 = registerItem("test_item_1",new Item(new Item.Settings()));
    public static final Item TEST_ITEM_2 = registerItem("test_item_2",new Item(new Item.Settings()));
    public static final Item TEST_ITEM_3 = registerItem("test_item_3",new Item(new Item.Settings()));
    public static final Item TEST_ITEM_4 = registerItem("test_item_4",new Item(new Item.Settings()));
    public static final Item TEST_ITEM_5 = registerItem("test_item_5",new Item(new Item.Settings()));
    public static final Item TEST_ITEM_6 = registerItem("test_item_6",new Item(new Item.Settings()));
    public static final Item TEST_ITEM_7 = registerItem("test_item_7",new Item(new Item.Settings()));
    public static final Item TEST_ITEM_8 = registerItem("test_item_8",new Item(new Item.Settings()));
    public static final Item TEST_ITEM_9 = registerItem("test_item_9",new Item(new Item.Settings()));
    public static final Item TEST_ITEM_10 = registerItem("test_item_10",new Item(new Item.Settings()));
    public static final Item TEST_ITEM_11 = registerItem("test_item_11",new Item(new Item.Settings()));
    public static final Item TEST_ITEM_12 = registerItem("test_item_12",new Item(new Item.Settings()));
    public static final Item TEST_ITEM_13 = registerItem("test_item_13",new Item(new Item.Settings()));
    public static final Item TEST_ITEM_14 = registerItem("test_item_14",new Item(new Item.Settings()));
    public static final Item TEST_ITEM_15 = registerItem("test_item_15",new Item(new Item.Settings()));
    public static final Item TEST_ITEM_16 = registerItem("test_item_16",new Item(new Item.Settings()));








    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(QueerCraft.MOD_ID, name),item);
    }

    public static void registerModItems(){
        QueerCraft.LOGGER.info("Registering mod items for " + QueerCraft.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {

            fabricItemGroupEntries.add(TEST_ITEM_1);
            fabricItemGroupEntries.add(TEST_ITEM_2);
            fabricItemGroupEntries.add(TEST_ITEM_3);
            fabricItemGroupEntries.add(TEST_ITEM_4);
            fabricItemGroupEntries.add(TEST_ITEM_5);
            fabricItemGroupEntries.add(TEST_ITEM_6);
            fabricItemGroupEntries.add(TEST_ITEM_7);
            fabricItemGroupEntries.add(TEST_ITEM_8);
            fabricItemGroupEntries.add(TEST_ITEM_9);
            fabricItemGroupEntries.add(TEST_ITEM_10);
            fabricItemGroupEntries.add(TEST_ITEM_11);
            fabricItemGroupEntries.add(TEST_ITEM_12);
            fabricItemGroupEntries.add(TEST_ITEM_13);
            fabricItemGroupEntries.add(TEST_ITEM_14);
            fabricItemGroupEntries.add(TEST_ITEM_15);
            fabricItemGroupEntries.add(TEST_ITEM_16);

        });
    }
}
