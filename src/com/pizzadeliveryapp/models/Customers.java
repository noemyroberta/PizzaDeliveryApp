package com.pizzadeliveryapp.models;

public class Customers extends People {

    /**
     * Attributes
     */
    private int numberRegisteredOrders;

    public Customers() {

    }

    public Customers(String cpf, String fullName, String zipCode, String street, String neighborhood,
                     String number, String telephoneNumber, int numberRegisteredOrders) {
        super(cpf, fullName, zipCode, street, neighborhood, number, telephoneNumber);

        this.numberRegisteredOrders = numberRegisteredOrders;
    }

    public int getNumberRegisteredOrders() {
        return numberRegisteredOrders;
    }

    public void setNumberRegisteredOrders(int numberRegisteredOrders) {
        this.numberRegisteredOrders = numberRegisteredOrders;
    }
}
