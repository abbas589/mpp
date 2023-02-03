package com.miu.mpp.lab9.partii.q11.b;

import com.miu.mpp.lab9.partii.q11.a.Employee;
import com.miu.mpp.lab9.partii.q11.a.TriFunction;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author bazz
 * Feb 02 2023
 * 18:48
 */
public class LambdaLibrary {

    public static final TriFunction <List<Employee>,List<Character>, Integer, String> EMPS_WITH_SAL_GR_ONE_K_AND_NAME_STR_WITH_N_Z = (emps, characterList, maxSal) ->
            emps.stream()
                    .filter(v -> v.getSalary() > maxSal)
                    .filter(e->characterList.stream().anyMatch(v->e.getLastName().startsWith(v+"")))
                    .sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName))
                    .map(v -> v.getFirstName() + " " + v.getLastName())
                    .collect(Collectors.joining(", "));

}
