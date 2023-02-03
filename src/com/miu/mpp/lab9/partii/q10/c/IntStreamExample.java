package com.miu.mpp.lab9.partii.q10.c;

import java.util.Collection;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author bazz
 * Feb 02 2023
 * 17:04
 */
public class IntStreamExample {

    public static final IntStream intStream = getIntStream();

    private static IntStream getIntStream() {
        return IntStream.iterate(1, (x) -> x + 1).limit(500);
    }

    public static void main(String[] args) {
        IntSummaryStatistics intSummaryStatistics = intStream.summaryStatistics();


        System.out.println("Max is :"+intSummaryStatistics.getMax());
        System.out.println("Min is :"+intSummaryStatistics.getMin());

    }
}
