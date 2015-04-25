package io.console;

import java.io.Console;

public class Echo {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.err.println("Cannot retrieve console object - are you running your app from an IDE?" +
                    " Exiting the app...");
            System.exit(-1);
        }

        console.printf(console.readLine());
    }
}
