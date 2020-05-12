package com.pizzadeliveryapp.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateTelephoneNumber {

    public boolean isValidIndianMobileNumber(String str) {
        Pattern pattern = Pattern.compile("^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$");
        Matcher matcher = pattern.matcher(str);

        return (matcher.find() && matcher.group().equals(str));
    }
}
