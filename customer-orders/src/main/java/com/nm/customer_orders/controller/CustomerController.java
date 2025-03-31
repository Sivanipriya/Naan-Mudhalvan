package com.nm.customer_orders.controller;

import com.nm.customer_orders.model.Customer;
import com.nm.customer_orders.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController
{
    @Autowired
    private CustomerService customerService;

    @GetMapping(value="getAllCustomers")
    public List<Customer> getAllCustomers()
    {
        return customerService.getAllCustomer();
    }

    @PostMapping(value="saveCustomer")
    public Customer saveCustomer(@RequestBody Customer customer)
    {
        Customer response=customerService.saveCustomer(customer);
        return response;
    }
}
