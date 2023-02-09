package com.miu.mpp.finalsprep.leder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Employee {
    private long id;
    private String firstName;
    private String lastName;
    private int age;

    public Employee(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }
}

//public class Util {
//    public static <T, R> List<R> filterMap(List<T> list, Predicate<T> filter, Function<T, R> map) {
//        List<R> result = new ArrayList<>();
//        for (T t : list) {
//            if (filter.test(t)) {
//                result.add(map.apply(t));
//            }
//        }
//        return result;
//    }
//
//
//    // usage example
//    List<Employee> employees = Arrays.asList(new Employee("ab",2),new Employee("ab1",4));
//    List<String> names = Util.filterMap(employees, e -> e.getAge() > 20, Employee::getFirstName);
//
//}

