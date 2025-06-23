package com.june.queercraft;

import com.june.queercraft.block.ModBlocks;
import com.june.queercraft.datagen.ModLootTableProvider;
import com.june.queercraft.item.ModItemGroups;
import com.june.queercraft.item.ModItems;
import com.june.queercraft.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QueerCraft implements ModInitializer {
	public static final String MOD_ID = "queercraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModWorldGeneration.generateModWorldGen();
	}
}