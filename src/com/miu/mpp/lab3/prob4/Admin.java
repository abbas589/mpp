package com.miu.mpp.lab3.prob4;

public class Admin {
    public static double computeTotalRent(Object[] properties) {
        double totalRent = 0;
        for (Object o : properties) {
            if (o instanceof House) {
                House h = (House) o;
                totalRent += h.computeRent();
            } else if (o instanceof Condo) {
                Condo h = (Condo) o;
                totalRent += h.computeRent();
            } else if (o instanceof Trailer) {
                Trailer h = (Trailer) o;
                totalRent += h.computeRent();
            }
        }
        return totalRent;
    }

    public static void listPropertiesIn(Object[] properties, String city) {
        for (Object p : properties) {
            if (p instanceof Property) {
                if (((Property) p).getAddress().getCity().equalsIgnoreCase(city)) {
                    System.out.println(p);
                }
            }
        }
    }
}
