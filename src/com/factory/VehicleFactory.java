package com.factory;

import com.entities.VehicleType;
import com.entities.Payment;

import com.entities.Vehicle;

import com.entities.Bike;
import com.entities.Car;
import com.entities.Truck;

public class VehicleFactory {

    public static Vehicle createVehicle(int vehicleId, VehicleType type, Payment payment)
    {
        switch(type)
        {
            case BIKE : return new Bike(vehicleId,payment);
            case CAR : return new Car(vehicleId,payment);
            case TRUCK : return new Truck(vehicleId,payment);
        }

        throw new IllegalArgumentException("Unknown type");
    }
    
}
