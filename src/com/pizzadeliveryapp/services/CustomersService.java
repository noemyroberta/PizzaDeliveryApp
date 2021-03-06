package com.pizzadeliveryapp.services;

import br.com.parg.viacep.ViaCEP;
import br.com.parg.viacep.ViaCEPException;
import com.pizzadeliveryapp.models.Customers;

public class CustomersService {

    public Customers checkData(Customers obj) throws ViaCEPException {
        String cpf = obj.getCpf();
        String code = obj.getZipCode();
        String telephoneNumber = obj.getTelephoneNumber();

        ViaCEP zipCodeChecked = checkZipCode(code);

        if(checkTelephoneNumber(telephoneNumber) &&
                checkCpf(cpf) &&
                 zipCodeChecked != null) {

            Customers customer = obj;
            customer.setStreet(zipCodeChecked.getLogradouro());
            customer.setNeighborhood(zipCodeChecked.getBairro());

            return customer;
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

