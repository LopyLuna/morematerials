package net.xuwu.morematerials.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xuwu.morematerials.MoreMaterials;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MoreMaterials.MOD_ID);


    public static RegistryObject<SoundEvent> BLOCK_BREAK = registerSoundEvent("block_break");
    public static RegistryObject<SoundEvent> BLOCK_STEP = registerSoundEvent("block_step");
    public static RegistryObject<SoundEvent> BLOCK_PLACE = registerSoundEvent("block_place");
    public static RegistryObject<SoundEvent> BLOCK_HIT = registerSoundEvent("block_hit");
    public static RegistryObject<SoundEvent> BLOCK_FALL = registerSoundEvent("block_fall");

    public static final ForgeSoundType BLOCK = new ForgeSoundType(1f, 1f,
            ModSounds.BLOCK_BREAK, ModSounds.BLOCK_STEP, ModSounds.BLOCK_PLACE,
            ModSounds.BLOCK_HIT, ModSounds.BLOCK_FALL);

    public static RegistryObject<SoundEvent> PEARL_BREAK = registerSoundEvent("pearl_break");
    public static RegistryObject<SoundEvent> PEARL_STEP = registerSoundEvent("pearl_step");
    public static RegistryObject<SoundEvent> PEAL_PLACE = registerSoundEvent("pearl_place");
    public static RegistryObject<SoundEvent> PEAL_HIT = registerSoundEvent("pearl_hit");
    public static RegistryObject<SoundEvent> PEAL_FALL = registerSoundEvent("pearl_fall");

    public static final ForgeSoundType PEARL = new ForgeSoundType(1f, 1f,
            ModSounds.PEARL_BREAK, ModSounds.PEARL_STEP, ModSounds.PEAL_PLACE,
            ModSounds.PEAL_HIT, ModSounds.PEAL_FALL);


    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(MoreMaterials.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
