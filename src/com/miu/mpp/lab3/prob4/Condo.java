package com.miu.mpp.lab3.prob4;

public class Condo extends Property {
    private double rent;
    private int numOfFloors;

    public Condo(int numOfFloors, String city) {
        super.setAddress(new Address(city));
        this.numOfFloors = numOfFloors;
        this.rent = 400 * numOfFloors;
    }

    public double getRent() {
        return rent;
    }

    @Override
    double computeRent() {
        return getRent();
    }

    @Override
    public String toString() {
        return "Condo{" +
                "rent=" + rent +
                '}';
    }
}
