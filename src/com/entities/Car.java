package com.entities;

public class Car extends Vehicle{
    
    public Car(int vehicleId,  Payment payment)
    {
        super(vehicleId, VehicleType.CAR, payment);
    }
}
