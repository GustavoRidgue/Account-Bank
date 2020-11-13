package com.accountbank;

import com.accountbank.account.CurrentAccount;
import com.accountbank.account.SavingAccount;
import com.accountbank.person.Client;
import com.accountbank.person.worker.FrontEndDeveloper;
import com.accountbank.person.HolderAccount;
import com.accountbank.person.worker.authentic.Administrator;
import com.accountbank.person.worker.authentic.Director;
import com.accountbank.person.worker.authentic.Manager;
import com.accountbank.system.InternalSystem;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        HolderAccount gustavoRigue =
//                new HolderAccount("Gustavo Ridgue", "43257089542",
//                        LocalDate.of(2005, 9, 30), "Programmer");
//        HolderAccount gabrielBarbosa =
//                new HolderAccount("Gabriel Barbosa", "40007445895",
//                        LocalDate.of(1999, 5, 18), "Civil engineer");
//        HolderAccount arnaldoCosta =
//                new HolderAccount("Arnaldo Costa", "98920249545",
//                        LocalDate.of(2005, 2, 9), "Graphic Worker");
//
//        CurrentAccount accountRidgue07 = new CurrentAccount(gustavoRigue, 274714);
//        SavingAccount accountBarbosa27 = new SavingAccount(gabrielBarbosa, 213314);
//        CurrentAccount accountCosta44 = new CurrentAccount(arnaldoCosta, 232697);

        FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper("Gustavo Ridgue", 246967457);
        Manager manager = new Manager("Fernando Silva", 548294639, 434243);
        Director director = new Director("Fernando Silva", 548294639, 434243);
        Administrator administrator = new Administrator("Fernando Silva", 548294639, 434243);
        Client client = new Client("Fernando Silva", 548294639, 434243);

        InternalSystem system = new InternalSystem();

        System.out.println("Authenticating Manager:");
        manager.authentic(434243);
        System.out.println("Authenticating Director:");
        director.authentic(434243);
        System.out.println("Authenticating Administrator:");
        administrator.authentic(434243);
        System.out.println("Authenticating Client");
        client.authentic(434243);

        //system.authentic(manager);

    }
}
