package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScanInt {
    public static void main(String[] args) {
        System.out.println("Type an integer in the console: ");
        Scanner conseleScanner = new Scanner(System.in);
        try {
            System.out.println("You typed the integer value: " + conseleScanner.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("Error: You typed some text that is not an integer value...");
        }
    }
}
