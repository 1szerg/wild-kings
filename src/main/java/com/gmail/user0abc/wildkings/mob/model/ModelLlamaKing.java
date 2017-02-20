package com.gmail.user0abc.wildkings.mob.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Sergii Ivanov
 */
@SideOnly(Side.CLIENT)
public class ModelLlamaKing extends ModelQuadrupedKing {
    private final ModelRenderer chest1;
    private final ModelRenderer chest2;

    public ModelLlamaKing(int height, float scale) {
        super(height, scale);
        this.head.addBox(-4.0F, -4.0F, -8.0F, 8, 8, 8, scale);
        this.head.setRotationPoint(0.0F, (float) (18 - height), -6.0F);
        this.body = new ModelRenderer(this, 28, 8);
        this.body.addBox(-5.0F, -10.0F, -7.0F, 10, 16, 8, scale);
        this.body.setRotationPoint(0.0F, (float) (17 - height), 2.0F);
        this.leg1 = new ModelRenderer(this, 0, 16);
        this.leg1.addBox(-2.0F, 0.0F, -2.0F, 4, height, 4, scale);
        this.leg1.setRotationPoint(-3.0F, (float) (24 - height), 7.0F);
        this.leg2 = new ModelRenderer(this, 0, 16);
        this.leg2.addBox(-2.0F, 0.0F, -2.0F, 4, height, 4, scale);
        this.leg2.setRotationPoint(3.0F, (float) (24 - height), 7.0F);
        this.leg3 = new ModelRenderer(this, 0, 16);
        this.leg3.addBox(-2.0F, 0.0F, -2.0F, 4, height, 4, scale);
        this.leg3.setRotationPoint(-3.0F, (float) (24 - height), -5.0F);
        this.leg4 = new ModelRenderer(this, 0, 16);
        this.leg4.addBox(-2.0F, 0.0F, -2.0F, 4, height, 4, scale);
        this.leg4.setRotationPoint(3.0F, (float) (24 - height), -5.0F);

        this.textureWidth = 128;
        this.textureHeight = 64;
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-2.0F, -14.0F, -10.0F, 4, 4, 9, scale);
        this.head.setRotationPoint(0.0F, 7.0F, -6.0F);
        this.head.setTextureOffset(0, 14).addBox(-4.0F, -16.0F, -6.0F, 8, 18, 6, scale);
        this.head.setTextureOffset(17, 0).addBox(-4.0F, -19.0F, -4.0F, 3, 3, 2, scale);
        this.head.setTextureOffset(17, 0).addBox(1.0F, -19.0F, -4.0F, 3, 3, 2, scale);
        this.body = new ModelRenderer(this, 29, 0);
        this.body.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10, scale);
        this.body.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.chest1 = new ModelRenderer(this, 45, 28);
        this.chest1.addBox(-3.0F, 0.0F, 0.0F, 8, 8, 3, scale);
        this.chest1.setRotationPoint(-8.5F, 3.0F, 3.0F);
        this.chest1.rotateAngleY = ((float) Math.PI / 2F);
        this.chest2 = new ModelRenderer(this, 45, 41);
        this.chest2.addBox(-3.0F, 0.0F, 0.0F, 8, 8, 3, scale);
        this.chest2.setRotationPoint(5.5F, 3.0F, 3.0F);
        this.chest2.rotateAngleY = ((float) Math.PI / 2F);
        int i = 4;
        int j = 14;
        this.leg1 = new ModelRenderer(this, 29, 29);
        this.leg1.addBox(-2.0F, 0.0F, -2.0F, 4, 14, 4, scale);
        this.leg1.setRotationPoint(-2.5F, 10.0F, 6.0F);
        this.leg2 = new ModelRenderer(this, 29, 29);
        this.leg2.addBox(-2.0F, 0.0F, -2.0F, 4, 14, 4, scale);
        this.leg2.setRotationPoint(2.5F, 10.0F, 6.0F);
        this.leg3 = new ModelRenderer(this, 29, 29);
        this.leg3.addBox(-2.0F, 0.0F, -2.0F, 4, 14, 4, scale);
        this.leg3.setRotationPoint(-2.5F, 10.0F, -4.0F);
        this.leg4 = new ModelRenderer(this, 29, 29);
        this.leg4.addBox(-2.0F, 0.0F, -2.0F, 4, 14, 4, scale);
        this.leg4.setRotationPoint(2.5F, 10.0F, -4.0F);
        --this.leg1.rotationPointX;
        ++this.leg2.rotationPointX;
        this.leg1.rotationPointZ += 0.0F;
        this.leg2.rotationPointZ += 0.0F;
        --this.leg3.rotationPointX;
        ++this.leg4.rotationPointX;
        --this.leg3.rotationPointZ;
        --this.leg4.rotationPointZ;
    }

    @Override
    public float getHeightFix() {
        return -12f;
    }

    @Override
    public float getSizeScale() {
        return 2f;
    }

    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {

        float renderScale = scale * getSizeScale();
        //AbstractChestHorse abstractchesthorse = (AbstractChestHorse)entityIn;
        boolean flag = false;//!abstractchesthorse.isChild() && abstractchesthorse.hasChest();
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, renderScale, entityIn);

        GlStateManager.pushMatrix();
        GlStateManager.translate(0.0F, getHeightFix() * renderScale, 0f);
        this.head.render(renderScale);
        this.body.render(renderScale);
        this.leg1.render(renderScale);
        this.leg2.render(renderScale);
        this.leg3.render(renderScale);
        this.leg4.render(renderScale);
        GlStateManager.popMatrix();
    }

}
