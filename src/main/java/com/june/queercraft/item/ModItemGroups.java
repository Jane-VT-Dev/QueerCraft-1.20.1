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


                        entries.add(ModItems.RAW_BROWN_ORE);

                        entries.add(ModBlocks.BROWN_STONE_ORE);
                        entries.add(ModBlocks.BROWN_DEEPSLATE_ORE);

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

                        public static void registerItemGroups() {
        QueerCraft.LOGGER.info("Registering Item Groups for " + QueerCraft.MOD_ID);
    }
}
