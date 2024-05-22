package net.bambuki.magiccraft.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class LevitationSwordItem extends SwordItem {
    public LevitationSwordItem(Tier tier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(tier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        pTarget.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 200), pAttacker);
        pTarget.setSecondsOnFire(5);
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}
