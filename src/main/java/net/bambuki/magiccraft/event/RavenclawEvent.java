package net.bambuki.magiccraft.event;

import net.bambuki.magiccraft.item.ModItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "magiccraft", bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class RavenclawEvent {

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            Player player = event.player;
            boolean hasArtifact = false;

            // Проверяем все слоты инвентаря игрока
            for (int i = 0; i < player.getInventory().getContainerSize(); i++) {
                if (player.getInventory().getItem(i).getItem() == ModItems.RAVENCLAW_ARTIFACT.get()) {
                    hasArtifact = true;
                    break;
                }
            }

            // Если предмет найден, применяем эффект огнеупорности
            if (hasArtifact) {
                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 220, 0, true, false));
            }
        }
    }
}
