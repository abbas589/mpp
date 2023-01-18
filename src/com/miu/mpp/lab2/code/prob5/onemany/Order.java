package com.miu.mpp.lab2.code.prob5.onemany;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Order {
    private LocalDate orderDate;
    private Customer customer;
    private List<Item> items;

    //package level access
    Order(LocalDate orderDate, Customer customer) {
        this.orderDate = orderDate;
        items = new ArrayList<Item>();
        this.customer = customer;
    }

    public static Order newOrder(LocalDate orderDate, Customer customer) {
        if (customer == null) {
            throw new NullPointerException("Customer Error!");
        }
        return new Order(orderDate, customer);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void addItem(String name) {
        items.add(new Item(name));
    }

    @Override
    public String toString() {
        return orderDate + ": " +
                items.toString();
    }
}
