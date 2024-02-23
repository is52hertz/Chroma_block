
package net.mcreator.chromablock.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.chromablock.init.ChromaBlockModTabs;
import net.mcreator.chromablock.ChromaBlockModElements;

import java.util.List;

@ChromaBlockModElements.ModElement.Tag
public class KillSwordItem extends ChromaBlockModElements.ModElement {
	@ObjectHolder("chroma_block:kill_sword")
	public static final Item block = null;

	public KillSwordItem(ChromaBlockModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 0;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 9997f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 100;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().group(ChromaBlockModTabs.TAB_CHROMA_BLOCK).isImmuneToFire()) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("Kill everything"));
			}
		}.setRegistryName("kill_sword"));
	}
}
