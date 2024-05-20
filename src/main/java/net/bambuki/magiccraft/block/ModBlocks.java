package net.bambuki.magiccraft.block;

import net.bambuki.magiccraft.MagicCraft;
import net.bambuki.magiccraft.block.custom.InvisibilityBlock;
import net.bambuki.magiccraft.block.custom.MandragoraCropBlock;
import net.bambuki.magiccraft.block.custom.TinLampBlock;
import net.bambuki.magiccraft.item.ModCreativeModeTab;
import net.bambuki.magiccraft.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MagicCraft.MOD_ID);
    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MAGICCRAFT_TAB);
    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.MAGICCRAFT_TAB);
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.MAGICCRAFT_TAB);
    public static final RegistryObject<Block> ENDSTONE_TIN_ORE = registerBlock("endstone_tin_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.MAGICCRAFT_TAB);
    public static final RegistryObject<Block> NETHERRACK_TIN_ORE = registerBlock("netherrack_tin_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.MAGICCRAFT_TAB);
    public static final RegistryObject<Block> BLUE_SAPPHIRES_BLOCK = registerBlock("blue_sapphires_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MAGICCRAFT_TAB);
    public static final RegistryObject<Block> BLUE_SAPPHIRES_ORE = registerBlock("blue_sapphires_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.MAGICCRAFT_TAB);
    public static final RegistryObject<Block> GREEN_EMERALDS_BLOCK = registerBlock("green_emeralds_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MAGICCRAFT_TAB);
    public static final RegistryObject<Block> GREEN_EMERALDS_ORE = registerBlock("green_emeralds_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.MAGICCRAFT_TAB);
    public static final RegistryObject<Block> SCARLET_RUBIES_BLOCK = registerBlock("scarlet_rubies_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MAGICCRAFT_TAB);
    public static final RegistryObject<Block> SCARLET_RUBIES_ORE = registerBlock("scarlet_rubies_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.MAGICCRAFT_TAB);
    public static final RegistryObject<Block> YELLOW_DIAMONDS_BLOCK = registerBlock("yellow_diamonds_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MAGICCRAFT_TAB);
    public static final RegistryObject<Block> YELLOW_DIAMONDS_ORE = registerBlock("yellow_diamonds_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.MAGICCRAFT_TAB);
    public static final RegistryObject<Block> INVISIBILITY_BLOCK = registerBlock("invisibility_block",
            () -> new InvisibilityBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MAGICCRAFT_TAB);
    public static final RegistryObject<Block> TIN_LAMP = registerBlock("tin_lamp",
            () -> new TinLampBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()
                    .lightLevel(state -> state.getValue(TinLampBlock.LIT) ? 15 : 0)), ModCreativeModeTab.MAGICCRAFT_TAB);
    public static final RegistryObject<Block> BLUE_SAPPHIRES_LAMP = registerBlock("blue_sapphires_lamp",
            () -> new TinLampBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()
                    .lightLevel(state -> state.getValue(TinLampBlock.LIT) ? 15 : 0)), ModCreativeModeTab.MAGICCRAFT_TAB);
    public static final RegistryObject<Block> GREEN_EMERALDS_LAMP = registerBlock("green_emeralds_lamp",
            () -> new TinLampBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()
                    .lightLevel(state -> state.getValue(TinLampBlock.LIT) ? 15 : 0)), ModCreativeModeTab.MAGICCRAFT_TAB);
    public static final RegistryObject<Block> SCARLET_RUBIES_LAMP = registerBlock("scarlet_rubies_lamp",
            () -> new TinLampBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()
                    .lightLevel(state -> state.getValue(TinLampBlock.LIT) ? 15 : 0)), ModCreativeModeTab.MAGICCRAFT_TAB);
    public static final RegistryObject<Block> YELLOW_DIAMONDS_LAMP = registerBlock("yellow_diamonds_lamp",
            () -> new TinLampBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()
                    .lightLevel(state -> state.getValue(TinLampBlock.LIT) ? 15 : 0)), ModCreativeModeTab.MAGICCRAFT_TAB);
    public static final RegistryObject<Block> MANDRAGORA_CROP = BLOCKS.register("mandragora_crop",
            () -> new MandragoraCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get() , new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
