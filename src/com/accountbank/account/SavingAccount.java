package com.accountbank.account;

import com.accountbank.person.HolderAccount;

public class SavingAccount extends Account {
    public SavingAccount(HolderAccount holder, String type, int password) {
        super(holder, type, password);
    }
}
