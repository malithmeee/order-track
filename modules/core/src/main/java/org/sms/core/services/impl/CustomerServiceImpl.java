package org.sms.core.services.impl;

import org.sms.core.services.CustomerService;
import org.sms.models.Customer;
import org.sms.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@Service("customerService")
@ContextConfiguration(locations = "classpath:META-INF/application-context.xml")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Customer customer) {
        customerRepository.delete(customer);
    }

    public Customer findCustomer(Long id) {
        return customerRepository.findOne(id);
    }

    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    public Page<Customer> findAllCustomers(int page, int size) {
        return customerRepository.findAll(new PageRequest(page, size));
    }
}