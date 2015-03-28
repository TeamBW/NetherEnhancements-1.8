package com.teambw.ne.common;

import com.teambw.ne.common.init.RegisterBlocks;
import com.teambw.ne.common.init.RegisterItems;
import com.teambw.ne.common.proxy.CommonProxy;
import com.teambw.ne.common.util.Reference;
import com.teambw.ne.common.util.helpers.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.ID, name = Reference.NAME, version = Reference.VERSION)
public class NetherEnhancements {

    @Mod.Instance(value = Reference.ID)
    public static NetherEnhancements instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        RegisterBlocks.init();
        RegisterItems.init();

        LogHelper.info("Pre Initialization Complete");
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        LogHelper.info("Initialization Complete");
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        LogHelper.info("Post Initialization Complete");
    }
}
