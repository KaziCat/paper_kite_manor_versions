package net.mcreator.papercraftmagicdecoration.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class CocktailRecipeBookUiButtonEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entUseItem0 ? _entUseItem0.getUseItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("recipe") <= 2) {
			(entity instanceof LivingEntity _entUseItem4 ? _entUseItem4.getUseItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("recipe",
					((entity instanceof LivingEntity _entUseItem2 ? _entUseItem2.getUseItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("recipe") + 1));
		} else {
			(entity instanceof LivingEntity _entUseItem6 ? _entUseItem6.getUseItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("recipe", 1);
		}
	}
}
