package com.pizzadeliveryapp.models;

import java.util.Objects;

public class Deliveries {

    private String sentTime;
    private String arrivalTime;
    private char[] deliveryBoyId = new char[3];
    private boolean status = false;

    public Deliveries(String sentTime, String arrivalTime, char[] deliveryBoyId, boolean status) {
        this.sentTime = sentTime;
        this.arrivalTime = arrivalTime;
        this.deliveryBoyId = deliveryBoyId;
        this.status = status;
    }

    public Deliveries() {

    }

    public String getSentTime() {
        return sentTime;
    }

    public void setSentTime(String sentTime) {
        this.sentTime = sentTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public char[] getDeliveryBoyId() {
        return deliveryBoyId;
    }

    public void setDeliveryBoyId(char[] deliveryBoyId) {
        this.deliveryBoyId = deliveryBoyId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deliveries that = (Deliveries) o;

        return Objects.equals(sentTime, that.sentTime) &&
                Objects.equals(arrivalTime, that.arrivalTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentTime, arrivalTime);
    }
}
