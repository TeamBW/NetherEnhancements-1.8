package com.teambw.ne.common.init;

import com.teambw.ne.common.items.test.ItemTest;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterItems {

    public static ItemTest itemTest;

    public static void init() {
        itemTest = new ItemTest();
        GameRegistry.registerItem(itemTest, "itemTest");
    }
}
