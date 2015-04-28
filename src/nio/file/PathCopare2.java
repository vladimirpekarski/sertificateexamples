package nio.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathCopare2 {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("Test");
        Path path2 = Paths.get("D:\\books\\JAVA\\Sertificate\\sertification\\sertification\\Test");

        System.out.println("File.isSameFile(path1, path2) is: " + Files.isSameFile(path1, path2));
    }
}
