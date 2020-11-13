package com.accountbank.person;

import com.accountbank.system.Authentic;

public class Client implements Authentic {
    private int password;

    @Override
    public boolean authentic(int password) {
        if (password == this.getPassword()) {
            System.out.println("Entering in the system...");
            return true;
        } else {
            System.out.println("Invalid password.");
            return false;
        }
    }

    @Override
    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public int getPassword() {
        return this.password;
    }
}
