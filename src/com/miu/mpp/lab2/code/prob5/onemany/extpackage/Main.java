package com.miu.mpp.lab2.code.prob5.onemany.extpackage;

import com.miu.mpp.lab2.code.prob5.onemany.Customer;
import com.miu.mpp.lab2.code.prob5.onemany.Order;

import java.time.LocalDate;


public class Main {
	public static void main(String[] args) {
		Customer cust = new Customer("Bob");
		Order order = cust.addOrder(LocalDate.now());
		order.addItem("Shirt");
		order.addItem("Laptop");
		order = cust.addOrder(LocalDate.now());
		order.addItem("Pants");
		order.addItem("Knife set");
		System.out.println(cust.getOrders());
		//cannot directly create an Order here
	}
}

		
