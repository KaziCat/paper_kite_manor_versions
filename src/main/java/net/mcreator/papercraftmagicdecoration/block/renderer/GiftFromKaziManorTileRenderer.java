package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.GiftFromKaziManorBlockModel;
import net.mcreator.papercraftmagicdecoration.block.entity.GiftFromKaziManorTileEntity;

public class GiftFromKaziManorTileRenderer extends GeoBlockRenderer<GiftFromKaziManorTileEntity> {
	public GiftFromKaziManorTileRenderer() {
		super(new GiftFromKaziManorBlockModel());
	}

	@Override
	public RenderType getRenderType(GiftFromKaziManorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
