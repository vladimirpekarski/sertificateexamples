package io.console;

import java.io.Console;
import java.util.Arrays;

public class Login {
    public static void main(String[] args) {
        Console console = System.console();
        if (console != null) {
            String userName = null;
            char[] password = null;
            userName = console.readLine("Enter your username: ");
            password = console.readPassword("Enter password: ");
            if (userName.equals("scrat") && new String(password).equals("nuts")) {
                console.printf("login successful!");
            } else {
                console.printf("restarting app and try again");
            }

            Arrays.fill(password, ' ');
        }
    }
}
