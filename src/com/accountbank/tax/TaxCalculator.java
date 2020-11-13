package com.accountbank.tax;

public class TaxCalculator { //implements Taxable
    private float tax;

    public void register(Taxable taxable) {
        float taxAmount = taxable.getTax();
        this.tax += taxAmount;
    }

    public float getTax() {
        return tax;
    }
    public void setTax(float tax) {
        this.tax = tax;
    }
}
