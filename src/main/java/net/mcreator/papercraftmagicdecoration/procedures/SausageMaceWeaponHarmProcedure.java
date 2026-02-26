package net.mcreator.papercraftmagicdecoration.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class SausageMaceWeaponHarmProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		entity.setDeltaMovement(new Vec3((sourceentity.getLookAngle().x * 4), (sourceentity.getLookAngle().y + 0.5), (sourceentity.getLookAngle().z * 4)));
	}
}
