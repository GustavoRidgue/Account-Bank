package com.accountbank.system;

public abstract interface Authentic {
    public abstract boolean authentic(int password);
    public abstract void setPassword(int password);
    public abstract int getPassword();
}
