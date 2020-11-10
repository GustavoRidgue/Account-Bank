package com.accountbank;

import com.accountbank.holder.HolderAccount;
import com.accountbank.type.AccountType;

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

        System.out.println(gustavoRigue.getRegistration());
        System.out.println(gabrielBarbosa.getRegistration());
        System.out.println(arnaldoCosta.getRegistration());

        Account accountRidgue07 = new Account(gustavoRigue, "Current account", 274714);
        Account accountBarbosa27 = new Account(gabrielBarbosa, "Saving account", 213314);
        Account accountCosta44 = new Account(arnaldoCosta, "Current account", 232697);

        accountBarbosa27.myAccount(213314);
    }
}
