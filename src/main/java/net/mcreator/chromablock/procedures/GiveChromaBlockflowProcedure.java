package net.mcreator.chromablock.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.chromablock.block.ChromaBlockWhiteBlock;
import net.mcreator.chromablock.block.ChromaBlockRedBlock;
import net.mcreator.chromablock.block.ChromaBlockGreenBlock;
import net.mcreator.chromablock.block.ChromaBlockBlueBlock;
import net.mcreator.chromablock.block.ChromaBlockBlackBlock;
import net.mcreator.chromablock.ChromaBlockMod;

import java.util.Map;

public class GiveChromaBlockflowProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ChromaBlockMod.LOGGER.warn("Failed to load dependency entity for procedure GiveChromaBlockflow!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double NUMBER = 0;
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(ChromaBlockWhiteBlock.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(ChromaBlockBlackBlock.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(ChromaBlockRedBlock.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(ChromaBlockGreenBlock.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(ChromaBlockBlueBlock.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}
}
