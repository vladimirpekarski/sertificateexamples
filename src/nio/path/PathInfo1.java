package nio.path;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by asus on 28.04.15.
 */
public class PathInfo1 {
    public static void main(String[] args) {
        Path testFilePath = Paths.get("D:\\books\\JAVA\\firstFile2.txt");

        System.out.println("Printing file information: ");
        System.out.println("\t file name: " + testFilePath.getFileName());
        System.out.println("\t root of the path: " + testFilePath.getRoot());
        System.out.println("\t parent of the target: " + testFilePath.getParent());

        System.out.println("Print elements of pathL ");
        for (Path path : testFilePath) {
            System.out.println("\t path elements: " + path);
        }
    }
}
