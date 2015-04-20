package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SpellChecker {
    public static void main(String[] args) {
        Map<String, String> misspelWords = new HashMap<>();
        misspelWords.put("calender", "calendar");
        misspelWords.put("tomatos", "tomatoes");
        misspelWords.put("existance", "existence");
        misspelWords.put("aquaintance", "acquaintance");

        String sentence = "Buy a calender for the 2015";

        System.out.println("Given sentence is: " + sentence);
        for (String word : sentence.split("\\W+")) {
            if (misspelWords.containsKey(word)) {
                System.out.println("The correct spelling for " + word
                        + " is: " + misspelWords.get(word));
            }
        }

        Set<String> key = misspelWords.keySet();
        System.out.println(key);
    }
}
