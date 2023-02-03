package com.miu.mpp.exercise.ex9.q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author bazz
 * Feb 01 2023
 * 11:20
 */
public class Main {
    public static void main(String[] args) {

//        Stream<Integer> integerStream = Stream.iterate(9,b->b+2);
//        System.out.println(integerStream.limit(4).collect(Collectors.toList()));


//        List<Integer> ints = Arrays.asList(3,5,2,3,8);
//        List<int[]> intArrs = ints.stream().map(int[]::new).collect(Collectors.toList());
//
//        List<String> intArrStr = intArrs.stream().map(Arrays::toString).collect(Collectors.toList());
//
//        System.out.println(intArrStr);

        List<Account> accounts = new ArrayList<>();

    }

    class Account {
        String ownerName;
        int balance;
        int acctId;

        Account(String ownnner, int bal, int id){
            this.ownerName = ownnner;
            this.balance = bal;
            this.acctId = id;
        }

    }
}
