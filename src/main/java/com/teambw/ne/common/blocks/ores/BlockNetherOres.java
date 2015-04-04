package com.teambw.ne.common.blocks.ores;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.teambw.ne.common.blocks.iface.IBlockVariant;
import com.teambw.ne.common.blocks.iface.IBlockWithVariants;
import com.teambw.ne.common.init.ModTab;

public class BlockNetherOres extends Block implements IBlockWithVariants
{
	public enum OreVariant implements IBlockVariant
	{
		COAL(0, "netherore_coal"),
		GOLD(1, "netherore_gold"),
		IRON(2, "netherore_iron"),
		LAPIS(3, "netherore_lapis");

		private static final OreVariant[] metaLookup = new OreVariant[OreVariant.values().length];

		static
		{
			for (OreVariant type : OreVariant.values())
			{
				metaLookup[type.getMetadata()] = type;
			}
		}

		private int metadata;

		private String name;

		OreVariant(int metadata, String name)
		{
			this.metadata = metadata;
			this.name = name;
		}

		@Override
		public String getName()
		{
			return this.name;
		}

		@Override
		public int getMetadata()
		{
			return this.metadata;
		}

		public static OreVariant getVariantFromMetadata(int meta)
		{
			return OreVariant.metaLookup[meta];
		}
	}

	public static final PropertyEnum ORE_TYPE = PropertyEnum.create("variant", OreVariant.class);

	public BlockNetherOres()
	{
		super(Material.rock);
		this.setStepSound(soundTypePiston);
		this.setResistance(2.0F);
		this.setHardness(2.5F);
		this.setHarvestLevel("pickaxe", 3);

		this.setDefaultState(this.getBlockState().getBaseState().withProperty(ORE_TYPE, OreVariant.COAL));
		this.setCreativeTab(ModTab.MAIN);
	}

	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List list)
	{
		for (OreVariant type : OreVariant.values())
		{
			list.add(new ItemStack(itemIn, 1, type.getMetadata()));
		}
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		switch (((OreVariant) state.getValue(ORE_TYPE)).getMetadata())
		{
		case 0:
			return Items.coal;
		case 1:
			return Items.gold_ingot;
		case 2:
			return Items.iron_ingot;
		case 3:
			return Item.getItemFromBlock(Blocks.lapis_ore);
		}

		return Items.coal;
	}

	@Override
	public int quantityDropped(Random random)
	{
		return 1 + random.nextInt(2);
	}

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(ORE_TYPE, OreVariant.getVariantFromMetadata(meta));
	}

	@Override
	public int getMetaFromState(IBlockState state)
	{
		return ((OreVariant) state.getValue(ORE_TYPE)).getMetadata();
	}

	@Override
	protected BlockState createBlockState()
	{
		return new BlockState(this, new IProperty[] { ORE_TYPE });
	}

	@Override
	public String getVariantNameFromStack(ItemStack stack)
	{
		return OreVariant.getVariantFromMetadata(stack.getMetadata()).getName();
	}
}
