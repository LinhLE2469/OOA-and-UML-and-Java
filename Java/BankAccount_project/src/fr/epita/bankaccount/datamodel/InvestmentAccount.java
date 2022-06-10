package fr.epita.bankaccount.datamodel;

import fr.epita.bankaccount.datamodel.Account;

// this class ke thua thong tin tu Account
public class InvestmentAccount extends Account {
    //define contructor when create new investmentAccount
    public InvestmentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public String toString() {
        return "InvestmentAccount{" +
               super.toString()+
                '}';
    }
}