
package net.mcreator.papercraftmagicdecoration.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.papercraftmagicdecoration.procedures.CatEyeEffectsProcedure;

public class CatEyeMobEffect extends MobEffect {
	public CatEyeMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13434676);
	}

	@Override
	public String getDescriptionId() {
		return "effect.papercraft_magic_decoration.cat_eye";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		CatEyeEffectsProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
