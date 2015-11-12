package com.trinia.mob.entity;

import net.minecraft.entity.boss.EntityDragonPart;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public interface EntityMultiPart
{
    World getWorld();

    boolean attackEntityFromPart(EntityIceDragonPart p_70965_1_, DamageSource p_70965_2_, float p_70965_3_);
}