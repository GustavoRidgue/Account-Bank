package com.accountbank;

import com.accountbank.person.HolderAccount;
import com.accountbank.type.AccountType;

import java.util.Random;
import java.util.Scanner;

public class Account {
    Scanner read = new Scanner(System.in);
    private double accountBalance;
    private int accountBankBranch;
    private int accountNumber;
    private String accountType;
    private HolderAccount accountHolder;
    private int accountPassword;
    private boolean status;
    protected static int totalOfAccounts;

    public Account(HolderAccount holder, String type, int password) {
        this.setStatus(true);

        if (holder == null || type == null || password <= 0 || !checkAccount(type)) {
            System.out.println("Failed to create this account. It can not content negative or null values");
            this.setStatus(false);
            Random generatorNewPassword = new Random(999999);
            this.setAccountPassword(generatorNewPassword.nextInt(999999));
        } else {
            System.out.println("Congratulations " + holder.getHolderName() +
                    ", your account was created successfully");
            totalOfAccounts++;
            this.setAccountHolder(holder);
            this.setAccountPassword(password);

            Random generator = new Random(5000);
            this.setAccountBankBranch(generator.nextInt(1000));
            this.setAccountNumber(generator.nextInt(100000 + this.accountPassword + totalOfAccounts));
        }
    }

    public boolean checkAccount(String type) {
        if (type.toLowerCase().equals("current account")) {
            this.accountType = "Current Account";
            this.deposit(50);
            return true;
        }
        else if (type.toLowerCase().equals("saving account")) {
            this.accountType = "Saving Account";
            this.deposit(150);
            return true;
        } else {
            System.out.println(
                    "Wrong account type. Options:\n" +
                    "Current account\n" +
                    "Saving account");
            return false;
        }
    }

    public void deposit(double depositAmount) {
        if (this.getStatus()){
            this.accountBalance += depositAmount;
            System.out.println("Deposit successfully completed");
        } else {
            System.out.println("Failed to deposit");
        }
    }

    public void withdraw(double withdrawAmount) {
        if (this.getAccountBalance() > -200 && this.getStatus()) {
            this.accountBalance -= withdrawAmount;
            System.out.println("Withdraw successfully completed");
        } else {
            System.out.println(
                    "Insufficient money/n" +
                    "Your balance: " + this.getAccountBalance() +
                    "Withdraw amount: " + withdrawAmount
            );
        }
    }

    public void withdrawAll(int passwordToWithdraw) {
        if (this.getAccountPassword() == passwordToWithdraw && this.getAccountBalance() > 0) {
            this.withdraw(this.getAccountBalance());
            System.out.println("Withdraw all successfully completed");
        } else {
            System.out.println("Invalid password or negative money");
        }
    }

    public void transfer(double transferAmount, Account targetAccount) {
        if (this.getAccountBalance() >= transferAmount && this.getStatus() && targetAccount.getStatus()) {
            this.withdraw(transferAmount);
            targetAccount.deposit(transferAmount);
            System.out.println("Transfer successfully completed");
        } else {
            System.out.println(
                    "Insufficient money or closed account \n" +
                    "Your balance: " + this.getAccountBalance() + "\n" +
                    "Transfer amount: " + transferAmount
            );
        }
    }

    public void payMonthlyFee() {
        if (this.getAccountType().equals("Current Account")) {
            this.withdraw(100);
            System.out.println("Monthly fee successfully payed");
        }
        else if (this.getAccountType().equals("Saving Account")) {
            this.withdraw(50);
            System.out.println("Monthly fee successfully payed");
        } else {
            System.out.println("Invalid operation. We can't found the account type");
        }
    }

    public void closeAccount(int passwordAccount) {
        if (passwordAccount == this.getAccountPassword() && this.getAccountBalance() >= 0) {
            if (!this.getStatus() && this.getAccountBalance() < 0) {
                System.out.println("Error: you can't close your account with negative balance");
            } else {
                System.out.println("Account successfully closed");
                this.setStatus(false);
            }
        } else {
            System.out.println("Operation failed: Invalid password or insufficient money");
        }
    }

    public void reopenAccount(int passwordAccount) {
        if (passwordAccount == this.getAccountPassword()) {
            if (this.getStatus()) {
                System.out.println("Your account is already opened");
            } else {
                System.out.println("Account successfully opened");
                this.setStatus(true);
            }
        } else {
            System.out.println("Operation failed: Invalid password!");
        }
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public int getAccountBankBranch() {
        return accountBankBranch;
    }

    public void setAccountBankBranch(int accountBankBranch) {
        this.accountBankBranch = accountBankBranch;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public HolderAccount getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(HolderAccount accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(int accountPassword) {
        this.accountPassword = accountPassword;
    }

    public boolean getStatus() {
        return this.status;
    }

    private void setStatus(boolean status) {
        this.status = status;
    }

    public void myAccount(int password) {
        if (this.getAccountPassword() == password) {
            System.out.println (
                    "\n- " + this.getAccountHolder().getHolderName() + "'s account:\n" +
                    "Account Balance: " + this.getAccountBalance() + ";\n" +
                    "Account BankBranch: " + this.getAccountBankBranch() + ";\n" +
                    "Account Number: " + this.getAccountNumber() + ";\n" +
                    "Account Type: " + this.getAccountType() + ";\n" +
                    "Account Password: " + this.getAccountPassword() + ";\n" +
                    "Status: " + this.getStatus() + ".\n"
            );
        } else {
            System.out.println("Invalid password");
        }
    }
}
