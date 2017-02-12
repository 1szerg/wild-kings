package com.gmail.user0abc.wildkings.block;

import com.gmail.user0abc.wildkings.WildKingsMod;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @author Sergii Ivanov
 */
public class WildKingsBlocks {

    public static Block autoWorkbench;
    public static Block breaker;
    public static Block feeder;
    public static Block fisher;
    public static Block planter;

    public static void preInit() {
        autoWorkbench = new BlockAutoWorkbench(null);
        breaker = new BlockBreaker(null);
        feeder = new BlockFeeder(null);
        fisher = new BlockFisher(null);
        planter = new BlockPlanter(null);
        registerBlocks();
    }

    public static void registerRenders(){
        registerRender(autoWorkbench, BlockAutoWorkbench.MODEL_NAME);
        registerRender(breaker, BlockBreaker.MODEL_NAME);
        registerRender(autoWorkbench, BlockFeeder.MODEL_NAME);
        registerRender(autoWorkbench, BlockFisher.MODEL_NAME);
        registerRender(autoWorkbench, BlockPlanter.MODEL_NAME);
    }

    private static void registerRender(Block block, String name) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0,
                new ModelResourceLocation(WildKingsMod.MODID, name)
        );
    }

    private static void registerBlocks() {
        registerBlock(autoWorkbench, BlockAutoWorkbench.NAME);
        registerBlock(breaker, BlockBreaker.NAME);
        registerBlock(feeder, BlockFeeder.NAME);
        registerBlock(fisher, BlockFisher.NAME);
        registerBlock(planter, BlockPlanter.NAME);
    }

    private static void registerBlock(Block block, String name){
        GameRegistry.register(block, new ResourceLocation(WildKingsMod.MODID, name));
    }
}
