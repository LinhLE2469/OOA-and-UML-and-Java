package fr.epita.bankaccount.datamodel;

//this is a class to describe customer
public class Customer {
    private String name;
    private  String address;

    // Method 1 to acces Customer class (private) to create a new client is Add constructor paramater to connect with launcher create new customer account

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }
   // Method 1 to acces Customer class (private) to create a new client is Gettter and Setter

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // presentation by string type
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
