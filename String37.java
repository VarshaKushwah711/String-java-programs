package Git_string;

import java.util.HashSet;

public class String37 {
    public static boolean isPangram(String str) {
        // Create a HashSet to store unique letters
        HashSet<Character> letters = new HashSet<>();

        // Convert string to lowercase and iterate through each character
        for (char c : str.toLowerCase().toCharArray()) {
            // Check if the character is an alphabet letter
            if (c >= 'a' && c <= 'z') {
                letters.add(c);
            }
        }

        // Check if the size of the set is 26 (number of letters in the alphabet)
        return letters.size() == 26;
    }

    public static void main(String[] args) {
        String testString = "The quick brown fox jumps over the lazy dog";
        if (isPangram(testString)) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }
}

