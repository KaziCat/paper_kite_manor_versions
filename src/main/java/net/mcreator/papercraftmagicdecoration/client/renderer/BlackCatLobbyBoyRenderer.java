
package net.mcreator.papercraftmagicdecoration.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.entity.model.BlackCatLobbyBoyModel;
import net.mcreator.papercraftmagicdecoration.entity.layer.BlackCatLobbyBoyLayer;
import net.mcreator.papercraftmagicdecoration.entity.BlackCatLobbyBoyEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BlackCatLobbyBoyRenderer extends GeoEntityRenderer<BlackCatLobbyBoyEntity> {
	public BlackCatLobbyBoyRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new BlackCatLobbyBoyModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new BlackCatLobbyBoyLayer(this));
	}

	@Override
	public RenderType getRenderType(BlackCatLobbyBoyEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, BlackCatLobbyBoyEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
