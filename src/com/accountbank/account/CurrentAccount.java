package com.accountbank.account;

import com.accountbank.person.HolderAccount;

public class CurrentAccount extends Account {
    public CurrentAccount(HolderAccount holder, int password) {
        super(holder, password);
        this.deposit(100);
    }

    @Override
    public void payMonthlyFee() {
        this.withdraw(100);
        System.out.println("Monthly fee successfully payed");

    }
}
