package com.teambw.ne.common.blocks.iface;

import net.minecraft.item.ItemStack;

public interface IBlockWithVariants
{
	String getVariantNameFromStack(ItemStack stack);
}
