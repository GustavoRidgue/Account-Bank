package com.accountbank.exceptions;

public class InsufficientFunds extends RuntimeException {
    public InsufficientFunds(String msg) {
        super(msg);
    }
}
