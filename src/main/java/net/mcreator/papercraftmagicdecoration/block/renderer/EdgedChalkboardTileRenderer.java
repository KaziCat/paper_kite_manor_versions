package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.EdgedChalkboardBlockModel;
import net.mcreator.papercraftmagicdecoration.block.entity.EdgedChalkboardTileEntity;

public class EdgedChalkboardTileRenderer extends GeoBlockRenderer<EdgedChalkboardTileEntity> {
	public EdgedChalkboardTileRenderer() {
		super(new EdgedChalkboardBlockModel());
	}

	@Override
	public RenderType getRenderType(EdgedChalkboardTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
