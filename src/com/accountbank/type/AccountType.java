package com.accountbank.type;

import java.util.Random;

public class AccountType {
    private String type;

    public AccountType(String type) {
        if (type.toLowerCase().toLowerCase().equals("current account") ||
                type.toLowerCase().toLowerCase().equals("saving account")) {
            this.type = type;
        } else {
            System.out.println("Wrong account type. Options:\n" +
                    "Current account\n" +
                    "Saving account");
        }
    }
}
