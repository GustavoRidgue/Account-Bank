package com.accountbank.tax;

public class LifeInsurance implements Taxable {

    @Override
    public double getTax() {
        return 42;
    }
}
