package com.teambw.ne.common.init;

import net.minecraftforge.oredict.OreDictionary;

public class RegisterOres {
    public static void init() {
        /**
         * Blocks
         */

        //Test
        OreDictionary.registerOre("testBlock", RegisterBlocks.blockTest);

        /**
         * Items
         */

        //Test
        OreDictionary.registerOre("testItem", RegisterItems.itemTest);
    }
}
