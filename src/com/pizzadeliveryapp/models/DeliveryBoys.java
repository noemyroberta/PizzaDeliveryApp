package com.pizzadeliveryapp.models;

public class DeliveryBoys extends People {

    private int numberTotalDeliveries;
    private int numberDeliveriesDay;
    private String aerea;
    private char id[] = new char[3];

    public DeliveryBoys() {

    }

    public DeliveryBoys(String cpf, String fullName, String zipCode, String street, String neighborhood,
                        String number, String telephoneNumber, int numberTotalDeliveries,
                        int numberDeliveriesDay, String aerea, char id[]) {
        super(cpf, fullName, zipCode, street, neighborhood, number, telephoneNumber);

        this.numberTotalDeliveries = numberTotalDeliveries;
        this.numberDeliveriesDay = numberDeliveriesDay;
        this.aerea = aerea;
        this.id = id;
    }

    public int getNumberTotalDeliveries() {
        return numberTotalDeliveries;
    }

    public void setNumberTotalDeliveries(int numberTotalDeliveries) {
        this.numberTotalDeliveries = numberTotalDeliveries;
    }

    public int getNumberDeliveriesDay() {
        return numberDeliveriesDay;
    }

    public void setNumberDeliveriesDay(int numberDeliveriesDay) {
        this.numberDeliveriesDay = numberDeliveriesDay;
    }

    public String getAerea() {
        return aerea;
    }

    public void setAerea(String aerea) {
        this.aerea = aerea;
    }

    public char[] getId() {
        return this.id;
    }

    public void setId(char id[]) {
        this.id = id;
    }
}
