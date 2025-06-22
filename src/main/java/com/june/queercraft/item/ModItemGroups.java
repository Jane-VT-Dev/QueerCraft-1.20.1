package com.june.queercraft.item;

import com.june.queercraft.QueerCraft;
import com.june.queercraft.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup QUEERCRAFT_ITEMGROUP_ORES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(QueerCraft.MOD_ID, "ingot_1"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.queercraft.ores"))
                    .icon(() -> new ItemStack(ModItems.AROACE_INGOT)).entries((displayContext, entries) -> {

                        entries.add(ModItems.AROACE_INGOT);
                        entries.add(ModItems.BASE_INGOT);
                        entries.add(ModItems.BI_INGOT);
                        entries.add(ModItems.BLACK_INGOT);
                        entries.add(ModItems.BLUE_INGOT);
                        entries.add(ModItems.CYAN_INGOT);
                        entries.add(ModItems.DEMIGENDER_INGOT);
                        entries.add(ModItems.GENDERFLUID_INGOT);
                        entries.add(ModItems.GREEN_INGOT);
                        entries.add(ModItems.GREY_INGOT);
                        entries.add(ModItems.LESBIAN_INGOT);
                        entries.add(ModItems.LIGHT_BLUE_INGOT);
                        entries.add(ModItems.LIGHT_GREY_INGOT);
                        entries.add(ModItems.LIME_INGOT);
                        entries.add(ModItems.MAGENTA_INGOT);
                        entries.add(ModItems.NONBINARY_INGOT);

                        entries.add(ModItems.RAW_INGOT_1);

                        entries.add(ModBlocks.BROWN_STONE_ORE);
                        entries.add(ModBlocks.BROWN_DEEPSLATE_ORE);

                    }).build());


    public static final ItemGroup QUEERCRAFT_ITEMS_TOOLS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(QueerCraft.MOD_ID, "pickaxe_ingot_1"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.queercraft.tools"))
                    .icon(() -> new ItemStack(ModItems.PICKAXE_INGOT_1)).entries((displayContext, entries) -> {

                    entries.add(ModItems.PICKAXE_INGOT_1);
                    entries.add(ModItems.PICKAXE_INGOT_2);
                    entries.add(ModItems.PICKAXE_INGOT_3);
                    entries.add(ModItems.PICKAXE_INGOT_4);
                    entries.add(ModItems.PICKAXE_INGOT_5);
                    entries.add(ModItems.PICKAXE_INGOT_6);
                    entries.add(ModItems.PICKAXE_INGOT_7);
                    entries.add(ModItems.PICKAXE_INGOT_8);
                    entries.add(ModItems.PICKAXE_INGOT_9);
                    entries.add(ModItems.PICKAXE_INGOT_10);
                    entries.add(ModItems.PICKAXE_INGOT_11);
                    entries.add(ModItems.PICKAXE_INGOT_12);
                    entries.add(ModItems.PICKAXE_INGOT_13);
                    entries.add(ModItems.PICKAXE_INGOT_14);
                    entries.add(ModItems.PICKAXE_INGOT_15);
                    entries.add(ModItems.PICKAXE_INGOT_16);

                    }).build());

    public static void registerItemGroups() {
        QueerCraft.LOGGER.info("Registering Item Groups for " + QueerCraft.MOD_ID);
    }
}
