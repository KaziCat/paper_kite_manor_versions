package net.mcreator.papercraftmagicdecoration.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.papercraftmagicdecoration.init.PapercraftMagicDecorationModMobEffects;

public class DevilMargaritaEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 120, 1, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(PapercraftMagicDecorationModMobEffects.BLOODTHIRSTY_DEVIL.get(), 6000, 1, false, false));
	}
}
