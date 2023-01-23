package com.miu.mpp.lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {
    List<Building> buildings = new ArrayList<>();

    public void addBuilding(Building bd) {
        buildings.add(bd);
    }

    public double calcProfits(){
        double profit = 0;
        for (Building bld: buildings) {
           double maintCost = bld.getMaintenanceCost();
           double rent = 0;
            for (Apartment apt: bld.getApartments()) {
                rent+= apt.getRent();
            }
            profit+= (rent - maintCost );
        }
        return profit;
    }
}
