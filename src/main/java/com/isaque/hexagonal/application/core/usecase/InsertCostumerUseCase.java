package com.isaque.hexagonal.application.core.usecase;

import com.isaque.hexagonal.application.core.domain.Customer;
import com.isaque.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
public class InsertCostumerUseCase {

    private final FindAddressByZipCodeOutputPort  findAddressByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCostumerUseCase(FindAddressByZipCodeOutputPort  findAddressByZipCodeOutputPort,
    InsertCustomerOutputPort insertCustomerOutputPort){
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    public void insert(Customer customer, String zipCode){
        var address: Address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
    }
}
