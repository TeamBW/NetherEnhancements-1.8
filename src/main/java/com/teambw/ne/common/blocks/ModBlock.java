package com.teambw.ne.common.blocks;

import com.teambw.ne.common.init.ModTab;
import com.teambw.ne.common.util.Info;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlock extends Block {
    public ModBlock(Material material) {
        super(material);
        this.setCreativeTab(ModTab.MAIN);
    }
    @Override
    public String getUnlocalizedName() {

        return String.format("tile.%s%s", Info.ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
