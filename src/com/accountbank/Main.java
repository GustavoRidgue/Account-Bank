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
    public static void main(String[] args) throws Exception {
        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (IllegalStateException exception) {
            System.out.println("Error to connect");
        }

        /*
        * public abstract class Conta {

        //atributos omitidos

        public Conta(int agencia, int numero){

            if(agencia < 1) {
                throw new IllegalArgumentException("Agencia inválida");
            }

            if(numero < 1) {
                throw new IllegalArgumentException("Numero da conta inválido");
            }

            //resto do construtor foi omitido
    }
    **/

//        Conexao conexao = null;
//        try {
//            conexao = new Conexao();
//            conexao.leDados();
//        } catch (IllegalStateException exception) {
//            System.out.println("Error to connect");
//        } finally {
//            conexao.fecha();
//        }
    }
}
