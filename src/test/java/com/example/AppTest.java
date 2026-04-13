package com.voting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class VoterTest {
    @Test
    void testEligible() {
        Voter v = new Voter("Amit", 25, "Indian", true);
        assertEquals("Eligible to Vote", v.checkEligibility());
    }

    @Test
    void testUnderage() {
        Voter v = new Voter("Rahul", 17, "Indian", true);
        assertEquals("Ineligible: Underage", v.checkEligibility());
    }
}
