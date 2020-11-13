package com.accountbank.person.worker.authentic;

import com.accountbank.person.worker.Worker;

public class Director extends Worker {
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

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
