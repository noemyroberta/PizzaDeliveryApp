package com.pizzadeliveryapp.services;

import java.util.InputMismatchException;

public class ValidateCPF {

    public boolean isCpf(String cpf) {
        /**
         * CPF as a sequence of numbers
         */
        if (cpf.equals("00000000000") ||
                cpf.equals("11111111111") ||
                cpf.equals("22222222222") || cpf.equals("33333333333") ||
                cpf.equals("44444444444") || cpf.equals("55555555555") ||
                cpf.equals("66666666666") || cpf.equals("77777777777") ||
                cpf.equals("88888888888") || cpf.equals("99999999999") ||
                (cpf.length() != 11))
            return (false);

        char dig10, dig11;
        int sum, cont, rest, num, weight;

        try {
            /**
             * Calculation of the first check digit
             */
            sum = 0;
            weight = 10;

            for (cont = 0; cont < 9; cont++) {
                // Converts the i-th character into a number
                num = (int) (cpf.charAt(cont) - 48); // '48' is the number of the last position in ASCII scale
                sum = sum + (num * weight);
                weight = weight - 1;
            }

            rest = 11 - (sum % 11);

            if ((rest == 10) || (rest == 11))
                dig10 = '0';
            else dig10 = (char) (rest + 48);  // Converts it to its numeric character

            /**
             * Calculation of the second check digit
             */
            sum = 0;
            weight = 11;

            for (cont = 0; cont < 10; cont++) {
                num = (int) (cpf.charAt(cont) - 48);
                sum = sum + (num * weight);
                weight = weight - 1;
            }

            rest = 11 - (sum % 11);

            if ((rest == 10) || (rest == 11))
                dig11 = '0';
            else dig11 = (char) (rest + 48);

            // Checks whether the numbers sent and verified are the same
            if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10)))
                return (true);
            else return (false);

        } catch (InputMismatchException err) {
            return (false);
        }
    }

    public static String printCpf(String cpf) {
        return (cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." +
                cpf.substring(6, 9) + "-" + cpf.substring(9, 11));
    }

}
