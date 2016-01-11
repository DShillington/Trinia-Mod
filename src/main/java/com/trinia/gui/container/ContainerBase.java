package com.trinia.gui.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerBase extends Container {

    protected int tileSlots = -1;
    protected int InventoryMin;
    protected int InventoryMax;
    protected int HotBarMax;
    protected boolean canSendToTile = true;

    public String getNEILabel() { return ""; }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return true;
    }

    public void setCanSendToTile(boolean bool) {
        canSendToTile = bool;
    }

    @Override
    public Slot addSlotToContainer(Slot slot) {
        if(!(slot.inventory instanceof InventoryPlayer))
            tileSlots++;
        return super.addSlotToContainer(slot);
    }

    protected void bindPlayerInventory(InventoryPlayer playerInventory, int pixelX, int pixelY)
    {
        
        InventoryMin = InventoryMax = tileSlots + 1;
        for(int y = 0; y < 3; y++)
            for(int x = 0; x < 9; x++) {
                addSlotToContainer(new Slot(playerInventory, x + y * 9 + 9, pixelX + x * 18, pixelY + y * 18));
                InventoryMax++;
            }
      
        for(int x = 0; x < 9; x++)
            addSlotToContainer(new Slot(playerInventory, x, 8 + x * 18, pixelY + 58));
        HotBarMax = InventoryMax + 9;
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slot) {
        ItemStack stack = null;
        Slot slotObject = (Slot)this.inventorySlots.get(slot);
       
        if (slotObject != null && slotObject.getHasStack()) {
            ItemStack stackInSlot = slotObject.getStack();
            stack = stackInSlot.copy();
        
            if (slot <= tileSlots) {
                if (!this.mergeItemStack(stackInSlot, InventoryMin, HotBarMax, true))
                    return null;
            }
     
            else if(canSendToTile && slot > tileSlots) {
                if(!this.mergeItemStack(stackInSlot, 0, tileSlots + 1, false))
                    return null;
            }
     
            else if(slot >= InventoryMin && slot <= InventoryMax - 1) {
                if(!this.mergeItemStack(stackInSlot, InventoryMax, HotBarMax, false))
                    return null;
            }
      
            else if(slot >= InventoryMax && slot <= HotBarMax - 1) {
                if(!this.mergeItemStack(stackInSlot, InventoryMin, InventoryMax, false))
                    return null;
            }
            if (stackInSlot.stackSize == 0) {
                slotObject.putStack(null);
            } else {
                slotObject.onSlotChanged();
            }
            if (stackInSlot.stackSize == stack.stackSize) {
                return null;
            }
            slotObject.onPickupFromSlot(player, stackInSlot);
        }
        return stack;
    }
}