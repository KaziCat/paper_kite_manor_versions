package net.mcreator.papercraftmagicdecoration.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.item.SausageMaceWeaponItem;

public class SausageMaceWeaponItemModel extends GeoModel<SausageMaceWeaponItem> {
	@Override
	public ResourceLocation getAnimationResource(SausageMaceWeaponItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/sausage_mace_weapon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SausageMaceWeaponItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/sausage_mace_weapon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SausageMaceWeaponItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/item/sausage_mace_weapon.png");
	}
}
