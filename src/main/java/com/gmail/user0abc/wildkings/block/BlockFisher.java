package com.gmail.user0abc.wildkings.block;

import com.gmail.user0abc.wildkings.WildKingsMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * @author Sergii Ivanov
 */
public class BlockFisher extends Block {
    public static final String NAME = "fisher_block";
    public static final String MODEL_NAME = "fisher_block";

    public BlockFisher(Material materialIn) {
        super(Material.WOOD);
        setUnlocalizedName(NAME);
        setCreativeTab(WildKingsMod.wkCreativeTab);
    }
}
