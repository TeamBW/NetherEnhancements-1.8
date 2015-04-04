package com.teambw.ne.common;

import com.teambw.ne.common.init.*;
import com.teambw.ne.common.proxy.CommonProxy;
import com.teambw.ne.common.util.Info;
import com.teambw.ne.common.util.helpers.LogHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Info.ID, name = Info.NAME, version = Info.VERSION)
public class NetherEnhancements {

    @Mod.Instance(value = Info.ID)
    public static NetherEnhancements instance;

    @SidedProxy(clientSide = Info.CLIENT_PROXY, serverSide = Info.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        RegisterBlocks.init();
        RegisterItems.init();
        RegisterOres.init();

        LogHelper.info("Pre Initialization Complete");
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        InventoryRender.init();
        RegisterRecipes.init();

        LogHelper.info("Initialization Complete");
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        LogHelper.info("Post Initialization Complete");
    }
}
