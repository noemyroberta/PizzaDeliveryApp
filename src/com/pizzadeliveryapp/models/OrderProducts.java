package com.pizzadeliveryapp.models;

import java.util.Arrays;
import java.util.Objects;

public class OrderProducts {

    private char[] productId = new char[4];
    private int orderId;
    private char[] amount = new char[2];

    public OrderProducts(char[] productId, int orderId, char[] amount) {
        this.productId = productId;
        this.orderId = orderId;
        this.amount = amount;
    }

    public OrderProducts() {

    }

    public char[] getProductId() {
        return productId;
    }

    public void setProductId(char[] productId) {
        this.productId = productId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public char[] getAmount() {
        return amount;
    }

    public void setAmount(char[] amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderProducts that = (OrderProducts) o;

        return orderId == that.orderId &&
                Arrays.equals(productId, that.productId);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(orderId);
        result = 31 * result + Arrays.hashCode(productId);
        return result;
    }
}
