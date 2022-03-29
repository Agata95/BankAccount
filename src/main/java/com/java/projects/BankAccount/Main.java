package com.java.projects.BankAccount;

/**
 * 1.Utwórz klasę KontoBankowe
 *
 * 2.Nadaj pola publiczne :
 * •numerKonta: long
 * •stanKonta: int
 *
 * 3.Utwórz metody:
 * •wyswietlStanKonta
 * •wplacSrodki
 * •pobierzSrodki
 *
 * 4.Utwórz 2 obiekty:
 *  1.kontoAndrzeja
 *  2.kontoBeaty
 *  3.Przetestuj przesyłpieniędzy pomiędzy kontami
 */

public class Main {
    public static void main(String[] args) {
        BankAccount accountAndrew = new BankAccount(123L, 1000);
        BankAccount accountBeatrice = new BankAccount(555L, 2000);

        accountAndrew.payInFunds(accountBeatrice, accountAndrew, 8000);
        accountAndrew.printAccountBalcance();
        accountBeatrice.printAccountBalcance();
    }
}
