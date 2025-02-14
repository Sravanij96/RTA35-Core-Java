package com.bharath.oops.assignment;

 class BankAccount{
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }




    public  BankAccount(double initialBalance, int accountNumber, String accountHolderName){
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial Balance should not be negative.");
        }
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }
    public void deposit(double amount) {
        // login
        // authentication
        //authorization
        if (amount > 0) {
            balance += amount; // balance = balance + amount
            System.out.println("Deposited: "+ amount+" Account Holder Name :: "+accountHolderName+" Account Number :: " +accountNumber+" final balance :: " +balance);
        } else {
            System.out.println("Deposit amount should be positive "+" Account Holder Name :: "+accountHolderName+" Account Number :: " +accountNumber);
        }

    }


    // withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            balance -= amount;
            System.out.println("Withdrawn success for : "+ amount+" Account Holder Name :: "+accountHolderName+" Account Number :: " +accountNumber+" final balance :: " +balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds for withdrawing "+amount+ " Account Holder Name :: "+accountHolderName+" Account Number :: " +accountNumber);
        }

    }

}


public class Encapsulation{
    public static void main(String[] args) {
        BankAccount sravani = new BankAccount(500.00,12346,"sravani");

        sravani.deposit(100);
        sravani.withdraw(200);
        sravani.withdraw(700);



        BankAccount abhay = new BankAccount(600.00,12346,"abhay");
        abhay.deposit(-500);
        abhay.withdraw(-60);

        BankAccount nivedha = new BankAccount(-300.00,12346,"sravani");

    }



}