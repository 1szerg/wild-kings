package com.gmail.user0abc.wildkings.misc;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;

/**
 * @author Sergii Ivanov
 */
public class Utils {

    public static void typicalMobAi(EntityMob mob) {
        int ownTaskOrder = 0;
        mob.tasks.addTask(ownTaskOrder++, new EntityAILeapAtTarget(mob, 0.5f));
        mob.tasks.addTask(ownTaskOrder++, new EntityAIAttackMelee(mob, 1.0f, true));
        mob.tasks.addTask(ownTaskOrder++, new EntityAISwimming(mob));
        mob.tasks.addTask(ownTaskOrder++, new EntityAIMoveTowardsTarget(mob, 0.75f, 40f));
        mob.tasks.addTask(ownTaskOrder++, new EntityAIWatchClosest(mob, EntityPlayer.class, 40f));
        mob.tasks.addTask(ownTaskOrder++, new EntityAIWanderAvoidWater(mob, 0.5f));
        mob.tasks.addTask(ownTaskOrder++, new EntityAIWander(mob, 0.5f));
        mob.tasks.addTask(ownTaskOrder++, new EntityAILookIdle(mob));
        int targetTaskOrder = 0;
        mob.targetTasks.addTask(targetTaskOrder++, new EntityAIHurtByTarget(mob, true, new Class[0]));
        mob.targetTasks.addTask(targetTaskOrder++, new EntityAINearestAttackableTarget(mob, EntityPlayer.class, false));
    }

    public static void typicalStats(EntityMob mob) {
        mob.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20f);
        mob.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.75f);
        mob.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2f);
        mob.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(40f);
    }


    public static void log(String s) {
        System.out.println(">>> "+s);
    }
}
