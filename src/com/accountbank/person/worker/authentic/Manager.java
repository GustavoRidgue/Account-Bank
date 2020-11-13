package com.accountbank.person.worker.authentic;

import com.accountbank.person.worker.Worker;
import com.accountbank.system.Authentic;

public class Manager extends Worker implements Authentic {
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
    
    @Override
    public void authentic(int password) {
        if (password == this.getPassword()) {
            System.out.println("Entering in the system...");
        } else {
            System.out.println("Invalid password.");
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
