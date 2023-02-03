package com.miu.mpp.lab9.q4;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author bazz
 * Feb 01 2023
 * 19:32
 */
public class PrimeStream {
    final Supplier<Stream<Integer>> primeSupplier = () -> Stream.iterate(2, (n) -> {
        int j = n + 1;
        while (!isPrime(j)) {
            j++;
        }
        return j;
    });

    final Stream<Integer> primes = primeSupplier.get();

    void printFirstNPrimes(long n) {
        primeSupplier.get().limit(n).forEach(System.out::println);

    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}
