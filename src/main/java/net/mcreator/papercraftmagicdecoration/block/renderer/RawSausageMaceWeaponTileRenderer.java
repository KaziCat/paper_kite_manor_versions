package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.RawSausageMaceWeaponBlockModel;
import net.mcreator.papercraftmagicdecoration.block.entity.RawSausageMaceWeaponTileEntity;

public class RawSausageMaceWeaponTileRenderer extends GeoBlockRenderer<RawSausageMaceWeaponTileEntity> {
	public RawSausageMaceWeaponTileRenderer() {
		super(new RawSausageMaceWeaponBlockModel());
	}

	@Override
	public RenderType getRenderType(RawSausageMaceWeaponTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
