package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.entity.CollarAndHandcuffsTileEntity;

public class CollarAndHandcuffsBlockModel extends GeoModel<CollarAndHandcuffsTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CollarAndHandcuffsTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/collar_and_handcuffs.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CollarAndHandcuffsTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/collar_and_handcuffs.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CollarAndHandcuffsTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/collars_and_handcuffs.png");
	}
}
