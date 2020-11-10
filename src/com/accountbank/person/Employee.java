package com.accountbank.person;

public class Employee {
    private String name;
    private int cpf;
    private String salary;
    private int number;
    private static int totalEmployees;

    public Employee(String name, int cpf) {
        if (cpf > 10)
        totalEmployees++;
        this.setName(name);
        this.setCpf(cpf);
        this.setNumber(totalEmployees);
    }

    public static int cpfSize(int cpf) {
        cpf = Math.abs(cpf);
        if (cpf == 0) {
            return 1;
        } else {
            return (int) (Math.log10 (cpf) + 1);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getSalary() {
        return salary;
    }

    private void setSalary(String salary) {
        this.salary = salary;
    }

    public int getNumber() {
        return number;
    }

    private void setNumber(int number) {
        this.number = number;
    }
}
