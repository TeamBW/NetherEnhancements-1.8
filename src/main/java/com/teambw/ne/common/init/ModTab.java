package com.teambw.ne.common.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ModTab
{
	public static final CreativeTabs MAIN = new CreativeTabs("ne")
	{
		@Override
		public Item getTabIconItem()
		{
			return Items.netherbrick;
		}
	};
}
