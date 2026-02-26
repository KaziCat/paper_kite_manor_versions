package net.mcreator.papercraftmagicdecoration.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.papercraftmagicdecoration.init.PapercraftMagicDecorationModItems;
import net.mcreator.papercraftmagicdecoration.init.PapercraftMagicDecorationModBlocks;

public class PourNocturnalCatCoffeeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.brewing_stand.brew")), SoundSource.BLOCKS, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.brewing_stand.brew")), SoundSource.BLOCKS, 1, 1, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PapercraftMagicDecorationModBlocks.POT_OF_BOILED_NOCTURNAL_CAT_COFFEE.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PapercraftMagicDecorationModItems.NOCTURNAL_CAT_COFFEE.get());
				_setstack.setCount(2);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PapercraftMagicDecorationModBlocks.POT_OF_BOILED_GOLD_MEDAL_COFFEE.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PapercraftMagicDecorationModItems.GOLD_MEDAL_COFFEE.get());
				_setstack.setCount(2);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.BUCKET));
			entityToSpawn.setPickUpDelay(10);
			_level.addFreshEntity(entityToSpawn);
		}
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_INGOT));
			entityToSpawn.setPickUpDelay(10);
			_level.addFreshEntity(entityToSpawn);
		}
	}
}
