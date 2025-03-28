package com.bridgelabz.votingsystem;

public class Candidate {
    private String name;
    private int votes;

    public Candidate(String name) {
        this.name = name;
        this.votes = 0;  // Initially, no votes
    }

    public String getName() {
        return name;
    }

    public int getVotes() {
        return votes;
    }

    public void incrementVotes() {
        this.votes++;
    }

    @Override
    public String toString() {
        return name + ": " + votes + " votes";
    }
}
