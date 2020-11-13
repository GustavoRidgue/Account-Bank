package com.accountbank.system;

public class InternalSystem {
    private int password;

    public void authentic(Authentic authenticator) {
        boolean authenticated = authenticator.authentic(authenticator.getPassword());

        if (authenticated) {
            System.out.println("You can enter in the system.");
        } else {
            System.out.println("You can not enter in the system");
        }
    }

    public int getPassword() {
        return password;
    }
    public void setPassword(int password) {
        this.password = password;
    }
}
