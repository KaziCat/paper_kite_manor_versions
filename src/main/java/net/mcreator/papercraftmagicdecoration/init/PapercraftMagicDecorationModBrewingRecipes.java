
package net.mcreator.papercraftmagicdecoration.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.recipe.vanilla.IVanillaRecipeFactory;
import mezz.jei.api.recipe.vanilla.IJeiBrewingRecipe;
import mezz.jei.api.constants.RecipeTypes;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.List;
import java.util.ArrayList;

@JeiPlugin
public class PapercraftMagicDecorationModBrewingRecipes implements IModPlugin {
	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("papercraft_magic_decoration:brewing_recipes");
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		IVanillaRecipeFactory factory = registration.getVanillaRecipeFactory();
		List<IJeiBrewingRecipe> brewingRecipes = new ArrayList<>();
		ItemStack potion = new ItemStack(Items.POTION);
		ItemStack potion2 = new ItemStack(Items.POTION);
		List<ItemStack> ingredientStack = new ArrayList<>();
		List<ItemStack> inputStack = new ArrayList<>();
		ingredientStack.add(new ItemStack(Items.BLAZE_POWDER));
		inputStack.add(new ItemStack(PapercraftMagicDecorationModItems.WHISKEYRAW.get()));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), List.copyOf(inputStack), new ItemStack(PapercraftMagicDecorationModBlocks.BLAZEWHISKEY.get())));
		inputStack.clear();
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(Blocks.SEA_PICKLE));
		inputStack.add(new ItemStack(PapercraftMagicDecorationModItems.WHISKEYRAW.get()));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), List.copyOf(inputStack), new ItemStack(PapercraftMagicDecorationModBlocks.FERRY_WHISKEY.get())));
		inputStack.clear();
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(Blocks.WARPED_FUNGUS));
		inputStack.add(new ItemStack(PapercraftMagicDecorationModItems.WHISKEYRAW.get()));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), List.copyOf(inputStack), new ItemStack(PapercraftMagicDecorationModBlocks.FLY_WHISKEY.get())));
		inputStack.clear();
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(Blocks.CACTUS));
		inputStack.add(new ItemStack(PapercraftMagicDecorationModItems.WHISKEYRAW.get()));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), List.copyOf(inputStack), new ItemStack(PapercraftMagicDecorationModBlocks.LUCKY_CACTUS.get())));
		inputStack.clear();
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(Blocks.WITHER_ROSE));
		inputStack.add(new ItemStack(PapercraftMagicDecorationModItems.WHISKEYRAW.get()));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), List.copyOf(inputStack), new ItemStack(PapercraftMagicDecorationModBlocks.POISON_RUM.get())));
		inputStack.clear();
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(Blocks.TORCHFLOWER));
		inputStack.add(new ItemStack(PapercraftMagicDecorationModItems.WHISKEYRAW.get()));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), List.copyOf(inputStack), new ItemStack(PapercraftMagicDecorationModBlocks.PACK_OF_GUANG_S.get())));
		inputStack.clear();
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(Items.APPLE));
		inputStack.add(new ItemStack(PapercraftMagicDecorationModItems.WHISKEYRAW.get()));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), List.copyOf(inputStack), new ItemStack(PapercraftMagicDecorationModBlocks.LAND_NO_1.get())));
		inputStack.clear();
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(PapercraftMagicDecorationModItems.BOTTLE_VITALITY_SPORES.get()));
		inputStack.add(new ItemStack(Blocks.CORNFLOWER));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), List.copyOf(inputStack), new ItemStack(PapercraftMagicDecorationModBlocks.FORGET_ME_NOT.get())));
		inputStack.clear();
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(PapercraftMagicDecorationModItems.BOTTLE_VITALITY_SPORES.get()));
		inputStack.add(new ItemStack(Blocks.DARK_OAK_SAPLING));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), List.copyOf(inputStack), new ItemStack(PapercraftMagicDecorationModItems.GLOW_CASHEWS.get())));
		inputStack.clear();
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(PapercraftMagicDecorationModItems.BOTTLE_VITALITY_SPORES.get()));
		inputStack.add(new ItemStack(Blocks.JUNGLE_SAPLING));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), List.copyOf(inputStack), new ItemStack(PapercraftMagicDecorationModBlocks.MINI_PALM_TREE.get())));
		inputStack.clear();
		ingredientStack.clear();
		registration.addRecipes(RecipeTypes.BREWING, brewingRecipes);
	}
}
