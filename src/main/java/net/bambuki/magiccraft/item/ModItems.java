package net.bambuki.magiccraft.item;

import net.bambuki.magiccraft.MagicCraft;
import net.bambuki.magiccraft.block.ModBlocks;
import net.bambuki.magiccraft.event.GryffindorEvent;
import net.bambuki.magiccraft.item.custom.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MagicCraft.MOD_ID);

    public static final RegistryObject<Item> TIN = ITEMS.register("tin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> BLUE_SAPPHIRES = ITEMS.register("blue_sapphires",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> RAW_BLUE_SAPPHIRES = ITEMS.register("raw_blue_sapphires",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> GREEN_EMERALDS = ITEMS.register("green_emeralds",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> RAW_GREEN_EMERALDS = ITEMS.register("raw_green_emeralds",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> SCARLET_RUBIES = ITEMS.register("scarlet_rubies",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> RAW_SCARLET_RUBIES = ITEMS.register("raw_scarlet_rubies",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> YELLOW_DIAMONDS = ITEMS.register("yellow_diamonds",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> RAW_YELLOW_DIAMONDS = ITEMS.register("raw_yellow_diamonds",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> DOWSING_ROD = ITEMS.register("dowsing_rod",
            () -> new DowsingRodItem(new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB).durability(16)));


    public static final RegistryObject<Item> YELLOW_DIAMONDS_PICKAXE = ITEMS.register("yellow_diamonds_pickaxe",
            () -> new ExplosivePowerPickAxeItem(ModTiers.YELLOW_DIAMONDS,2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> YELLOW_DIAMONDS_AXE = ITEMS.register("yellow_diamonds_axe",
            () -> new AxeItem(ModTiers.YELLOW_DIAMONDS,2, 2f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> YELLOW_DIAMONDS_SHOVEL = ITEMS.register("yellow_diamonds_shovel",
            () -> new ShovelItem(ModTiers.YELLOW_DIAMONDS,1, 2f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> YELLOW_DIAMONDS_SWORD = ITEMS.register("yellow_diamonds_sword",
            () -> new LevitationSwordItem(ModTiers.YELLOW_DIAMONDS,2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> YELLOW_DIAMONDS_HOE = ITEMS.register("yellow_diamonds_hoe",
            () -> new HoeItem(ModTiers.YELLOW_DIAMONDS,0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> GREEN_EMERALDS_PICKAXE = ITEMS.register("green_emeralds_pickaxe",
            () -> new ExplosivePowerPickAxeItem(ModTiers.GREEN_EMERALDS,2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> GREEN_EMERALDS_AXE = ITEMS.register("green_emeralds_axe",
            () -> new AxeItem(ModTiers.GREEN_EMERALDS,2, 2f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> GREEN_EMERALDS_SHOVEL = ITEMS.register("green_emeralds_shovel",
            () -> new ShovelItem(ModTiers.GREEN_EMERALDS,1, 2f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> GREEN_EMERALDS_SWORD = ITEMS.register("green_emeralds_sword",
            () -> new LevitationSwordItem(ModTiers.GREEN_EMERALDS,2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> GREEN_EMERALDS_HOE = ITEMS.register("green_emeralds_hoe",
            () -> new HoeItem(ModTiers.GREEN_EMERALDS,0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> SCARLET_RUBIES_PICKAXE = ITEMS.register("scarlet_rubies_pickaxe",
            () -> new ExplosivePowerPickAxeItem(ModTiers.SCARLET_RUBIES,2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> SCARLET_RUBIES_AXE = ITEMS.register("scarlet_rubies_axe",
            () -> new AxeItem(ModTiers.SCARLET_RUBIES,2, 2f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> SCARLET_RUBIES_SHOVEL = ITEMS.register("scarlet_rubies_shovel",
            () -> new ShovelItem(ModTiers.SCARLET_RUBIES,1, 2f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> SCARLET_RUBIES_SWORD = ITEMS.register("scarlet_rubies_sword",
            () -> new LevitationSwordItem(ModTiers.SCARLET_RUBIES,2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> SCARLET_RUBIES_HOE = ITEMS.register("scarlet_rubies_hoe",
            () -> new HoeItem(ModTiers.SCARLET_RUBIES,0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> BLUE_SAPPHIRES_PICKAXE = ITEMS.register("blue_sapphires_pickaxe",
            () -> new ExplosivePowerPickAxeItem(ModTiers.BLUE_SAPPHIRES,2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> BLUE_SAPPHIRES_AXE = ITEMS.register("blue_sapphires_axe",
            () -> new AxeItem(ModTiers.BLUE_SAPPHIRES,2, 2f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> BLUE_SAPPHIRES_SHOVEL = ITEMS.register("blue_sapphires_shovel",
            () -> new ShovelItem(ModTiers.BLUE_SAPPHIRES,1, 2f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> BLUE_SAPPHIRES_SWORD = ITEMS.register("blue_sapphires_sword",
            () -> new LevitationSwordItem(ModTiers.BLUE_SAPPHIRES,2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> BLUE_SAPPHIRES_HOE = ITEMS.register("blue_sapphires_hoe",
            () -> new HoeItem(ModTiers.BLUE_SAPPHIRES,0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));

    public static final RegistryObject<Item> BLUE_SAPPHIRES_BOOTS = ITEMS.register("blue_sapphires_boots",
            () -> new ArmorItem(ModArmorMaterials.BLUE_SAPPHIRES, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> BLUE_SAPPHIRES_LEGGINGS = ITEMS.register("blue_sapphires_leggings",
            () -> new ArmorItem(ModArmorMaterials.BLUE_SAPPHIRES, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> BLUE_SAPPHIRES_CHESTPLATE = ITEMS.register("blue_sapphires_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BLUE_SAPPHIRES, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> BLUE_SAPPHIRES_HELMET = ITEMS.register("blue_sapphires_helmet",
            () -> new ModArmorItem(ModArmorMaterials.BLUE_SAPPHIRES, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> SCARLET_RUBIES_BOOTS = ITEMS.register("scarlet_rubies_boots",
            () -> new ArmorItem(ModArmorMaterials.SCARLET_RUBIES, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> SCARLET_RUBIES_LEGGINGS = ITEMS.register("scarlet_rubies_leggings",
            () -> new ArmorItem(ModArmorMaterials.SCARLET_RUBIES, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> SCARLET_RUBIES_CHESTPLATE = ITEMS.register("scarlet_rubies_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SCARLET_RUBIES, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> SCARLET_RUBIES_HELMET = ITEMS.register("scarlet_rubies_helmet",
            () -> new ModArmorItem(ModArmorMaterials.SCARLET_RUBIES, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> GREEN_EMERALDS_BOOTS = ITEMS.register("green_emeralds_boots",
            () -> new ArmorItem(ModArmorMaterials.GREEN_EMERALDS, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> GREEN_EMERALDS_LEGGINGS = ITEMS.register("green_emeralds_leggings",
            () -> new ArmorItem(ModArmorMaterials.GREEN_EMERALDS, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> GREEN_EMERALDS_CHESTPLATE = ITEMS.register("green_emeralds_chestplate",
            () -> new ArmorItem(ModArmorMaterials.GREEN_EMERALDS, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> GREEN_EMERALDS_HELMET = ITEMS.register("green_emeralds_helmet",
            () -> new ModArmorItem(ModArmorMaterials.GREEN_EMERALDS, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> YELLOW_DIAMONDS_BOOTS = ITEMS.register("yellow_diamonds_boots",
            () -> new ArmorItem(ModArmorMaterials.YELLOW_DIAMONDS, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> YELLOW_DIAMONDS_LEGGINGS = ITEMS.register("yellow_diamonds_leggings",
            () -> new ArmorItem(ModArmorMaterials.YELLOW_DIAMONDS, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> YELLOW_DIAMONDS_CHESTPLATE = ITEMS.register("yellow_diamonds_chestplate",
            () -> new ArmorItem(ModArmorMaterials.YELLOW_DIAMONDS, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> YELLOW_DIAMONDS_HELMET = ITEMS.register("yellow_diamonds_helmet",
            () -> new ModArmorItem(ModArmorMaterials.YELLOW_DIAMONDS, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> INVISIBILITY_CLOAK = ITEMS.register("invisibility_cloak",
            () -> new InvisibilityCloak(ModArmorMaterials.INVISIBILITY_CLOAK, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SORTING_HAT = ITEMS.register("sorting_hat",
            () -> new SortingHat(ModArmorMaterials.SORTING_HAT, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB).stacksTo(1)));




    public static final RegistryObject<Item> MAGIC_BALL = ITEMS.register("magic_ball",
            () -> new MagicBallItem(new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB).stacksTo(1)));
    public static final RegistryObject<Item> MAGIC_WAND = ITEMS.register("magic_wand",
            () -> new MagicWandItem(new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB).stacksTo(1)));
    public static final RegistryObject<Item> MAGIC_BLUE_SAPPHIRES_WAND = ITEMS.register("magic_blue_sapphires_wand",
            () -> new MagicBlueSapphiresWandItem(new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BUTTER_BEER = ITEMS.register("butter_beer",
            () -> new ButterBeerItem(new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB).stacksTo(1)));
    public static final RegistryObject<Item> MANDRAGORA_SEEDS = ITEMS.register("mandragora_seeds",
            () -> new ItemNameBlockItem(ModBlocks.MANDRAGORA_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> GRYFFINDOR_ARTIFACT = ITEMS.register("gryffindor_artifact",
            () -> new GryffindorArtifactItem(new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB).stacksTo(1)));
    public static final RegistryObject<Item> RAVENCLAW_ARTIFACT = ITEMS.register("ravenclaw_artifact",
            () -> new RavenclawArtifactItem(new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB).stacksTo(1)));
    public static final RegistryObject<Item> HUFFLEPUFF_ARTIFACT = ITEMS.register("hufflepuff_artifact",
            () -> new HufflepuffArtifactItem(new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SLYTHERIN_ARTIFACT = ITEMS.register("slytherin_artifact",
            () -> new SlytherinArtifactItem(new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB).stacksTo(1)));
    public static final RegistryObject<Item> RAVENCLAW_CHALICE = ITEMS.register("ravenclaw_chalice",
            () -> new RavenclawChaliceItem(new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB).stacksTo(1)));
    public static final RegistryObject<Item> MANDRAGORA = ITEMS.register("mandragora",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)
                    .food(new FoodProperties.Builder()
                            .nutrition(2).effect(() -> new MobEffectInstance
                                    (MobEffects.BLINDNESS, 200, 0), 1.0F).build())));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }

}
