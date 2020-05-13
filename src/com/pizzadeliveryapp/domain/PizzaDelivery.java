package com.pizzadeliveryapp.domain;

import br.com.parg.viacep.ViaCEPException;
import com.pizzadeliveryapp.dao.ConnectionFactory;
import com.pizzadeliveryapp.models.Customers;
import com.pizzadeliveryapp.services.CustomersService;

import java.sql.Connection;

public class PizzaDelivery {

    public static void main(String[] args) throws ViaCEPException {

        Customers customer = new Customers("122.777.000-63", "Noemy Roberta", "57303-212",
                "", "", "154", "(84) 99983-1111", 0);
        System.out.println(customer.toString());
        CustomersService service = new CustomersService();
        Customers customerChecked = service.checkData(customer);
        System.out.println(customerChecked.toString());
    }
}
