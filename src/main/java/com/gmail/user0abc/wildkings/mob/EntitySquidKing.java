package com.gmail.user0abc.wildkings.mob;

import com.gmail.user0abc.wildkings.misc.Utils;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

/**
 * @author Sergii Ivanov
 */
public class EntitySquidKing extends EntityMob implements IRangedAttackMob {
    public static final String NAME = "squid_king";
    public static final int EGG_PRIM = 0x0;
    public static final int EGG_SEC = 0xFFFFFF;

    public EntitySquidKing(World worldIn) {
        super(worldIn);
        setSize(1.0f, 1.75f);
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        int ownTaskOrder = 0;
        this.tasks.addTask(ownTaskOrder++, new EntityAIAttackRanged(this, 1.25D, 40, 20.0F));
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
        Utils.typicalStats(this);
    }

    @Override
    public void attackEntityWithRangedAttack(EntityLivingBase target, float distanceFactor) {
        double power = getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue();
        double armour = target.getEntityAttribute(SharedMonsterAttributes.ARMOR).getAttributeValue();
        float damage = armour > 0 ? (float) power / (float) armour : (float) power;
        DamageSource damageSource = DamageSource.GENERIC.setProjectile();
        target.attackEntityFrom(damageSource, damage);
    }
}
