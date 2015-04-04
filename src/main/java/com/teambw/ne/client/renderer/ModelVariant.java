package com.teambw.ne.client.renderer;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.teambw.ne.common.util.Info;

@SideOnly(Side.CLIENT)
public class ModelVariant {
	public void registerItemRenderer(Block block, int meta) {
		this.registerItemRenderer(Item.getItemFromBlock(block), meta);
	}

	public void registerItemRenderer(Item item, int meta) {
		String name = (Info.ID + ":") + item.getUnlocalizedName().substring(5);

		this.registerItemRenderer(name, item, meta);
	}

	public void registerItemRenderer(String name, Block block, int meta) {
		this.registerItemRenderer(name, Item.getItemFromBlock(block), meta);
	}

	public static void registerItemRenderer(String name, Item item, int meta) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(name, "inventory"));
	}
}
