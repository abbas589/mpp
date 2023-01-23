package com.miu.mpp.lab3.prob4;

public class House extends Property {
    private int lotSize;
    private double rent;

    public House(int lotSize, String city) {
        this.lotSize = lotSize;
        this.rent = 0.1 * lotSize;
        super.setAddress(new Address(city));
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
        return "House{" +
                "lotSize=" + lotSize +
                ", rent=" + rent +
                '}';
    }
}
