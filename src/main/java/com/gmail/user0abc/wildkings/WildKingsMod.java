package com.gmail.user0abc.wildkings;

import com.gmail.user0abc.wildkings.block.WildKingsBlocks;
import com.gmail.user0abc.wildkings.item.WildKingsItems;
import com.gmail.user0abc.wildkings.misc.WildKingsCrafting;
import com.gmail.user0abc.wildkings.mob.WildKingsMobs;
import com.gmail.user0abc.wildkings.proxy.CommonProxy;
import com.gmail.user0abc.wildkings.tab.WildKingsTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = WildKingsMod.MODID, version = WildKingsMod.VERSION)
public class WildKingsMod {
    public static final String MODID = "wildkings";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "com.gmail.user0abc.wildkings.proxy.ClientProxy", serverSide = "com.gmail.user0abc.wildkings.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static WildKingsMod instance;
    public static WildKingsTab wkCreativeTab;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        wkCreativeTab = new WildKingsTab(CreativeTabs.getNextID(), "wildkings_tab");
        WildKingsItems.preInit();
        WildKingsBlocks.preInit();
        WildKingsMobs.preInit();
        WildKingsCrafting.preInit();
        proxy.preInit(event);

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
        System.out.println("DIRT BLOCK >> " + Blocks.DIRT.getUnlocalizedName());
    }

}
