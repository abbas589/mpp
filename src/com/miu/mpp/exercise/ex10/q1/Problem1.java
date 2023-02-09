package com.miu.mpp.exercise.ex10.q1;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;

public class Problem1 {


    //A list of Customers whose checking account balance is > 50, sorted by customer's last name
    public static List<Customer> specialAccounts(List<Account> accounts) {
        return accounts.stream()
                .filter(greaterThanFifty)
                .map(accountCustomerFunction)
                .sorted(sortedCustomer)
                .collect(Collectors.toList());

    }

    public static Comparator<Customer> sortedCustomer = Comparator.comparing((Customer::getLastName));
    public static Function<Account,Customer> accountCustomerFunction = Account::getCustomer;
    public static Predicate<Account> greaterThanFifty = new Predicate<Account>() {
        @Override
        public boolean test(Account account) {
           return account.getBalance() > 340;
        }
    };


    String[] money = new String[5];

}
