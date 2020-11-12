package com.accountbank.account;

import com.accountbank.person.HolderAccount;

public class CurrentAccount extends Account {
    public CurrentAccount(HolderAccount holder, String type, int password) {
        super(holder, type, password);
    }
}
