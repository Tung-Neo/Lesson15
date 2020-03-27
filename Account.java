package Lesson15;

public class Account {
    private int id;
    private Customer2 customer2;
    private double balance = 0.0;

    public Account(int id, Customer2 customer2, double balance){
        this.id = id;
        this.customer2 = customer2;
        this.balance = balance;
    }
    public Account(int id, Customer2 customer2, int getID){}

    public int getId() {
        return id;
    }

    public Customer2 getCustomer2() {
        return customer2;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", customer2=" + customer2 +
                ", balance=" + balance +
                '}';
    }
    public String getCustomerName(){
        return customer2.getName();
    }

    public Account deposit(double amount){
        amount = balance;
    }
}
