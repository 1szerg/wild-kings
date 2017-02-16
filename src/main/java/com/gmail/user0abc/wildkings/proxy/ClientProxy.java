package com.gmail.user0abc.wildkings.proxy;

import com.gmail.user0abc.wildkings.block.WildKingsBlocks;
import com.gmail.user0abc.wildkings.item.WildKingsItems;
import com.gmail.user0abc.wildkings.misc.Utils;
import com.gmail.user0abc.wildkings.mob.WildKingsMobs;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * @author Sergii Ivanov
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        Utils.log("Client: Pre init " + System.currentTimeMillis());
        WildKingsMobs.registerRenders();
    }

    @Override
    public void init(FMLInitializationEvent event) {
        Utils.log("Client: Init " + System.currentTimeMillis());
        WildKingsItems.registerRenders();
        WildKingsBlocks.registerRenders();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        Utils.log("Client: Post init " + System.currentTimeMillis());
    }


}
