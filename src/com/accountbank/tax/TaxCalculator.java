package com.accountbank.tax;

public class TaxCalculator { //implements Taxable
    private double tax;

    public void register(Taxable taxable) {
        double taxAmount = taxable.getTax();
        this.tax += taxAmount;
    }

    public double getTax() {
        return tax;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }
}
