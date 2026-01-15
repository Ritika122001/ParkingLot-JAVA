package com.entities;

public class Bike extends Vehicle{
    
    public Bike(int vehicleId, Payment payment)
    {
        super(vehicleId, VehicleType.BIKE, payment);
    }
}
