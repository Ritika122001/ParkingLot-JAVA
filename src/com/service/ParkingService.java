package com.service;
import java.util.PriorityQueue;

import com.entities.Payment;
import com.entities.Slot;
import com.entities.Vehicle;
import java.util.*;

public class ParkingService {

     Map<Integer, Vehicle>slotToVehicleMapping = new HashMap<>();
     PriorityQueue<Integer>pq = new PriorityQueue<>(); 
     int totalSlotPresent = 0;


    public  void assignSlots(int totalSlot)
    {
        totalSlotPresent = totalSlot;
        for(int i=0;i<totalSlot;i++)
        {
            pq.offer(i+1);
        }
    }

    public  Slot createParking(Vehicle vehicle)
    {
        int freeSlotId = 0;
        int fee = vehicle.calculateFee();
        Payment type = vehicle.getPayment();
        type.setFeePaid(fee);

        if(!pq.isEmpty())
        {
            freeSlotId = pq.poll();
            System.out.println("Slot" + freeSlotId +  "is present");

        }
        else
        {
            System.out.println("No available slots present");
        }
        
        Slot slot = new Slot(vehicle,freeSlotId, totalSlotPresent);
        slotToVehicleMapping.put(freeSlotId , vehicle);
        return slot;
    }

    public  boolean unparkVehicle(int slotId)
    {

        if(slotId  > pq.size())
        {
            System.out.println("No Slot Id is present ");
            return false;
        }

        if(slotToVehicleMapping.containsKey(slotId))
            slotToVehicleMapping.remove(slotId);
        else
        {
            System.out.println("No SlotId is present");
            return false;
        }

        pq.offer(slotId);
        return true;
    }

    public  void printAllSlots()
    {
    
    slotToVehicleMapping.forEach((id , vehicle) -> 
    {
        System.out.println("Slot Id - " + id + " Vehicle - " + vehicle);
    });

    }
    
}
