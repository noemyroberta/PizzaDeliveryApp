package com.pizzadeliveryapp.models;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Orders {

    private String promotionalCode;
    private String hourOrderSent;
    private String description;
    private String payment;
    private double totalPrice;

    public Orders() {

    }

    public Orders(String promotionalCode, String hourOrderSent, String description,
                  String payment, double totalPrice) {
        this.promotionalCode = promotionalCode;
        this.hourOrderSent = hourOrderSent;
        this.description = description;
        this.payment = payment;
        this.totalPrice = totalPrice;
    }

    public Orders(String hourOrderSent, String description, String payment, double totalPrice) {
        this.hourOrderSent = hourOrderSent;
        this.description = description;
        this.payment = payment;
        this.totalPrice = totalPrice;
    }

    public String getPromotionalCode() {
        return promotionalCode;
    }

    public void setPromotionalCode(String promotionalCode) {
        this.promotionalCode = promotionalCode;
    }

    public String getHourOrderSent() {
        return hourOrderSent;
    }

    public void setHourOrderSent(String hourOrderSent) {
        this.hourOrderSent = hourOrderSent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        DecimalFormatSymbols x = new DecimalFormatSymbols();
        x.setDecimalSeparator(',');
        DecimalFormat f = new DecimalFormat("#.##", x);

        return "Orders{" +
                "promotionalCode='" + promotionalCode + '\'' +
                ", hourOrderSent='" + hourOrderSent + '\'' +
                ", description='" + description + '\'' +
                ", payment='" + payment + '\'' +
                ", totalPrice=" + f.format(totalPrice) +
                '}';
    }
}
