package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.display.CollarAndHandcuffsDisplayItem;

public class CollarAndHandcuffsDisplayModel extends GeoModel<CollarAndHandcuffsDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CollarAndHandcuffsDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/collar_and_handcuffs.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CollarAndHandcuffsDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/collar_and_handcuffs.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CollarAndHandcuffsDisplayItem entity) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/collars_and_handcuffs.png");
	}
}
