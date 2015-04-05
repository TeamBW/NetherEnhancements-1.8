package com.teambw.ne.common.items.tools.netherbrick;

import com.teambw.ne.common.init.ModTab;
import net.minecraft.item.ItemSword;

public class ToolNetherBrickSword extends ItemSword {
    public ToolNetherBrickSword(ToolMaterial toolMaterial) {
        super(toolMaterial);
        this.setCreativeTab(ModTab.MAIN);
    }
}
