package com.teambw.ne.common.init;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModTab {
    public static final CreativeTabs MAIN = new CreativeTabs("ne") {
        @Override
        public Item getTabIconItem() {
            return Items.netherbrick;
        }
    };
}
