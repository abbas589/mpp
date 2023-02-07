package com.miu.mpp.lab10.q5.soln1;

import com.miu.mpp.lab10.q5.Employee;
import com.miu.mpp.lab10.q5.Main;
import junit.framework.TestCase;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author bazz
 * Feb 04 2023
 * 00:18
 */
public class TestAsString extends TestCase {

    @Test
    public void testAsString(){
        Stream<Employee> emps = Arrays.asList(
                new Employee("Joe", "Davis", 120000),
                new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 10000),
                new Employee("Donald", "Trump", 100000)
        ).stream();


        assertEquals("Joe Stevens, John Sims, Steven Walters", Main.asString(emps));


    }
}
