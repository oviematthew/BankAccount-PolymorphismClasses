/**
 * Matthew Ovie Enamuotor
 * August 11 2023
 * An template for an Aggregate class Transaction
 */

public class Transaction {
    private String month;
    private int day;
    private String transaction;
    private double amount;
    private double balance;

    public Transaction(String month, int day, String transaction, double amount, double balance)
    {
        this.month = month;
        this.day = day;
        this.transaction = transaction;
        this.amount = amount;
        this.balance = balance;
    }


    public String getMonth() {
        return this.month;
    }

    

    public int getDay() {
        return this.day;
    }

    public String getTransaction() {
        return this.transaction;
    }

    public double getAmount() {
        return this.amount;
    }

    
    public double getBalance() {
        return this.balance;
    }

    public void setMonth(String month, int day, String transaction, double amount, double balance) {
       this.month = month;
       this.day = day;
       this.transaction = transaction;
       this.amount = amount;
       this.balance = balance;
    }
    public String toString() {
        return String.format("%-10s %-10d %-15s $%-15.2f %-15s$ %,.2f", month, day, transaction, amount, "Balance", balance);
    }
    
    

}
