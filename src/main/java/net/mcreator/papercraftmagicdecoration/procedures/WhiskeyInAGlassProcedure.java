package net.mcreator.papercraftmagicdecoration.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.papercraftmagicdecoration.init.PapercraftMagicDecorationModItems;

public class WhiskeyInAGlassProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.brewing_stand.brew")), SoundSource.RECORDS, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.brewing_stand.brew")), SoundSource.RECORDS, 1, 1, false);
			}
		}
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(PapercraftMagicDecorationModItems.A_GLASS_OF_BLAZE_WHISKEY.get());
			_setstack.setCount(4);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
	}
}
