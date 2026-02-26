
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.papercraftmagicdecoration.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.papercraftmagicdecoration.entity.WhiteRabbitMaidEntity;
import net.mcreator.papercraftmagicdecoration.entity.VodkaThrowEntity;
import net.mcreator.papercraftmagicdecoration.entity.PaperTigerEntity;
import net.mcreator.papercraftmagicdecoration.entity.FlyingChickenEntity;
import net.mcreator.papercraftmagicdecoration.entity.FireWhiskeyThrowEntity;
import net.mcreator.papercraftmagicdecoration.entity.BlackCatLobbyBoyEntity;
import net.mcreator.papercraftmagicdecoration.entity.AoaoEntity;
import net.mcreator.papercraftmagicdecoration.entity.AirFlowCarpEntity;
import net.mcreator.papercraftmagicdecoration.PapercraftMagicDecorationMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PapercraftMagicDecorationModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PapercraftMagicDecorationMod.MODID);
	public static final RegistryObject<EntityType<BlackCatLobbyBoyEntity>> BLACK_CAT_LOBBY_BOY = register("black_cat_lobby_boy", EntityType.Builder.<BlackCatLobbyBoyEntity>of(BlackCatLobbyBoyEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlackCatLobbyBoyEntity::new).fireImmune().sized(0.6f, 1.2f));
	public static final RegistryObject<EntityType<WhiteRabbitMaidEntity>> WHITE_RABBIT_MAID = register("white_rabbit_maid", EntityType.Builder.<WhiteRabbitMaidEntity>of(WhiteRabbitMaidEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WhiteRabbitMaidEntity::new).fireImmune().sized(0.6f, 1.2f));
	public static final RegistryObject<EntityType<AoaoEntity>> AOAO = register("aoao",
			EntityType.Builder.<AoaoEntity>of(AoaoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AoaoEntity::new).fireImmune().sized(0.6f, 1.2f));
	public static final RegistryObject<EntityType<AirFlowCarpEntity>> AIR_FLOW_CARP = register("air_flow_carp",
			EntityType.Builder.<AirFlowCarpEntity>of(AirFlowCarpEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AirFlowCarpEntity::new)

					.sized(2f, 2.8f));
	public static final RegistryObject<EntityType<PaperTigerEntity>> PAPER_TIGER = register("paper_tiger",
			EntityType.Builder.<PaperTigerEntity>of(PaperTigerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PaperTigerEntity::new)

					.sized(2f, 2.4f));
	public static final RegistryObject<EntityType<FireWhiskeyThrowEntity>> FIRE_WHISKEY_THROW = register("projectile_fire_whiskey_throw", EntityType.Builder.<FireWhiskeyThrowEntity>of(FireWhiskeyThrowEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FireWhiskeyThrowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<VodkaThrowEntity>> VODKA_THROW = register("projectile_vodka_throw",
			EntityType.Builder.<VodkaThrowEntity>of(VodkaThrowEntity::new, MobCategory.MISC).setCustomClientFactory(VodkaThrowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FlyingChickenEntity>> FLYING_CHICKEN = register("projectile_flying_chicken",
			EntityType.Builder.<FlyingChickenEntity>of(FlyingChickenEntity::new, MobCategory.MISC).setCustomClientFactory(FlyingChickenEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			BlackCatLobbyBoyEntity.init();
			WhiteRabbitMaidEntity.init();
			AoaoEntity.init();
			AirFlowCarpEntity.init();
			PaperTigerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BLACK_CAT_LOBBY_BOY.get(), BlackCatLobbyBoyEntity.createAttributes().build());
		event.put(WHITE_RABBIT_MAID.get(), WhiteRabbitMaidEntity.createAttributes().build());
		event.put(AOAO.get(), AoaoEntity.createAttributes().build());
		event.put(AIR_FLOW_CARP.get(), AirFlowCarpEntity.createAttributes().build());
		event.put(PAPER_TIGER.get(), PaperTigerEntity.createAttributes().build());
	}
}
