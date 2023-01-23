package com.miu.mpp.lab4.probc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public abstract class Employee {

    private String empId;

    public Employee(String empId) {
        this.empId = empId;
    }

    public void print() {
        LocalDate now = LocalDate.now();
        System.out.println(calcCompensation(now.getMonthValue(),now.getYear()));

    }

    public Paycheck calcCompensation(int month, int yr) {

        LocalDate now = LocalDate.now();
        double grossPay = calcGrossPay(now.getMonthValue(),now.getYear());

        return new Paycheck(grossPay, Tax.FICA, Tax.State,
                Tax.Local, Tax.Medicare, Tax.SSN);
    }

    public abstract double calcGrossPay(int month, int yr);

}
