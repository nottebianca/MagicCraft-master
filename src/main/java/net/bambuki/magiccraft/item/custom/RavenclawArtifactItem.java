package net.bambuki.magiccraft.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RavenclawArtifactItem extends Item {

    public RavenclawArtifactItem(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level p_41422_, List<Component> components, TooltipFlag flag) {
        if(Screen.hasShiftDown()){
            components.add(Component.literal("Place in inventory to get night vision").withStyle(ChatFormatting.GREEN));
        } else {
            components.add(Component.literal("Press SHIFT for more info").withStyle(ChatFormatting.GOLD));
        }
        super.appendHoverText(stack, p_41422_, components, flag);
    }
}
