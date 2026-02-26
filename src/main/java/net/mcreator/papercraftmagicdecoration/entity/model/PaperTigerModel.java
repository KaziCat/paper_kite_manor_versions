package net.mcreator.papercraftmagicdecoration.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.entity.PaperTigerEntity;

public class PaperTigerModel extends GeoModel<PaperTigerEntity> {
	@Override
	public ResourceLocation getAnimationResource(PaperTigerEntity entity) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/paper_tiger.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PaperTigerEntity entity) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/paper_tiger.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PaperTigerEntity entity) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/entities/" + entity.getTexture() + ".png");
	}

}
