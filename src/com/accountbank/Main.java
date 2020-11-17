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
    public static void main(String[] args) throws InsufficientFundsException {
        HolderAccount gustavoRigue =
                new HolderAccount("Gustavo Ridgue", "43257089542",
                        LocalDate.of(2005, 9, 30), "Programmer");

        HolderAccount gabrielBarbosa =
                new HolderAccount("Gustavo Ridgue", "43257089542",
                        LocalDate.of(2005, 9, 30), "Programmer");

        CurrentAccount accountRidgue07 = new CurrentAccount(gustavoRigue, 100100);
        CurrentAccount accountBarbosa27 = new CurrentAccount(gabrielBarbosa, 444444);

        accountRidgue07.deposit(500);
        accountRidgue07.transfer(700, accountBarbosa27);
        accountRidgue07.withdraw(700);
        //try {
        //    accountRidgue07.transfer(700, accountBarbosa27);
        //} catch (InsufficientFundsException exception) {
        //    System.out.println("Exception!!! " + exception.getMessage());
        //}
        System.out.println(accountRidgue07.getAccountBalance());
    }
}
