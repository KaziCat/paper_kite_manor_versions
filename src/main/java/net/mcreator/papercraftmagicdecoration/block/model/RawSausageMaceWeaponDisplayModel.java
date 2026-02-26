package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.display.RawSausageMaceWeaponDisplayItem;

public class RawSausageMaceWeaponDisplayModel extends GeoModel<RawSausageMaceWeaponDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RawSausageMaceWeaponDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/sausage_mace_weapon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RawSausageMaceWeaponDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/sausage_mace_weapon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RawSausageMaceWeaponDisplayItem entity) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/raw_sausage_mace_weapon.png");
	}
}
