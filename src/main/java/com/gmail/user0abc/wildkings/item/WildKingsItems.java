package com.gmail.user0abc.wildkings.item;

import com.gmail.user0abc.wildkings.WildKingsMod;
import com.gmail.user0abc.wildkings.misc.Utils;
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

    public static void preInit() {
        gear = new ItemGear();
        gearBroken = new ItemGearBroken();
        register(gear, ItemGear.NAME);
        register(gearBroken, ItemGearBroken.NAME);
    }

    private static void register(Item gear, String name) {
        GameRegistry.register(gear, new ResourceLocation(WildKingsMod.MODID, name));
    }

    public static void registerRenders() {
        registerRender(gear, ItemGear.MODEL);
        registerRender(gearBroken, ItemGearBroken.MODEL);
    }

    private static void registerRender(Item item, String model) {
        ModelResourceLocation mrl = new ModelResourceLocation(WildKingsMod.MODID + ":" + model, "inventory");
        Utils.log("Registering item render for " + item + " as " + mrl);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, mrl);
    }

}
