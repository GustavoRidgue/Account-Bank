package com.accountbank.person.worker;

public class FrontEndDeveloper extends Worker {

    public FrontEndDeveloper(String name, long cpf) {
        super(name, cpf);
        super.setSalary(1250);
    }

    @Override
    public float getBonus() {
        return super.getSalary() * 1.1f;
    }
}
