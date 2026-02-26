package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.SausageMaceWeaponBlockBlockModel;
import net.mcreator.papercraftmagicdecoration.block.entity.SausageMaceWeaponBlockTileEntity;

public class SausageMaceWeaponBlockTileRenderer extends GeoBlockRenderer<SausageMaceWeaponBlockTileEntity> {
	public SausageMaceWeaponBlockTileRenderer() {
		super(new SausageMaceWeaponBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(SausageMaceWeaponBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
