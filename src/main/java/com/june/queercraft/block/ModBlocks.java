package com.june.queercraft.block;

import com.june.queercraft.QueerCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BROWN_STONE_ORE = registerBlock("brown_stone_ore",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(0.7f,0.7f).solid()));

    public static final Block BROWN_DEEPSLATE_ORE = registerBlock("brown_deepslate_ore",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.DEEPSLATE).strength(0.7f,0.7f).solid()));

    public static final Block RAW_BROWN_ORE_BLOCK = registerBlock("raw_brown_ore_block",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(0.7f,0.7f).solid()));

    public static final Block BROWN_BLOCK = registerBlock("brown_block",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(0.7f,0.7f).solid()));

    public static final Block AROACE_BLOCK = registerBlock("aroace_block",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(0.7f,0.7f).solid()));

    public static final Block BI_BLOCK = registerBlock("bi_block",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(0.7f,0.7f).solid()));

    public static final Block BLACK_BLOCK = registerBlock("black_block",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(0.7f,0.7f).solid()));

    public static final Block BLUE_BLOCK = registerBlock("blue_block",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(0.7f,0.7f).solid()));

    public static final Block CYAN_BLOCK = registerBlock("cyan_block",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(0.7f,0.7f).solid()));

    public static final Block DEMIGENDER_BLOCK = registerBlock("demigender_block",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(0.7f,0.7f).solid()));

    public static final Block GENDERFLUID_BLOCK = registerBlock("genderfluid_block",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(0.7f,0.7f).solid()));

    public static final Block GREEN_BLOCK = registerBlock("green_block",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(0.7f,0.7f).solid()));

    public static final Block GRAY_BLOCK = registerBlock("gray_block",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(0.7f,0.7f).solid()));

    public static final Block LESBIAN_BLOCK = registerBlock("lesbian_block",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(0.7f,0.7f).solid()));

    public static final Block LIGHT_BLUE_BLOCK = registerBlock("light_blue_block",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(0.7f,0.7f).solid()));

    public static final Block LIGHT_GRAY_BLOCK = registerBlock("light_gray_block",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(0.7f,0.7f).solid()));

    public static final Block LIME_BLOCK = registerBlock("lime_block",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(0.7f,0.7f).solid()));

    public static final Block MAGENTA_BLOCK = registerBlock("magenta_block",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(0.7f,0.7f).solid()));

    public static final Block MLM_BLOCK = registerBlock("mlm_block",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(0.7f,0.7f).solid()));

    public static final Block NONBINARY_BLOCK = registerBlock("nonbinary_block",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(0.7f,0.7f).solid()));

    public static final Block ORANGE_BLOCK = registerBlock("orange_block",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(0.7f,0.7f).solid()));

    public static final Block PAN_BLOCK = registerBlock("pan_block",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(0.7f,0.7f).solid()));

    public static final Block PINK_BLOCK = registerBlock("pink_block",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(0.7f,0.7f).solid()));

    public static final Block PURPLE_BLOCK = registerBlock("purple_block",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(0.7f,0.7f).solid()));

    public static final Block QUEER_BLOCK = registerBlock("queer_block",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(0.7f,0.7f).solid()));

    public static final Block RED_BLOCK = registerBlock("red_block",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(0.7f,0.7f).solid()));

    public static final Block TRANS_BLOCK = registerBlock("trans_block",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(0.7f,0.7f).solid()));

    public static final Block WHITE_BLOCK = registerBlock("white_block",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(0.7f,0.7f).solid()));

    public static final Block YELLOW_BLOCK = registerBlock("yellow_block",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(0.7f,0.7f).solid()));



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
