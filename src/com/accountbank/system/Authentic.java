package com.accountbank.system;

public abstract interface Authentic {
    public abstract void authentic(int password);
    public abstract void setPassword(int password);
    public abstract int getPassword(int password);
}
