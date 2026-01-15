package com.entities;

public enum VehicleType {
    BIKE(100),
    CAR(200),
    TRUCK(250);

    private int fees;

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    private VehicleType(int fees) {
        this.fees = fees;
    }
    
    
}
