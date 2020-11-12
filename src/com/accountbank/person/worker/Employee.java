package com.accountbank.person.worker;

public class Employee extends Worker {

    public Employee(String name, long cpf) {
        super(name, cpf);
        super.setSalary(1250);
    }

    @Override
    public float getBonus() {
        return super.getSalary() * 1.1f;
    }
}
