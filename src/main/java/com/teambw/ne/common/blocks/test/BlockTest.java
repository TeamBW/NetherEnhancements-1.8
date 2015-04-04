package com.teambw.ne.common.blocks.test;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.teambw.ne.common.init.ModTab;

public class BlockTest extends Block {
	public BlockTest(Material material) {
		super(material);
		this.setCreativeTab(ModTab.MAIN);
	}
}
