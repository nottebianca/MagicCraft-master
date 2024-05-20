package net.bambuki.magiccraft.world.feature;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import net.bambuki.magiccraft.MagicCraft;
import net.bambuki.magiccraft.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, MagicCraft.MOD_ID);
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_TIN_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TIN_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TIN_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_TIN_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.ENDSTONE_TIN_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_TIN_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHERRACK_TIN_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_BLUE_SAPPHIRES_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BLUE_SAPPHIRES_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_GREEN_EMERALDS_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.GREEN_EMERALDS_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SCARLET_RUBIES_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SCARLET_RUBIES_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_YELLOW_DIAMONDS_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.YELLOW_DIAMONDS_ORE.get().defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> TIN_ORE = CONFIGURED_FEATURES.register("tin_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_TIN_ORES.get(),9)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> BLUE_SAPPHIRES_ORE = CONFIGURED_FEATURES.register("blue_sapphires_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_BLUE_SAPPHIRES_ORES.get(),9)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> GREEN_EMERALDS_ORE = CONFIGURED_FEATURES.register("green_emeralds_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_GREEN_EMERALDS_ORES.get(),9)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> SCARLET_RUBIES_ORE = CONFIGURED_FEATURES.register("scarlet_rubies_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SCARLET_RUBIES_ORES.get(),9)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> YELLOW_DIAMONDS_ORE = CONFIGURED_FEATURES.register("yellow_diamonds_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_YELLOW_DIAMONDS_ORES.get(),9)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> END_TIN_ORE = CONFIGURED_FEATURES.register("end_tin_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_TIN_ORES.get(), 12)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_TIN_ORE = CONFIGURED_FEATURES.register("nether_tin_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_TIN_ORES.get(), 12)));
    public static void register(IEventBus eventBus){
        CONFIGURED_FEATURES.register(eventBus);
    }
}
