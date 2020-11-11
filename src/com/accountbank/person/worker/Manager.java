package com.accountbank.person.worker;

public class Manager extends Worker {
    public Manager(String name, long cpf) {
        super(name, cpf);
        this.setSalary(2000);
    }

    @Override
    public float getBonus() {
        return this.getSalary() * 1.2f;
    }
}
