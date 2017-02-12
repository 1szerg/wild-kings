package com.gmail.user0abc.wildkings.block;

import com.gmail.user0abc.wildkings.WildKingsMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * @author Sergii Ivanov
 */
public class BlockAutoWorkbench extends Block {

    public static final String NAME = "auto_workbench_block";
    public static final String MODEL_NAME = "auto_workbench_block";

    public BlockAutoWorkbench(Material materialIn) {
        super(Material.WOOD);
        setUnlocalizedName(NAME);
        setCreativeTab(WildKingsMod.wkCreativeTab);
    }
}
