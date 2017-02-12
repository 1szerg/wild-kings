package com.gmail.user0abc.wildkings.mob;

import com.gmail.user0abc.wildkings.misc.Utils;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

/**
 * @author Sergii Ivanov
 */
public class EntityCowKing extends EntityMob {
    public static final String NAME = "cow_king";
    public static final int EGG_PRIM = 0x443626;
    public static final int EGG_SEC = 0xA1A1A1;

    public EntityCowKing(World worldIn) {
        super(worldIn);
        setSize(0.75f, 0.75f);
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        Utils.typicalMobAi(this);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        Utils.typicalStats(this);
    }
}
