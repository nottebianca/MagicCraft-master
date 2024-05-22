package net.bambuki.magiccraft.item;

import net.bambuki.magiccraft.MagicCraft;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    BLUE_SAPPHIRES("blue_sapphires", 33, new int[]{3, 6, 8, 3}, 19, SoundEvents.ARMOR_EQUIP_DIAMOND,
            2.0F, 0.0F, () -> {return Ingredient.of(ModItems.BLUE_SAPPHIRES.get());
    }),
    YELLOW_DIAMONDS("yellow_diamonds", 33, new int[]{3, 6, 8, 3}, 19, SoundEvents.ARMOR_EQUIP_GOLD,
            2.0F, 0.0F, () -> {return Ingredient.of(ModItems.YELLOW_DIAMONDS.get());
    }),
    GREEN_EMERALDS("green_emeralds", 33, new int[]{3, 6, 8, 3}, 19, SoundEvents.ARMOR_EQUIP_IRON,
            2.0F, 0.0F, () -> {return Ingredient.of(ModItems.GREEN_EMERALDS.get());
    }),
    SCARLET_RUBIES("scarlet_rubies", 28, new int[]{3, 6, 8, 3}, 19, SoundEvents.ARMOR_EQUIP_CHAIN,
            2.0F, 0.0F, () -> Ingredient.of(ModItems.SCARLET_RUBIES.get()));

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private ModArmorMaterials(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_, SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
        this.name = p_40474_;
        this.durabilityMultiplier = p_40475_;
        this.slotProtections = p_40476_;
        this.enchantmentValue = p_40477_;
        this.sound = p_40478_;
        this.toughness = p_40479_;
        this.knockbackResistance = p_40480_;
        this.repairIngredient = new LazyLoadedValue<>(p_40481_);
    }

    public int getDurabilityForSlot(EquipmentSlot p_40484_) {
        return HEALTH_PER_SLOT[p_40484_.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot p_40487_) {
        return this.slotProtections[p_40487_.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return MagicCraft.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
