package net.bambuki.magiccraft.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

public class MagicBallItem extends Item {

    private static final String[] PREDICTIONS = {
            "You will have a great day today.",
            "Postpone that task until tomorrow.",
            "The dark times will soon pass.",
            "A new opportunity is on the horizon.",
            "Take a risk, it will pay off.",
            "Spend more time with your loved ones.",
            "Focus on your goals, you're on the right track.",
            "Don't worry, everything will work out.",
            "A surprise is coming your way soon.",
            "Trust your instincts, they will guide you."
    };

    public MagicBallItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND){
            outputPrediction(player);
            player.getCooldowns().addCooldown(this, 20);
        }
        return super.use(level, player, hand);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level p_41422_, List<Component> components, TooltipFlag flag) {
        if(Screen.hasShiftDown()){
            components.add(Component.literal("Right click to receive a mystical prediction").withStyle(ChatFormatting.GREEN));
        } else {
            components.add(Component.literal("Press SHIFT for more info").withStyle(ChatFormatting.GOLD));
        }
        super.appendHoverText(stack, p_41422_, components, flag);
    }

    private void outputPrediction(Player player) {
        String prediction = PREDICTIONS[new Random().nextInt(PREDICTIONS.length)];
        player.sendSystemMessage(Component.literal("The magic ball speaks: " + prediction));
    }
}
