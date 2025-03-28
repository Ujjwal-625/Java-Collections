package com.bridgelabz.votingsystem;
public class Main {
    public static void main(String[] args) {
        // Create a new VotingSystem
        VotingSystem votingSystem = new VotingSystem();

        // Cast some votes for different candidates
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Bob");

        // Display the results in insertion order
        votingSystem.displayVotesInOrder();

        // Display the results sorted by votes
        votingSystem.displaySortedResults();

        // Display all votes using HashMap
        votingSystem.displayAllVotes();
    }
}

