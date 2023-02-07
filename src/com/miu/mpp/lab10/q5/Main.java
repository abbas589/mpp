package com.miu.mpp.lab10.q5;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<Employee> emps = Arrays.asList(
                new Employee("Joe", "Davis", 120000),
                new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000)
        ).stream();

        printEmps(asString(emps));

    }

    public static String asString(Stream<Employee> emps) {
        return emps
                .filter(Main::salaryGreaterThan100000)
                .filter(Main::lastNameAfterM)
                .map(Main::fullName)
                .sorted()
                .collect(Collectors.joining(", "));
    }

    private static void printEmps(String asList) {
        System.out.println(asList);
    }

    public static String fullName(Employee e) {
        return e.getFirstName() + " " + e.getLastName();
    }


    public static boolean salaryGreaterThan100000(Employee e) {
        return e.getSalary() > 100000;
    }

    public static boolean lastNameAfterM(Employee e){
        return e.getLastName().charAt(0) > 'M';
    }
}
