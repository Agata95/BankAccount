package com.java.projects.BankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount accountAndrew = new BankAccount(123L, 1000);
        BankAccount accountBeatrice = new BankAccount(555L, 2000);

        try {
            accountAndrew.payInFunds(accountBeatrice, accountAndrew, 8000);
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }
        accountAndrew.printAccountBalcance();
        accountBeatrice.printAccountBalcance();
    }
}
