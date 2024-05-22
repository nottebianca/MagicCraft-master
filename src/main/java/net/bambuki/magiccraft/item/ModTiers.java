package net.bambuki.magiccraft.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier BLUE_SAPPHIRES = new ForgeTier(4, 2000, 2f,
            2f,22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.BLUE_SAPPHIRES.get()));
    public static final ForgeTier GREEN_EMERALDS = new ForgeTier(4, 2000, 2f,
            2f,22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.GREEN_EMERALDS.get()));
    public static final ForgeTier SCARLET_RUBIES = new ForgeTier(4, 2000, 2f,
            2f,22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.SCARLET_RUBIES.get()));
    public static final ForgeTier YELLOW_DIAMONDS = new ForgeTier(4, 2000, 2f,
            2f,22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.YELLOW_DIAMONDS.get()));
}
