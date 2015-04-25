package io.console;

import java.io.Console;

public class SpecialCharHanding {
    public static void main(String[] args) {
        String scandString = "å, ä, and ö";
        System.out.println("Printing scands directly with println: " + scandString);
        Console console = System.console();
        console.printf("Printing scands thro' console's printf method: " + scandString);
    }
}
