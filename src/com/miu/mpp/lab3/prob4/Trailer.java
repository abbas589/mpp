package com.miu.mpp.lab3.prob4;

public class Trailer extends Property {
    private final double rent = 500;

    public Trailer(String city) {

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
        return "Trailer{" +
                "rent=" + rent +
                '}';
    }
}
