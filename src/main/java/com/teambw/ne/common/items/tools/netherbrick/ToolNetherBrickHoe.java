package com.teambw.ne.common.items.tools.netherbrick;

import com.teambw.ne.common.init.ModTab;
import net.minecraft.item.ItemHoe;

public class ToolNetherBrickHoe extends ItemHoe {
    public ToolNetherBrickHoe(ToolMaterial toolMaterial) {
        super(toolMaterial);
        this.setCreativeTab(ModTab.MAIN);
    }
}
