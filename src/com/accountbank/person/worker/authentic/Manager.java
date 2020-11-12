package com.accountbank.person.worker;

public class Manager extends Worker {
    public Manager(String name, long cpf) {
        super(name, cpf);
        super.setSalary(2000);
    }

    @Override
    public float getBonus() {
        return super.getSalary() * 1.2f;
    }
}
