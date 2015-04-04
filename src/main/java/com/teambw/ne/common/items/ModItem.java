package com.teambw.ne.common.items;

import com.teambw.ne.common.init.ModTab;
import com.teambw.ne.common.util.Info;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModItem extends Item {
    public ModItem() {
        super();
        this.setCreativeTab(ModTab.MAIN);
    }
    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", Info.ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return String.format("item.%s%s", Info.ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
