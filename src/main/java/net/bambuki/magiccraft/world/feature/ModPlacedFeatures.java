package net.bambuki.magiccraft.world.feature;

import net.bambuki.magiccraft.MagicCraft;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, MagicCraft.MOD_ID);
    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }
    public static final RegistryObject<PlacedFeature> ZIRCON_ORE_PLACED = PLACED_FEATURES.register("tin_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.TIN_ORE.getHolder().get(),
                    commonOrePlacement(7,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> BLUE_SAPPHIRES_ORE_PLACED = PLACED_FEATURES.register("blue_sapphires_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.BLUE_SAPPHIRES_ORE.getHolder().get(),
                    commonOrePlacement(7,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> GREEN_EMERALDS_ORE_PLACED = PLACED_FEATURES.register("green_emeralds_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.GREEN_EMERALDS_ORE.getHolder().get(),
                    commonOrePlacement(7,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> SCARLET_RUBIES_ORE_PLACED = PLACED_FEATURES.register("scarlet_rubies_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.SCARLET_RUBIES_ORE.getHolder().get(),
                    commonOrePlacement(7,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> YELLOW_DIAMONDS_ORE_PLACED = PLACED_FEATURES.register("yellow_diamonds_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.YELLOW_DIAMONDS_ORE.getHolder().get(),
                    commonOrePlacement(7,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> END_TIN_ORE_PLACED = PLACED_FEATURES.register("end_tin_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.END_TIN_ORE.getHolder().get(), commonOrePlacement(7,
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> NETHER_TIN_ORE_PLACED = PLACED_FEATURES.register("nether_tin_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.NETHER_TIN_ORE.getHolder().get(), commonOrePlacement(7,
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }
    public static void register(IEventBus eventBus){
        PLACED_FEATURES.register(eventBus);
    }
}
