package net.bambuki.magiccraft.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

import java.util.Random;

@EventBusSubscriber(modid = "magiccraft")
public class SortingHat extends ArmorItem {
    private static final String[] HOUSE_NAMES = {"Gryffindor", "Slytherin", "Hufflepuff", "Ravenclaw"};
    private static final Random RANDOM = new Random();

    public SortingHat(ArmorMaterial material, EquipmentSlot slot, Properties properties) {
        super(material, slot, properties);
    }

    @SubscribeEvent
    public static void onEquipmentChange(LivingEquipmentChangeEvent event) {
        if (event.getEntity() instanceof Player player) {
            if (event.getSlot() == EquipmentSlot.HEAD) {
                ItemStack newItemStack = event.getTo();
                if (newItemStack.getItem() instanceof SortingHat) {
                    String houseChosen = getRandomHouse();
                    ChatFormatting color = getHouseColor(houseChosen);
                    MutableComponent message = Component.translatable("item.magiccraft.sorting_hat.message")
                            .append(" ")
                            .append(Component.literal(houseChosen).withStyle(color));
                    player.sendSystemMessage(message);
                }
            }
        }
    }

    private static String getRandomHouse() {
        return HOUSE_NAMES[RANDOM.nextInt(HOUSE_NAMES.length)];
    }

    private static ChatFormatting getHouseColor(String house) {
        return switch (house) {
            case "Gryffindor" -> ChatFormatting.RED;
            case "Slytherin" -> ChatFormatting.GREEN;
            case "Hufflepuff" -> ChatFormatting.YELLOW;
            case "Ravenclaw" -> ChatFormatting.BLUE;
            default -> ChatFormatting.WHITE;
        };
    }
}
