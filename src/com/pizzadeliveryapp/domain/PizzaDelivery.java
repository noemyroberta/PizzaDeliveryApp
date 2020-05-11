package com.pizzadeliveryapp.domain;

import com.pizzadeliveryapp.dao.ConnectionFactory;

import java.sql.Connection;

public class PizzaDelivery {

    public static void main(String[] args) {

        Connection connection = new ConnectionFactory().getConnection();
    }
}
