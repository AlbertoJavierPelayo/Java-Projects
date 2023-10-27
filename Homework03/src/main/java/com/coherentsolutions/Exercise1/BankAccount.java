package com.coherentsolutions.Exercise1;

public class BankAccount {
    //Attributes
    private String accountNumber;
    private String accountType;
    private double balance;
    private String ownerName;

    //Base constructor
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    //chained constructor 1 adding accountType
    public BankAccount(String accountNumber, String accountType) {
        this(accountNumber);
        this.accountType = accountType;
    }

    //chained constructor 2 adding balance
    public BankAccount(String accountNumber, String accountType, double balance) {
        this(accountNumber, accountType);
        this.balance = balance;
    }

    //chained constructor 3 adding ownerName
    public BankAccount(String accountNumber, String accountType, double balance, String ownerName) {
        this(accountNumber, accountType, balance);
        this.ownerName = ownerName;
    }

    //method to display the account details
    public void displayAccountDetails(){
        System.out.println("ACCOUNT DETAILS:");
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Type: " + this.accountType);
        System.out.println("Balance: " + this.balance);
        System.out.println("Owner Name: " + this.ownerName);
    }
}
