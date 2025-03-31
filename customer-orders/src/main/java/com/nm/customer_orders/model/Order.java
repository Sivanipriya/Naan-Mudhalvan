package com.nm.customer_orders.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String product;
    private int quantity;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
//    @JsonIgnore
    @JsonBackReference
    private Customer customer;

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
