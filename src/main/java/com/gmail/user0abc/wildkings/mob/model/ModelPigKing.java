package com.gmail.user0abc.wildkings.mob.model;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Sergii Ivanov
 */
@SideOnly(Side.CLIENT)
public class ModelPigKing extends ModelQuadrupedKing {

    public ModelPigKing(float scale) {
        super(6, scale*2);
        this.head.setTextureOffset(16, 16).addBox(-2.0F, 0.0F, -9.0F, 4, 3, 1, scale*2);
    }

    @Override
    public float getHeightFix() {
        return -12f;
    }

}
