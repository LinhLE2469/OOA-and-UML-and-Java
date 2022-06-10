package fr.epita.bankaccount.datamodel;

import fr.epita.bankaccount.datamodel.Account;

// SavingsAccount ke thua thuoc tinh tu Account (extends)
public class SavingsAccount extends Account {
    protected double interestRate;

    //define contructor when create new SavingAccount
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }


  // compute InterestRate in the SavingAccount class that calculates the interest on once year
    public double computeInterestRate() {
        return this.interestRate*balance;
    }
// write a method withDraw on the same class that takes one parameter
    public void withDraw(double amount){
        this.balance=this.balance- amount;
        this.balance-=amount;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
               super.toString()+ //Method convert double to string
                ", interestRate=" + interestRate +
                '}';
    }


}