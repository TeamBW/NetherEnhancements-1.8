package com.teambw.ne.common.items.tools.netherbrick;

import com.teambw.ne.common.init.ModTab;
import net.minecraft.item.ItemPickaxe;

public class ToolNetherBrickPickaxe extends ItemPickaxe {
    public ToolNetherBrickPickaxe(ToolMaterial toolMaterial) {
        super(toolMaterial);
        this.setCreativeTab(ModTab.MAIN);
    }
}
