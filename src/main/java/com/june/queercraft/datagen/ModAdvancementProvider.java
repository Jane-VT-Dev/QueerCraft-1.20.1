package com.june.queercraft.datagen;

import com.june.queercraft.QueerCraft;
import com.june.queercraft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.*;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.data.server.advancement.AdvancementProvider;
import net.minecraft.data.server.advancement.vanilla.VanillaAdventureTabAdvancementGenerator;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemStackSet;
import net.minecraft.item.Items;
import net.minecraft.recipe.Recipe;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModAdvancementProvider extends FabricAdvancementProvider {
    public ModAdvancementProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {


        Advancement.Builder.create()

                .display(new AdvancementDisplay(ItemStack.EMPTY,Text.literal("Display"),Text.literal("description"),null,AdvancementFrame.TASK,true,true,true))
                .criterion("got_brown_ingot",InventoryChangedCriterion.Conditions.items(ModItems.BROWN_INGOT))
                .rewards(AdvancementRewards.Builder.recipe(Identifier.of("queercraft","queecraft:data/recipes")));

    }
}
