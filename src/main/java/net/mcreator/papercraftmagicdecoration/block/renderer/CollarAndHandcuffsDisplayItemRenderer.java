package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.CollarAndHandcuffsDisplayModel;
import net.mcreator.papercraftmagicdecoration.block.display.CollarAndHandcuffsDisplayItem;

public class CollarAndHandcuffsDisplayItemRenderer extends GeoItemRenderer<CollarAndHandcuffsDisplayItem> {
	public CollarAndHandcuffsDisplayItemRenderer() {
		super(new CollarAndHandcuffsDisplayModel());
	}

	@Override
	public RenderType getRenderType(CollarAndHandcuffsDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
