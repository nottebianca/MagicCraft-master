package net.bambuki.magiccraft.item.custom;

import net.bambuki.magiccraft.sound.ModSounds;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MagicBlueSapphiresWandItem extends Item {

    private static final double LEVITATION_RADIUS = 5.0;
    private static final double PETRIFICATION_RADIUS = 10.0;

    public MagicBlueSapphiresWandItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        Player player = context.getPlayer();
        if (!world.isClientSide && player != null) {
            // Wingardium Leviosa
            Vec3 playerPos = player.position();
            AABB levitationArea = new AABB(playerPos.x - LEVITATION_RADIUS, playerPos.y - LEVITATION_RADIUS, playerPos.z - LEVITATION_RADIUS,
                    playerPos.x + LEVITATION_RADIUS, playerPos.y + LEVITATION_RADIUS, playerPos.z + LEVITATION_RADIUS);
            AtomicInteger itemsLevitated = new AtomicInteger(0);
            for (ItemEntity item : world.getEntitiesOfClass(ItemEntity.class, levitationArea)) {
                Vec3 itemPos = item.position();
                new Thread(() -> {
                    try {
                        world.playSound(null, player.getX(), player.getY(), player.getZ(),
                                ModSounds.WINGARDIUM_LEVIOSA.get(), SoundSource.PLAYERS, 1.0F, 1.0F);
                        item.setNoGravity(true);
                        item.setDeltaMovement(new Vec3(0, 0.5, 0));
                        Thread.sleep(2500);
                        item.setDeltaMovement(Vec3.ZERO);
                        item.setNoGravity(false);
                        itemsLevitated.incrementAndGet();
                        if (itemsLevitated.get() > 0) {
                            player.sendSystemMessage(Component.literal("Wingardium Leviosa").withStyle(ChatFormatting.YELLOW));
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }).start();
            }
        }
        return InteractionResult.SUCCESS;
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker instanceof Player) {
            Player player = (Player) attacker;
            player.level.playSound(null, player.getX(), player.getY(), player.getZ(),
                    ModSounds.PETRIFICUS_TOTALUS.get(), SoundSource.PLAYERS, 1.0F, 1.0F);
            target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 10)); // Полностью парализует на 30 секунд
            player.sendSystemMessage(Component.literal("Petrificus Totalus").withStyle(ChatFormatting.RED));
        }
        return super.hurtEnemy(stack, target, attacker);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Component.literal("Right click to Wingardium Leviosa. Left click to Petrificus Totalus").withStyle(ChatFormatting.GREEN));
        } else {
            tooltip.add(Component.literal("Press SHIFT for more info").withStyle(ChatFormatting.GOLD));
        }
        super.appendHoverText(stack, world, tooltip, flag);
    }
}
