package com.accountbank;

import com.accountbank.holder.HolderAccount;
import com.accountbank.type.AccountType;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        HolderAccount gustavoRigue =
                new HolderAccount("Gustavo Ridgue Barbosa de Oliveira", "43920249895",
                        LocalDate.of(2005, 9, 30), "Programmer");
        HolderAccount gabrielBarbosa =
                new HolderAccount("Gabriel Barbosa de Oliveira", "43527459895",
                        LocalDate.of(2005, 9, 30), "Civil engineer");
        HolderAccount arnaldoCosta =
                new HolderAccount("Arnaldo Costa de Oliveira", "43920249545",
                        LocalDate.of(2005, 9, 30), "Graphic Worker");

        System.out.println(gustavoRigue.getRegistration());
        System.out.println(gabrielBarbosa.getRegistration());
        System.out.println(arnaldoCosta.getRegistration());

        Account accountRidgue007 = new Account(gustavoRigue, "Current ", 274714);
        Account accountBarbosa274711 = new Account(gabrielBarbosa, "Saving account", 213314);
        Account accountCosta44 = new Account(arnaldoCosta, "Current account", 232697);

        accountBarbosa274711.deposit(5000);
        System.out.println(accountBarbosa274711.withdrawAll(213314));
        System.out.println("Saldo atual: " + accountBarbosa274711.getAccountBalance());
        accountBarbosa274711.deposit(1000);
        System.out.println("Depositei 1000 e ficou: " + accountBarbosa274711.getAccountBalance());
        accountBarbosa274711.withdraw(500);
        System.out.println("Saquei 500 e ficou: " + accountBarbosa274711.getAccountBalance());

        System.out.println(Account.totalOfAccounts);
    }
}
