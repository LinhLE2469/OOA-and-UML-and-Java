package fr.epita.bankaccount.Launchers;

// do call customer từ package khác nên cần phải import package chứa
import fr.epita.bankaccount.datamodel.Account;
import fr.epita.bankaccount.datamodel.Customer;
import fr.epita.bankaccount.datamodel.InvestmentAccount;
import fr.epita.bankaccount.datamodel.SavingsAccount;
import java.util.Scanner; //run scanner ben duoi se generate ra

public class Launcher {

    public static void main(String[] args) {

        System.out.println("hello world");
        /// CREATE a new customer
        //method 1 input directly
        Customer thomas=new Customer("thomas","paris");
        Customer quentin=new Customer("quetin","paris");

        System.out.println(thomas);
        System.out.println(quentin);

        //method 2 get data from user input using Scanner ( read input)

        // Method 2 Scanner input by the user to create a new customer
        Scanner scanner = new Scanner(System.in);

        System.out.println("hello, please input a customer name: ");
        //read input
        String name = scanner.nextLine();

        System.out.println("please input the customer address: ");
        //read input
        String address = scanner.nextLine();

        Customer customerFromConsole = new Customer(name,address); // goi class Customer
        System.out.println("about to create this customer:" + customerFromConsole);

        ///CREATE a new SavingAccount with balance
        SavingsAccount account=new SavingsAccount(123);

        ///CREATE a new InvestmentAccount

        InvestmentAccount investmentAccount= new InvestmentAccount(456);

        System.out.println("please enter the initialBalance for savings: ");
        String initialBalance = scanner.nextLine();
        SavingsAccount savingsAccountFromConsole = new SavingsAccount(Double.parseDouble(initialBalance));// goi class SavingAccount
        // Do initialBalance is Double type but we define it's String above so we need to parse Doule to String
        System.out.println("please enter the Investment for savings: ");
        initialBalance = scanner.nextLine();
        InvestmentAccount investmentAccountFromConsole= new InvestmentAccount(Double.parseDouble(initialBalance));
        System.out.println(savingsAccountFromConsole);
        System.out.println(investmentAccountFromConsole);

        scanner.close();
    }
}
