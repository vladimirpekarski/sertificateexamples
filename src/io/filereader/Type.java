package io.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Type {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("pass the name of file(s) as argument");
            System.exit(-1);
        }

        for (String file : args) {
            try (FileReader inputFile = new FileReader(file)){
                int ch = 0;
                while ((ch = inputFile.read()) != -1) {
                    System.out.print((char)ch);
                }
            } catch (FileNotFoundException fnfe) {
                System.err.printf("Cannot open the given file %s", file);
            } catch (IOException ioe) {
                System.err.printf("Error when processing file %s... skipping it", file);
            }
        }
    }
}
