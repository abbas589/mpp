package com.miu.mpp.lab8.q2.a;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int isSalaryEqual = e1.salary == e2.salary ? 0 : 1;

        int nameEqual = e1.name.compareTo(e2.name);

        return nameEqual == 0 && isSalaryEqual == 0 ? 0 : 1;
    }
}
