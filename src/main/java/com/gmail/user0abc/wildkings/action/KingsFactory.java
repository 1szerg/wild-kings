package com.gmail.user0abc.wildkings.action;

import com.gmail.user0abc.wildkings.misc.Utils;
import com.gmail.user0abc.wildkings.misc.WildKingsSettings;
import com.gmail.user0abc.wildkings.mob.EntityOcelotKing;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import java.util.Random;

public class KingsFactory {

    private Random r = new Random();

    public void makeTigerNearby(LivingDeathEvent death) {
        if(death.getEntityLiving().world.isRemote){
            return;
        }
        Utils.log("Spawn Tiger near "+
                death.getEntityLiving().posX+" / "+
                death.getEntityLiving().posZ+" / "+
                death.getEntityLiving().posY);
        int maxRetry = 1000;
        while(maxRetry-->0 && spawnTiger(death.getEntityLiving())){

        }
        Utils.log("   spawned before "+maxRetry+" try");
    }

    private boolean spawnTiger(EntityLivingBase entityLiving) {
        double radius = WildKingsSettings.kingsRadius();
        double posX = entityLiving.posX + r.nextDouble() * radius * 2 - radius;
        double posY = entityLiving.posY + r.nextDouble() * radius - radius / 2;
        double posZ = entityLiving.posZ + r.nextDouble() * radius * 2 - radius;
        BlockPos pos = new BlockPos(posX,posY,posZ);
        World w = entityLiving.world;
        EntityOcelotKing tiger = new EntityOcelotKing(entityLiving.world);
        tiger.setPosition(posX, posY, posZ);
        AxisAlignedBB bbox = tiger.getEntityBoundingBox();
        if(!w.collidesWithAnyBlock(bbox)){
            w.spawnEntity(tiger);
            Utils.log("Spawned Tiger at "+tiger.posX+", "+tiger.posY+", "+tiger.posZ);
            return false;
        };
        return true;
    }
}
