package com.bridgelabz.insurancepolicy;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class InsurancePolicyManager {
    private Set<InsurancePolicy> hashSetPolicies = new HashSet<>();
    private Set<InsurancePolicy> linkedHashSetPolicies = new LinkedHashSet<>();
    private Set<InsurancePolicy> treeSetPolicies = new TreeSet<>(Comparator.comparing(InsurancePolicy::getExpiryDate));

    // Add a policy to all sets
    public void addPolicy(InsurancePolicy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    // Remove a policy from all sets
    public void removePolicy(InsurancePolicy policy) {
        hashSetPolicies.remove(policy);
        linkedHashSetPolicies.remove(policy);
        treeSetPolicies.remove(policy);
    }

    // Retrieve all unique policies
    public void displayAllPolicies() {
        System.out.println("HashSet Policies:");
        hashSetPolicies.forEach(System.out::println);

        System.out.println("\nLinkedHashSet Policies:");
        linkedHashSetPolicies.forEach(System.out::println);

        System.out.println("\nTreeSet Policies (Sorted by Expiry Date):");
        treeSetPolicies.forEach(System.out::println);
    }

    // Retrieve policies expiring within the next 30 days
    public void displayExpiringPolicies() {
        Date currentDate = new Date();
        Date futureDate = new Date(currentDate.getTime() + TimeUnit.DAYS.toMillis(30));

        System.out.println("\nPolicies Expiring Soon (within 30 days):");
        hashSetPolicies.stream()
                .filter(policy -> !policy.getExpiryDate().before(currentDate) && policy.getExpiryDate().before(futureDate))
                .forEach(System.out::println);
    }

    // Retrieve policies by a specific coverage type
    public void displayPoliciesByCoverage(String coverageType) {
        System.out.println("\nPolicies with Coverage Type: " + coverageType);
        hashSetPolicies.stream()
                .filter(policy -> policy.getCoverageType().equalsIgnoreCase(coverageType))
                .forEach(System.out::println);
    }

    // Retrieve duplicate policies based on policy numbers
    public void displayDuplicatePolicies() {
        Set<String> policyNumbers = new HashSet<>();
        Set<InsurancePolicy> duplicates = new HashSet<>();

        for (InsurancePolicy policy : hashSetPolicies) {
            if (!policyNumbers.add(policy.getPolicyNumber())) {
                duplicates.add(policy);
            }
        }

        System.out.println("\nDuplicate Policies based on Policy Number:");
        duplicates.forEach(System.out::println);
    }

    // Performance comparison
    public void comparePerformance(InsurancePolicy policy) {
        long startTime, endTime;

        // HashSet add performance
        startTime = System.nanoTime();
        hashSetPolicies.add(policy);
        endTime = System.nanoTime();
        System.out.println("HashSet add time: " + (endTime - startTime) + " ns");

        // LinkedHashSet add performance
        startTime = System.nanoTime();
        linkedHashSetPolicies.add(policy);
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet add time: " + (endTime - startTime) + " ns");

        // TreeSet add performance
        startTime = System.nanoTime();
        treeSetPolicies.add(policy);
        endTime = System.nanoTime();
        System.out.println("TreeSet add time: " + (endTime - startTime) + " ns");

        // HashSet remove performance
        startTime = System.nanoTime();
        hashSetPolicies.remove(policy);
        endTime = System.nanoTime();
        System.out.println("HashSet remove time: " + (endTime - startTime) + " ns");

        // LinkedHashSet remove performance
        startTime = System.nanoTime();
        linkedHashSetPolicies.remove(policy);
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet remove time: " + (endTime - startTime) + " ns");

        // TreeSet remove performance
        startTime = System.nanoTime();
        treeSetPolicies.remove(policy);
        endTime = System.nanoTime();
        System.out.println("TreeSet remove time: " + (endTime - startTime) + " ns");

        // HashSet search performance
        startTime = System.nanoTime();
        hashSetPolicies.contains(policy);
        endTime = System.nanoTime();
        System.out.println("HashSet search time: " + (endTime - startTime) + " ns");

        // LinkedHashSet search performance
        startTime = System.nanoTime();
        linkedHashSetPolicies.contains(policy);
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet search time: " + (endTime - startTime) + " ns");

        // TreeSet search performance
        startTime = System.nanoTime();
        treeSetPolicies.contains(policy);
        endTime = System.nanoTime();
        System.out.println("TreeSet search time: " + (endTime - startTime) + " ns");
    }
}

