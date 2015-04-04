package com.teambw.ne.common;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.teambw.ne.common.blocks.RegisterBlocks;
import com.teambw.ne.common.init.RegisterOres;
import com.teambw.ne.common.init.RegisterRecipes;
import com.teambw.ne.common.items.RegisterItems;
import com.teambw.ne.common.proxy.CommonProxy;
import com.teambw.ne.common.util.Info;
import com.teambw.ne.common.util.helpers.LogHelper;

@Mod(modid = Info.ID, name = Info.NAME, version = Info.VERSION)
public class NetherEnhancements
{

	@Mod.Instance(value = Info.ID)
	public static NetherEnhancements instance;

	@SidedProxy(clientSide = Info.CLIENT_PROXY, serverSide = Info.SERVER_PROXY)
	public static CommonProxy proxy;

	private RegisterBlocks blocks = new RegisterBlocks();

	private RegisterItems items = new RegisterItems();

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		this.blocks.preInit();
		this.items.preInit();
		RegisterOres.init();

		LogHelper.info("Pre Initialization Complete");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		this.blocks.init();
		this.items.init();
		RegisterRecipes.init();

		LogHelper.info("Initialization Complete");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		LogHelper.info("Post Initialization Complete");
	}

	public static RegisterBlocks getBlocks()
	{
		return NetherEnhancements.instance.blocks;
	}

	public static RegisterItems getItems()
	{
		return NetherEnhancements.instance.items;
	}
}
