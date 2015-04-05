package com.teambw.ne.common.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.teambw.ne.client.renderer.ModelVariant;
import com.teambw.ne.common.NetherEnhancements;
import com.teambw.ne.common.items.test.ItemTest;

public class RegisterItems
{
	public Item itemTest;

    public ItemSword toolNetherBrickSword;

	public void preInit()
	{
		this.itemTest = this.registerItem("itemTest", new ItemTest());

        //Tools
	}

	private <T extends Item> T registerItem(String name, T item) {
		item.setUnlocalizedName(name);
		GameRegistry.registerItem(item, name);

		return item;
	}

	public void init() {
		if (NetherEnhancements.proxy.getModels() != null) {
			ModelVariant models = NetherEnhancements.proxy.getModels();

			models.registerItemRenderer(this.itemTest, 0);
		}
	}
}
