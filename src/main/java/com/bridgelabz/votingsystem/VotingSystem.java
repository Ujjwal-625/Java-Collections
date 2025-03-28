package com.bridgelabz.votingsystem;

import java.util.*;

public class VotingSystem {
    // HashMap to store the votes (Candidate -> Votes)
    private HashMap<String, Candidate> voteMap = new HashMap<>();

    // LinkedHashMap to maintain the order of votes (preserves insertion order)
    private LinkedHashMap<String, Candidate> orderMap = new LinkedHashMap<>();

    // TreeMap to display results sorted by votes (sorted by vote count)
    private TreeMap<Integer, List<Candidate>> sortedMap = new TreeMap<>(Collections.reverseOrder());

    // Method to cast a vote for a candidate
    public void castVote(String candidateName) {
        Candidate candidate = voteMap.get(candidateName);

        if (candidate == null) {
            candidate = new Candidate(candidateName);
            voteMap.put(candidateName, candidate);
            orderMap.put(candidateName, candidate);
        }

        candidate.incrementVotes();
        updateSortedResults(candidate);
    }

    // Update sorted results in TreeMap
    private void updateSortedResults(Candidate candidate) {
        int votes = candidate.getVotes();
        // Remove candidate from the previous vote count
        sortedMap.values().forEach(list -> list.remove(candidate));

        // Add the candidate to the new vote count
        sortedMap.putIfAbsent(votes, new ArrayList<>());
        sortedMap.get(votes).add(candidate);
    }

    // Display the results in order of insertion (using LinkedHashMap)
    public void displayVotesInOrder() {
        System.out.println("Votes in Insertion Order (LinkedHashMap):");
        orderMap.values().forEach(System.out::println);
    }

    // Display the results sorted by votes (using TreeMap)
    public void displaySortedResults() {
        System.out.println("Votes Sorted by Vote Count (TreeMap):");
        sortedMap.forEach((votes, candidates) -> {
            candidates.forEach(candidate -> System.out.println(candidate));
        });
    }

    // Display all candidates with their vote count (using HashMap)
    public void displayAllVotes() {
        System.out.println("All Votes (HashMap):");
        voteMap.values().forEach(System.out::println);
    }
}

