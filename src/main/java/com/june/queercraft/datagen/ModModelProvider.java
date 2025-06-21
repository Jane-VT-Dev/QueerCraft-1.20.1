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

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORE_BLOCK_1);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORE_BLOCK_2);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORE_BLOCK_3);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORE_BLOCK_4);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORE_BLOCK_5);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORE_BLOCK_6);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORE_BLOCK_7);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORE_BLOCK_8);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORE_BLOCK_9);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORE_BLOCK_10);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORE_BLOCK_11);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORE_BLOCK_12);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORE_BLOCK_13);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORE_BLOCK_14);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORE_BLOCK_15);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORE_BLOCK_16);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.INGOT_1, Models.GENERATED);
        itemModelGenerator.register(ModItems.INGOT_2, Models.GENERATED);
        itemModelGenerator.register(ModItems.INGOT_3, Models.GENERATED);
        itemModelGenerator.register(ModItems.INGOT_4, Models.GENERATED);
        itemModelGenerator.register(ModItems.INGOT_5, Models.GENERATED);
        itemModelGenerator.register(ModItems.INGOT_6, Models.GENERATED);
        itemModelGenerator.register(ModItems.INGOT_7, Models.GENERATED);
        itemModelGenerator.register(ModItems.INGOT_8, Models.GENERATED);
        itemModelGenerator.register(ModItems.INGOT_9, Models.GENERATED);
        itemModelGenerator.register(ModItems.INGOT_10, Models.GENERATED);
        itemModelGenerator.register(ModItems.INGOT_11, Models.GENERATED);
        itemModelGenerator.register(ModItems.INGOT_12, Models.GENERATED);
        itemModelGenerator.register(ModItems.INGOT_13, Models.GENERATED);
        itemModelGenerator.register(ModItems.INGOT_14, Models.GENERATED);
        itemModelGenerator.register(ModItems.INGOT_15, Models.GENERATED);
        itemModelGenerator.register(ModItems.INGOT_16, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_INGOT_1, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_INGOT_2, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_INGOT_3, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_INGOT_4, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_INGOT_5, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_INGOT_6, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_INGOT_7, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_INGOT_8, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_INGOT_9, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_INGOT_10, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_INGOT_11, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_INGOT_12, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_INGOT_13, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_INGOT_14, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_INGOT_15, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_INGOT_16, Models.GENERATED);

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
