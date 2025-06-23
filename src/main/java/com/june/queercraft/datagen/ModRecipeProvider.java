package com.june.queercraft.datagen;

import com.june.queercraft.block.ModBlocks;
import com.june.queercraft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.SmeltingRecipe;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.AROACE_INGOT,1)
                .pattern(" 9 ")
                .pattern("LPL")
                .pattern(" E ")
                .input('9', ModItems.GREEN_INGOT)
                .input('L', ModItems.PURPLE_INGOT)
                .input('P', ModItems.WHITE_INGOT)
                .input('E', ModItems.LIME_INGOT)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.BI_INGOT,1)
                .pattern(" F ")
                .pattern("5L5")
                .pattern(" F ")
                .input('F', ModItems.MAGENTA_INGOT)
                .input('L', ModItems.PURPLE_INGOT)
                .input('5', ModItems.BLUE_INGOT)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.DEMIGENDER_INGOT,1)
                .pattern(" D ")
                .pattern("QPQ")
                .pattern(" A ")
                .input('D', ModItems.LIGHT_GRAY_INGOT)
                .input('P', ModItems.WHITE_INGOT)
                .input('Q', ModItems.YELLOW_INGOT)
                .input('A', ModItems.GRAY_INGOT)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.NONBINARY_INGOT,1)
                .pattern(" Q ")
                .pattern("LPL")
                .pattern(" 4 ")
                .input('Q', ModItems.YELLOW_INGOT)
                .input('P', ModItems.WHITE_INGOT)
                .input('L', ModItems.PURPLE_INGOT)
                .input('4', ModItems.BLACK_INGOT)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.GENDERFLUID_INGOT,1)
                .pattern(" K ")
                .pattern("4LP")
                .pattern(" 5 ")
                .input('K', ModItems.PINK_INGOT)
                .input('P', ModItems.WHITE_INGOT)
                .input('L', ModItems.PURPLE_INGOT)
                .input('4', ModItems.BLACK_INGOT)
                .input('5', ModItems.BLUE_INGOT)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.LESBIAN_INGOT,1)
                .pattern(" N ")
                .pattern("FPI")
                .pattern(" L ")
                .input('N', ModItems.RED_INGOT)
                .input('F', ModItems.MAGENTA_INGOT)
                .input('P', ModItems.WHITE_INGOT)
                .input('I', ModItems.ORANGE_INGOT)
                .input('L', ModItems.PURPLE_INGOT)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.MLM_INGOT,1)
                .pattern(" 6 ")
                .pattern("5P5")
                .pattern(" 6 ")
                .input('6', ModItems.CYAN_INGOT)
                .input('5', ModItems.BLUE_INGOT)
                .input('P', ModItems.WHITE_INGOT)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.PAN_INGOT,1)
                .pattern(" F ")
                .pattern("CQC")
                .pattern(" F ")
                .input('F', ModItems.MAGENTA_INGOT)
                .input('Q', ModItems.YELLOW_INGOT)
                .input('C', ModItems.LIGHT_BLUE_INGOT)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.QUEER_INGOT,1)
                .pattern("1B8")
                .pattern("G73")
                .pattern("HOJ")
                .input('1', ModItems.AROACE_INGOT)
                .input('B', ModItems.LESBIAN_INGOT)
                .input('8', ModItems.GENDERFLUID_INGOT)
                .input('G', ModItems.MLM_INGOT)
                .input('7', ModItems.DEMIGENDER_INGOT)
                .input('3', ModItems.BI_INGOT)
                .input('H', ModItems.NONBINARY_INGOT)
                .input('O', ModItems.TRANS_INGOT)
                .input('J', ModItems.PAN_INGOT)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.TRANS_INGOT,1)
                .pattern(" K ")
                .pattern("CPC")
                .pattern(" K ")
                .input('K', ModItems.PINK_INGOT)
                .input('P', ModItems.WHITE_INGOT)
                .input('C', ModItems.LIGHT_BLUE_INGOT)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        //================================================================================

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_BROWN_ORE, RecipeCategory.DECORATIONS,
                ModBlocks.RAW_BROWN_ORE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BROWN_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.BROWN_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BLACK_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.BLACK_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BLUE_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.BLUE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CYAN_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.CYAN_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.GREEN_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.GREEN_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.GRAY_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.GRAY_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.LIGHT_BLUE_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.LIGHT_BLUE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.LIGHT_GRAY_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.LIGHT_GRAY_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.LIME_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.LIME_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MAGENTA_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.MAGENTA_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ORANGE_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.ORANGE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PINK_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.PINK_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PURPLE_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.PURPLE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RED_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.RED_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.WHITE_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.WHITE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.YELLOW_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.YELLOW_BLOCK);

        //================================================================================

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.AROACE_PICKAXE,1)
                .pattern(" 1 ")
                .pattern("101")
                .pattern(" 1 ")
                .input('1', ModItems.AROACE_INGOT)
                .input('0', Items.NETHERITE_PICKAXE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.BI_PICKAXE,1)
                .pattern(" 3 ")
                .pattern("303")
                .pattern(" 3 ")
                .input('3', ModItems.BI_INGOT)
                .input('0', Items.NETHERITE_PICKAXE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.DEMIGENDER_PICKAXE,1)
                .pattern(" 7 ")
                .pattern("707")
                .pattern(" 7 ")
                .input('7', ModItems.DEMIGENDER_INGOT)
                .input('0', Items.NETHERITE_PICKAXE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.GENDERFLUID_PICKAXE,1)
                .pattern(" 8 ")
                .pattern("808")
                .pattern(" 8 ")
                .input('8', ModItems.GENDERFLUID_INGOT)
                .input('0', Items.NETHERITE_PICKAXE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.LESBIAN_PICKAXE,1)
                .pattern(" B ")
                .pattern("B0B")
                .pattern(" B ")
                .input('B', ModItems.LESBIAN_INGOT)
                .input('0', Items.NETHERITE_PICKAXE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.MLM_PICKAXE,1)
                .pattern(" G ")
                .pattern("G0G")
                .pattern(" G ")
                .input('G', ModItems.MLM_INGOT)
                .input('0', Items.NETHERITE_PICKAXE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.NONBINARY_PICKAXE,1)
                .pattern(" H ")
                .pattern("H0H")
                .pattern(" H ")
                .input('H', ModItems.NONBINARY_INGOT)
                .input('0', Items.NETHERITE_PICKAXE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.PAN_PICKAXE,1)
                .pattern(" J ")
                .pattern("J0J")
                .pattern(" J ")
                .input('J', ModItems.PAN_INGOT)
                .input('0', Items.NETHERITE_PICKAXE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.QUEER_PICKAXE,1)
                .pattern(" M ")
                .pattern("M0M")
                .pattern(" M ")
                .input('M', ModItems.QUEER_INGOT)
                .input('0', Items.NETHERITE_PICKAXE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.TRANS_PICKAXE,1)
                .pattern(" O ")
                .pattern("O0O")
                .pattern(" O ")
                .input('O', ModItems.TRANS_INGOT)
                .input('0', Items.NETHERITE_PICKAXE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        //================================================================================

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.AROACE_SHOVEL,1)
                .pattern(" 1 ")
                .pattern("101")
                .pattern(" 1 ")
                .input('1', ModItems.AROACE_INGOT)
                .input('0', Items.NETHERITE_SHOVEL)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.BI_SHOVEL,1)
                .pattern(" 3 ")
                .pattern("303")
                .pattern(" 3 ")
                .input('3', ModItems.BI_INGOT)
                .input('0', Items.NETHERITE_SHOVEL)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.DEMIGENDER_SHOVEL,1)
                .pattern(" 7 ")
                .pattern("707")
                .pattern(" 7 ")
                .input('7', ModItems.DEMIGENDER_INGOT)
                .input('0', Items.NETHERITE_SHOVEL)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.GENDERFLUID_SHOVEL,1)
                .pattern(" 8 ")
                .pattern("808")
                .pattern(" 8 ")
                .input('8', ModItems.GENDERFLUID_INGOT)
                .input('0', Items.NETHERITE_SHOVEL)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.LESBIAN_SHOVEL,1)
                .pattern(" B ")
                .pattern("B0B")
                .pattern(" B ")
                .input('B', ModItems.LESBIAN_INGOT)
                .input('0', Items.NETHERITE_SHOVEL)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.MLM_SHOVEL,1)
                .pattern(" G ")
                .pattern("G0G")
                .pattern(" G ")
                .input('G', ModItems.MLM_INGOT)
                .input('0', Items.NETHERITE_SHOVEL)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.NONBINARY_SHOVEL,1)
                .pattern(" H ")
                .pattern("H0H")
                .pattern(" H ")
                .input('H', ModItems.NONBINARY_INGOT)
                .input('0', Items.NETHERITE_SHOVEL)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.PAN_SHOVEL,1)
                .pattern(" J ")
                .pattern("J0J")
                .pattern(" J ")
                .input('J', ModItems.PAN_INGOT)
                .input('0', Items.NETHERITE_SHOVEL)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.QUEER_SHOVEL,1)
                .pattern(" M ")
                .pattern("M0M")
                .pattern(" M ")
                .input('M', ModItems.QUEER_INGOT)
                .input('0', Items.NETHERITE_SHOVEL)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.TRANS_SHOVEL,1)
                .pattern(" O ")
                .pattern("O0O")
                .pattern(" O ")
                .input('O', ModItems.TRANS_INGOT)
                .input('0', Items.NETHERITE_SHOVEL)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        //================================================================================

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.AROACE_AXE,1)
                .pattern(" 1 ")
                .pattern("101")
                .pattern(" 1 ")
                .input('1', ModItems.AROACE_INGOT)
                .input('0', Items.NETHERITE_AXE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.BI_AXE,1)
                .pattern(" 3 ")
                .pattern("303")
                .pattern(" 3 ")
                .input('3', ModItems.BI_INGOT)
                .input('0', Items.NETHERITE_AXE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.DEMIGENDER_AXE,1)
                .pattern(" 7 ")
                .pattern("707")
                .pattern(" 7 ")
                .input('7', ModItems.DEMIGENDER_INGOT)
                .input('0', Items.NETHERITE_AXE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.GENDERFLUID_AXE,1)
                .pattern(" 8 ")
                .pattern("808")
                .pattern(" 8 ")
                .input('8', ModItems.GENDERFLUID_INGOT)
                .input('0', Items.NETHERITE_AXE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.LESBIAN_AXE,1)
                .pattern(" B ")
                .pattern("B0B")
                .pattern(" B ")
                .input('B', ModItems.LESBIAN_INGOT)
                .input('0', Items.NETHERITE_AXE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.MLM_AXE,1)
                .pattern(" G ")
                .pattern("G0G")
                .pattern(" G ")
                .input('G', ModItems.MLM_INGOT)
                .input('0', Items.NETHERITE_AXE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.NONBINARY_AXE,1)
                .pattern(" H ")
                .pattern("H0H")
                .pattern(" H ")
                .input('H', ModItems.NONBINARY_INGOT)
                .input('0', Items.NETHERITE_AXE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.PAN_AXE,1)
                .pattern(" J ")
                .pattern("J0J")
                .pattern(" J ")
                .input('J', ModItems.PAN_INGOT)
                .input('0', Items.NETHERITE_AXE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.QUEER_AXE,1)
                .pattern(" M ")
                .pattern("M0M")
                .pattern(" M ")
                .input('M', ModItems.QUEER_INGOT)
                .input('0', Items.NETHERITE_AXE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.TRANS_AXE,1)
                .pattern(" O ")
                .pattern("O0O")
                .pattern(" O ")
                .input('O', ModItems.TRANS_INGOT)
                .input('0', Items.NETHERITE_AXE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        //================================================================================

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.AROACE_HOE,1)
                .pattern(" 1 ")
                .pattern("101")
                .pattern(" 1 ")
                .input('1', ModItems.AROACE_INGOT)
                .input('0', Items.NETHERITE_HOE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.BI_HOE,1)
                .pattern(" 3 ")
                .pattern("303")
                .pattern(" 3 ")
                .input('3', ModItems.BI_INGOT)
                .input('0', Items.NETHERITE_HOE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.DEMIGENDER_HOE,1)
                .pattern(" 7 ")
                .pattern("707")
                .pattern(" 7 ")
                .input('7', ModItems.DEMIGENDER_INGOT)
                .input('0', Items.NETHERITE_HOE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.GENDERFLUID_HOE,1)
                .pattern(" 8 ")
                .pattern("808")
                .pattern(" 8 ")
                .input('8', ModItems.GENDERFLUID_INGOT)
                .input('0', Items.NETHERITE_HOE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.LESBIAN_HOE,1)
                .pattern(" B ")
                .pattern("B0B")
                .pattern(" B ")
                .input('B', ModItems.LESBIAN_INGOT)
                .input('0', Items.NETHERITE_HOE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.MLM_HOE,1)
                .pattern(" G ")
                .pattern("G0G")
                .pattern(" G ")
                .input('G', ModItems.MLM_INGOT)
                .input('0', Items.NETHERITE_HOE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.NONBINARY_HOE,1)
                .pattern(" H ")
                .pattern("H0H")
                .pattern(" H ")
                .input('H', ModItems.NONBINARY_INGOT)
                .input('0', Items.NETHERITE_HOE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.PAN_HOE,1)
                .pattern(" J ")
                .pattern("J0J")
                .pattern(" J ")
                .input('J', ModItems.PAN_INGOT)
                .input('0', Items.NETHERITE_HOE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.QUEER_HOE,1)
                .pattern(" M ")
                .pattern("M0M")
                .pattern(" M ")
                .input('M', ModItems.QUEER_INGOT)
                .input('0', Items.NETHERITE_HOE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.TRANS_HOE,1)
                .pattern(" O ")
                .pattern("O0O")
                .pattern(" O ")
                .input('O', ModItems.TRANS_INGOT)
                .input('0', Items.NETHERITE_HOE)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        //================================================================================

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.AROACE_SWORD,1)
                .pattern(" 1 ")
                .pattern("101")
                .pattern(" 1 ")
                .input('1', ModItems.AROACE_INGOT)
                .input('0', Items.NETHERITE_SWORD)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.BI_SWORD,1)
                .pattern(" 3 ")
                .pattern("303")
                .pattern(" 3 ")
                .input('3', ModItems.BI_INGOT)
                .input('0', Items.NETHERITE_SWORD)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.DEMIGENDER_SWORD,1)
                .pattern(" 7 ")
                .pattern("707")
                .pattern(" 7 ")
                .input('7', ModItems.DEMIGENDER_INGOT)
                .input('0', Items.NETHERITE_SWORD)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.GENDERFLUID_SWORD,1)
                .pattern(" 8 ")
                .pattern("808")
                .pattern(" 8 ")
                .input('8', ModItems.GENDERFLUID_INGOT)
                .input('0', Items.NETHERITE_SWORD)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.LESBIAN_SWORD,1)
                .pattern(" B ")
                .pattern("B0B")
                .pattern(" B ")
                .input('B', ModItems.LESBIAN_INGOT)
                .input('0', Items.NETHERITE_SWORD)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.MLM_SWORD,1)
                .pattern(" G ")
                .pattern("G0G")
                .pattern(" G ")
                .input('G', ModItems.MLM_INGOT)
                .input('0', Items.NETHERITE_SWORD)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.NONBINARY_SWORD,1)
                .pattern(" H ")
                .pattern("H0H")
                .pattern(" H ")
                .input('H', ModItems.NONBINARY_INGOT)
                .input('0', Items.NETHERITE_SWORD)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.PAN_SWORD,1)
                .pattern(" J ")
                .pattern("J0J")
                .pattern(" J ")
                .input('J', ModItems.PAN_INGOT)
                .input('0', Items.NETHERITE_SWORD)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.QUEER_SWORD,1)
                .pattern(" M ")
                .pattern("M0M")
                .pattern(" M ")
                .input('M', ModItems.QUEER_INGOT)
                .input('0', Items.NETHERITE_SWORD)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.TRANS_SWORD,1)
                .pattern(" O ")
                .pattern("O0O")
                .pattern(" O ")
                .input('O', ModItems.TRANS_INGOT)
                .input('0', Items.NETHERITE_SWORD)
                .criterion(hasItem(ModItems.BROWN_INGOT),conditionsFromItem(ModItems.BROWN_INGOT))
                .offerTo(exporter);

    }
}
