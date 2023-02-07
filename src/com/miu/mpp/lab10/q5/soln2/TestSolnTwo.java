package com.miu.mpp.lab10.q5.soln2;

import com.miu.mpp.lab10.q5.Employee;
import com.miu.mpp.lab10.q5.Main;
import junit.framework.TestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author bazz
 * Feb 04 2023
 * 00:37
 */
public class TestSolnTwo extends TestCase {

    List<Employee> emps = Arrays.asList(
            new Employee("Joe", "Davis", 120000),
            new Employee("John", "Sims", 110000),
            new Employee("Joe", "Stevens", 200000),
            new Employee("Andrew", "Reardon", 80000),
            new Employee("Joe", "Cummings", 760000),
            new Employee("Steven", "Walters", 135000),
            new Employee("Thomas", "Blake", 111000),
            new Employee("Alice", "Richards", 10000),
            new Employee("Donald", "Trump", 100000)
    );

    @Test
    public void testSalaryGreaterThan100000() {

        Assert.assertEquals(6, emps.stream().filter(Main::salaryGreaterThan100000).count());

    }

    @Test
    public void testThatLastameAfterM() {
        Assert.assertEquals(6, emps.stream().filter(Main::lastNameAfterM).count());
    }

    @Test
    public void testFullName() {
        Assert.assertEquals("Joe Davis", Main.fullName(emps.stream().findAny().orElseGet(() -> {
            System.out.println("called me");
            return new Employee("Joe", "Davis", 120000);
        })));
    }


    @Test
    public void testOrElseGet(){
        String s = Stream.of("Abbbas").findAny().orElseGet(()->getCame());

        System.out.println(s);
    }

    private String getCame(){
        System.out.println("came here");
        return "Kame";
    }

}
