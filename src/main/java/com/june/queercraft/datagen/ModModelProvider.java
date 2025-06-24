package com.june.queercraft.datagen;

import com.june.queercraft.block.ModBlocks;
import com.june.queercraft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_STONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_BROWN_ORE_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AROACE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BI_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEMIGENDER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GENDERFLUID_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LESBIAN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MLM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NONBINARY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PAN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUEER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TRANS_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CYAN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRAY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_BLUE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_GRAY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIME_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGENTA_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.AROACE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BROWN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BI_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CYAN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEMIGENDER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GENDERFLUID_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAY_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LESBIAN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_BLUE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_GRAY_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIME_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGENTA_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MLM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.NONBINARY_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PAN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.QUEER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.TRANS_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_BROWN_ORE, Models.GENERATED);

        itemModelGenerator.register(ModItems.AROACE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BI_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DEMIGENDER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GENDERFLUID_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LESBIAN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MLM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NONBINARY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PAN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.QUEER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TRANS_PICKAXE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.AROACE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BI_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DEMIGENDER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GENDERFLUID_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LESBIAN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MLM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NONBINARY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PAN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.QUEER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TRANS_AXE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.AROACE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BI_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DEMIGENDER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GENDERFLUID_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LESBIAN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MLM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NONBINARY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PAN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.QUEER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TRANS_SHOVEL, Models.HANDHELD);

        itemModelGenerator.register(ModItems.AROACE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BI_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DEMIGENDER_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GENDERFLUID_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LESBIAN_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MLM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NONBINARY_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PAN_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.QUEER_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TRANS_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.AROACE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BI_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DEMIGENDER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GENDERFLUID_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LESBIAN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MLM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NONBINARY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PAN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.QUEER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TRANS_SWORD, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AROACE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AROACE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AROACE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AROACE_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BI_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BI_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BI_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BI_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DEMIGENDER_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DEMIGENDER_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DEMIGENDER_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DEMIGENDER_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GENDERFLUID_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GENDERFLUID_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GENDERFLUID_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GENDERFLUID_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LESBIAN_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LESBIAN_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LESBIAN_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LESBIAN_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MLM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MLM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MLM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MLM_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NONBINARY_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NONBINARY_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NONBINARY_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NONBINARY_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PAN_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PAN_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PAN_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PAN_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.QUEER_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.QUEER_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.QUEER_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.QUEER_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TRANS_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TRANS_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TRANS_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TRANS_BOOTS));

    }
}
