package com.miu.mpp.lab8.q1;

import java.util.function.Supplier;

/**
 * @author bazz
 * Jan 31 2023
 * 22:58
 */
public class Biii {
    public static void main(String[] args) {

        SupplierClass supplierClass = new SupplierClass();

        System.out.println(supplierClass.get());
    }

    public static class SupplierClass implements Supplier<Double> {

        @Override
        public Double get() {
            return Math.random();
        }

    }
}
