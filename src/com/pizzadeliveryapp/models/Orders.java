package com.pizzadeliveryapp.models;

public class Orders {

    private char[] promotionalCode = new char[10];
    private int discount;
    private String hourOrderSent;
    private String description;
    private String payment;
    private double totalPrice;

    public Orders() {

    }

    public Orders(char[] promotionalCode, int discount, String hourOrderSent,
                  String description, String payment, double totalPrice) {
        this.promotionalCode = promotionalCode;
        this.discount = discount;
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

    public char[] getPromotionalCode() {
        return promotionalCode;
    }

    public void setPromotionalCode(char[] promotionalCode) {
        this.promotionalCode = promotionalCode;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discout) {
        this.discount = discout;
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


}
