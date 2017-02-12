package com.gmail.user0abc.wildkings.mob;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

/**
 * @author Sergii Ivanov
 */
public class EntitySheepKing  extends EntityMob {
    public static final String NAME = "sheep_king";
    public static final int EGG_PRIM = 0x0;
    public static final int EGG_SEC = 0xFFFFFF;

    public EntitySheepKing(World worldIn) {
        super(worldIn);
    }
}
