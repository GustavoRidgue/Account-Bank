package com.accountbank;

import com.accountbank.account.Account;
import com.accountbank.account.CurrentAccount;
import com.accountbank.account.SavingAccount;
import com.accountbank.person.worker.Employee;
import com.accountbank.person.HolderAccount;
import com.accountbank.person.worker.Manager;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        HolderAccount gustavoRigue =
                new HolderAccount("Gustavo Ridgue", "43257089542",
                        LocalDate.of(2005, 9, 30), "Programmer");
        HolderAccount gabrielBarbosa =
                new HolderAccount("Gabriel Barbosa", "40007445895",
                        LocalDate.of(1999, 5, 18), "Civil engineer");
        HolderAccount arnaldoCosta =
                new HolderAccount("Arnaldo Costa", "98920249545",
                        LocalDate.of(2005, 2, 9), "Graphic Worker");

        CurrentAccount accountRidgue07 = new CurrentAccount(gustavoRigue, 274714);
        SavingAccount accountBarbosa27 = new SavingAccount(gabrielBarbosa, 213314);
        CurrentAccount accountCosta44 = new CurrentAccount(arnaldoCosta, 232697);

        Employee gustavo = new Employee("Gustavo Ridgue", 246967457);
        Manager fernando = new Manager("Fernando Silva", 548294639);

        accountBarbosa27.myAccount(213314);

        System.out.println(gustavo.getSalary());
        System.out.println(fernando.getSalary());

        System.out.println(gustavo.getBonus());
        System.out.println(fernando.getBonus());



    }
}
