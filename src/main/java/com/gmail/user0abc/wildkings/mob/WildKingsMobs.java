package com.gmail.user0abc.wildkings.mob;

import com.gmail.user0abc.wildkings.WildKingsMod;
import com.gmail.user0abc.wildkings.mob.render.*;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Sergii Ivanov
 */
public class WildKingsMobs {

    public static void preInit() {
        registerMob(1, EntityBatKing.class, EntityBatKing.NAME, EntityBatKing.EGG_PRIM, EntityBatKing.EGG_SEC);
        registerMob(2, EntityChickenKing.class, EntityChickenKing.NAME, EntityChickenKing.EGG_PRIM, EntityChickenKing.EGG_SEC);
        registerMob(3, EntityCowKing.class, EntityCowKing.NAME, EntityCowKing.EGG_PRIM, EntityCowKing.EGG_SEC);
        registerMob(4, EntityHorseKing.class, EntityHorseKing.NAME, EntityHorseKing.EGG_PRIM, EntityHorseKing.EGG_SEC);
        registerMob(5, EntityLlamaKing.class, EntityLlamaKing.NAME, EntityLlamaKing.EGG_PRIM, EntityLlamaKing.EGG_SEC);
        registerMob(6, EntityOcelotKing.class, EntityOcelotKing.NAME, EntityOcelotKing.EGG_PRIM, EntityOcelotKing.EGG_SEC);
        registerMob(7, EntityPigKing.class, EntityPigKing.NAME, EntityPigKing.EGG_PRIM, EntityPigKing.EGG_SEC);
        registerMob(8, EntityRabbitKing.class, EntityRabbitKing.NAME, EntityRabbitKing.EGG_PRIM, EntityRabbitKing.EGG_SEC);
        registerMob(9, EntitySheepKing.class, EntitySheepKing.NAME, EntitySheepKing.EGG_PRIM, EntitySheepKing.EGG_SEC);
        registerMob(10, EntitySquidKing.class, EntitySquidKing.NAME, EntitySquidKing.EGG_PRIM, EntitySquidKing.EGG_SEC);
    }

    private static void registerMob(int id, Class<? extends EntityMob> entityClass, String entityName, int eggPrimaryColor, int eggSecondaryColor) {
        ResourceLocation rl = new ResourceLocation(WildKingsMod.MODID, entityName);
        EntityRegistry.registerModEntity(rl, entityClass, entityName, id, WildKingsMod.instance, 64, 1, true);
        EntityList.ENTITY_EGGS.put(rl, new EntityList.EntityEggInfo(rl, eggPrimaryColor, eggSecondaryColor));
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntityBatKing.class, RenderBatKing.getRenderFactory());
        RenderingRegistry.registerEntityRenderingHandler(EntityChickenKing.class, RenderChickenKing.getRenderFactory());
        RenderingRegistry.registerEntityRenderingHandler(EntityCowKing.class, RenderCowKing.getRenderFactory());
        RenderingRegistry.registerEntityRenderingHandler(EntityHorseKing.class, RenderHorseKing.getRenderFactory());
        RenderingRegistry.registerEntityRenderingHandler(EntityLlamaKing.class, RenderLlamaKing.getRenderFactory());
        RenderingRegistry.registerEntityRenderingHandler(EntityOcelotKing.class, RenderOcelotKing.getRenderFactory());
        RenderingRegistry.registerEntityRenderingHandler(EntityPigKing.class, RenderPigKing.getRenderFactory());
        RenderingRegistry.registerEntityRenderingHandler(EntityRabbitKing.class, RenderRabbitKing.getRenderFactory());
        RenderingRegistry.registerEntityRenderingHandler(EntitySheepKing.class, RenderSheepKing.getRenderFactory());
        RenderingRegistry.registerEntityRenderingHandler(EntitySquidKing.class, RenderSquidKing.getRenderFactory());
    }
}
