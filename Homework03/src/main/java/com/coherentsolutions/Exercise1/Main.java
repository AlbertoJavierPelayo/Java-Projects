package com.coherentsolutions.Exercise1;

public class Main {
    public static void main(String[] args) {
        //creating an account with base constructor (only accountNumber)
        BankAccount account1 = new BankAccount("12345");
        //creating an account with chained constructor 1 (accountNumber and accountType)
        BankAccount account2 = new BankAccount("67890", "Savings");
        //creating an account with chained constructor 2 (accountNumber, accountType and balance)
        BankAccount account3 =  new BankAccount("54321", "Checking", 500.0);
        //creating an account with chained constructor 3 (accountNumber, accountType and balance)
        BankAccount account4 =  new BankAccount("09876", "Investment", 4800.0, "Chris Evans");

        //display account details for account1
        account1.displayAccountDetails();
        //display account details for account2
        account2.displayAccountDetails();
        //display account details for account3
        account3.displayAccountDetails();
        //display account details for account4
        account4.displayAccountDetails();

    }
}