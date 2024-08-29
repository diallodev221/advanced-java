package com.diallodev.map;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VotingSystemTest {

    VotingSystem votingSystem = new VotingSystem();

    @Test
    void testVote() {

        votingSystem.vote("Contestant 1");
        votingSystem.vote("Contestant 1");
        votingSystem.vote("Contestant 2");
        votingSystem.vote("Contestant 1");
        votingSystem.vote("Contestant 3");
        votingSystem.vote("Contestant 3");

        assertEquals(3, votingSystem.getVotes().get("Contestant 1"));
        assertEquals(1, votingSystem.getVotes().get("Contestant 2"));
        assertEquals(2, votingSystem.getVotes().get("Contestant 3"));
    }


    @Test
    void testOrderOfVotes() {
        votingSystem.vote("Contestant 1");
        votingSystem.vote("Contestant 1");
        votingSystem.vote("Contestant 2");
        votingSystem.vote("Contestant 1");
        votingSystem.vote("Contestant 3");
        votingSystem.vote("Contestant 3");

        assertEquals("Contestant 1", votingSystem.getVotes().keySet().iterator().next());
    }

}