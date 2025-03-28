package com.bridgelabz.bankingsystem;

import java.util.*;

import java.util.*;

import java.util.*;

public class BankingSystem {
    // HashMap to store customer accounts (AccountNumber -> CustomerAccount)
    private HashMap<String, CustomerAccount> accounts = new HashMap<>();

    // TreeMap to sort customers by balance (Balance -> List of CustomerAccount)
    private TreeMap<Double, List<CustomerAccount>> balanceSortedAccounts = new TreeMap<>(Collections.reverseOrder());

    // Queue to process withdrawal requests (FIFO)
    private Queue<String> withdrawalQueue = new LinkedList<>();

    // Method to add a customer account
    public void addAccount(String accountNumber, double balance) {
        CustomerAccount account = new CustomerAccount(accountNumber, balance);
        accounts.put(accountNumber, account);
        addToSortedAccounts(account);
    }

    // Method to add a customer account to TreeMap based on balance
    private void addToSortedAccounts(CustomerAccount account) {
        balanceSortedAccounts.putIfAbsent(account.getBalance(), new ArrayList<>());
        balanceSortedAccounts.get(account.getBalance()).add(account);
    }

    // Method to make a withdrawal request (add to the queue)
    public void requestWithdrawal(String accountNumber, double amount) {
        withdrawalQueue.add(accountNumber + "," + amount);
    }

    // Method to process withdrawal requests
    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            String[] request = withdrawalQueue.poll().split(",");
            String accountNumber = request[0];
            double amount = Double.parseDouble(request[1]);

            if (accounts.containsKey(accountNumber)) {
                CustomerAccount account = accounts.get(accountNumber);
                if (account.getBalance() >= amount) {
                    // Remove old balance entry from TreeMap
                    balanceSortedAccounts.get(account.getBalance()).remove(account);
                    if (balanceSortedAccounts.get(account.getBalance()).isEmpty()) {
                        balanceSortedAccounts.remove(account.getBalance());
                    }

                    // Update the account balance
                    account.setBalance(account.getBalance() - amount);

                    // Add updated balance to TreeMap
                    addToSortedAccounts(account);

                    System.out.println("Withdrawal successful: " + account);
                } else {
                    System.out.println("Insufficient funds for withdrawal on account: " + account);
                }
            } else {
                System.out.println("Account not found: " + accountNumber);
            }
        }
    }

    // Method to update the TreeMap after withdrawal (remove and re-add)
    private void updateSortedAccounts(CustomerAccount account) {
        // Remove old balance entry from TreeMap
        balanceSortedAccounts.get(account.getBalance()).remove(account);
        if (balanceSortedAccounts.get(account.getBalance()).isEmpty()) {
            balanceSortedAccounts.remove(account.getBalance());
        }

        // Add updated balance to TreeMap
        addToSortedAccounts(account);
    }

    // Display all accounts sorted by balance (using TreeMap)
    public void displayAccountsByBalance() {
        System.out.println("Customers Sorted by Balance:");
        balanceSortedAccounts.forEach((balance, accountsList) -> {
            accountsList.forEach(account -> System.out.println(account));
        });
    }

    // Display all accounts (using HashMap)
    public void displayAllAccounts() {
        System.out.println("All Customer Accounts:");
        accounts.forEach((accountNumber, account) -> {
            System.out.println(account);
        });
    }

    // Display all pending withdrawal requests
    public void displayWithdrawalQueue() {
        System.out.println("Pending Withdrawal Requests:");
        withdrawalQueue.forEach(System.out::println);
    }
}
