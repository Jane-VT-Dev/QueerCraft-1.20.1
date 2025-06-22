package com.june.queercraft.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

    public enum ModToolMaterial implements ToolMaterial {

        INGOT_1(0, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.AROACE_INGOT)),

        INGOT_2(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.BASE_INGOT)),

        INGOT_3(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.BI_INGOT)),

        INGOT_4(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.BLACK_INGOT)),

        INGOT_5(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.BLUE_INGOT)),

        INGOT_6(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.CYAN_INGOT)),

        INGOT_7(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.DEMIGENDER_INGOT)),

        INGOT_8(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.GENDERFLUID_INGOT)),

        INGOT_9(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.GREEN_INGOT)),

        INGOT_10(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.GREY_INGOT)),

        INGOT_11(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.LESBIAN_INGOT)),

        INGOT_12(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.LIGHT_BLUE_INGOT)),

        INGOT_13(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.LIGHT_GREY_INGOT)),

        INGOT_14(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.LIME_INGOT)),

        INGOT_15(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.MAGENTA_INGOT)),

        INGOT_16(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.NONBINARY_INGOT));

        private final int miningLevel;
        private final int itemDurability;
        private final float miningSpeed;
        private final float attackDamage;
        private final int enchantability;
        private final Supplier<Ingredient> repairIngredient;

        ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attckDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
            this.miningLevel = miningLevel;
            this.itemDurability = itemDurability;
            this.miningSpeed = miningSpeed;
            this.attackDamage = attckDamage;
            this.enchantability = enchantability;
            this.repairIngredient = repairIngredient;
        }

        @Override
        public int getDurability() {
            return this.itemDurability;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return this.miningSpeed;
        }

        @Override
        public float getAttackDamage() {
            return this.attackDamage;
        }

        @Override
        public int getMiningLevel() {
            return this.miningLevel;
        }

        @Override
        public int getEnchantability() {
            return this.enchantability;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return this.repairIngredient.get();
        }
    }

