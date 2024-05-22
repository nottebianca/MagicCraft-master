package net.bambuki.magiccraft.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class InvisibilityCloak extends ArmorItem {
    private static final int INVISIBILITY_DURATION = 60; // 3 секунды
    private static final int SLOWNESS_EFFECT_AMPLIFIER = 1; // 50% снижение скорости

    public InvisibilityCloak(ArmorMaterial material, EquipmentSlot slot, Properties properties) {
        super(material, slot, properties);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if (!world.isClientSide()) {
            if (player.isShiftKeyDown() && player.getInventory().getArmor(2).getItem() == this) { // Игрок держит shift и носит мантию-невидимку
                makePlayerInvisible(player);
                reducePlayerMovementSpeed(player);
            } else {
                stopPlayerInvisibility(player);
                resetPlayerMovementSpeed(player);
            }
        }
    }

    private void makePlayerInvisible(Player player) {
        if (!player.hasEffect(MobEffects.INVISIBILITY)) {
            player.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, INVISIBILITY_DURATION * 20, 0)); // Применение эффекта невидимости
        }
    }

    private void reducePlayerMovementSpeed(Player player) {
        if (!player.hasEffect(MobEffects.MOVEMENT_SLOWDOWN)) {
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, INVISIBILITY_DURATION * 20, SLOWNESS_EFFECT_AMPLIFIER)); // Снижение скорости передвижения
        }
    }

    private void stopPlayerInvisibility(Player player) {
        if (player.hasEffect(MobEffects.INVISIBILITY)) {
            player.removeEffect(MobEffects.INVISIBILITY); // Удаление эффекта невидимости
        }
    }

    private void resetPlayerMovementSpeed(Player player) {
        if (player.hasEffect(MobEffects.MOVEMENT_SLOWDOWN)) {
            player.removeEffect(MobEffects.MOVEMENT_SLOWDOWN); // Возврат скорости к нормальной
        }
    }
}
