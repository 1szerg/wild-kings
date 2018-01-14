package com.gmail.user0abc.wildkings.tileentity;

import com.gmail.user0abc.wildkings.inventory.ContainerPlanter;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.NonNullList;

/**
 * @author Sergii Ivanov
 */
public class TileEntityPlanter extends TileEntityLockableLoot
{
    private NonNullList<ItemStack> stacks = NonNullList.<ItemStack>withSize(9, ItemStack.EMPTY);

    @Override
    protected NonNullList<ItemStack> getItems()
    {
        return this.stacks;
    }

    @Override
    public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn)
    {
        return new ContainerPlanter();
    }

    @Override
    public String getGuiID()
    {
        return "wildkings:planter";
    }

    @Override
    public int getSizeInventory()
    {
        return 9;
    }

    @Override
    public boolean isEmpty()
    {
        for(ItemStack stack : stacks){
            if(!stack.isEmpty()){
                return false;
            }
        }
        return true;
    }

    @Override
    public int getInventoryStackLimit()
    {
        return 64;
    }

    @Override
    public String getName()
    {
        return this.hasCustomName() ? this.customName : "container.planter";
    }
}
