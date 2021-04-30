package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MiscTest {

    @Test
    void genFormID() {
        String test = Misc.genFormID();

        assertEquals(11, test.length());

        for(int i = 0; i < 5; i++) {
            assertTrue(Character.isLetterOrDigit(test.charAt(i)));
        }
        assertEquals('-', test.charAt(5));
        for(int i = 6; i < 11; i++) {
            assertTrue(Character.isLetterOrDigit(test.charAt(i)));
        }
    }

    @Test
    void genRandChar() {
        double validExpProb = 1F/62;

        // Boundary tests
        testChar((char)('0' - 1), 0);
        testChar('0', validExpProb);
        testChar((char)('0' + 1), validExpProb);

        testChar((char)('9' - 1), validExpProb);
        testChar('9', validExpProb);
        testChar((char)('9' + 1), 0);

        testChar((char)('A' - 1), 0);
        testChar('A', validExpProb);
        testChar((char)('A' + 1), validExpProb);

        testChar((char)('Z' - 1), validExpProb);
        testChar('Z', validExpProb);
        testChar((char)('Z' + 1), 0);

        testChar((char)('a' - 1), 0);
        testChar('a', validExpProb);
        testChar((char)('a' + 1), validExpProb);

        testChar((char)('z' - 1), validExpProb);
        testChar('z', validExpProb);
        testChar((char)('z' + 1), 0);
    }

    private void testChar(char testC, double expProb) {
        int hits = 0, attempts = 0;
        for(; attempts < 1E6; attempts++) {
            char c = Misc.genRandChar();
            assertTrue(Character.isLetterOrDigit(c));
            if(c == testC) hits++;
        }
        assertEquals(expProb, ((float)hits)/attempts, 0.001);
    }
}