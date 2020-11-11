package com.accountbank.person.worker;

public class Employee extends Worker {

    public Employee(String name, long cpf) {
        super(name, cpf);
        this.setSalary(1250);
    }

    @Override
    public float getBonus() {
        return this.getSalary() * 1.1f;
    }
}
