package com.accountbank.system;

public class Authenticator {
    private int password;

    public boolean authentic(int password) {
        if (password == this.getPassword()) {
            System.out.println("Entering in the system...");
            return true;
        } else {
            System.out.println("Invalid password.");
            return false;
        }
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getPassword() {
        return this.password;
    }
}
