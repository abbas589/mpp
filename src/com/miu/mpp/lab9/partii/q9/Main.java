package com.miu.mpp.lab9.partii.q9;

import java.util.stream.IntStream;

/**
 * @author bazz
 * Feb 02 2023
 * 14:35
 */
public class Main {
    public static void main(String[] args) {

        printSquares(14);

    }

    public static void printSquares(int num) {
        IntStream intStream = IntStream.iterate(1, (n) -> {

            int j = n + 1;
            int sqrt = (int) Math.sqrt(j);
            while (sqrt * sqrt != j ) {
                j++;
                sqrt = (int) Math.sqrt(j);
            }
            return j;
        }).limit(num);

        intStream.boxed().forEach(System.out::println);
    }

}
