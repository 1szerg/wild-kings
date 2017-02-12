package com.gmail.user0abc.wildkings.mob.model;

import net.minecraft.client.model.ModelSheep1;
import net.minecraft.client.model.ModelSquid;
import net.minecraft.entity.Entity;

/**
 * @author Sergii Ivanov
 */
public class ModelSquidKing extends ModelSquid{

    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale*2);
    }
}
