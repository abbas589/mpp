package com.miu.mpp.lab8.q1;

import java.util.function.Supplier;

/**
 * @author bazz
 * Jan 31 2023
 * 22:43
 */
public class Bii {
    public static void main(String[] args) {

        Supplier<Double> runnable = () -> Math.random();

        System.out.println(runnable.get());
    }
}
