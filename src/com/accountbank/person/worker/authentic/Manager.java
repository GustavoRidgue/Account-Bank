package com.accountbank.person.worker.authentic;

import com.accountbank.person.worker.Worker;

public class Manager extends Worker {
    private int password;
    public Manager(String name, long cpf, int password) {
        super(name, cpf);
        super.setSalary(2000);
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

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
