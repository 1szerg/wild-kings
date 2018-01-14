package com.gmail.user0abc.wildkings.tileentity;

import com.gmail.user0abc.wildkings.inventory.ContainerFeeder;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.NonNullList;

public class TileEntityFeeder extends TileEntityLockableLoot {
    private NonNullList<ItemStack> stacks = NonNullList.<ItemStack>withSize(9, ItemStack.EMPTY);

    @Override
    protected NonNullList<ItemStack> getItems() {
        return stacks;
    }

    @Override
    public int getSizeInventory() {
        return 9;
    }

    @Override
    public boolean isEmpty() {
        for(ItemStack stack : stacks){
            if(!stack.isEmpty()){
                return false;
            }
        }
        return true;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
        return new ContainerFeeder();
    }

    @Override
    public String getGuiID() {
        return "wildkings:planter";
    }

    @Override
    public String getName() {
        return "Feeder";
    }
}
