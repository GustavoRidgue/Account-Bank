package com.accountbank.holder;

import java.time.LocalDate;

public class HolderAccount {
    private String name;
    private String cpf;
    private LocalDate dateOfBird;
    private String occupation;
    private int registration;
    private static int totalHolders;

    public HolderAccount(String name, String cpf, LocalDate dateOfBird, String occupation) {
        totalHolders++;
        this.name = name;
        this.cpf = cpf;
        this.dateOfBird = dateOfBird;
        this.occupation = occupation;
        this.registration = totalHolders;
    }

    public String getHolderName() {
        return this.name;
    }

    public void setHolderName(String holderName) {
        this.name = holderName;
    }

    public String getHolderCpf() {
        return this.cpf;
    }

    public void setHolderCpf(String holderCpf) {
        this.cpf = holderCpf;
    }

    public LocalDate getDateOfBird() {
        return this.dateOfBird;
    }

    public void setDateOfBird(LocalDate dateOfBird) {
        this.dateOfBird = dateOfBird;
    }

    public String getHolderOccupation() {
        return this.occupation;
    }

    public void setHolderOccupation(String holderOccupation) {
        this.occupation = holderOccupation;
    }

    public int getRegistration() {
        return registration;
    }
}
