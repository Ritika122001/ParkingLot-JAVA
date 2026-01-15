package com.entities;

public class Slot {
    
   private int slotId;
   private int totalSlot;
   private Vehicle vehicle;

    public Slot(Vehicle vehicle, int slotId, int totalSlot) {
        this.vehicle = vehicle;
        this.slotId = slotId;
        this.totalSlot = totalSlot;
    }
   public int getSlotId() {
      return slotId;
   }
   public void setSlotId(int slotId) {
      this.slotId = slotId;
   }
   public int getTotalSlot() {
      return totalSlot;
   }
   public void setTotalSlot(int totalSlot) {
      this.totalSlot = totalSlot;
   }
   public Slot(int slotId, int totalSlot) {
      this.slotId = slotId;
      this.totalSlot = totalSlot;
   }
   @Override
   public String toString() {
      return "Slot [slotId=" + slotId + ", totalSlot=" + totalSlot + ", vehicle=" + vehicle + "]";
   }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicleId(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

   



}
