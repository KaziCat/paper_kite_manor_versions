package net.mcreator.papercraftmagicdecoration.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class OpenTheCocktailrecipebookProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		(entity instanceof LivingEntity _entUseItem0 ? _entUseItem0.getUseItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("recipe", 0);
	}
}
