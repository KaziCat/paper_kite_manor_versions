package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.entity.MarbleAngelTileEntity;

public class MarbleAngelBlockModel extends GeoModel<MarbleAngelTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MarbleAngelTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/marble_angel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MarbleAngelTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/marble_angel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MarbleAngelTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/marble_angel.png");
	}
}
