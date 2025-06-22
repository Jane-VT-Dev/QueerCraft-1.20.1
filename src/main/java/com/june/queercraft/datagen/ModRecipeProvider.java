package com.june.queercraft.datagen;

import com.june.queercraft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

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
                .criterion(hasItem(ModItems.BASE_INGOT),conditionsFromItem(ModItems.BASE_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.BI_INGOT,1)
                .pattern(" F ")
                .pattern("5L5")
                .pattern(" F ")
                .input('F', ModItems.MAGENTA_INGOT)
                .input('L', ModItems.PURPLE_INGOT)
                .input('5', ModItems.BLUE_INGOT)
                .criterion(hasItem(ModItems.BASE_INGOT),conditionsFromItem(ModItems.BASE_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.DEMIGENDER_INGOT,1)
                .pattern(" D ")
                .pattern("QPQ")
                .pattern(" A ")
                .input('D', ModItems.LIGHT_GREY_INGOT)
                .input('P', ModItems.WHITE_INGOT)
                .input('Q', ModItems.YELLOW_INGOT)
                .input('A', ModItems.GREY_INGOT)
                .criterion(hasItem(ModItems.BASE_INGOT),conditionsFromItem(ModItems.BASE_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.NONBINARY_INGOT,1)
                .pattern(" Q ")
                .pattern("LPL")
                .pattern(" 4 ")
                .input('Q', ModItems.YELLOW_INGOT)
                .input('P', ModItems.WHITE_INGOT)
                .input('L', ModItems.PURPLE_INGOT)
                .input('4', ModItems.BLACK_INGOT)
                .criterion(hasItem(ModItems.BASE_INGOT),conditionsFromItem(ModItems.BASE_INGOT))
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
                .criterion(hasItem(ModItems.BASE_INGOT),conditionsFromItem(ModItems.BASE_INGOT))
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
                .criterion(hasItem(ModItems.BASE_INGOT),conditionsFromItem(ModItems.BASE_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.MLM_INGOT,1)
                .pattern(" 6 ")
                .pattern("5P5")
                .pattern(" 6 ")
                .input('6', ModItems.CYAN_INGOT)
                .input('5', ModItems.BLUE_INGOT)
                .input('P', ModItems.WHITE_INGOT)
                .criterion(hasItem(ModItems.BASE_INGOT),conditionsFromItem(ModItems.BASE_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.PAN_INGOT,1)
                .pattern(" F ")
                .pattern("CQC")
                .pattern(" F ")
                .input('F', ModItems.MAGENTA_INGOT)
                .input('Q', ModItems.YELLOW_INGOT)
                .input('C', ModItems.LIGHT_BLUE_INGOT)
                .criterion(hasItem(ModItems.BASE_INGOT),conditionsFromItem(ModItems.BASE_INGOT))
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
                .criterion(hasItem(ModItems.BASE_INGOT),conditionsFromItem(ModItems.BASE_INGOT))
                .offerTo(exporter);

    }
}
