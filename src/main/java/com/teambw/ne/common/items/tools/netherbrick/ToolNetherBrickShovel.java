package com.teambw.ne.common.items.tools.netherbrick;

import com.teambw.ne.common.init.ModTab;
import net.minecraft.item.ItemSpade;

public class ToolNetherBrickShovel extends ItemSpade {
    public ToolNetherBrickShovel(ToolMaterial toolMaterial) {
        super(toolMaterial);
        this.setCreativeTab(ModTab.MAIN);
    }
}
