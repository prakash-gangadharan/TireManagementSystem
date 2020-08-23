package com.tms.orders.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-orders
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/11/17
 * Time: 06.48
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Setter
@Getter
public class Orders {
    @Id
    @Column(name = "orderId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long orderId;

    @ManyToMany(mappedBy = "orders")
    Set<Customer> customer;

    double totalAmount;
    
    public Orders() {
    }


    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", customer=" + customer +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
