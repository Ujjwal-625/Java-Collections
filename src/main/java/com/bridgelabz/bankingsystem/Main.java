package com.bridgelabz.bankingsystem;

public class Main {
    public static void main(String[] args) {
        // Create a new banking system
        BankingSystem bankingSystem = new BankingSystem();

        // Add customer accounts
        bankingSystem.addAccount("A001", 1500.00);
        bankingSystem.addAccount("A002", 2000.00);
        bankingSystem.addAccount("A003", 500.00);
        bankingSystem.addAccount("A004", 3000.00);

        // Display all accounts
        bankingSystem.displayAllAccounts();

        // Display accounts sorted by balance
        bankingSystem.displayAccountsByBalance();

        // Request some withdrawals
        bankingSystem.requestWithdrawal("A002", 500.00);
        bankingSystem.requestWithdrawal("A001", 200.00);
        bankingSystem.requestWithdrawal("A003", 700.00); // Should fail due to insufficient balance

        // Display withdrawal queue
        bankingSystem.displayWithdrawalQueue();

        // Process the withdrawal requests
        bankingSystem.processWithdrawals();

        // Display accounts after processing withdrawals
        bankingSystem.displayAllAccounts();
        bankingSystem.displayAccountsByBalance();
    }
}
