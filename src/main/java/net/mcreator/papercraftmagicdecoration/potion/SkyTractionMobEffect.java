
package net.mcreator.papercraftmagicdecoration.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.papercraftmagicdecoration.procedures.SkyTractionEffectsProcedure;

public class SkyTractionMobEffect extends MobEffect {
	public SkyTractionMobEffect() {
		super(MobEffectCategory.NEUTRAL, -256);
	}

	@Override
	public String getDescriptionId() {
		return "effect.papercraft_magic_decoration.sky_traction";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SkyTractionEffectsProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
