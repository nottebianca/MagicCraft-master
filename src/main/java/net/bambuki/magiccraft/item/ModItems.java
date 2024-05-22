package net.bambuki.magiccraft.item;

import net.bambuki.magiccraft.MagicCraft;
import net.bambuki.magiccraft.block.ModBlocks;
import net.bambuki.magiccraft.item.custom.DowsingRodItem;
import net.bambuki.magiccraft.item.custom.LevitationSwordItem;
import net.bambuki.magiccraft.item.custom.MagicBallItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
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
            () -> new PickaxeItem(ModTiers.YELLOW_DIAMONDS,2, 3f,
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
            () -> new PickaxeItem(ModTiers.GREEN_EMERALDS,2, 3f,
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
            () -> new PickaxeItem(ModTiers.SCARLET_RUBIES,2, 3f,
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
            () -> new PickaxeItem(ModTiers.BLUE_SAPPHIRES,2, 3f,
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




    public static final RegistryObject<Item> MAGIC_BALL = ITEMS.register("magic_ball",
            () -> new MagicBallItem(new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB).stacksTo(1)));
    public static final RegistryObject<Item> MANDRAGORA_SEEDS = ITEMS.register("mandragora_seeds",
            () -> new ItemNameBlockItem(ModBlocks.MANDRAGORA_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> MANDRAGORA = ITEMS.register("mandragora",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)
                    .food(new FoodProperties.Builder()
                            .nutrition(2).effect(() -> new MobEffectInstance
                                    (MobEffects.BLINDNESS, 200, 0), 1.0F).build())));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }

}
