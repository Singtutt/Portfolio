package com.pluralsight.finance;

public class BankAccount implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, String name, String balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = Double.parseDouble(balance);
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if(amount <= balance)  {
            balance -= amount;
        } else {
            System.out.println("Error: Processing Funds");
        }

    }
    @Override
    public double getValue() {
        return balance;
    }
}
