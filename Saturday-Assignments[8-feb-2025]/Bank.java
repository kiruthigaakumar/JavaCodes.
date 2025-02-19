package com.celcom.assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Bank1 {
    String acc;
    double amount;

    Bank1(String acc, double amount) {
        this.acc = acc;
        this.amount = amount;
    }

    public String getAcc() {
        return acc;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String toString() {
        return "Account: " + acc + " | Balance: " + amount;
    }
}

class Management {
    Map<String, Bank1> banks;

    Management() {
        banks = new HashMap<>();
    }

    void addBank(Bank1 bank) {
        banks.put(bank.getAcc(), bank);
        System.out.println(bank);
    }

    public boolean deposit(String acc, double money) {
        if (banks.containsKey(acc)) {
            Bank1 bank = banks.get(acc);
            bank.setAmount(bank.getAmount() + money);
            return true;
        }
        System.out.println("Account does not exist.");
        return false;
    }

    public boolean withdrawal(String acc, double money) {
        if (banks.containsKey(acc)) {
            Bank1 bank = banks.get(acc);
            double balance = bank.getAmount();
            if (money <= balance) {
                bank.setAmount(balance - money);
                return true;
            } else {
                System.out.println("Insufficient balance.");
                return false;
            }
        }
        System.out.println("Account does not exist.");
        return false;
    }

    public boolean display(String acc) {
        if (banks.containsKey(acc)) {
            System.out.println("Balance: " + banks.get(acc).getAmount());
            return true;
        }
        System.out.println("Account does not exist.");
        return false;
    }
}
public class Bank_Project {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Management management = new Management();
        
        System.out.print("Enter the account holder name: ");
        String name = sc.nextLine();

        while (true) {
            System.out.println("\nBank Management System");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the initial deposit amount: ");
                    double initialAmount = sc.nextDouble();
                    management.addBank(new Bank1(name, initialAmount));
                    break;

                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    management.deposit(name, depositAmount);
                    break;

                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    management.withdrawal(name, withdrawAmount);
                    break;

                case 4:
                    management.display(name);
                    break;

                case 5:
                    System.out.println("Exiting the system...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


	
