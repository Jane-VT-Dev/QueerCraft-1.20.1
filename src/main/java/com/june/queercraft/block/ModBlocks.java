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

    public static final Block BROWN_STONE_ORE = registerBlock("brown_stone_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.COAL_ORE).strength(3.0F)));

    public static final Block BROWN_DEEPSLATE_ORE = registerBlock("brown_deepslate_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COAL_ORE).strength(3.0F)));



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
