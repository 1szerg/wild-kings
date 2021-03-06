package com.gmail.user0abc.wildkings.tab;

import com.gmail.user0abc.wildkings.item.WildKingsItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * @author Sergii Ivanov
 */
public class WildKingsTab extends CreativeTabs {
    public static ItemStack TAB_ICON = new ItemStack(WildKingsItems.gear);

    public WildKingsTab(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return TAB_ICON;
    }
}
