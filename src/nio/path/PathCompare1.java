package nio.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathCompare1 {
    public static void main(String[] args) {
        Path path1 = Paths.get("Test");
        Path path2 = Paths.get("D:\\books\\JAVA\\Sertificate\\sertification\\sertification\\Test");

        System.out.println("(path1.compareTo(path2) == 0: " + (path1.compareTo(path2) == 0));

        System.out.println("path1.equals(path2) is: " + path1.equals(path2));

        System.out.println("path2.equals(path1.toAbsolutePath) is " + path2.equals(path1.toAbsolutePath()));
    }
}
