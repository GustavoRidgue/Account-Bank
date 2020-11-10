package com.accountbank.person;

public class Employee {
    private String name;
    private long cpf;
    private float salary;
    private int number;
    private static int totalEmployees;

    public Employee(String name, long cpf) {
        if (cpfSize(cpf) == 9) {
            this.setCpf(cpf);
        } else {
            System.out.println("Invalid CPF!");
        }
        totalEmployees++;
        this.setName(name);
        this.setNumber(totalEmployees);
        this.setSalary(1250);

        System.out.println("Welcome " + name + " to the ByteBank!");
    }

    public static long cpfSize(long cpf) {
        cpf = Math.abs(cpf);
        if (cpf == 0) {
            return 1;
        } else {
            return (int) (Math.log10 (cpf) + 1);
        }
    }

    public float getBonus() {
        return this.getSalary() * 1.1f;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public float getSalary() {
        return salary;
    }

    private void setSalary(float salary) {
        this.salary = salary;
    }

    public int getNumber() {
        return number;
    }

    private void setNumber(int number) {
        this.number = number;
    }
}
