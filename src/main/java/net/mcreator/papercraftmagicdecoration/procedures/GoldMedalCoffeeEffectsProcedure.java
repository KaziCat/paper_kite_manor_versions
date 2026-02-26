package net.mcreator.papercraftmagicdecoration.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class GoldMedalCoffeeEffectsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		NocturnalCatCoffeeEffectsProcedure.execute(entity);
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1, false, false));
	}
}
