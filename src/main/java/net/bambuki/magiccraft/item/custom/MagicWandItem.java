package net.bambuki.magiccraft.item.custom;

import net.bambuki.magiccraft.sound.ModSounds;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundSource;
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

public class MagicWandItem extends Item {

    private static final double ATTACK_RADIUS = 10.0;

    public MagicWandItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        Player player = context.getPlayer();
        if (!world.isClientSide && player != null) {
            Vec3 playerPos = player.position();
            double radius = 5.0;
            AABB area = new AABB(playerPos.x - radius, playerPos.y - radius, playerPos.z - radius,
                    playerPos.x + radius, playerPos.y + radius, playerPos.z + radius);
            AtomicInteger itemsPulled = new AtomicInteger(0);
            for (ItemEntity item : world.getEntitiesOfClass(ItemEntity.class, area)) {
                Vec3 itemPos = item.position();
                Vec3 direction = playerPos.subtract(itemPos).normalize();
                new Thread(() -> {
                    try {
                        world.playSound(null, player.getX(), player.getY(), player.getZ(),
                                ModSounds.ACCIO.get(), SoundSource.PLAYERS, 1.0F, 1.0F);
                        Thread.sleep(1000);
                        item.setDeltaMovement(direction.scale(0.5));
                        itemsPulled.incrementAndGet();
                        if (itemsPulled.get() > 0) {
                            player.sendSystemMessage(Component.literal("Accio").withStyle(ChatFormatting.DARK_PURPLE));
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }).start();
            }
            AABB attackArea = new AABB(playerPos.x - ATTACK_RADIUS, playerPos.y - ATTACK_RADIUS, playerPos.z - ATTACK_RADIUS,
                    playerPos.x + ATTACK_RADIUS, playerPos.y + ATTACK_RADIUS, playerPos.z + ATTACK_RADIUS);
            for (LivingEntity target : world.getEntitiesOfClass(LivingEntity.class, attackArea)) {
                if (target != player) {
                    double distance = playerPos.distanceTo(target.position());
                    if (distance <= ATTACK_RADIUS) {
                        world.playSound(null, player.getX(), player.getY(), player.getZ(),
                                ModSounds.AVADA_KEDAVRA.get(), SoundSource.PLAYERS, 1.0F, 1.0F);
                        target.setHealth(0.0F);
                        player.sendSystemMessage(Component.literal("Avada Kedavra").withStyle(ChatFormatting.DARK_GREEN));
                    }
                }
            }
        }
        return InteractionResult.SUCCESS;
    }



    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker instanceof Player) {
            Player player = (Player) attacker;
            player.level.playSound(null, player.getX(), player.getY(), player.getZ(),
                    ModSounds.AVADA_KEDAVRA.get(), SoundSource.PLAYERS, 1.0F, 1.0F);
            new Thread(() -> {
                try {
                    Thread.sleep(2600);
                    target.setHealth(0.0F);
                    player.sendSystemMessage(Component.literal("Avada Kedavra").withStyle(ChatFormatting.DARK_GREEN));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        return super.hurtEnemy(stack, target, attacker);
    }



    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Component.literal("Right click to Accio. Left click to Avada Kedavra").withStyle(ChatFormatting.GREEN));
        } else {
            tooltip.add(Component.literal("Press SHIFT for more info").withStyle(ChatFormatting.GOLD));
        }
        super.appendHoverText(stack, world, tooltip, flag);
    }
}