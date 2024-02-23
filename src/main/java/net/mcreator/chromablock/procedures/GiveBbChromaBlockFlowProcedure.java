package net.mcreator.chromablock.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.chromablock.block.BbChromaBlockRedBlock;
import net.mcreator.chromablock.block.BbChromaBlockPinkBlock;
import net.mcreator.chromablock.block.BbChromaBlockGreenBlock;
import net.mcreator.chromablock.block.BbChromaBlockCyanBlock;
import net.mcreator.chromablock.block.BbChromaBlockBlueBlock;
import net.mcreator.chromablock.ChromaBlockMod;

import java.util.Map;

public class GiveBbChromaBlockFlowProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ChromaBlockMod.LOGGER.warn("Failed to load dependency entity for procedure GiveBbChromaBlockFlow!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(BbChromaBlockGreenBlock.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(BbChromaBlockRedBlock.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(BbChromaBlockBlueBlock.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(BbChromaBlockCyanBlock.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(BbChromaBlockPinkBlock.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}
}
