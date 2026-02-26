
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.papercraftmagicdecoration.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.papercraftmagicdecoration.potion.SkyTractionMobEffect;
import net.mcreator.papercraftmagicdecoration.potion.CatEyeMobEffect;
import net.mcreator.papercraftmagicdecoration.potion.BloodyMargaritaMobEffect;
import net.mcreator.papercraftmagicdecoration.PapercraftMagicDecorationMod;

public class PapercraftMagicDecorationModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PapercraftMagicDecorationMod.MODID);
	public static final RegistryObject<MobEffect> BLOODTHIRSTY_DEVIL = REGISTRY.register("bloodthirsty_devil", () -> new BloodyMargaritaMobEffect());
	public static final RegistryObject<MobEffect> CAT_EYE = REGISTRY.register("cat_eye", () -> new CatEyeMobEffect());
	public static final RegistryObject<MobEffect> SKY_TRACTION = REGISTRY.register("sky_traction", () -> new SkyTractionMobEffect());
}
