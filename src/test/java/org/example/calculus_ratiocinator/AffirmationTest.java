package org.example.calculus_ratiocinator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AffirmationTest {

    @Test
    void testFauxAffirmation() {
        Affirmation affirmation1 = new Affirmation("Lou est pauvre", "FAUSSE");
        Affirmation affirmation2 = new Affirmation("Lou est généreux", "VRAIE");
        assertEquals("FAUSSE", Affirmation.isFalseOrTrueAnd(affirmation1, affirmation2));
    }
    @Test
    void testFauxEtVraiAffirmation(){
        Affirmation affirmation3 = new Affirmation("Lou est beau", "VRAIE");
        Affirmation affirmation4 = new Affirmation("Lou est pauvre", "FAUSSE");
        assertEquals("FAUSSE", Affirmation.IsFalseOrTrueThusResult(affirmation3, affirmation4));
    }

    @Test
    void testVraiFaux(){
        Affirmation affirmation5 = new Affirmation("Lou est pauvre", "FAUSSE");
        Affirmation affirmation6 = new Affirmation("Lou est généreux", "VRAIE");
        assertEquals("VRAIE", Affirmation.IsFalseOrTrueThusResult(affirmation5, affirmation6));
    }

    @Test
    void testVraiVraiEtFaux(){
        Affirmation affirmation7 = new Affirmation("Lou est beau ou Lou est généreux", "VRAIE");
        Affirmation affirmation8 = new Affirmation("Lou est pauvre", "FAUSSE");
        assertEquals("FAUSSE", Affirmation.IsFalseOrTrueThusResult(affirmation7, affirmation8));
    }

    @Test
    void testVraiVrai(){
        Affirmation affirmation9 = new Affirmation("Lou est pauvre", "FAUSSE");
        Affirmation affirmation10 = new Affirmation("Lou est généreux", "VRAIE");
        assertEquals("VRAIE", Affirmation.isFalseOrTrue(affirmation9, affirmation10));
    }
}
