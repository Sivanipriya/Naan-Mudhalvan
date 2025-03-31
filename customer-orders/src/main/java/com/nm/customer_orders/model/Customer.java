package com.nm.customer_orders.model;

import jakarta.persistence.*;
import lombok.*;
import org.aspectj.weaver.ast.Or;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="customers")
@Getter
@Setter //annotations
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private Long mobile;
    @OneToMany(mappedBy="customer",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> orders;

    public void setOrders(List<Order> orders){
        this.orders = orders;
        if(orders != null) {
            for (Order order : orders) {
                order.setCustomer(this);
            }
        }
    }





    /*public static void main(String[] args)
    {
     Customer customer1= new Customer(1, "Ravi", "Ravi@gmail.com", 1234567890L, new ArrayList<>());
     Customer customer2= new Customer();
     System.out.println(customer1);
    }*/
}
