package com.pizzadeliveryapp.services;

public class ValidateTelephoneNumber {

    public boolean isTelephoneNumber(String telephoneNumber) {
        return telephoneNumber.matches("(\\(?\\d{2}\\)?\\s)?(\\d{4,5}\\-\\d{4})");
    }
}
