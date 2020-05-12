package com.pizzadeliveryapp.models;

public class Customers extends People {

    /**
     * Attributes
     */
    private int numberRegisteredOrders;

    public Customers() {

    }

    /**
     *
     * @param cpf
     * @param fullName
     * @param zipCode
     * @param street
     * @param neighborhood
     * @param number
     * @param telephoneNumber
     * @param numberRegisteredOrders
     */
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

    @Override
    public String toString() {
        return "Customers{" +
                "cpf='" + super.getCpf() + '\'' +
                ", fullName='" + super.getFullName() + '\'' +
                ", zipCode='" + super.getZipCode() + '\'' +
                ", street='" + super.getStreet() + '\'' +
                ", neighborhood='" + super.getNeighborhood() + '\'' +
                ", number='" + super.getNumber() + '\'' +
                ", telephoneNumber='" + super.getTelephoneNumber() + '\'' +
                "numberRegisteredOrders=" + numberRegisteredOrders +
                '}';
    }
}
