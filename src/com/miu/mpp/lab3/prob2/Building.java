package com.miu.mpp.lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {

    private List<Apartment> apartments;
    private double maintenanceCost;


    public Building(double maintenanceCost) {
        apartments = new ArrayList<>();
        this.maintenanceCost = maintenanceCost;
    }

    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }

    public double getMaintenanceCost() {
        return maintenanceCost;
    }

    public List<Apartment> getApartments() {
        return apartments;
    }
}
