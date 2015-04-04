package com.teambw.ne.common.blocks.utils;

import net.minecraft.item.ItemStack;

public interface IBlockWithVariants
{
	String getVariantNameFromStack(ItemStack stack);
}