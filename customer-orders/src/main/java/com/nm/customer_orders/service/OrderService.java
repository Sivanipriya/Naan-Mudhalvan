package com.nm.customer_orders.service;

import com.nm.customer_orders.model.Order;
import com.nm.customer_orders.repository.CustomerRepository;
import com.nm.customer_orders.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CustomerRepository customerRepository;


    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }
    public Order saveOrder(Order order)
    {
        return orderRepository.save(order);
    }
}
