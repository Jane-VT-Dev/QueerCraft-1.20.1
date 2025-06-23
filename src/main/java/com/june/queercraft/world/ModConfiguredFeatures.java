package com.june.queercraft.world;

import com.june.queercraft.QueerCraft;
import com.june.queercraft.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

import static net.minecraft.world.gen.feature.ConfiguredFeatures.register;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> BROWN_STONE_ORE_KEY = registerKey("brown_stone_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BROWN_DEEPSLATE_ORE_KEY = registerKey("brown_deepslate_ore_key");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldBrownOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.BROWN_STONE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.BROWN_DEEPSLATE_ORE.getDefaultState()));

        register(context, BROWN_STONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldBrownOres, 6));
        register(context, BROWN_DEEPSLATE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldBrownOres, 6));

    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(QueerCraft.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
