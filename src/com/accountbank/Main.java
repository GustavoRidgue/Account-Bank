package com.accountbank;

import com.accountbank.account.CurrentAccount;
import com.accountbank.account.SavingAccount;
import com.accountbank.exceptions.InsufficientFundsException;
import com.accountbank.person.Client;
import com.accountbank.person.worker.FrontEndDeveloper;
import com.accountbank.person.HolderAccount;
import com.accountbank.person.worker.authentic.Administrator;
import com.accountbank.person.worker.authentic.Director;
import com.accountbank.person.worker.authentic.Manager;
import com.accountbank.system.InternalSystem;
import com.accountbank.tax.LifeInsurance;
import com.accountbank.tax.TaxCalculator;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        HolderAccount gustavoRigue =
                new HolderAccount("Gustavo Ridgue", "43257089542",
                        LocalDate.of(2005, 9, 30), "Programmer");

        CurrentAccount accountRidgue07 = new CurrentAccount(gustavoRigue, 274714);
        //LifeInsurance lifeInsurance = new LifeInsurance();
//
        //System.out.println(accountRidgue07.getAccountBalance()); // return 100
//
        //TaxCalculator taxCalculator = new TaxCalculator();
        //taxCalculator.register(accountRidgue07); // return 1
        //taxCalculator.register(lifeInsurance); // return 42
//
        //System.out.println(taxCalculator.getTax()); // return 43 (1 + 42)

        accountRidgue07.deposit(500);
        try {
            accountRidgue07.withdraw(700);
        } catch (InsufficientFundsException exception) {
            System.out.println("Exception!!! " + exception.getMessage());
        }
        System.out.println(accountRidgue07.getAccountBalance());
    }
}
