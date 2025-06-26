package com.june.queercraft.item;

import com.june.queercraft.QueerCraft;
import com.june.queercraft.item.materials.ModToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModSpecialWeapons {

    public static final Item SCYTHE = registerSpecialWeapon("scythe",
            new SwordItem(ModToolMaterial.QUEER, 12, -3f,new FabricItemSettings()));

    public static final Item BONK_STICK = registerSpecialWeapon("bonk_stick",
            new BonkStickItem(new FabricItemSettings().maxCount(1)));


    public static final Item DAGGER = registerSpecialWeapon("dagger",
            new DaggerItem(ModToolMaterial.QUEER, 1, -1f,new FabricItemSettings()));

    private static Item registerSpecialWeapon(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(QueerCraft.MOD_ID, name),item);
    }

    public static void registerModWeapons(){
        QueerCraft.LOGGER.info("Registering mod special weapons for " + QueerCraft.MOD_ID);
    }


}
