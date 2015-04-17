package generics.generic.methods;

import java.util.ArrayList;
import java.util.List;

public class UtilitiesTest {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        System.out.println("The original list is: " + intList);
        Utilities.fill(intList, 50);
        System.out.println("The modified list is: " + intList);
    }
}
