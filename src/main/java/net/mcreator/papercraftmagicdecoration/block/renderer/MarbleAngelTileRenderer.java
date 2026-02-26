package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.MarbleAngelBlockModel;
import net.mcreator.papercraftmagicdecoration.block.entity.MarbleAngelTileEntity;

public class MarbleAngelTileRenderer extends GeoBlockRenderer<MarbleAngelTileEntity> {
	public MarbleAngelTileRenderer() {
		super(new MarbleAngelBlockModel());
	}

	@Override
	public RenderType getRenderType(MarbleAngelTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
