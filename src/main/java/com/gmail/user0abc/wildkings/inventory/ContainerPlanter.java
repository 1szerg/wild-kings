package com.gmail.user0abc.wildkings.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

/**
 * @author Sergii Ivanov
 */
public class ContainerPlanter extends Container
{
    @Override
    public boolean canInteractWith(EntityPlayer playerIn)
    {
        return false;
    }
}
