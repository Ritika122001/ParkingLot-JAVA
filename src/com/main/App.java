package com.main;
import com.entities.Payment;
import com.entities.Vehicle;
import com.entities.VehicleType;
import com.factory.VehicleFactory;
import com.service.ParkingService;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println("Parking Lot System!!");
        System.out.println("Enter the total slots you want in parkingLot");
        Scanner sc = new Scanner(System.in);
        int totalSlots = sc.nextInt();
        ParkingService parkingService = new ParkingService();

        parkingService.assignSlots(totalSlots);

        // ParkingService.assignSlots(5);

        Vehicle bike = VehicleFactory.createVehicle(1, VehicleType.BIKE, Payment.PAYMENT_CARD);
        Vehicle car = VehicleFactory.createVehicle(2, VehicleType.CAR, Payment.PAYMENT_UPI);
        Vehicle truck = VehicleFactory.createVehicle(3, VehicleType.TRUCK, Payment.PAYMENT_CASH);

        System.out.println(parkingService.createParking(bike));
        System.out.println(parkingService.createParking(car));
        System.out.println(parkingService.createParking(truck));

        boolean isUnparked = parkingService.unparkVehicle(1);
        System.out.println("isUnparked ? " + isUnparked);
        
        boolean isUnparked1 = parkingService.unparkVehicle(5); // test non-existing slot
System.out.println("isUnparked1 ? " + isUnparked1);


        // Vehicle vehicle1 = VehicleFactory.createVehicle(1, VehicleType.BIKE , Payment.PAYMENT_CARD);
        // System.out.println("New Vehicle Created" + vehicle1);
        // Slot parking1 = ParkingService.createParking(vehicle1);
        // System.out.println("New Parking Created" + parking1);

        // Vehicle vehicle2 = VehicleFactory.createVehicle(10, VehicleType.TRUCK , Payment.PAYMENT_CASH);
        // System.out.println("New Vehicle Created" + vehicle2);
        // Slot parking2 = ParkingService.createParking(vehicle2);
        // System.out.println("New Parking Created" + parking2);

        // boolean isUnparked = ParkingService.unparkVehicle(1);
        // System.out.println("isUnparked ? " + isUnparked);

        parkingService.printAllSlots();

    }
}
