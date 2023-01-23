package com.miu.mpp.lab3.prob4;

public class Driver {

    public static void main(String[] args) {

        Object[] objects = {new House(9000, "fairfield"), new Condo(2, "fairfield"), new Trailer("Otummwa")};
        double totalRent = Admin.computeTotalRent(objects);
        Admin.listPropertiesIn(objects,"fairfield");
        System.out.println(totalRent);
    }
}
