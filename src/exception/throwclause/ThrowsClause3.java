package exception.throwclause;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsClause3 {
    public int readIntFromFile() throws FileNotFoundException {
        Scanner consoleScanner = new Scanner(new File("integer.txt"));
        return consoleScanner.nextInt();
    }

    public static void main(String []args) throws FileNotFoundException {
        System.out.println("Reading an integer from the file 'integer.txt': ");
        System.out.println("You typed the integer value: " + new ThrowsClause3().readIntFromFile());
    }
}
