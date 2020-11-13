package com.accountbank.person;

import com.accountbank.system.Authentic;

public class Client implements Authentic {
    private int password;

    @Override
    public void authentic(int password) {
        public void authentic(int password) {
            if (password == this.getPassword()) {
                System.out.println("Entering in the system...");
            } else {
                System.out.println("Invalid password.");
            }
        }
    }

    @Override
    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public int getPassword(int password) {
        return this.password;
    }
}
