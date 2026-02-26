package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.entity.KaziLuckycatTileEntity;

public class KaziLuckycatBlockModel extends GeoModel<KaziLuckycatTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(KaziLuckycatTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/kazi_lucky_cat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(KaziLuckycatTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/kazi_lucky_cat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(KaziLuckycatTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/kazi_lucky_cat.png");
	}
}
