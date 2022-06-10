package fr.epita.bankaccount.datamodel;

public abstract class Account {

    protected double balance;
 // Do SavingAccount and InvestmentAccount ke thua thuoc tinh tu Balance account
    // nen khi create a new SavingAccount and New InvesmentAccount  phai define Constructor initialBalance o Account
    public Account(double initialBalance){
        this.balance = initialBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}