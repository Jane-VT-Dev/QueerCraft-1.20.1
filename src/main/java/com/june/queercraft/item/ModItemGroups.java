package com.june.queercraft.item;

import com.june.queercraft.QueerCraft;
import com.june.queercraft.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup QUEERCRAFT_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(QueerCraft.MOD_ID, "ingot_1"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.queercraft.ores"))
                    .icon(() -> new ItemStack(ModItems.INGOT_1)).entries((displayContext, entries) -> {

                        entries.add(ModItems.INGOT_1);
                        entries.add(ModItems.INGOT_2);
                        entries.add(ModItems.INGOT_3);
                        entries.add(ModItems.INGOT_4);
                        entries.add(ModItems.INGOT_5);
                        entries.add(ModItems.INGOT_6);
                        entries.add(ModItems.INGOT_7);
                        entries.add(ModItems.INGOT_8);
                        entries.add(ModItems.INGOT_9);
                        entries.add(ModItems.INGOT_10);
                        entries.add(ModItems.INGOT_11);
                        entries.add(ModItems.INGOT_12);
                        entries.add(ModItems.INGOT_13);
                        entries.add(ModItems.INGOT_14);
                        entries.add(ModItems.INGOT_15);
                        entries.add(ModItems.INGOT_16);

                        entries.add(ModItems.RAW_INGOT_1);
                        entries.add(ModItems.RAW_INGOT_2);
                        entries.add(ModItems.RAW_INGOT_3);
                        entries.add(ModItems.RAW_INGOT_4);
                        entries.add(ModItems.RAW_INGOT_5);
                        entries.add(ModItems.RAW_INGOT_6);
                        entries.add(ModItems.RAW_INGOT_7);
                        entries.add(ModItems.RAW_INGOT_8);
                        entries.add(ModItems.RAW_INGOT_9);
                        entries.add(ModItems.RAW_INGOT_10);
                        entries.add(ModItems.RAW_INGOT_11);
                        entries.add(ModItems.RAW_INGOT_12);
                        entries.add(ModItems.RAW_INGOT_13);
                        entries.add(ModItems.RAW_INGOT_14);
                        entries.add(ModItems.RAW_INGOT_15);
                        entries.add(ModItems.RAW_INGOT_16);

                        entries.add(ModBlocks.ORE_BLOCK_1);
                        entries.add(ModBlocks.ORE_BLOCK_2);
                        entries.add(ModBlocks.ORE_BLOCK_3);
                        entries.add(ModBlocks.ORE_BLOCK_4);
                        entries.add(ModBlocks.ORE_BLOCK_5);
                        entries.add(ModBlocks.ORE_BLOCK_6);
                        entries.add(ModBlocks.ORE_BLOCK_7);
                        entries.add(ModBlocks.ORE_BLOCK_8);
                        entries.add(ModBlocks.ORE_BLOCK_9);
                        entries.add(ModBlocks.ORE_BLOCK_10);
                        entries.add(ModBlocks.ORE_BLOCK_11);
                        entries.add(ModBlocks.ORE_BLOCK_12);
                        entries.add(ModBlocks.ORE_BLOCK_13);
                        entries.add(ModBlocks.ORE_BLOCK_14);
                        entries.add(ModBlocks.ORE_BLOCK_15);
                        entries.add(ModBlocks.ORE_BLOCK_16);

                    }).build());


    public static void registerItemGroups() {
        QueerCraft.LOGGER.info("Registering Item Groups for " + QueerCraft.MOD_ID);
    }
}
