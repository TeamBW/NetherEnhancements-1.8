package com.teambw.ne.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.teambw.ne.client.renderer.ModelVariant;
import com.teambw.ne.common.NetherEnhancements;
import com.teambw.ne.common.blocks.ores.BlockNetherCoal;
import com.teambw.ne.common.blocks.test.BlockTest;

public class RegisterBlocks
{
	public Block blockTest, blockNetherCoal;

	public void preInit()
	{
		blockTest = this.registerBlock("blockTest", new BlockTest(Material.ground));
		blockNetherCoal = this.registerBlock("blockNetherCoal", new BlockNetherCoal(Material.rock));
	}

	private <T extends Block> T registerBlock(String name, T block)
	{
		block.setUnlocalizedName(name);
		GameRegistry.registerBlock(block, name);

		return block;
	}

	public void init()
	{
		if (NetherEnhancements.proxy.getModels() != null)
		{
			ModelVariant models = NetherEnhancements.proxy.getModels();

			models.registerItemRenderer(blockTest, 0);
			models.registerItemRenderer(blockNetherCoal, 0);
		}
	}
}
