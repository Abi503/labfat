package com.voting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class VoterTest {
    @Test
    void testEligibleVoter() {
        Voter v = new Voter("John", 25, "Indian", true);
        assertEquals("Eligible to Vote", v.checkEligibility());
    }

    @Test
    void testUnderage() {
        Voter v = new Voter("Jane", 17, "Indian", true);
        assertEquals("Ineligible: Underage (Must be 18+)", v.checkEligibility());
    }
}
