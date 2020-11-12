package com.accountbank.person.worker;

public class Administrator extends Worker {
    public Administrator(String name, long cpf) {
        super(name, cpf);
    }

    @Override
    public float getBonus() {
        return 0;
    }
}
