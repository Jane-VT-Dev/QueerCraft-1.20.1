package com.june.queercraft.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

    public enum ModToolMaterial implements ToolMaterial {

        INGOT_1(0, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.INGOT_1)),

        INGOT_2(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.INGOT_2)),

        INGOT_3(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.INGOT_3)),

        INGOT_4(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.INGOT_4)),

        INGOT_5(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.INGOT_5)),

        INGOT_6(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.INGOT_6)),

        INGOT_7(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.INGOT_7)),

        INGOT_8(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.INGOT_8)),

        INGOT_9(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.INGOT_9)),

        INGOT_10(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.INGOT_10)),

        INGOT_11(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.INGOT_11)),

        INGOT_12(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.INGOT_12)),

        INGOT_13(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.INGOT_13)),

        INGOT_14(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.INGOT_14)),

        INGOT_15(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.INGOT_15)),

        INGOT_16(5, 650, 4.5f, 3.5f, 26,
                () -> Ingredient.ofItems(ModItems.INGOT_16));

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

