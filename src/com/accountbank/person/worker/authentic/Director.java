package com.accountbank.person.worker.authentic;

import com.accountbank.person.worker.Worker;
import com.accountbank.system.Authentic;

public class Director extends Worker implements Authentic {
    private int password;

    public Director(String name, long cpf, int password) {
        super(name, cpf);
        super.setSalary(2750);
        if (password > 999 && password < 999999) {
            this.setPassword(password);
        } else {
            System.out.println("Invalid number of password.");
        }
    }

    @Override
    public float getBonus() {
        return 0;
    }

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
