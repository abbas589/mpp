package com.miu.mpp.lab5.prob4;

import java.time.LocalDate;

public class CustOrderFactory {

    public static Customer createCustomer(String name){
        return new Customer(name);
    }

    public static Order addNewOrder (Customer customer, LocalDate date){
        return Order.newOrder(customer, LocalDate.now());
    }
    public static void addItem(Order order,String name){
        order.addItem(name);
    }
}
