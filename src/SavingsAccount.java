
/**
 * Matthew Ovie Enamuotor
 * August 11 2023
 * An template for Savings Account objects and a subclass to Bank Account
 */

import java.util.ArrayList;

public class SavingsAccount extends BankAccount {
    
    private double balance;
    private int withdrawals;
    private int deposits;
    private ArrayList<Transaction> record;

    public SavingsAccount(String customerName, String month, double balance)
    {
        // Since accountType is not a parameter, you pass the account type, here it is Savings
        super(customerName, "Savings", month);
        this.balance = balance;
        this.withdrawals = 0;
        this.deposits = 0;
        this.record = new ArrayList<>();
    }

    public double getBalance(){
        return this.balance;
    }

    public int getWithdrawals(){
        return this.withdrawals;
    }

    public int getDeposits(){
        return this.deposits;
    }

    private ArrayList<Transaction> getRecord(){
        return this.record;
    }

    public void withdrawals(double amount, int day)
    {   
        String transaction;

        if(balance - amount > 0.0)
        {
            balance -= amount;
            transaction = "Withdrawal";
            withdrawals++;
        }
        else{
            transaction = "Transaction cancelled. Insufficient funds.";
        }

        recordTransaction(day, transaction, amount);
    }

    public void deposit(double amount, int day){
        balance += amount;
        deposits++;
        recordTransaction(day, "Deposit", amount);
    }

    private void recordTransaction(int day, String transaction, double amount) {
        record.add(new Transaction(getMonth(), day, transaction, amount, balance));
    }

    public void printTransaction(){
        String accountType = getAccountType();
        String month = getMonth();
        String customerName = getCustomerName();

        System.out.println("--------------------------------------------------");
        System.out.println("Transaction Record for " + customerName);
        System.out.println(accountType + " Account for the Month of " + month);
        System.out.println("--------------------------------------------------");

        for (Transaction transaction : record) {
            System.out.println(transaction);
        }
        

        System.out.println("Number of Withdrawals for  " + month + ": " + withdrawals);
        System.out.println("Number of Deposits for "  + month + ": " + deposits);
        System.out.println("Balance: $" + String.format("%,.2f", balance));
        System.out.println("--------------------------------------------------");
    }

    

    public String toString(){
        return super.toString() +
        String.format("%-30s %d\n", "Number Of Withdrawals: ", withdrawals) +
        String.format("%-30s %d\n", "Number of Deposits:", deposits) +
        String.format("%-30s $%,.2f\n", "Balance:", balance);
    }

}
