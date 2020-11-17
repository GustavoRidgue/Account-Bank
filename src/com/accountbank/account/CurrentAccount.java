package com.accountbank.account;

import com.accountbank.exceptions.InsufficientFundsException;
import com.accountbank.person.HolderAccount;
import com.accountbank.tax.Taxable;

public class CurrentAccount extends Account implements Taxable {

    public CurrentAccount(HolderAccount holder, int password) {
        super(holder, password);
        this.deposit(100);
    }

    @Override
    public void withdraw(double withdrawAmount) throws InsufficientFundsException {
        super.withdraw(withdrawAmount + getTax());
    }

    @Override
    public void payMonthlyFee() throws InsufficientFundsException {
        this.withdraw(100);
        System.out.println("Monthly fee successfully payed");

    }

    @Override
    public double getTax() {
        return super.getAccountBalance() * 0.01;
    }
}
