package com.pluralsight.finance;

public class CreditCard implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String accountNumber, String name, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void charge(double amount) {
        balance += amount;
    }
    public void pay(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Error: Processing Payment");
        }
    }
    @Override
    public double getValue() {
        return -balance;
    }
}
