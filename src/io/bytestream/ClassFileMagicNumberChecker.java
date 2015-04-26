package io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class ClassFileMagicNumberChecker {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Pass a valid file name as argument");
            System.exit(-1);
        }

        String file = args[0];
        byte []magicNumber = {(byte)0xCA, (byte)0xFE, (byte)0xBA, (byte)0xBE};
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] u4buffer = new byte[4];
            if (fis.read(u4buffer) != -1) {
                if (Arrays.equals(magicNumber, u4buffer)) {
                    System.out.printf("The magic number for passed file %s matches that of a .class file", file);
                } else {
                    System.out.printf("The magic numbers for passed file %s does not match of a .class file", file);
                }
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("file does not exist with given file name ");
        } catch (IOException ioe) {
            System.err.println("an I/O error occurred while processing the file");
        }
    }
}

