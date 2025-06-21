package com.june.queercraft.block;

import com.june.queercraft.QueerCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block ORE_BLOCK_1 = registerBlock("ore_block_1",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(3.0F)));

    public static final Block ORE_BLOCK_2 = registerBlock("ore_block_2",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(3.0F)));

    public static final Block ORE_BLOCK_3 = registerBlock("ore_block_3",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(3.0F)));

    public static final Block ORE_BLOCK_4 = registerBlock("ore_block_4",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(3.0F)));

    public static final Block ORE_BLOCK_5 = registerBlock("ore_block_5",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(3.0F)));

    public static final Block ORE_BLOCK_6 = registerBlock("ore_block_6",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(3.0F)));

    public static final Block ORE_BLOCK_7 = registerBlock("ore_block_7",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(3.0F)));

    public static final Block ORE_BLOCK_8 = registerBlock("ore_block_8",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(3.0F)));

    public static final Block ORE_BLOCK_9 = registerBlock("ore_block_9",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(3.0F)));

    public static final Block ORE_BLOCK_10 = registerBlock("ore_block_10",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(3.0F)));

    public static final Block ORE_BLOCK_11 = registerBlock("ore_block_11",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(3.0F)));

    public static final Block ORE_BLOCK_12 = registerBlock("ore_block_12",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(3.0F)));

    public static final Block ORE_BLOCK_13 = registerBlock("ore_block_13",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(3.0F)));

    public static final Block ORE_BLOCK_14 = registerBlock("ore_block_14",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(3.0F)));

    public static final Block ORE_BLOCK_15 = registerBlock("ore_block_15",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(3.0F)));

    public static final Block ORE_BLOCK_16 = registerBlock("ore_block_16",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(3.0F)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(QueerCraft.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(QueerCraft.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));


    }

    public static void registerModBlocks() {
        QueerCraft.LOGGER.info("Registering ModBlocks for " + QueerCraft.MOD_ID);
    }
}
