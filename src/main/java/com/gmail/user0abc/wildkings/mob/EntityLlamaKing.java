package com.gmail.user0abc.wildkings.mob;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

/**
 * @author Sergii Ivanov
 */
public class EntityLlamaKing  extends EntityMob {
    public static final String NAME = "llama_king";
    public static final int EGG_PRIM = 0x0;
    public static final int EGG_SEC = 0xFFFFFF;

    public EntityLlamaKing(World worldIn) {
        super(worldIn);
    }
}
