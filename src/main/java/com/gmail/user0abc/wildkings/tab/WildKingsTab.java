package com.gmail.user0abc.wildkings.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * @author Sergii Ivanov
 */
public class WildKingsTab extends CreativeTabs {
    public static ItemStack TAB_ICON = new ItemStack(Items.BANNER);

    public WildKingsTab(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return TAB_ICON;
    }
}
