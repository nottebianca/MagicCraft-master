package net.bambuki.magiccraft.villager;

import com.google.common.collect.ImmutableSet;
import net.bambuki.magiccraft.MagicCraft;
import net.bambuki.magiccraft.block.ModBlocks;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.InvocationTargetException;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, MagicCraft.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, MagicCraft.MOD_ID);
    public static final RegistryObject<PoiType> INVISIBILITY_BLOCK_POI = POI_TYPES.register("invisibility_block_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.INVISIBILITY_BLOCK.get().getStateDefinition().getPossibleStates()),
                    1, 1));
    public static final RegistryObject<VillagerProfession> INVISIBILITY_MASTER = VILLAGER_PROFESSIONS.register("invisibility_master",
            () -> new VillagerProfession("invisibility_master", x -> x.get() == INVISIBILITY_BLOCK_POI.get(),
                    x -> x.get() == INVISIBILITY_BLOCK_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_CLERIC));
    public static void registerPOIs(){
        try {
            ObfuscationReflectionHelper.findMethod(PoiType.class,
                    "registerBlockStates", PoiType.class).invoke(null, INVISIBILITY_BLOCK_POI.get());
        } catch (InvocationTargetException | IllegalAccessException exception){
            exception.printStackTrace();
        }
    }
    public static void register(IEventBus eventBus){
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
