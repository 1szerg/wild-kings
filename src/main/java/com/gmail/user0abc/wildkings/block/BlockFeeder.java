package com.gmail.user0abc.wildkings.block;

import com.gmail.user0abc.wildkings.WildKingsMod;
import com.gmail.user0abc.wildkings.tileentity.TileEntityFeeder;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.world.World;

import javax.annotation.Nullable;

/**
 * @author Sergii Ivanov
 */
public class BlockFeeder extends BlockContainer {
    public static final String NAME = "feeder_block";
    public static final String MODEL_NAME = "feeder_block";

    public BlockFeeder(Material materialIn) {
        super(Material.WOOD);
        setUnlocalizedName(NAME);
        setCreativeTab(WildKingsMod.wkCreativeTab);
    }


    @Nullable
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityFeeder();
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }
}
