package com.gmail.user0abc.wildkings.item;

import com.gmail.user0abc.wildkings.WildKingsMod;
import net.minecraft.item.Item;

/**
 * @author Sergii Ivanov
 */
public class ItemGearBroken extends Item {
    public static final String MODEL = "gear_broken";
    public static final String NAME = "gear_broken";

    public ItemGearBroken() {
        setCreativeTab(WildKingsMod.wkCreativeTab);
        setUnlocalizedName(NAME);
    }
}
