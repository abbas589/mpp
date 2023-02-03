package com.miu.mpp.lab9.q4;

/**
 * @author bazz
 * Feb 01 2023
 * 20:19
 */
public class Main {
    public static void main(String[] args) {
        PrimeStream ps = new PrimeStream(); //PrimeStream is enclosing class
        ps.printFirstNPrimes(10);
        System.out.println("====");
        ps.printFirstNPrimes(5);
    }
}
