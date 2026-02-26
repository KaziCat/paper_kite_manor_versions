
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.papercraftmagicdecoration.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.PapercraftMagicDecorationMod;

public class PapercraftMagicDecorationModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PapercraftMagicDecorationMod.MODID);
	public static final RegistryObject<SoundEvent> KAZI_STAR = REGISTRY.register("kazi_star", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("papercraft_magic_decoration", "kazi_star")));
	public static final RegistryObject<SoundEvent> ORGAN_MUSIC = REGISTRY.register("organ_music", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("papercraft_magic_decoration", "organ_music")));
	public static final RegistryObject<SoundEvent> AOAO_IDLE = REGISTRY.register("aoao_idle", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("papercraft_magic_decoration", "aoao_idle")));
	public static final RegistryObject<SoundEvent> AOAO_HURT = REGISTRY.register("aoao_hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("papercraft_magic_decoration", "aoao_hurt")));
	public static final RegistryObject<SoundEvent> AOAO_DEATH = REGISTRY.register("aoao_death", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("papercraft_magic_decoration", "aoao_death")));
	public static final RegistryObject<SoundEvent> LOUD_BUTTON = REGISTRY.register("loud_button", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("papercraft_magic_decoration", "loud_button")));
	public static final RegistryObject<SoundEvent> PAPER_TIGER_DEATH = REGISTRY.register("paper_tiger_death", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("papercraft_magic_decoration", "paper_tiger_death")));
	public static final RegistryObject<SoundEvent> PAPER_TIGER_IDLE = REGISTRY.register("paper_tiger_idle", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("papercraft_magic_decoration", "paper_tiger_idle")));
	public static final RegistryObject<SoundEvent> COCKTAIL_SHAKING = REGISTRY.register("cocktail_shaking", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("papercraft_magic_decoration", "cocktail_shaking")));
}
