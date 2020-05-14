package com.pizzadeliveryapp.services;

import com.pizzadeliveryapp.models.Orders;
import java.util.*;

public class OrdersService {

    public Orders checkData(Orders obj) {
        String promoCode = obj.getPromotionalCode();
        double totalPrice = obj.getTotalPrice();
        String hourSent = obj.getHourOrderSent();

        Orders order;

        if(promoCode != null) {
            totalPrice = getTotalPriceWithDiscount(promoCode, totalPrice);
            order = obj;
            order.setTotalPrice(totalPrice);
            return order;
        } else {
            order = obj;
            return order;
        }
    }

    private double getTotalPriceWithDiscount(String promoCode, double totalPrice) {
        double discount = readPromotionalCode(promoCode);
        discount = totalPrice * (discount / 100);
        totalPrice = totalPrice - discount;

        return totalPrice;
    }

    private int readPromotionalCode(String code) {
        Integer discount;
        String lastCharacters;
        String[] words = new String[]{"PIZZA", "DISCOUNT", "COMB", "PROMO"};

        lastCharacters = code.substring(code.length()-2);
        if(Arrays.stream(words).parallel().anyMatch(code::contains) &&
                lastCharacters.matches("[10-90]+")) {
             discount = Integer.parseInt(lastCharacters);
             return discount;
        }

        return 0;
    }

    private String generatePromotionalCode() {
        Random random = new Random();
        int sufix = generateDiscountIn();

        String[] words = new String[]{"PIZZA", "DISCOUNT", "COMB", "PROMO"};
        String prefix = words[random.nextInt(words.length)];
        StringBuilder builder = new StringBuilder();
        builder.append(prefix).append(sufix);

        return builder.toString();
    }

    private int generateDiscountIn() {
        Random random = new Random();
        int values[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        return values[random.nextInt(values.length)];
    }

    public static void main(String[] args) {

        OrdersService service = new OrdersService();
        /*
        for(int i=0; i<10; i++) {
            int discount = service.generateDiscountIn();
            System.out.println(discount+"\n");
        }*/

        /*String promotionalCode = service.generatePromotionalCode();
        System.out.println(service.readPromotionalCode(promotionalCode));

        */

        Orders order = new Orders("PIZZA10", "15:02", 
                "Tire o sorvete", "Dinheiro", 18.1);
        Orders checked = service.checkData(order);
        System.out.println(checked.toString());
    }

}
