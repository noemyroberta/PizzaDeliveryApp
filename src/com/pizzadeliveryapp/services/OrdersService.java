package com.pizzadeliveryapp.services;

import java.util.Random;

public class OrdersService {

    private char[] generatePromotionalCode() {
        return null;
    }

    private int generateDiscountIn() {
        Random random = new Random();
        int values[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        return random.nextInt(values.length);
    }

    public static void main(String[] args) {

        OrdersService service = new OrdersService();
        for(int i=0; i<10; i++) {
            int discount = service.generateDiscountIn();
            System.out.println(discount+"\n");
        }
    }
}
