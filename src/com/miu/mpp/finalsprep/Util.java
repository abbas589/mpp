package com.miu.mpp.finalsprep;

import com.miu.mpp.lab4.probE.Employee;

import java.util.Arrays;
import java.util.List;

/**
 * @author bazz
 * Feb 08 2023
 * 19:51
 */
public class Util {

    public static <T> T filterMapEmployee(List<T> list, T filer){

        return list.stream().findAny().orElse(list.get(0));
    }


    public static void main(String[] args) {
        Util.filterMapEmployee(Arrays.asList(new Employee("abbas"),new Employee("bazz"),new Employee("mainn")), 46);
    }
}
