package com.gmail.user0abc.wildkings.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * @author Sergii Ivanov
 */
public class BlockPlanter extends Block{
    public static final String NAME = "planter_block";
    public static final String MODEL_NAME = "planter_block";

    public BlockPlanter(Material materialIn) {
        super(Material.ROCK);
    }
}
