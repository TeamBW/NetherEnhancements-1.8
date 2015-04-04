package com.teambw.ne.common.init;

import net.minecraftforge.oredict.OreDictionary;

import com.teambw.ne.common.NetherEnhancements;

public class RegisterOres
{
	public static void init()
	{
		/**
		 * Blocks
		 */

		//Test
		OreDictionary.registerOre("testBlock", NetherEnhancements.getBlocks().blockTest);

		/**
		 * Items
		 */

		//Test
		OreDictionary.registerOre("testItem", NetherEnhancements.getItems().itemTest);
	}
}
