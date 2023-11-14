package com.pluralsight.finance;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123", "Pam", 12500);
        BankAccount account2 = new BankAccount("456", "Gary", 1500);
        account1.deposit(100);
        account2.deposit(100);
        System.out.println("Deposit Successful..." +
                "\nAccount 1 Balance: $" + account1.getValue() +
                "\nAccount 2 Balance: $" + account2.getValue());
        account1.withdraw(300);
        account2.withdraw(50);
        System.out.println("Withdraw Successful..." +
                "\nAccount 1 Balance: $" + account1.getValue() +
                "\nAccount 2 Balance: $" + account2.getValue());
    }
}
