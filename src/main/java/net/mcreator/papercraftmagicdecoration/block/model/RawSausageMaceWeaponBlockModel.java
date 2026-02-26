package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.entity.RawSausageMaceWeaponTileEntity;

public class RawSausageMaceWeaponBlockModel extends GeoModel<RawSausageMaceWeaponTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RawSausageMaceWeaponTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/sausage_mace_weapon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RawSausageMaceWeaponTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/sausage_mace_weapon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RawSausageMaceWeaponTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/raw_sausage_mace_weapon.png");
	}
}
