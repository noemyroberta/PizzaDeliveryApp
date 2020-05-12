package com.pizzadeliveryapp.services;

import br.com.parg.viacep.ViaCEP;
import br.com.parg.viacep.ViaCEPException;
import com.pizzadeliveryapp.models.Customers;

public class CustomersService {

    public Customers checkData(Customers obj) throws ViaCEPException {
        String cpf = obj.getCpf();
        String code = obj.getZipCode();
        String fullName = obj.getFullName();
        String number = obj.getNumber();
        String telephoneNumber = obj.getTelephoneNumber();
        int numberRegisteredOrders = obj.getNumberRegisteredOrders();

        ValidateCPF validate = new ValidateCPF();
        ViaCEP viaCEP = new ViaCEP();
        ValidateTelephoneNumber validateNumber = new ValidateTelephoneNumber();
        Customers customer = new Customers();

        if(validate.isCpf(cpf) == true && validateNumber.isValidIndianMobileNumber(telephoneNumber)) {
            viaCEP.buscar(code);

            if(viaCEP.getBairro() != null &&
                    viaCEP.getLocalidade() != null &&
                    viaCEP.getLogradouro() != null) {

                customer.setNeighborhood(viaCEP.getBairro());
                customer.setStreet(viaCEP.getLocalidade());
                customer.setFullName(fullName);
                customer.setNumber(number);
                customer.setTelephoneNumber(telephoneNumber);
                customer.setNumberRegisteredOrders(numberRegisteredOrders);
            }
        }

        return customer;
    }
}
