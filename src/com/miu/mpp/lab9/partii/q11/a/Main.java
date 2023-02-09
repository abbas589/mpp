package com.miu.mpp.lab9.partii.q11.a;

import com.miu.mpp.lab9.partii.q11.b.LambdaLibrary;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

    public static final List<Character> characterList = getCharacterStream();

    private static List<Character> getCharacterStream() {
        return Stream.iterate('N', character -> (char) (character + 1)).limit(26).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
                new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000));


        String strVal = LambdaLibrary.EMPS_WITH_SAL_GR_ONE_K_AND_NAME_STR_WITH_N_Z.apply(emps, characterList, 100000);
        System.out.println(strVal);


        System.out.println(Optional.of(23).flatMap(x ->
                Optional.ofNullable(null)).orElseGet(() -> "none"));
        Optional.of(23).flatMap(x ->
                Optional.ofNullable(46)).ifPresent(System.out::println);


        Stream<String> stringStream = Stream.of("1", "2", "40", "10");

        System.out.println(stringStream.map(Integer::parseInt).reduce((x, y)-> getLarget(x,y)).get());;

        List<Integer> us = new ArrayList<>();
//        List<Number> uo = us;



    }

    private static Integer getLarget(Integer x, Integer y) {

        System.out.println("x "+x);
        System.out.println("y "+y);
        if (x > y) {
            return x;
        }
        return y;
    }


}
