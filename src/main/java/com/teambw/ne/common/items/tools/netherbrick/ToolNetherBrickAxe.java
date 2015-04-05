package com.teambw.ne.common.items.tools.netherbrick;

import com.teambw.ne.common.init.ModTab;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSpade;

public class ToolNetherBrickAxe extends ItemAxe {
    public ToolNetherBrickAxe(ToolMaterial toolMaterial) {
        super(toolMaterial);
        this.setCreativeTab(ModTab.MAIN);
    }
}
