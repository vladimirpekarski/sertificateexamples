package collections.navigablemap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest {
    public static void main(String[] args) {
        NavigableMap<Integer, String> examScore = new TreeMap<>();
        examScore.put(90, "Sophia");
        examScore.put(20, "Isabella");
        examScore.put(10, "Emma");
        examScore.put(50, "Olivea");

        System.out.println("The data in the map is:" + examScore);
        System.out.println("The data descending order:" + examScore.descendingMap());
        System.out.println("Details of those who passed the exam: " + examScore.tailMap(40));
        System.out.println("The lowers mark is: " + examScore.firstEntry());
    }
}
