package com.gmail.user0abc.wildkings.proxy;

import com.gmail.user0abc.wildkings.block.WildKingsBlocks;
import com.gmail.user0abc.wildkings.item.WildKingsItems;
import com.gmail.user0abc.wildkings.mob.WildKingsMobs;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

/**
 * @author Sergii Ivanov
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLInitializationEvent event) {
        System.out.println("Client: Pre init " + System.currentTimeMillis());
        WildKingsItems.registerRenders();
        WildKingsBlocks.registerRenders();
        WildKingsMobs.registerRenders();
    }

    @Override
    public void init(FMLInitializationEvent event) {
        System.out.println("Client: Init " + System.currentTimeMillis());
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("Client: Post init " + System.currentTimeMillis());
    }


}
