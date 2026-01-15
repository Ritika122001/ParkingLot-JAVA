package com.entities;

public abstract class Vehicle
{
    private int vehicleId;
    private VehicleType vehicleType;
    private Payment payment;

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }



    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

     public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }


    public Vehicle(int vehicleId, VehicleType vehicleType, Payment payment) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Vehicle [vehicleId=" + vehicleId + ", vehicleType=" + vehicleType + "vehicleType.fees" + vehicleType.getFees() + "payment" + payment + "]";
    }

    public int calculateFee()
    {
            int fee = vehicleType.getFees();
            if(payment == Payment.PAYMENT_CARD)
            {
                fee-=50;
            }

            return fee;
    }

}