package com.java.projects.BankAccount;

public class BankAccount {
    private long accountNumber;
    private int accountBalance;

    public BankAccount(long accountNumber, int accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public void printAccountBalcance() {
        System.out.println("Account balance with the number " + accountNumber + " is " + accountBalance + ".");
    }

    public void payInFunds(BankAccount fromAccount, BankAccount forAccount, int money) {
        int payedMoney = fromAccount.getFunds(money);
        forAccount.setAccountBalance(depositFunds(payedMoney));
        System.out.println("The transfer was made from the account number " + fromAccount.getAccountNumber() + " to account number "
                + forAccount.getAccountNumber() + " in the amount of " + payedMoney + ".");
    }

    //    if we don't have enough money, then we get all from accountBalcance
    //    and then we payed all this money to another account
    public int getFunds(int money) {
        if (accountBalance >= money) {
            accountBalance -= money;
            return money;
        }

        throw new RuntimeException("Don't have enough money");
    }

    public int depositFunds(int money) {
        if (money < 0) {
            throw new RuntimeException("You can't deposit negative number of money.");
        }
        accountBalance += money;
        return accountBalance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }
}
