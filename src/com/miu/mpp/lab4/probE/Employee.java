package com.miu.mpp.lab4.probE;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> accounts;


	public Employee(String emp){
		this.name = emp;
		accounts = new ArrayList<>();

	}

	public String getName() {
		return name;
	}

	public void addAccount(Account account){
		accounts.add(account);

	}

	public double computeUpdatedBalanceSum() {
		//implement
		double total = 0;
		for (Account acct: accounts) {
			total += acct.computeUpdatedBalance();
		}
		return total;
	}
}
