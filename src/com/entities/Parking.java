package com.entities;


public class Parking {
    
    private int totalSlots;

    private int availableSlots;

    private Slot slot;

    public Parking( Slot slot, int totalSlots , int availableSlots) {
        this.availableSlots = availableSlots;
        this.slot = slot;
        this.totalSlots = totalSlots;
    }

    public Parking() {
    }


    public int getTotalSlots() {
        return totalSlots;
    }

    public void setTotalSlots(int totalSlots) {
        this.totalSlots = totalSlots;
    }

    @Override
    public String toString() {
        return "Parking [totalSlots=" + totalSlots + "Slots=" + slot + "availableSlots=" + availableSlots + "]";
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public int getAvailableSlots() {
        return availableSlots;
    }

    public void setAvailableSlots(int availableSlots) {
        this.availableSlots = availableSlots;
    }

}
