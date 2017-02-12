package com.gmail.user0abc.wildkings.block;

import com.gmail.user0abc.wildkings.WildKingsMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

/**
 * @author Sergii Ivanov
 */
public class BlockPlanter extends BlockDirectional {
    public static final String NAME = "planter_block";
    public static final String MODEL_NAME = "planter_block";
    public static final PropertyBool ACTIVE = PropertyBool.create("active");


    public BlockPlanter(boolean active) {
        super(Material.ROCK);
        setUnlocalizedName(NAME);
        setCreativeTab(WildKingsMod.wkCreativeTab);
        setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(ACTIVE, active));
        setHardness(10F);
        setResistance(100F);
        setSoundType(SoundType.STONE);
    }

    @Override
    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
        if (!state.getValue(ACTIVE) && worldIn.isBlockPowered(pos)) {
            worldIn.setBlockState(pos, state.withProperty(ACTIVE, true));
            doPlant(worldIn, pos, state);
        } else if (state.getValue(ACTIVE) && !worldIn.isBlockPowered(pos)) {
            worldIn.setBlockState(pos, state.withProperty(ACTIVE, false));
        }
    }

    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{FACING, ACTIVE});
    }


    private void doPlant(World worldIn, BlockPos pos, IBlockState state) {

    }

    @Override
    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
        super.onBlockAdded(worldIn, pos, state);
        setDirection(worldIn, pos, state);
    }

    private void setDirection(World worldIn, BlockPos pos, IBlockState state) {
        worldIn.setBlockState(pos, state);
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        super.onBlockPlacedBy(worldIn, pos, state, placer, stack);
        worldIn.setBlockState(pos, state.withProperty(FACING, EnumFacing.getDirectionFromEntityLiving(pos, placer)), 2);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(WildKingsBlocks.planter);
    }

    @Override
    public boolean canConnectRedstone(IBlockState state, IBlockAccess world, BlockPos pos, @Nullable EnumFacing side) {
        return true;
    }

    @Override
    public boolean canBeReplacedByLeaves(IBlockState state, IBlockAccess world, BlockPos pos) {
        return false;
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty(FACING, getFacingFromMeta(meta)).withProperty(ACTIVE, getEnabledFromMeta(meta));
    }

    private boolean getEnabledFromMeta(int meta) {
        return (meta & 8) == 8;
    }

    private EnumFacing getFacingFromMeta(int meta) {
        int dir = meta - (meta & 8);
        return EnumFacing.getFront(dir);
    }

    public int getMetaFromState(IBlockState state) {
        int i = 0;
        i = i | ((EnumFacing) state.getValue(FACING)).getIndex();

        if (state.getValue(ACTIVE)) {
            i |= 8;
        }

        return i;
    }

}
