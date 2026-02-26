package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.display.SausageMaceWeaponBlockDisplayItem;

public class SausageMaceWeaponBlockDisplayModel extends GeoModel<SausageMaceWeaponBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SausageMaceWeaponBlockDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/sausage_mace_weapon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SausageMaceWeaponBlockDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/sausage_mace_weapon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SausageMaceWeaponBlockDisplayItem entity) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/sausage_mace_weapon.png");
	}
}
