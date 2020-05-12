package com.pizzadeliveryapp.domain;

import br.com.parg.viacep.ViaCEPException;
import com.pizzadeliveryapp.dao.ConnectionFactory;
import com.pizzadeliveryapp.models.Customers;
import com.pizzadeliveryapp.services.CustomersService;

import java.sql.Connection;

public class PizzaDelivery {

    public static void main(String[] args) throws ViaCEPException {

        //Connection connection = new ConnectionFactory().getConnection();
        Customers customer = new Customers("121.772.014-62", "Noemy Roberta",
                "57303-212", "", "", "154", "(82) 9 9982-11117", 0);
        CustomersService cusService = new CustomersService();
        Customers checked = cusService.checkData(customer);
        System.out.println(checked.toString());
    }
}
