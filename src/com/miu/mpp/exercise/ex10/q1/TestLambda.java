package com.miu.mpp.exercise.ex10.q1;

import org.testng.Assert;
import org.testng.annotations.Test;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class TestLambda extends TestCase {
	@Test
	public void testLambda() {

		List<Account> accounts = new ArrayList<>();
		Customer customer = new Customer("1000", "Bazz", "Abbas");
		accounts.add(new Account(400,customer));
		accounts.add(new Account(500,new Customer("1001","Bazz1","Abbas1")));
		accounts.add(new Account(20,new Customer("1002","Bazz2","Abbas2")));
		accounts.add(new Account(10,new Customer("1003","Bazz3","Abbas3")));
		accounts.add(new Account(800,new Customer("1004","Bazz4","Abbas4")));


		List<Customer> customers = Problem1.specialAccounts(accounts);

		Assert.assertEquals(3,customers.size());

		Assert.assertEquals(Problem1.accountCustomerFunction.apply(accounts.get(0)),customer);
		Assert.assertFalse(Problem1.greaterThanFifty.test(accounts.get(2)));
		Assert.assertTrue(Problem1.greaterThanFifty.test(accounts.get(1)));
		//your test

	}
}
