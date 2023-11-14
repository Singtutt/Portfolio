package com.pluralsight.finance;

import java.util.Scanner;

public class FinanceApplication {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Portfolio newPortfolio = portfolioEntry();
        addAssets(newPortfolio);
        displayPortfolio(newPortfolio);
        scan.close();
    }
    private static Portfolio portfolioEntry() {
        System.out.println("Please enter the name for Portfolio: ");
        String entryName = scan.nextLine().trim();
        System.out.println("Please enter name of Owner: ");
        String entryOwner = scan.nextLine().trim();
        return new Portfolio(entryName, entryOwner);
    }

    private static void addAssets(Portfolio portfolio) {
        System.out.println("Portfolio Asset Addition:");
        boolean addAssets = true;
        while (addAssets) {
            System.out.println("Asset Type: " +
                    "\n•Bank Account" +
                    "\n•Credit Card" +
                    "\n•Jewelry" +
                    "\n•Gold" +
                    "\n•House");
            String type = scan.nextLine().trim();
            switch (type.toLowerCase()) {
                case "bankaccount":
                    addAccount(portfolio);
                    break;
                case "creditcard":
                    addCard(portfolio);
                    break;
                case "jewelry":
                    addJewelry(portfolio);
                    break;
                case "gold":
                    addGold(portfolio);
                case "house":
                    addHouse(portfolio);
                    break;
                default:
                    System.out.println("Invalid Entry... Please Enter Valid Option.");
            }
        }
    }
    private static void addCard(Portfolio portfolio) {

    }
    private static void addJewelry(Portfolio portfolio) {

    }
    private static void addGold(Portfolio portfolio) {

    }
    private static void addHouse(Portfolio portfolio) {

    }
    private static  void addAccount(Portfolio portfolio) {
        System.out.println("Account Name: ");
        String bankName = scan.nextLine().trim();
        System.out.println("Account Number: ");
        String bankNumber = scan.nextLine().trim();
        System.out.println("Account Balance: ");
        String bankBalance = scan.nextLine().trim();
        scan.nextLine();
        portfolio.addAsset(new BankAccount(bankName, bankNumber, bankBalance));
    }
    private static void displayPortfolio(Portfolio portfolio) {
        System.out.println("Portfolio Name: " + portfolio.getName());
        System.out.println("Portfolio Owner: " + portfolio.getOwner());
        System.out.println("Portfolio Value: $" + portfolio.getValue());

        Valuable mostValuable = portfolio.getMostValuable();
        if (mostValuable != null) {
            System.out.println("Most Valuable Asset: " + mostValuable.getClass().getSimpleName() +
                    "Value: $" + mostValuable.getValue());
        } else {
            System.out.println("Portfolio Empty...");
        }

        Valuable leastValuable = portfolio.getLeastValuable();
        if (mostValuable != null) {
            System.out.println("Least Valuable Asset: " + leastValuable.getClass().getSimpleName() +
                    "Value: $" + leastValuable.getValue());
        } else {
            System.out.println("Portfolio Empty...");
        }
    }
}
//    BankAccount account1 = new BankAccount("123", "Pam", 12500);
//    BankAccount account2 = new BankAccount("456", "Gary", 1500);
//        account1.deposit(100);
//                account2.deposit(100);
//                System.out.println("Deposit Successful..." +
//                "\nAccount 1 Balance: $" + account1.getValue() +
//                "\nAccount 2 Balance: $" + account2.getValue());
//                account1.withdraw(300);
//                account2.withdraw(50);
//                System.out.println("Withdraw Successful..." +
//                "\nAccount 1 Balance: $" + account1.getValue() +
//                "\nAccount 2 Balance: $" + account2.getValue());