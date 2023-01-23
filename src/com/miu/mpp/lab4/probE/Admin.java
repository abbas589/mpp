package com.miu.mpp.lab4.probE;


import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
	    double totalBal = 0;
        for (Employee emp: list) {
            totalBal += emp.computeUpdatedBalanceSum();
        }
		//implement
		return totalBal;
	}
}
