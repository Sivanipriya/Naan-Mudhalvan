package com.nm.customer_orders.service;

import com.nm.customer_orders.model.Customer;
import com.nm.customer_orders.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService
{
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }


    public Customer saveCustomer(Customer customer)
    {
        return customerRepository.save(customer);
    }
}
