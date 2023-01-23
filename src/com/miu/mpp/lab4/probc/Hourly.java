package com.miu.mpp.lab4.probc;

public class Hourly extends Employee{

    private static final int WEEKS_PER_MONTH = 4;
    private double hourlyWage;
    private int hoursPerWeek;

    public Hourly(String empId,double wage,int hoursPerWeek) {
        super(empId);
        this.hourlyWage = wage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calcGrossPay(int month, int yr) {
        return hourlyWage * hoursPerWeek * WEEKS_PER_MONTH;
    }



}
