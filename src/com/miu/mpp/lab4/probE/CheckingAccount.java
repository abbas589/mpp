package com.miu.mpp.lab4.probE;

import com.miu.mpp.lab4.probc.Employee;

public class CheckingAccount extends Account {
    private double balance;
    private double monthlyFee;
    private String acctId;

    public CheckingAccount(String acctId, double fee, double startBalance) {
        this.acctId = acctId;
        this.monthlyFee = fee;
        this.balance = startBalance;
    }


    @Override
    String getAccountID() {
        return acctId;
    }

    @Override
    double getBalance() {
        return balance;
    }

    @Override
    double computeUpdatedBalance() {
        return balance - monthlyFee;
    }
}
