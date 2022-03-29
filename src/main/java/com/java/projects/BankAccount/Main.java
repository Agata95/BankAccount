package com.java.projects.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount accountAndrew = new BankAccount(123L, 1000);
        BankAccount accountBeatrice = new BankAccount(555L, 2000);

        accountAndrew.payInFunds(accountBeatrice, accountAndrew, 8000);
        accountAndrew.printAccountBalcance();
        accountBeatrice.printAccountBalcance();
    }
}
