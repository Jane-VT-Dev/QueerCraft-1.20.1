package com.june.queercraft.datagen;

import com.june.queercraft.block.ModBlocks;
import com.june.queercraft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_STONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_DEEPSLATE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.AROACE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BASE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BI_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CYAN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEMIGENDER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GENDERFLUID_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREY_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LESBIAN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_BLUE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_GREY_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIME_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGENTA_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.NONBINARY_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_INGOT_1, Models.GENERATED);

        itemModelGenerator.register(ModItems.PICKAXE_INGOT_1, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICKAXE_INGOT_2, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICKAXE_INGOT_3, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICKAXE_INGOT_4, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICKAXE_INGOT_5, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICKAXE_INGOT_6, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICKAXE_INGOT_7, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICKAXE_INGOT_8, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICKAXE_INGOT_9, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICKAXE_INGOT_10, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICKAXE_INGOT_11, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICKAXE_INGOT_12, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICKAXE_INGOT_13, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICKAXE_INGOT_14, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICKAXE_INGOT_15, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICKAXE_INGOT_16, Models.GENERATED);
    }
}
