package model;

/** A class for placing code that does not belong in other classes. */
public class Misc {
    // Constant used for generating form IDs.
    private final static char[] alphabet = getAlphabet();

    /** Generates a string in format xxxxx-xxxxx where each 'x' is a random letter or number. */
    public static String genFormID() {
        StringBuilder sb = new StringBuilder();

        // Append 5 random characters.
        for(int i = 0; i < 5; i++) {
            sb.append(genRandChar());
        }

        // Append the dash.
        sb.append('-');

        // Append 5 random characters.
        for(int i = 0; i < 5; i++) {
            sb.append(genRandChar());
        }

        return sb.toString();
    }

    /** Gives a character array with the integers, uppercase letters, and lowercase letters, and in that order.*/
    private static char[] getAlphabet() {
        char[] alphabet = new char[10 + 26 + 26];
        int idx = 0;
        for(int i = 0; i < 10; idx++, i++) {
            alphabet[idx] = (char)('0' + i);
        }
        for(int i = 0; i < 26; idx++, i++) {
            alphabet[idx] = (char)('A' + i);
        }
        for(int i = 0; i < 26; idx++, i++) {
            alphabet[idx] = (char)('a' + i);
        }
        return alphabet;
    }

    /** Generate an ascii character that is one of: an integer, an uppercase letter, or a lowercase letter.
     *  Each of these characters have equal probability to be chosen. */
    public static char genRandChar() {
        return alphabet[(int)(alphabet.length * Math.random())];
    }
}
