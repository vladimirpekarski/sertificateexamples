package io.serializable;

import java.io.*;

public class TransientSerialization {
    public static void main(String[] args) {
        USPresident usPresident = new USPresident("Barack Obama", "2009 to --", "56th term");
        System.out.println(usPresident);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("president.data"))){
            oos.writeObject(usPresident);
        } catch (FileNotFoundException fnfe) {
            System.err.println("cannot create a file with given file name");
        } catch (IOException ioe) {
            System.err.println("an I/O error occurred while processing the file");
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("president.data"))){
            Object obj = ois.readObject();
            if (obj != null && obj instanceof USPresident) {
                USPresident president = (USPresident) obj;
                System.out.println(president);
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("cannot create a file with the given file name");
        } catch (IOException ioe) {
            System.err.println("an I/O error occurred while processing the file");
        } catch (ClassNotFoundException cnfe) {
            System.err.println("cannot recognize the class of the object - is the file corrupted?");
        }
    }
}
