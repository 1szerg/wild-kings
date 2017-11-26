package com.gmail.user0abc.wildkings.proxy;

import com.gmail.user0abc.wildkings.action.WildKingsEvents;
import com.gmail.user0abc.wildkings.misc.Utils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * @author Sergii Ivanov
 */
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        Utils.log("Server: Pre init " + System.currentTimeMillis());
    }

    public void init(FMLInitializationEvent event) {
        Utils.log("Server: Init " + System.currentTimeMillis());
        MinecraftForge.EVENT_BUS.register(new WildKingsEvents());
    }

    public void postInit(FMLPostInitializationEvent event) {
        Utils.log("Server: Post init " + System.currentTimeMillis());
    }

}
