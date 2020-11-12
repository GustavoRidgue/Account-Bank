package com.accountbank.person.worker;

public class Director extends Worker {
    public Director(String name, long cpf) {
        super(name, cpf);
    }

    @Override
    public float getBonus() {
        return 0;
    }
}
