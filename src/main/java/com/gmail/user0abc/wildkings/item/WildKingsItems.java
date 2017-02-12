package com.gmail.user0abc.wildkings.item;

import com.gmail.user0abc.wildkings.WildKingsMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @author Sergii Ivanov
 */
public class WildKingsItems {

    public static Item gear;
    public static Item gearBroken;

    public static void preInit(){
        gear = new ItemGear();
        gearBroken = new ItemGearBroken();
        register(gear, ItemGear.NAME);
        register(gearBroken, ItemGearBroken.NAME);
    }

    private static void register(Item gear, String name) {
        GameRegistry.register(gear, new ResourceLocation(WildKingsMod.MODID, name));
    }

    public static void registerRenders(){
        registerRender(gear, ItemGear.TEXTURE);
        registerRender(gearBroken, ItemGearBroken.TEXTURE);
    }

    private static void registerRender(Item gear, String texture) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(gear,0,
                new ModelResourceLocation(WildKingsMod.MODID, texture));
    }

}
