package com.gmail.user0abc.wildkings.mob;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

/**
 * @author Sergii Ivanov
 */
public class EntityChickenKing extends EntityMob {
    public static final String NAME = "chicken_king";
    public static final int EGG_PRIM = 0xA1A1A1;
    public static final int EGG_SEC = 0xFF0000;
    public float oFlapSpeed;
    public float oFlap;
    public float wingRotation;
    public float destPos;
    private float wingRotDelta;


    public EntityChickenKing(World worldIn) {
        super(worldIn);
        setSize(1.0f, 1.75f);
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        int ownTaskOrder = 0;
        this.tasks.addTask(ownTaskOrder++, new EntityAILeapAtTarget(this, 0.5f));
        this.tasks.addTask(ownTaskOrder++, new EntityAIAttackMelee(this, 1.0f, true));
        this.tasks.addTask(ownTaskOrder++, new EntityAISwimming(this));
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
        getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.75f);
        getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2f);
        getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(40f);
    }

    public void fall(float distance, float damageMultiplier)
    {
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        this.wingRotation = 0f;
        this.oFlap = this.wingRotation;
        this.oFlapSpeed = this.destPos;
        this.destPos = (float)((double)this.destPos + (double)(this.onGround ? -1 : 4) * 0.3D);
        this.destPos = MathHelper.clamp(this.destPos, 0.0F, 1.0F);

        if (!this.onGround && this.wingRotDelta < 1.0F)
        {
            this.wingRotDelta = 1.0F;
        }

        this.wingRotDelta = (float)((double)this.wingRotDelta * 0.9D);

        if (!this.onGround && this.motionY < 0.0D)
        {
            this.motionY *= 0.6D;
        }

        this.wingRotation += this.wingRotDelta * 2.0F;

    }
}
