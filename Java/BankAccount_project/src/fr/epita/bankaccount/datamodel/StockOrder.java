package fr.epita.bankaccount.datamodel;

import fr.epita.bankaccount.datamodel.InvestmentAccount;
import fr.epita.bankaccount.datamodel.Stock;

public class StockOrder {

    private int quantity;
    private double unitPrice;
    private double commission;
    // define aggregation connection
    private Stock stock;
    private InvestmentAccount account;


}