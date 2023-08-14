/**
 * Matthew Ovie Enamuotor
 * August 11 2023
 * An abstract class from which subclasses will be derived
 */

public abstract class BankAccount {
    private String customerName;
    private String accountType;
    private String month;
    private String accountNumber;


    public BankAccount(String customerName, String accountType, String month){
        this.customerName = customerName;
        this.accountType = accountType;
        this.month = month;

        setAccountNumber();
    }

    

    public String getCustomerName() {
        return this.customerName;
    }


    public String getAccountType() {
        return this.accountType;
    }


    public String getMonth() {
        return this.month;
    }


    public String getAccountNumber() {
        return this.accountNumber;
    }

    private void setAccountNumber()
    {
        // first part
        accountNumber = "002-623490-";

        
        // Add random digits
        String randomDigits = "";
        for (int i = 0; i < 6; i++) {
            int randomDigit = (int) (Math.random() * 10);
            randomDigits += randomDigit;
        }

        accountNumber += randomDigits;
        
        // add the account type
        if (accountType.equals("Chequings"))
        {
            accountNumber += "-550";
        }
        else if (accountType.equals("Savings"))
        {
            accountNumber += "-790";
        }
    }

    
    /**
     * Purpose
     * @param amount - describe purpose and returnType
     * @param day - describe purpose and returnType
     */
    public abstract void withdrawals (double amount, int day);

    /**
     * Purpose
     * @param amount
     * @param day
     */
    public abstract void deposit(double amount, int day);

    /**
     * Purpose
     */
    public abstract void printTransaction();

    public String toString(){
        return 
        String.format("%-30s %s\n", "Customer Name:", customerName) +
        String.format("%-30s %s\n", "Account Type:", accountType) +
        String.format("%-30s %s\n", "Current Month:", month) +
        String.format("%-30s %s\n", "Account Number:", accountNumber);
    }


}
