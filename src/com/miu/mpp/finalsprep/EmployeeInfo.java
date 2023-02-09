package com.miu.mpp.finalsprep;


import com.miu.mpp.lab10.q5.Employee;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeInfo {
    public void sort(List<Employee> emps, Employee e) {
        Collections.sort(emps, (e1, e2) -> {
            e.setSalary(10000);
            return e1.getFirstName().compareToIgnoreCase(e2.getFirstName());
        });
    }

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("10", "20", "30", "40");

        Stream<String> limit = stringStream.limit(3);

        System.out.println("res "+limit.count());
    }

}
