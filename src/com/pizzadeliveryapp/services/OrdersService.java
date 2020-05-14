package com.pizzadeliveryapp.services;

import com.pizzadeliveryapp.models.Orders;
import java.util.*;

public class OrdersService {

    public Orders checkData(Orders obj) {
        return null;
    }

    private int readPromotionalCode(String code) {
        Integer discount;
        String lastCharacteres;
        String[] words = new String[]{"PIZZA", "DISCOUNT", "COMB", "PROMO"};

        lastCharacteres = code.substring(code.length()-2);
        if(Arrays.stream(words).parallel().anyMatch(code::contains) &&
                lastCharacteres.matches("[10-90]+")) {
             discount = Integer.parseInt(lastCharacteres);
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

        /*OrdersService service = new OrdersService();
        for(int i=0; i<10; i++) {
            int discount = service.generateDiscountIn();
            System.out.println(discount+"\n");
        }*/

        OrdersService service = new OrdersService();
        String promotionalCode = service.generatePromotionalCode();
        System.out.println(service.readPromotionalCode(promotionalCode));

    }

}
