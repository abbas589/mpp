package com.miu.mpp.lab9.partii.q10.b;

import java.util.stream.Stream;

/**
 * @author bazz
 * Feb 02 2023
 * 15:16
 */
public class StringStream {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of( "Bill", "Thomas", "Mary");

        stringStream.reduce((x,y)-> new StringBuilder(x).append(", ").append(y).toString()).ifPresent(System.out::println);
    }
}
