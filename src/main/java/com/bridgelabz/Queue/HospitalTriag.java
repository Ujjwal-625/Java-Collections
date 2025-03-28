package com.bridgelabz.Queue;

import java.util.*;

class Patient implements Comparable<Patient> {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    // Higher severity should come first (Descending order)
    @Override
    public int compareTo(Patient other) {
        return Integer.compare(other.severity, this.severity);
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class HospitalTriag {
    public static void main(String[] args) {
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>();

        // Adding patients
        triageQueue.add(new Patient("John", 3));
        triageQueue.add(new Patient("Alice", 5));
        triageQueue.add(new Patient("Bob", 2));

        // Processing patients in priority order
        while (!triageQueue.isEmpty()) {
            System.out.println("Treating: " + triageQueue.poll());
        }
    }
}

