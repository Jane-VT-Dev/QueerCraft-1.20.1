package com.june.queercraft.datagen;

import com.june.queercraft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ItemTags.TOOLS)

                .add(ModItems.AROACE_AXE)
                .add(ModItems.AROACE_PICKAXE)
                .add(ModItems.AROACE_SHOVEL)
                .add(ModItems.AROACE_HOE)

                .add(ModItems.BI_AXE)
                .add(ModItems.BI_PICKAXE)
                .add(ModItems.BI_SHOVEL)
                .add(ModItems.BI_HOE)

                .add(ModItems.DEMIGENDER_AXE)
                .add(ModItems.DEMIGENDER_PICKAXE)
                .add(ModItems.DEMIGENDER_SHOVEL)
                .add(ModItems.DEMIGENDER_HOE)

                .add(ModItems.GENDERFLUID_AXE)
                .add(ModItems.GENDERFLUID_PICKAXE)
                .add(ModItems.GENDERFLUID_SHOVEL)
                .add(ModItems.GENDERFLUID_HOE)

                .add(ModItems.LESBIAN_AXE)
                .add(ModItems.LESBIAN_PICKAXE)
                .add(ModItems.LESBIAN_SHOVEL)
                .add(ModItems.LESBIAN_HOE)

                .add(ModItems.MLM_AXE)
                .add(ModItems.MLM_PICKAXE)
                .add(ModItems.MLM_SHOVEL)
                .add(ModItems.MLM_HOE)

                .add(ModItems.NONBINARY_AXE)
                .add(ModItems.NONBINARY_PICKAXE)
                .add(ModItems.NONBINARY_SHOVEL)
                .add(ModItems.NONBINARY_HOE)

                .add(ModItems.PAN_AXE)
                .add(ModItems.PAN_PICKAXE)
                .add(ModItems.PAN_SHOVEL)
                .add(ModItems.PAN_HOE)

                .add(ModItems.QUEER_AXE)
                .add(ModItems.QUEER_PICKAXE)
                .add(ModItems.QUEER_SHOVEL)
                .add(ModItems.QUEER_HOE)

                .add(ModItems.TRANS_AXE)
                .add(ModItems.TRANS_PICKAXE)
                .add(ModItems.TRANS_SHOVEL)
                .add(ModItems.TRANS_HOE);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.AROACE_SWORD)
                .add(ModItems.BI_SWORD)
                .add(ModItems.DEMIGENDER_SWORD)
                .add(ModItems.GENDERFLUID_SWORD)
                .add(ModItems.LESBIAN_SWORD)
                .add(ModItems.MLM_SWORD)
                .add(ModItems.NONBINARY_SWORD)
                .add(ModItems.PAN_SWORD)
                .add(ModItems.QUEER_SWORD)
                .add(ModItems.PAN_SWORD)
                .add(ModItems.TRANS_SWORD);


        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.AROACE_AXE)
                .add(ModItems.BI_AXE)
                .add(ModItems.DEMIGENDER_AXE)
                .add(ModItems.GENDERFLUID_AXE)
                .add(ModItems.LESBIAN_AXE)
                .add(ModItems.MLM_AXE)
                .add(ModItems.NONBINARY_AXE)
                .add(ModItems.PAN_AXE)
                .add(ModItems.QUEER_AXE)
                .add(ModItems.TRANS_AXE);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.AROACE_PICKAXE)
                .add(ModItems.BI_PICKAXE)
                .add(ModItems.DEMIGENDER_PICKAXE)
                .add(ModItems.GENDERFLUID_PICKAXE)
                .add(ModItems.LESBIAN_PICKAXE)
                .add(ModItems.MLM_PICKAXE)
                .add(ModItems.NONBINARY_PICKAXE)
                .add(ModItems.PAN_PICKAXE)
                .add(ModItems.QUEER_PICKAXE)
                .add(ModItems.TRANS_PICKAXE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.AROACE_SHOVEL)
                .add(ModItems.BI_SHOVEL)
                .add(ModItems.DEMIGENDER_SHOVEL)
                .add(ModItems.GENDERFLUID_SHOVEL)
                .add(ModItems.LESBIAN_SHOVEL)
                .add(ModItems.MLM_SHOVEL)
                .add(ModItems.NONBINARY_SHOVEL)
                .add(ModItems.PAN_SHOVEL)
                .add(ModItems.QUEER_SHOVEL)
                .add(ModItems.TRANS_SHOVEL);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.AROACE_HOE)
                .add(ModItems.BI_HOE)
                .add(ModItems.DEMIGENDER_HOE)
                .add(ModItems.GENDERFLUID_HOE)
                .add(ModItems.LESBIAN_HOE)
                .add(ModItems.MLM_HOE)
                .add(ModItems.NONBINARY_HOE)
                .add(ModItems.PAN_HOE)
                .add(ModItems.QUEER_HOE)
                .add(ModItems.TRANS_HOE);

    }
}
