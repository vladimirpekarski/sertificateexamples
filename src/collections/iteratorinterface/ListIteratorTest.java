package collections.iteratorinterface;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {
        String palStr = "abcba";
        List<Character> palindrome = new LinkedList<>();

        for (char ch : palStr.toCharArray()) {
            palindrome.add(ch);
        }

        System.out.println("Input string is: " + palStr);
        System.out.println("Array char is: " + palindrome);
        ListIterator<Character> iterator = palindrome.listIterator();
        ListIterator<Character> revIterator = palindrome.listIterator(palindrome.size());

        boolean result = true;
        while (revIterator.hasPrevious() && iterator.hasNext()) {
            if (iterator.next() != revIterator.previous()) {
                result = false;
                break;
            }
        }

        if (result) {
            System.out.println("Input string is a palindrome");
        } else {
            System.out.println("Input string is not a palindrome");
        }
    }
}
