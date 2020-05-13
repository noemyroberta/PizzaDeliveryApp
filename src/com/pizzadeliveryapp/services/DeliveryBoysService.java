package com.pizzadeliveryapp.services;

import br.com.parg.viacep.ViaCEP;
import br.com.parg.viacep.ViaCEPException;
import com.pizzadeliveryapp.models.DeliveryBoys;

public class DeliveryBoysService {

    public DeliveryBoys checkData(DeliveryBoys obj) throws ViaCEPException {
        String zipCode = obj.getZipCode();
        String cpf = obj.getCpf();
        String telephoneNumber = obj.getTelephoneNumber();

        ViaCEP zipCodeChecked = checkZipCode(zipCode);

        if(checkTelephoneNumber(telephoneNumber) &&
                checkCpf(cpf) &&
                zipCodeChecked != null) {

            DeliveryBoys deliveryBoy = obj;
            deliveryBoy.setNeighborhood(zipCodeChecked.getBairro());
            deliveryBoy.setStreet(zipCodeChecked.getLogradouro());

            return deliveryBoy;
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
