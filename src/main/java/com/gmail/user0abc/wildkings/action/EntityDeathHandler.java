package com.gmail.user0abc.wildkings.action;

import com.gmail.user0abc.wildkings.misc.WildKingsSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import java.util.Random;

public class EntityDeathHandler {

    private Random r = new Random(WildKingsSettings.getMapSeed());
    private KingsFactory factory = new KingsFactory();

    public void handle(LivingDeathEvent death) {
        Entity entity = death.getEntity();
        if(entity instanceof EntityOcelot){
            if(intChanseTriggered(WildKingsSettings.getTigerChance(),100)){
                factory.makeTigerNearby(death);
            }
        }
    }

    private boolean intChanseTriggered(int chance, int base) {
        return r.nextInt(base) <= chance;
    }
}
