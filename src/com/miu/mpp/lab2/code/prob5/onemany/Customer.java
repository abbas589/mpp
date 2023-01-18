package com.miu.mpp.lab2.code.prob5.onemany;

import java.time.LocalDate;
import java.util.*;

public class Customer {
    private String name;
    private List<Order> orders = new ArrayList<Order>();

    public Customer(String name) {
        this.name = name;
    }

    public Order addOrder(LocalDate dateOfOrder) {
        Order ord = Order.newOrder(dateOfOrder, this);
        orders.add(ord);
        return ord;
    }

    public String getName() {
        return name;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
