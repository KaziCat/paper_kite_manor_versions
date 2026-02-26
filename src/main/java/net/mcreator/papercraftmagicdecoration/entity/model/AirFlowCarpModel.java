package net.mcreator.papercraftmagicdecoration.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.entity.AirFlowCarpEntity;

public class AirFlowCarpModel extends GeoModel<AirFlowCarpEntity> {
	@Override
	public ResourceLocation getAnimationResource(AirFlowCarpEntity entity) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/air_flow_carp.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AirFlowCarpEntity entity) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/air_flow_carp.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AirFlowCarpEntity entity) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/entities/" + entity.getTexture() + ".png");
	}

}
