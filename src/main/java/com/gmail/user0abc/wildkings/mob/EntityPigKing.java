package com.gmail.user0abc.wildkings.mob;

import com.gmail.user0abc.wildkings.misc.Utils;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

/**
 * @author Sergii Ivanov
 */
public class EntityPigKing extends EntityMob {
    public static final String NAME = "pig_king";
    public static final int EGG_PRIM = 0x0;
    public static final int EGG_SEC = 0xFFFFFF;

    public EntityPigKing(World worldIn) {
        super(worldIn);
        setSize(1.25f, 1.25f);
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
