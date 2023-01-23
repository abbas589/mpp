package com.miu.mpp.lab4.probE;

public class SavingsAccount extends Account {
    private double balance;
    private double interestRate;
    private String accountId;

    public SavingsAccount(String acctId, double interestRate, double startBalance) {
        this.accountId = acctId;
        this.interestRate = interestRate;
        this.balance = startBalance;
    }

    @Override
    String getAccountID() {
        return accountId;
    }

    @Override
    double getBalance() {
        return balance;
    }

    @Override
    double computeUpdatedBalance() {
        return balance + (interestRate * balance);
    }
}
