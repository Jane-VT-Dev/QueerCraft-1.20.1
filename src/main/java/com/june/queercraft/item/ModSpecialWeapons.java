package com.june.queercraft.item;

import com.june.queercraft.QueerCraft;
import com.june.queercraft.item.materials.ModToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModSpecialWeapons {

    public static final Item SCYTHE = registerSpecialWeapon("scythe",
            new SwordItem(ModToolMaterial.QUEER, 10, -3.4f,new FabricItemSettings()));

    public static final Item BONK_STICK = registerSpecialWeapon("bonk_stick",
            new BonkStickItem(new FabricItemSettings().maxCount(1)));


    public static final Item DAGGER = registerSpecialWeapon("dagger",
            new DaggerItem(ModToolMaterial.QUEER, 1, -1f,new FabricItemSettings()));

    public static final Item J_S_LANCE = registerSpecialWeapon("j_s_lance",
            new LanceItem(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));


    public static final Item LANCE = registerSpecialWeapon("lance",
            new LanceItem(new FabricItemSettings().maxCount(1).rarity(Rarity.COMMON)));


    public static final Item MAGIC_WAND = registerSpecialWeapon("magic_wand",
            new MagicWandItem(new FabricItemSettings().maxCount(1).rarity(Rarity.UNCOMMON)));


    public static final Item FRYING_PAN = registerSpecialWeapon("frying_pan",
            new FryingPanItem(ModToolMaterial.QUEER, 0, -3f,new FabricItemSettings()));

    public static final Item BATTLE_AXE = registerSpecialWeapon("battle_axe",
            new AxeItem(ModToolMaterial.BI,8,-3f,new FabricItemSettings()));




    private static Item registerSpecialWeapon(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(QueerCraft.MOD_ID, name),item);
    }

    public static void registerModWeapons(){
        QueerCraft.LOGGER.info("Registering mod special weapons for " + QueerCraft.MOD_ID);
    }


}
