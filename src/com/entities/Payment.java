package com.entities;

public enum Payment {
    PAYMENT_UPI(0),
    PAYMENT_CASH(0),
    PAYMENT_CARD(0);

    private int feePaid;

    public int getFeePaid() {
        return feePaid;
    }

    public void setFeePaid(int feePaid) {
        this.feePaid = feePaid;
    }

    private Payment(int feePaid) {
        this.feePaid = feePaid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Payment{");
        sb.append("feePaid=").append(feePaid);
        sb.append('}');
        return sb.toString();
    }

}
