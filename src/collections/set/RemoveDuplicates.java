package collections.set;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String tongueTwister = "I feel, a feel, a funny feel, a funny feel I feel, " +
                "if you feel the feel I feel, I feel the feel you feel";

        Set<String> words = new HashSet<>();

        for (String word : tongueTwister.split("\\W+")) {
            words.add(word);
        }

        System.out.println("Original: " + tongueTwister);
        System.out.print("The words were used: ");
        System.out.println(words);
    }
}
