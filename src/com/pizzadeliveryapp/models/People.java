package com.pizzadeliveryapp.models;

import java.util.Objects;

public abstract class People {

    private String cpf;
    private String fullName;
    private String zipCode;
    private String street;
    private String neighborhood;
    private String number;
    private String telephoneNumber;

    public People() {

    }

    public People(String cpf, String fullName, String zipCode, String street,
                  String neighborhood, String number, String telephoneNumber) {

        this.cpf = cpf;
        this.fullName = fullName;
        this.zipCode = zipCode;
        this.street = street;
        this.neighborhood = neighborhood;
        this.number = number;
        this.telephoneNumber = telephoneNumber;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;

        return Objects.equals(cpf, people.cpf) &&
                Objects.equals(fullName, people.fullName) &&
                Objects.equals(zipCode, people.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, fullName, zipCode);
    }

}
