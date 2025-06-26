package com.june.queercraft.item;

import com.june.queercraft.QueerCraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.SnowballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class MobLauncherItem extends Item {
    public MobLauncherItem(Settings settings) {
        super(settings);
    }


    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        if (!world.isClient){

            SnowballEntity snowballEntity = new SnowballEntity(world, user);
            snowballEntity.setItem(itemStack);
            snowballEntity.addVelocity(new Vec3d(snowballEntity.getX() - user.getX(), 0.03, snowballEntity.getZ() - user.getZ()).normalize().multiply(10f));
            world.spawnEntity(snowballEntity);

            QueerCraft.LOGGER.info("FIRED");

        }



        return super.use(world, user, hand);
    }
}
