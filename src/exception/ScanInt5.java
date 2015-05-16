package exception;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScanInt5 {
    public static void main(String[] args) {
        String integerStr = "";
        System.out.println("The string to scan integer from it is: " + integerStr);
        Scanner scanner = new Scanner(integerStr);
        try {
            System.out.println("The integer value scanned from string is: " +
                    scanner.nextInt());
        } catch (NoSuchElementException | IllegalStateException multie) {
            System.out.println("Error: Cannot scan integer from the given string");
        }
    }
}
