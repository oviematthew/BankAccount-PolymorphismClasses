public class BankAccountTester {
    public static void main(String[] args) throws Exception {
        
        //2. Assume that any subclass of BankAccount object is created at the beginning of a month. Using polymorphism,create a ChequingAccount object, using a BankAccount reference. Use the multi-arg constructor
        BankAccount accountOne = new ChequingAccount("Bethany Anderson", "July", 2345.00);

        // 3. Print the object at the start of the month
        System.out.println("--------------------------------------------------");
        System.out.println(accountOne.toString());
        System.out.println("--------------------------------------------------");
        System.out.println();

        // 4. Apply the following transactions to Bethany’s chequing account for the month of July:
        accountOne.deposit(25.98, 5);
        accountOne.withdrawals(1300, 6);
        accountOne.withdrawals(1700, 10);
        accountOne.deposit(1050, 11);
        accountOne.withdrawals(1700, 11);
        accountOne.deposit(25.98, 25);
        accountOne.withdrawals(400, 26);
        accountOne.withdrawals(27.00, 28);
        accountOne.withdrawals(7.50, 28);

        // 5. Print the month’s transaction record.
        accountOne.printTransaction();
        
        // 6. Then, re-print the object at the end of the month
        System.err.println(accountOne.toString());

        // 7. Using polymorphism, create a SavingsAccount object, using a BankAccount reference. Use the multi-arg constructor
        BankAccount accountTwo = new SavingsAccount("Bethany Anderson", "July", 6100.00);

        // 8. Print the object at the start of the month.
        System.out.println("--------------------------------------------------");
        System.out.println(accountTwo.toString());
        System.out.println("--------------------------------------------------");

    }
}
