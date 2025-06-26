package com.june.queercraft.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;

public class BonkStickItem extends Item {
    public BonkStickItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        target.addVelocity(new Vec3d(target.getX() - attacker.getX(), 0.03, target.getZ() - attacker.getZ()).normalize().multiply(10f));

        return super.postHit(stack, target, attacker);



    }
}




