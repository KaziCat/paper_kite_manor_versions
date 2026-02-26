package net.mcreator.papercraftmagicdecoration.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.entity.WhiteRabbitMaidEntity;

public class WhiteRabbitMaidModel extends GeoModel<WhiteRabbitMaidEntity> {
	@Override
	public ResourceLocation getAnimationResource(WhiteRabbitMaidEntity entity) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/white_rabbit_maid.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WhiteRabbitMaidEntity entity) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/white_rabbit_maid.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WhiteRabbitMaidEntity entity) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(WhiteRabbitMaidEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
