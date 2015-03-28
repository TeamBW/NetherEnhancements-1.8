package com.teambw.ne.common.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ModTab {
    public static final CreativeTabs MAIN = new CreativeTabs("NetherEnhancements".toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return Items.apple;
        }
    };
}
