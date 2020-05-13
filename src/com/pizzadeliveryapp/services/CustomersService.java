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

        ViaCEP zipCodeChecked = checkZipCode(code);

        if(checkTelephoneNumber(telephoneNumber) &&
                checkCpf(cpf) &&
                 zipCodeChecked != null) {

            Customers customers = new Customers();
            customers.setFullName(fullName);
            customers.setNumber(number);
            customers.setNumberRegisteredOrders(numberRegisteredOrders);
            customers.setTelephoneNumber(telephoneNumber);
            customers.setCpf(cpf);
            customers.setZipCode(zipCodeChecked.getCep());
            customers.setStreet(zipCodeChecked.getLogradouro());
            customers.setNeighborhood(zipCodeChecked.getBairro());

            return customers;
        }

        return null;
    }

    private boolean checkTelephoneNumber(String telephoneNumber) {
        ValidateTelephoneNumber validate = new ValidateTelephoneNumber();
        return validate.isTelephoneNumber(telephoneNumber);
    }

    private boolean checkCpf(String cpf) {
        ValidateCPF validate = new ValidateCPF();
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");

        return validate.isCpf(cpf);
    }

    private ViaCEP checkZipCode(String code) throws ViaCEPException {
        ViaCEP validate = new ViaCEP();
        validate.buscar(code);

        if(validate.getLogradouro() != null &&
            validate.getBairro() != null)
            return validate;

        return null;
    }
}

