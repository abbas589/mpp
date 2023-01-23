package com.miu.mpp.lab4.probc;

public class Salaried extends Employee {

    private double monthlySalary;

    public Salaried(String empId, double sal) {
        super(empId);
        monthlySalary = sal;
    }

    @Override
    public double calcGrossPay(int month, int yr) {
        return monthlySalary;
    }
}
