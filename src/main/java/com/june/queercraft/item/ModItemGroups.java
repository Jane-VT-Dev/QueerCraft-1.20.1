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
            new Identifier(QueerCraft.MOD_ID, "queer_ingot"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.queercraft.ores"))
                    .icon(() -> new ItemStack(ModItems.AROACE_INGOT)).entries((displayContext, entries) -> {

                        entries.add(ModItems.AROACE_INGOT);
                        entries.add(ModItems.BROWN_INGOT);
                        entries.add(ModItems.BI_INGOT);
                        entries.add(ModItems.BLACK_INGOT);
                        entries.add(ModItems.BLUE_INGOT);
                        entries.add(ModItems.CYAN_INGOT);
                        entries.add(ModItems.DEMIGENDER_INGOT);
                        entries.add(ModItems.GENDERFLUID_INGOT);
                        entries.add(ModItems.GREEN_INGOT);
                        entries.add(ModItems.GRAY_INGOT);
                        entries.add(ModItems.LESBIAN_INGOT);
                        entries.add(ModItems.LIGHT_BLUE_INGOT);
                        entries.add(ModItems.LIGHT_GRAY_INGOT);
                        entries.add(ModItems.LIME_INGOT);
                        entries.add(ModItems.MAGENTA_INGOT);
                        entries.add(ModItems.MLM_INGOT);
                        entries.add(ModItems.NONBINARY_INGOT);
                        entries.add(ModItems.ORANGE_INGOT);
                        entries.add(ModItems.PAN_INGOT);
                        entries.add(ModItems.PINK_INGOT);
                        entries.add(ModItems.PURPLE_INGOT);
                        entries.add(ModItems.QUEER_INGOT);
                        entries.add(ModItems.RED_INGOT);
                        entries.add(ModItems.TRANS_INGOT);
                        entries.add(ModItems.WHITE_INGOT);
                        entries.add(ModItems.YELLOW_INGOT);

                        entries.add(ModBlocks.BROWN_STONE_ORE);
                        entries.add(ModBlocks.BROWN_DEEPSLATE_ORE);
                        entries.add(ModBlocks.RAW_BROWN_ORE_BLOCK);


                        entries.add(ModBlocks.AROACE_BLOCK);
                        entries.add(ModBlocks.BROWN_BLOCK);
                        entries.add(ModBlocks.BI_BLOCK);
                        entries.add(ModBlocks.BLACK_BLOCK);
                        entries.add(ModBlocks.BLUE_BLOCK);
                        entries.add(ModBlocks.CYAN_BLOCK);
                        entries.add(ModBlocks.DEMIGENDER_BLOCK);
                        entries.add(ModBlocks.GENDERFLUID_BLOCK);
                        entries.add(ModBlocks.GREEN_BLOCK);
                        entries.add(ModBlocks.GRAY_BLOCK);
                        entries.add(ModBlocks.LESBIAN_BLOCK);
                        entries.add(ModBlocks.LIGHT_BLUE_BLOCK);
                        entries.add(ModBlocks.LIGHT_GRAY_BLOCK);
                        entries.add(ModBlocks.LIME_BLOCK);
                        entries.add(ModBlocks.MAGENTA_BLOCK);
                        entries.add(ModBlocks.MLM_BLOCK);
                        entries.add(ModBlocks.NONBINARY_BLOCK);
                        entries.add(ModBlocks.ORANGE_BLOCK);
                        entries.add(ModBlocks.PAN_BLOCK);
                        entries.add(ModBlocks.PINK_BLOCK);
                        entries.add(ModBlocks.PURPLE_BLOCK);
                        entries.add(ModBlocks.QUEER_BLOCK);
                        entries.add(ModBlocks.RED_BLOCK);
                        entries.add(ModBlocks.TRANS_BLOCK);
                        entries.add(ModBlocks.WHITE_BLOCK);
                        entries.add(ModBlocks.YELLOW_BLOCK);

                    }).build());


    public static final ItemGroup QUEERCRAFT_ITEMS_TOOLS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(QueerCraft.MOD_ID, "queer_pickaxe"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.queercraft.tools"))
                    .icon(() -> new ItemStack(ModItems.QUEER_PICKAXE)).entries((displayContext, entries) -> {

                    entries.add(ModItems.AROACE_PICKAXE);
                    entries.add(ModItems.AROACE_AXE);
                    entries.add(ModItems.AROACE_SHOVEL);
                    entries.add(ModItems.AROACE_HOE);
                    entries.add(ModItems.BI_PICKAXE);
                    entries.add(ModItems.BI_AXE);
                    entries.add(ModItems.BI_SHOVEL);
                    entries.add(ModItems.BI_HOE);
                    entries.add(ModItems.DEMIGENDER_PICKAXE);
                    entries.add(ModItems.DEMIGENDER_AXE);
                    entries.add(ModItems.DEMIGENDER_SHOVEL);
                    entries.add(ModItems.DEMIGENDER_HOE);
                    entries.add(ModItems.GENDERFLUID_PICKAXE);
                    entries.add(ModItems.GENDERFLUID_AXE);
                    entries.add(ModItems.GENDERFLUID_SHOVEL);
                    entries.add(ModItems.GENDERFLUID_HOE);
                    entries.add(ModItems.LESBIAN_PICKAXE);
                    entries.add(ModItems.LESBIAN_AXE);
                    entries.add(ModItems.LESBIAN_SHOVEL);
                    entries.add(ModItems.LESBIAN_HOE);
                    entries.add(ModItems.MLM_PICKAXE);
                    entries.add(ModItems.MLM_AXE);
                    entries.add(ModItems.MLM_SHOVEL);
                    entries.add(ModItems.MLM_HOE);
                    entries.add(ModItems.NONBINARY_PICKAXE);
                    entries.add(ModItems.NONBINARY_AXE);
                    entries.add(ModItems.NONBINARY_SHOVEL);
                    entries.add(ModItems.NONBINARY_HOE);
                    entries.add(ModItems.PAN_PICKAXE);
                    entries.add(ModItems.PAN_AXE);
                    entries.add(ModItems.PAN_SHOVEL);
                    entries.add(ModItems.PAN_HOE);
                    entries.add(ModItems.QUEER_PICKAXE);
                    entries.add(ModItems.QUEER_AXE);
                    entries.add(ModItems.QUEER_SHOVEL);
                    entries.add(ModItems.QUEER_HOE);
                    entries.add(ModItems.TRANS_PICKAXE);
                    entries.add(ModItems.TRANS_AXE);
                    entries.add(ModItems.TRANS_SHOVEL);
                    entries.add(ModItems.TRANS_HOE);

                    }).build());

    public static final ItemGroup QUEERCRAFT_ITEMGROUP_WEAPONS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(QueerCraft.MOD_ID, "queer_sword"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.queercraft.ores"))
                    .icon(() -> new ItemStack(ModItems.QUEER_SWORD)).entries((displayContext, entries) -> {

                        entries.add(ModItems.AROACE_SWORD);
                        entries.add(ModItems.BI_SWORD);
                        entries.add(ModItems.DEMIGENDER_SWORD);
                        entries.add(ModItems.GENDERFLUID_SWORD);
                        entries.add(ModItems.LESBIAN_SWORD);
                        entries.add(ModItems.MLM_SWORD);
                        entries.add(ModItems.NONBINARY_SWORD);
                        entries.add(ModItems.PAN_SWORD);
                        entries.add(ModItems.QUEER_SWORD);
                        entries.add(ModItems.TRANS_SWORD);

                    }).build());
    public static final ItemGroup QUEERCRAFT_ITEMGROUP_ARMOR = Registry.register(Registries.ITEM_GROUP,
            new Identifier(QueerCraft.MOD_ID, "queer_chestplate"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.queercraft.armor"))
                    .icon(() -> new ItemStack(ModItems.AROACE_CHESTPLATE)).entries((displayContext, entries) -> {

                        entries.add(ModItems.AROACE_HELMET);
                        entries.add(ModItems.AROACE_CHESTPLATE);
                        entries.add(ModItems.AROACE_LEGGINGS);
                        entries.add(ModItems.AROACE_BOOTS);

                        entries.add(ModItems.BI_HELMET);
                        entries.add(ModItems.BI_CHESTPLATE);
                        entries.add(ModItems.BI_LEGGINGS);
                        entries.add(ModItems.BI_BOOTS);

                        entries.add(ModItems.DEMIGENDER_HELMET);
                        entries.add(ModItems.DEMIGENDER_CHESTPLATE);
                        entries.add(ModItems.DEMIGENDER_LEGGINGS);
                        entries.add(ModItems.DEMIGENDER_BOOTS);

                        entries.add(ModItems.GENDERFLUID_HELMET);
                        entries.add(ModItems.GENDERFLUID_CHESTPLATE);
                        entries.add(ModItems.GENDERFLUID_LEGGINGS);
                        entries.add(ModItems.GENDERFLUID_BOOTS);

                        entries.add(ModItems.LESBIAN_HELMET);
                        entries.add(ModItems.LESBIAN_CHESTPLATE);
                        entries.add(ModItems.LESBIAN_LEGGINGS);
                        entries.add(ModItems.LESBIAN_BOOTS);

                        entries.add(ModItems.MLM_HELMET);
                        entries.add(ModItems.MLM_CHESTPLATE);
                        entries.add(ModItems.MLM_LEGGINGS);
                        entries.add(ModItems.MLM_BOOTS);

                        entries.add(ModItems.NONBINARY_HELMET);
                        entries.add(ModItems.NONBINARY_CHESTPLATE);
                        entries.add(ModItems.NONBINARY_LEGGINGS);
                        entries.add(ModItems.NONBINARY_BOOTS);

                        entries.add(ModItems.PAN_HELMET);
                        entries.add(ModItems.PAN_CHESTPLATE);
                        entries.add(ModItems.PAN_LEGGINGS);
                        entries.add(ModItems.PAN_BOOTS);

                        entries.add(ModItems.QUEER_HELMET);
                        entries.add(ModItems.QUEER_CHESTPLATE);
                        entries.add(ModItems.QUEER_LEGGINGS);
                        entries.add(ModItems.QUEER_BOOTS);

                        entries.add(ModItems.TRANS_HELMET);
                        entries.add(ModItems.TRANS_CHESTPLATE);
                        entries.add(ModItems.TRANS_LEGGINGS);
                        entries.add(ModItems.TRANS_BOOTS);

                    }).build());

                        public static void registerItemGroups() {
        QueerCraft.LOGGER.info("Registering Item Groups for " + QueerCraft.MOD_ID);
    }
}
