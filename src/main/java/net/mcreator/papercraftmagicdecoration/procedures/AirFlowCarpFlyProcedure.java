package net.mcreator.papercraftmagicdecoration.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class AirFlowCarpFlyProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isVehicle() && entity.getLookAngle().y > 0.1 && entity.getLookAngle().y <= 0.5) {
			entity.setDeltaMovement(new Vec3(0, 0.1, 0));
		} else if (entity.isVehicle() && entity.getLookAngle().y < -0.3 && entity.getLookAngle().y >= -0.6) {
			entity.setDeltaMovement(new Vec3(0, (-0.1), 0));
		} else if (entity.isVehicle() && entity.getLookAngle().y > 0.5) {
			entity.setDeltaMovement(new Vec3(0, 0.2, 0));
		} else if (entity.isVehicle() && entity.getLookAngle().y < -0.6) {
			entity.setDeltaMovement(new Vec3(0, (-0.2), 0));
		}
	}
}
