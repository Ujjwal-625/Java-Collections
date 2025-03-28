package com.bridgelabz.insurancepolicy;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        InsurancePolicyManager manager = new InsurancePolicyManager();

        // Create some example policies
        InsurancePolicy policy1 = new InsurancePolicy("P001", "John Doe", new Date(2025, 3, 28), "Health", 1000.0);
        InsurancePolicy policy2 = new InsurancePolicy("P002", "Jane Smith", new Date(2025, 4, 5), "Auto", 1200.0);
        InsurancePolicy policy3 = new InsurancePolicy("P003", "Alice Johnson", new Date(2025, 5, 15), "Home", 1500.0);
        InsurancePolicy policy4 = new InsurancePolicy("P004", "Bob Brown", new Date(2025, 3, 30), "Health", 800.0);

        // Add policies
        manager.addPolicy(policy1);
        manager.addPolicy(policy2);
        manager.addPolicy(policy3);
        manager.addPolicy(policy4);

        // Display all policies
        manager.displayAllPolicies();

        // Display policies expiring soon
        manager.displayExpiringPolicies();

        // Display policies with specific coverage type
        manager.displayPoliciesByCoverage("Health");

        // Display duplicate policies
        manager.displayDuplicatePolicies();

        // Performance comparison
        manager.comparePerformance(policy1);
    }
}
