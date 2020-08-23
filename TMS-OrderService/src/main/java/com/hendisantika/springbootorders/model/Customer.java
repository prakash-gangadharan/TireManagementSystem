package com.hendisantika.springbootorders.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-orders
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/11/17
 * Time: 06.43
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Setter
@Getter
public class Customer {
    @Id
    @Column(name = "customerId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long customerId;
    String cusFirstname;
    String cusLastname;
    String cusEmail;
    String cusPhoneNo;
    String cusCity;
    String cusProvince;
    String cusCountry;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinColumn(name = "orderId")
    @JoinTable(name = "customer_order", joinColumns = {@JoinColumn(name = "customerId")}, inverseJoinColumns = {@JoinColumn(name = "orderId")})
    Set<Orders> orders = new HashSet<Orders>(0);

    public Customer() {
    }

    public Customer(String cusFirstname, String cusLastname, String cusEmail, String cusPhoneNo, String cusCity, String cusProvince, String cusCountry, Set<Orders> orders) {
        this.cusFirstname = cusFirstname;
        this.cusLastname = cusLastname;
        this.cusEmail = cusEmail;
        this.cusPhoneNo = cusPhoneNo;
        this.cusCity = cusCity;
        this.cusProvince = cusProvince;
        this.cusCountry = cusCountry;
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "customerId = " + customerId + " , cusFirstname = " + cusFirstname + " , cusLastname = " + cusLastname +
                " , cusEmail = " + cusEmail + " , cusPhoneNo = " + cusPhoneNo + " , cusCity = " + cusCity +
                ", cusProvince = " + cusProvince + " , cusCountry = " + cusCountry;
    }
}
