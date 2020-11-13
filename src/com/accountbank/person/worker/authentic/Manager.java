package com.accountbank.person.worker.authentic;

import com.accountbank.person.worker.Worker;
import com.accountbank.system.Authentic;
import com.accountbank.system.Authenticator;

public class Manager extends Worker implements Authentic {
    public Authenticator authenticator;

    public Manager(String name, long cpf, int password) {
        super(name, cpf);
        super.setSalary(2000);
        this.authenticator = new Authenticator();

        if (password > 999 && password < 999999) {
            this.setPassword(password);
        } else {
            System.out.println("Invalid number of password.");
        }
    }

    @Override
    public float getBonus() {
        return super.getSalary() * 1.2f;
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
