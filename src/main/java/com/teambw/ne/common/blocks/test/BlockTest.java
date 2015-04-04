package com.teambw.ne.common.blocks.test;

import com.teambw.ne.common.blocks.ModBlock;
import net.minecraft.block.material.Material;

public class BlockTest extends ModBlock {
    public BlockTest(Material material) {
        super(material);
        this.setUnlocalizedName("testBlock");
    }
}
