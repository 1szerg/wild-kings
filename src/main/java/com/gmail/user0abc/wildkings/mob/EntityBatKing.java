package com.gmail.user0abc.wildkings.mob;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * @author Sergii Ivanov
 */
public class EntityBatKing extends EntityMob {
    public static final String NAME = "bat_king";
    public static final int EGG_PRIM = 0x4C3E30;
    public static final int EGG_SEC = 0x0F0F0F;


    public EntityBatKing(World worldIn) {
        super(worldIn);
        setSize(1f, 1f);
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        int ownTaskOrder = 0;
        this.tasks.addTask(ownTaskOrder++, new EntityAILeapAtTarget(this, 0.5f));
        this.tasks.addTask(ownTaskOrder++, new EntityAIAttackMelee(this, 1.0f, true));
        this.tasks.addTask(ownTaskOrder++, new EntityAIMoveTowardsTarget(this, 0.75f, 40f));
        this.tasks.addTask(ownTaskOrder++, new EntityAIWatchClosest(this, EntityPlayer.class, 40f));
        this.tasks.addTask(ownTaskOrder++, new EntityAIWanderAvoidWater(this, 0.5f));
        this.tasks.addTask(ownTaskOrder++, new EntityAIWander(this, 0.5f));
        this.tasks.addTask(ownTaskOrder++, new EntityAILookIdle(this));
        int targetTaskOrder = 0;
        this.targetTasks.addTask(targetTaskOrder++, new EntityAIHurtByTarget(this, true, new Class[0]));
        this.targetTasks.addTask(targetTaskOrder++, new EntityAINearestAttackableTarget(this, EntityPlayer.class, false));
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20f);
        getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1.0f);
        getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2f);
        getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(40f);
    }

    @Override
    protected boolean isValidLightLevel() {
        return true;
    }

    @Override
    public boolean getCanSpawnHere() {
        if (super.getCanSpawnHere()) {
            BlockPos blockpos = new BlockPos(this.posX, this.getEntityBoundingBox().minY, this.posZ);
            return world.getBlockState(blockpos).getBlock().equals(Blocks.AIR);
        }
        return false;
    }

    @Override
    protected void updateFallState(double y, boolean onGroundIn, IBlockState state, BlockPos pos) {
        // does not fall
    }

}
