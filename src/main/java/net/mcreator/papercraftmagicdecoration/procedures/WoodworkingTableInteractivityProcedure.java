package net.mcreator.papercraftmagicdecoration.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.papercraftmagicdecoration.init.PapercraftMagicDecorationModItems;
import net.mcreator.papercraftmagicdecoration.init.PapercraftMagicDecorationModBlocks;

public class WoodworkingTableInteractivityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			int _value = 1;
			BlockPos _pos = BlockPos.containing(x, y, z);
			BlockState _bs = world.getBlockState(_pos);
			if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
				world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("minecraft:wooden_furniture_series_01")))) {
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.AMETHYST_CLUSTER.defaultBlockState()));
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PapercraftMagicDecorationModItems.LOWCABINET_WITH_TABLECLOTH_ORIGAMI.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(PapercraftMagicDecorationModBlocks.LOWCABINET_WITH_TABLECLOTH.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PapercraftMagicDecorationModItems.WOODEN_BARREL_BOOKSHELF_ORIGAMI.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(PapercraftMagicDecorationModBlocks.WOODEN_BARREL_BOOKSHELF.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PapercraftMagicDecorationModItems.EDGED_CHALKBOARD_ORIGAMI.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(PapercraftMagicDecorationModBlocks.EDGED_CHALKBOARD.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PapercraftMagicDecorationModItems.LONG_STORAGE_TABLE_ORIGAMI.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(PapercraftMagicDecorationModBlocks.LONG_STORAGE_TABLE.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PapercraftMagicDecorationModItems.CUPBOARD_ORIGAMI.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(PapercraftMagicDecorationModBlocks.CUPBOARD.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PapercraftMagicDecorationModItems.OLD_ORGAN_ORIGAMI.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(PapercraftMagicDecorationModBlocks.OLD_ORGAN.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PapercraftMagicDecorationModItems.LARGE_DINING_TABLE_ORIGAMI.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(PapercraftMagicDecorationModBlocks.LARGE_DINING_TABLE.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PapercraftMagicDecorationModItems.RED_VELVET_CHAISE_LONGUE_ORIGAMI.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(PapercraftMagicDecorationModBlocks.RED_VELVET_CHAISE_LONGUE.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PapercraftMagicDecorationModItems.FIREPLACE_DECORATION_ORIGAMI.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(PapercraftMagicDecorationModBlocks.FIREPLACE_DECORATION.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
