package net.bambuki.magiccraft.item;

import net.bambuki.magiccraft.MagicCraft;
import net.bambuki.magiccraft.block.ModBlocks;
import net.bambuki.magiccraft.item.custom.MagicBallItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
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
