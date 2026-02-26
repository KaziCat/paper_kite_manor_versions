package net.mcreator.papercraftmagicdecoration.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.papercraftmagicdecoration.init.PapercraftMagicDecorationModItems;
import net.mcreator.papercraftmagicdecoration.init.PapercraftMagicDecorationModBlocks;

public class TakeOutTheFriedChickenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(PapercraftMagicDecorationModBlocks.BUCKET_OF_FRIED_CHICKEN.get().defaultBlockState()));
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(PapercraftMagicDecorationModItems.FRIED_CHICKEN_LEG.get());
			_setstack.setCount(4);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
	}
}
