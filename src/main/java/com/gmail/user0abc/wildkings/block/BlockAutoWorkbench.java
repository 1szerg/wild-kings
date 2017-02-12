package com.gmail.user0abc.wildkings.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

/**
 * @author Sergii Ivanov
 */
public class BlockAutoWorkbench extends Block{

    public static final String NAME = "auto_workbench_block";
    public static final String MODEL_NAME = "auto_workbench_block";

    public BlockAutoWorkbench(Material materialIn) {
        super(Material.WOOD);
    }
}
