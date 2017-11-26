package com.gmail.user0abc.wildkings.action;

import com.gmail.user0abc.wildkings.misc.Utils;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * @author Sergii Ivanov
 */
public class WildKingsEvents {

    EntityDeathHandler deathHandler = new EntityDeathHandler();

    @SubscribeEvent(priority = EventPriority.NORMAL)
    public void onKillMob(LivingDeathEvent death){
        Utils.log("event "+death + " at " + death.getEntityLiving());
        deathHandler.handle(death);
    }

}
