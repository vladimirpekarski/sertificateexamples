package collections.iteratorinterface;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> languageList = new ArrayList<>();
        languageList.add("C");
        languageList.add("C++");
        languageList.add("JAVA");

        for (String language : languageList) {
            System.out.println(language);
        }

        for (Iterator<String> languageIter = languageList.iterator(); languageIter.hasNext();) {
            String language = languageIter.next();
            System.out.println(language);
        }
    }
}
