package com.isaque.hexagonal.application.ports.out;

import com.isaque.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
