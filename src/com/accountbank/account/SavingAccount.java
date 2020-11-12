package com.accountbank.account;

import com.accountbank.person.HolderAccount;

public class SavingAccount extends Account {
    public SavingAccount(HolderAccount holder, int password) {
        super(holder, password);
        this.deposit(150);
    }

    @Override
    public void payMonthlyFee() {
        this.withdraw(100);
        System.out.println("Monthly fee successfully payed");
    }
}
