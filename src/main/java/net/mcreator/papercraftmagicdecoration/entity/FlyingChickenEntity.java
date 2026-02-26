
package net.mcreator.papercraftmagicdecoration.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.papercraftmagicdecoration.procedures.HitByFlyingChickenProcedure;
import net.mcreator.papercraftmagicdecoration.init.PapercraftMagicDecorationModItems;
import net.mcreator.papercraftmagicdecoration.init.PapercraftMagicDecorationModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class FlyingChickenEntity extends AbstractArrow implements ItemSupplier {
	public static final ItemStack PROJECTILE_ITEM = new ItemStack(PapercraftMagicDecorationModItems.FRIED_CHICKEN_LEG.get());

	public FlyingChickenEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(PapercraftMagicDecorationModEntities.FLYING_CHICKEN.get(), world);
	}

	public FlyingChickenEntity(EntityType<? extends FlyingChickenEntity> type, Level world) {
		super(type, world);
	}

	public FlyingChickenEntity(EntityType<? extends FlyingChickenEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public FlyingChickenEntity(EntityType<? extends FlyingChickenEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected ItemStack getPickupItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		HitByFlyingChickenProcedure.execute(entityHitResult.getEntity(), this.getOwner());
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static FlyingChickenEntity shoot(Level world, LivingEntity entity, RandomSource source) {
		return shoot(world, entity, source, 1f, 5, 1);
	}

	public static FlyingChickenEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		FlyingChickenEntity entityarrow = new FlyingChickenEntity(PapercraftMagicDecorationModEntities.FLYING_CHICKEN.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(true);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.splash_potion.throw")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static FlyingChickenEntity shoot(LivingEntity entity, LivingEntity target) {
		FlyingChickenEntity entityarrow = new FlyingChickenEntity(PapercraftMagicDecorationModEntities.FLYING_CHICKEN.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(5);
		entityarrow.setKnockback(1);
		entityarrow.setCritArrow(true);
		entity.level().addFreshEntity(entityarrow);
		entity.level().playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.splash_potion.throw")), SoundSource.PLAYERS, 1,
				1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
