package com.gmail.user0abc.wildkings.item;

import com.gmail.user0abc.wildkings.WildKingsMod;
import net.minecraft.item.Item;

/**
 * @author Sergii Ivanov
 */
public class ItemKingsBlood extends Item {
    public static final String MODEL = "kings_blood";
    public static final String NAME = "kings_blood";

    public ItemKingsBlood() {
        setCreativeTab(WildKingsMod.wkCreativeTab);
        setUnlocalizedName(NAME);
    }
}
