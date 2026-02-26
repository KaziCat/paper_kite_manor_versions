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
import net.minecraft.core.BlockPos;

import net.mcreator.papercraftmagicdecoration.init.PapercraftMagicDecorationModItems;
import net.mcreator.papercraftmagicdecoration.init.PapercraftMagicDecorationModBlocks;

public class CuttingOnTheTableProcedure {
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
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PapercraftMagicDecorationModBlocks.BLACK_PAPER_BLICK.get().asItem()) {
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(PapercraftMagicDecorationModBlocks.BLACK_PAPER_BLICK.get().defaultBlockState()));
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(PapercraftMagicDecorationModBlocks.BLACK_PAPER_BLICK.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PapercraftMagicDecorationModItems.BLACK_PAPER.get());
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PapercraftMagicDecorationModBlocks.WHITE_PAPER_BLOCK.get().asItem()) {
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(PapercraftMagicDecorationModBlocks.WHITE_PAPER_BLOCK.get().defaultBlockState()));
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(PapercraftMagicDecorationModBlocks.WHITE_PAPER_BLOCK.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PapercraftMagicDecorationModItems.WHITE_PAPER.get());
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PapercraftMagicDecorationModBlocks.RED_PAPER_BLOCK.get().asItem()) {
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(PapercraftMagicDecorationModBlocks.RED_PAPER_BLOCK.get().defaultBlockState()));
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(PapercraftMagicDecorationModBlocks.RED_PAPER_BLOCK.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PapercraftMagicDecorationModItems.RED_PAPER.get());
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PapercraftMagicDecorationModBlocks.BLUE_PAPER_BLOCK.get().asItem()) {
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(PapercraftMagicDecorationModBlocks.BLUE_PAPER_BLOCK.get().defaultBlockState()));
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(PapercraftMagicDecorationModBlocks.BLUE_PAPER_BLOCK.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PapercraftMagicDecorationModItems.BLUE_PAPER.get());
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PapercraftMagicDecorationModBlocks.YELLOW_PAPER_BLOCK.get().asItem()) {
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(PapercraftMagicDecorationModBlocks.YELLOW_PAPER_BLOCK.get().defaultBlockState()));
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(PapercraftMagicDecorationModBlocks.YELLOW_PAPER_BLOCK.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PapercraftMagicDecorationModItems.YELLOW_PAPER.get());
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PapercraftMagicDecorationModBlocks.DEWY_MEMBRANE_BLOCK.get().asItem()) {
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(PapercraftMagicDecorationModBlocks.DEWY_MEMBRANE_BLOCK.get().defaultBlockState()));
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(PapercraftMagicDecorationModBlocks.DEWY_MEMBRANE_BLOCK.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PapercraftMagicDecorationModItems.DEWY_MEMBRANE.get());
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PapercraftMagicDecorationModBlocks.COTTON_SERGE_BLOCK.get().asItem()) {
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(PapercraftMagicDecorationModBlocks.COTTON_SERGE_BLOCK.get().defaultBlockState()));
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(PapercraftMagicDecorationModBlocks.COTTON_SERGE_BLOCK.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PapercraftMagicDecorationModItems.COTTON_SERGE.get());
				_setstack.setCount(8);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PapercraftMagicDecorationModItems.WOODWORKING_TABLE_ORIGAMI.get()) {
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.AMETHYST_CLUSTER.defaultBlockState()));
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(PapercraftMagicDecorationModItems.WOODWORKING_TABLE_ORIGAMI.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PapercraftMagicDecorationModBlocks.WOODWORKING_TABLE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
