package com.june.queercraft.item;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;

import static net.minecraft.util.ActionResult.SUCCESS;

public class DaggerItem extends SwordItem {
    public float attackSpeed;

    public DaggerItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }


    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {

        user.attack(entity);
        entity.damage(user.getDamageSources().generic(),getAttackDamage()*2);
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE,30,10,false,false,false));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS,30,10,false,false,false));

        return SUCCESS;
    }
}

