package com.accountbank.person;

import com.accountbank.system.Authentic;
import com.accountbank.system.Authenticator;

public class Client extends Authenticator implements Authentic {
    private int password;
    public Authenticator authenticator;

    public Client(String name, long cpf, int password) {
        this.authenticator = new Authenticator();

        if (password > 999 && password < 999999) {
            this.setPassword(password);
        } else {
            System.out.println("Invalid number of password.");
        }
    }

    @Override
    public boolean authentic(int password) {
        return this.authenticator.authentic(this.getPassword());
    }

    @Override
    public void setPassword(int password) {
        this.authenticator.setPassword(password);
    }

    @Override
    public int getPassword() {
        return this.authenticator.getPassword();
    }
}
