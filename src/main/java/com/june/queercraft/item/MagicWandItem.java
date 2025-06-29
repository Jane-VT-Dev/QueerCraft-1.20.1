package com.june.queercraft.item;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class MagicWandItem extends Item {
    public MagicWandItem(Settings settings) {
        super(settings);
    }


    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        if (world.isClient) {
            return TypedActionResult.pass(user.getStackInHand(hand));
        }

        LightningEntity lightningBolt = new LightningEntity(EntityType.LIGHTNING_BOLT, world);
        lightningBolt.setPosition(user.raycast(20,1,false).getPos());

        if (!user.getItemCooldownManager().isCoolingDown(ModSpecialWeapons.MAGIC_WAND)) {
            if (user.getHealth() > 4) {

                user.setHealth(user.getHealth() - 6);
                world.spawnEntity(lightningBolt);
                user.getItemCooldownManager().set(ModSpecialWeapons.MAGIC_WAND, 300);

            }else
                user.playSound(SoundEvents.BLOCK_BAMBOO_WOOD_BUTTON_CLICK_OFF,SoundCategory.PLAYERS,0.5f,0.1f);
        }

        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
