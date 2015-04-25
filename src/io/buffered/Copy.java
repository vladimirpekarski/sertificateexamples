package io.buffered;

import java.io.*;

public class Copy {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Incorrect syntax. Correct syntax: Copy SrcFile DstFile");
            System.exit(-1);
        }

        String srcFile = args[0];
        String dstFile = args[1];
        try (BufferedReader inputFile = new BufferedReader(new FileReader(srcFile));
             BufferedWriter outputFile = new BufferedWriter(new FileWriter(dstFile))) {
            int ch = 0;
            while ((ch = inputFile.read()) != -1) {
                outputFile.write((char)ch);
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("Cannot open the file " + fnfe.getMessage());
        } catch (IOException ioe) {
            System.err.printf("Error when processing file; exiting...");
        }
    }
}
