package com.miu.mpp.finalsprep.taxpayer;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author bazz
 * Feb 08 2023
 * 21:55
 */
public class Taxpayer {
    public static void main(String[] args) {

        Emp emp = new Emp("ab", Arrays.asList("a", "b", "c"));
        Emp emp1 = new Emp("ab", Arrays.asList("a", "b", "c"));
        Emp emp2 = new Emp("ab", Arrays.asList("a", "b", "c"));
        Emp em3 = new Emp("ab", Arrays.asList("a", "b"));

        List<Emp> emps = Arrays.asList(emp, emp1, emp2, em3);

        Optional<List<String>> any = emps.stream().map(Emp::getList)
                .filter(fr -> {
                    int count = 0;
                    for (String s: fr)
                        count++;
                    return count == 2;
                })
                .findAny();

        if (any.isPresent()) {
            System.out.println("Available");
        }
    }


    static class Emp {
        private String val;
        private List<String> list;

        public Emp(String val, List<String> vals) {
            this.val = val;
            this.list = vals;
        }

        public String getVal() {
            return val;
        }

        public void setVal(String val) {
            this.val = val;
        }

        public List<String> getList() {
            return list;
        }


    }
}
