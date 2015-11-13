package com.trinia.mob.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.IEntityMultiPart;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;

public class EntityIceDragonPart extends Entity
{
    /** The dragon entity this dragon part belongs to */
    public final EntityIceDragon EntityIceDragonObj;
    public final String partName;
    private static final String __OBFID = "CL_00001657";

    public EntityIceDragonPart(EntityIceDragon entityIceDragon, String partName, float base, float sizeHeight)
    {
        super(entityIceDragon.getWorld());
        this.setSize(base, sizeHeight);
        this.EntityIceDragonObj = entityIceDragon;
        this.partName = partName;
    }

    protected void entityInit() {}

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    protected void readEntityFromNBT(NBTTagCompound tagCompund) {}

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    protected void writeEntityToNBT(NBTTagCompound tagCompound) {}

    /**
     * Returns true if other Entities should be prevented from moving through this Entity.
     */
    public boolean canBeCollidedWith()
    {
        return true;
    }

   

    /**
     * Returns true if Entity argument is equal to this Entity
     */
    public boolean isEntityEqual(Entity entityIn)
    {
        return this == entityIn || this.EntityIceDragonObj == entityIn;
    }
}