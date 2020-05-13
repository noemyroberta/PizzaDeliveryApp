package com.pizzadeliveryapp.domain;

import br.com.parg.viacep.ViaCEPException;
import com.pizzadeliveryapp.models.Customers;
import com.pizzadeliveryapp.services.CustomersService;

public class PizzaDelivery {
    /**
     * The Program Start
     * @param args
     */
    public static void main(String[] args) throws ViaCEPException {

        Customers customer = new Customers(
                "513.127.430-34", "Noemy Roberta", "57303-212",
                "", "", "154", "(82) 99927-5198", 0
        );
        System.out.println(customer.toString());
        CustomersService service = new CustomersService();
        Customers checkedCustomer = service.checkData(customer);
        System.out.println(checkedCustomer.toString());
    }
}
