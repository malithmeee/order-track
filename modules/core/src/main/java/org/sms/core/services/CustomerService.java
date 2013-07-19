package org.sms.core.services;

import org.sms.models.Customer;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CustomerService {

    Customer saveCustomer(Customer customer);

    void deleteCustomer(Customer customer);

    Customer findCustomer(Long id);

    List<Customer> findAllCustomers();

    Page<Customer> findAllCustomers(int page, int size);
}