package net.bambuki.magiccraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MAGICCRAFT_TAB = new CreativeModeTab("magiccrafttab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SCARLET_RUBIES.get());

        }
    };

}
