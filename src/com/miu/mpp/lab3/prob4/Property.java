package com.miu.mpp.lab3.prob4;

public abstract class Property {
    abstract double computeRent();
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
