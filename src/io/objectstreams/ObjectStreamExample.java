package io.objectstreams;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class ObjectStreamExample {
    public static void main(String[] args) {
        Map<String, String> presidentsOfUS = new TreeMap<>();
        presidentsOfUS.put("Barack Obama", "2009 to --, Democratic Party, 56th term");
        presidentsOfUS.put("George W. Bush", "2001 to 2009, Republican Party, 54th and 55th terms");
        presidentsOfUS.put("Bill Clinton", "1993 to 2001, Democratic Party, 52th and 53th terms");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.data"))){
            oos.writeObject(presidentsOfUS);
        } catch (FileNotFoundException fnfe) {
            System.err.println("cannot create a file with given file name" );
        } catch (IOException ioe) {
            System.err.println("an I/O error occurred while processing the file");
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.data"))){
            Object obj = ois.readObject();
            if (obj != null && obj instanceof Map) {
                Map<String,String> presindents = (TreeMap<String, String>) obj;
                System.out.println("President name \t Description \n");
                for (Map.Entry<String, String> president : presindents.entrySet()) {
                    System.out.printf("%s \t %s %n", president.getKey(), president.getValue());
                }
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("cannot create a file with the given name ");
        } catch (IOException ioe) {
            System.err.println("an I/o error occurred while processing the file");
        } catch (ClassNotFoundException cnfe) {
            System.err.println("cannot recognize the class of the object - is the file corrupted?");
        }
    }
}
