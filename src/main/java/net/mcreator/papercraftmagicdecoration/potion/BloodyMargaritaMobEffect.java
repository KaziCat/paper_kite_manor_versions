
package net.mcreator.papercraftmagicdecoration.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.papercraftmagicdecoration.procedures.SuckBloodProcedure;

public class BloodyMargaritaMobEffect extends MobEffect {
	public BloodyMargaritaMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6750157);
	}

	@Override
	public String getDescriptionId() {
		return "effect.papercraft_magic_decoration.bloodthirsty_devil";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SuckBloodProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
