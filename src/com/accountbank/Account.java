package com.accountbank;

import com.accountbank.holder.HolderAccount;
import com.accountbank.type.AccountType;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

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
        if (holder == null || type == null || password <= 0 || !checkAccount(type)) {
            System.out.println("Faled to create this account. It can not content negative or null values");
            this.status = false;
            Random generatorNewPassword = new Random(999999);
            this.accountPassword = generatorNewPassword.nextInt(999999);
        } else {
            System.out.println("Congratulations " + holder.getHolderName() +
                    ", your account was created successfully");
            totalOfAccounts++;
            this.accountHolder = holder;
            this.accountPassword = password;
            this.status = true;

            Random generator = new Random(5000);
            this.accountBankBranch = generator.nextInt(1000);
            this.accountNumber = generator.nextInt(100000 + this.accountPassword + totalOfAccounts);
        }
    }

    public boolean checkAccount(String type) {
        if (type.toLowerCase().toLowerCase().equals("current account")) {
            this.accountType = "Current Account";
            this.deposit(50);
            return true;
        }
        else if (type.toLowerCase().toLowerCase().equals("saving account")) {
            this.accountType = "Saving Account";
            this.deposit(150);
            return true;
        } else {
            System.out.println("Wrong account type. Options:\n" +
                    "Current account\n" +
                    "Saving account");
            return false;
        }
    }

    public void deposit(double depositAmount) {
        if (status){
            this.accountBalance += depositAmount;
        }
    }

    public boolean withdraw(double withdrawAmount) {
        if (this.getAccountBalance() > -200 && status) {
            this.accountBalance -= withdrawAmount;
            System.out.println("Withdraw successfully completed");
            return true;
        } else {
            System.out.println("Insufficient money/n" +
                    "Your balance: " + this.accountBalance +
                    "Withdraw amount: " + withdrawAmount);
            return false;
        }
    }

    public boolean withdrawAll(int passwordToWithdraw) {
        if (this.accountPassword == passwordToWithdraw) {
            this.accountBalance -= this.accountBalance;
            return true;
        } else {
            System.out.println("Invalid password");
            return false;
        }
    }

    public boolean transfer(double transferAmount, Account targetAccount) {
        if (this.accountBalance >= transferAmount && status) {
            this.accountBalance -= transferAmount;
            targetAccount.deposit(transferAmount);
            return true;
        } else {
            System.out.println("Insufficient money \n" +
                    "Your balance: " + this.accountBalance + "\n" +
                    "Transfer amount: " + transferAmount);
            return false;
        }
    }

    public void payMonthlyFee() {
        if (this.accountType.equals("Current Account")) {
            this.accountBalance -= 100;
        }
        else if (this.accountType.equals("Saving Account")) {
            this.accountBalance -= 50;
        } else {
            System.out.println("Invalid operation. We can't found the account type");
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

    public void closeAccount(int passwordAccount) {
        if (passwordAccount == this.accountPassword && this.accountBalance >= 0) {
            if (!this.status && this.accountBalance < 0) {
                System.out.println("Error: you can't close your account with negative balance");
            } else {
                System.out.println("Account successfully closed");
                this.status = false;
            }
        } else {
            System.out.println("Operation failed: Invalid password or insufficient money");
        }
    }

    public void reopenAccount(int passwordAccount) {
        if (passwordAccount == this.accountPassword) {
            if (this.status) {
                System.out.println("Your account is already opened");
            } else {
                System.out.println("Account successfully opened");
                this.status = true;
            }
        } else {
            System.out.println("Operation failed: Invalid password!");
        }
    }

    public boolean getStatus() {
        return this.status;
    }
}
