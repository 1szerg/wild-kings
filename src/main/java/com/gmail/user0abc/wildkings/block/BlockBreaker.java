package com.gmail.user0abc.wildkings.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * @author Sergii Ivanov
 */
public class BlockBreaker extends Block{
    public static final String NAME = "breaker_block";
    public static final String MODEL_NAME = "breaker_block";

    public BlockBreaker(Material materialIn) {
        super(Material.ROCK);
    }
}
