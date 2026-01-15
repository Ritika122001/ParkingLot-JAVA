package com.entities;

public class Truck extends Vehicle {

    public Truck(int vehicleId, Payment payment)
    {
        super(vehicleId, VehicleType.TRUCK, payment);
    }
    
}
