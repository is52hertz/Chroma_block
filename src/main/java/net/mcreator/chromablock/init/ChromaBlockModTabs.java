
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chromablock.init;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.chromablock.block.ChromaBlockWhiteBlock;

public class ChromaBlockModTabs {
	public static ItemGroup TAB_CHROMA_BLOCK;

	public static void load() {
		TAB_CHROMA_BLOCK = new ItemGroup("tabchroma_block") {
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ChromaBlockWhiteBlock.block);
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
}
