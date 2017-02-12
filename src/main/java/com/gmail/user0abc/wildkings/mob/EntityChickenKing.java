package com.gmail.user0abc.wildkings.mob;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

/**
 * @author Sergii Ivanov
 */
public class EntityChickenKing extends EntityMob{
    public static final String NAME = "chicken_king";
    public static final int EGG_PRIM = 0xA1A1A1;
    public static final int EGG_SEC = 0xFF0000;

    public EntityChickenKing(World worldIn) {
        super(worldIn);
    }
}
