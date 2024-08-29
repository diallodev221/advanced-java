package com.diallodev.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class VotingSystem {

    Map<String, Integer> votes = new LinkedHashMap<>();

    void vote(String contestant) {
        votes.merge(contestant, 1, Integer::sum);
    }

    public Map<String, Integer> getVotes() {
        return votes;
    }
}
