package com.miu.mpp.lab5.prob4.extpackage;

import java.time.LocalDate;

import com.miu.mpp.lab5.prob4.CustOrderFactory;
import com.miu.mpp.lab5.prob4.Customer;
import com.miu.mpp.lab5.prob4.Order;

public class Main {
    public static void main(String[] args) {
        Customer cust = CustOrderFactory.createCustomer("Bob");
        Order order = CustOrderFactory.addNewOrder(cust, LocalDate.now());
        CustOrderFactory.addItem(order, "Shirt");
        CustOrderFactory.addItem(order, "Laptop");

        order = CustOrderFactory.addNewOrder(cust, LocalDate.now());

        CustOrderFactory.addItem(order, "Pants");
        CustOrderFactory.addItem(order, "Knife set");

        System.out.println(cust.getOrders());
    }
}

		
