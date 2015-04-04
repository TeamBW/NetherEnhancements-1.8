package com.teambw.ne.client.renderer;

import java.util.Collection;
import java.util.Iterator;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.teambw.ne.common.blocks.utils.BlockVariant;
import com.teambw.ne.common.util.Info;

@SideOnly(Side.CLIENT)
public class ModelVariant
{

	public void registerItemRenderer(Block block, Collection<BlockVariant> variants)
	{
		String[] names = new String[variants.size()];

		Iterator<BlockVariant> iterator = variants.iterator();
		for (int i = 0; iterator.hasNext(); i++)
		{
			BlockVariant variant = iterator.next();
			names[i] = (Info.ID + ":") + variant.getName();

			this.registerItemRenderer(names[i], Item.getItemFromBlock(block), variant.getMeta());
		}

		ModelBakery.addVariantName(Item.getItemFromBlock(block), names);
	}

	public void registerItemRenderer(Block block, int meta)
	{
		this.registerItemRenderer(Item.getItemFromBlock(block), meta);
	}

	public void registerItemRenderer(Item item, int meta)
	{
		String name = (Info.ID + ":") + item.getUnlocalizedName().substring(5);

		this.registerItemRenderer(name, item, meta);
	}

	public void registerItemRenderer(String name, Block block, int meta)
	{
		this.registerItemRenderer(name, Item.getItemFromBlock(block), meta);
	}

	public static void registerItemRenderer(String name, Item item, int meta)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(name, "inventory"));
	}
}
