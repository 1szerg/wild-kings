package com.gmail.user0abc.wildkings.item;

import com.gmail.user0abc.wildkings.WildKingsMod;
import net.minecraft.item.Item;

/**
 * @author Sergii Ivanov
 */
public class ItemGear extends Item {
    public static final String MODEL = "gear";
    public static final String NAME = "gear";

    public ItemGear() {
        setCreativeTab(WildKingsMod.wkCreativeTab);
        setUnlocalizedName(NAME);
    }
}
