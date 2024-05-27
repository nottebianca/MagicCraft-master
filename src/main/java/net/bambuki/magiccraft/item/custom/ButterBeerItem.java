package net.bambuki.magiccraft.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ButterBeerItem extends Item {
    private static final int MAX_DRINKS = 3;
    private static final String DRINK_COUNT_TAG = "ButterBeerDrinkCount";

    public ButterBeerItem(Properties properties) {
        super(properties.food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1F).alwaysEat().build()));
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity entity) {
        if (entity instanceof Player) {
            Player player = (Player) entity;
            if (!world.isClientSide) {
                int drinkCount = player.getPersistentData().getInt(DRINK_COUNT_TAG);
                drinkCount++;
                player.getPersistentData().putInt(DRINK_COUNT_TAG, drinkCount);

                if (drinkCount >= MAX_DRINKS) {
                    player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 600, 0)); // 30 секунд эффекта
                    player.sendSystemMessage(Component.literal("You feel dizzy...").withStyle(ChatFormatting.RED));
                    player.getPersistentData().putInt(DRINK_COUNT_TAG, 0); 
                } else {
                    player.sendSystemMessage(Component.literal("Butter Beer is refreshing!").withStyle(ChatFormatting.YELLOW));
                }
            }

            if (!player.getAbilities().instabuild) {
                stack.shrink(1);
            }
        }

        return stack.isEmpty() ? ItemStack.EMPTY : stack;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        return ItemUtils.startUsingInstantly(world, player, hand);
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 32;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.DRINK;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(Component.literal("Drink up to 3 times to feel dizzy.").withStyle(ChatFormatting.GREEN));
        super.appendHoverText(stack, world, tooltip, flag);
    }

    @Override
    public boolean isEdible() {
        return true;
    }
}
