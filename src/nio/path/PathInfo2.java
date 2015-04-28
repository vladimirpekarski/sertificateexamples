package nio.path;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathInfo2 {
    public static void main(String[] args) throws IOException {
        Path testFilePath = Paths.get(".\\Test");
        System.out.println("The file name is: " + testFilePath.getFileName());
        System.out.println("It's URI is: " + testFilePath.toUri());
        System.out.println("It's absolute path is: " + testFilePath.toAbsolutePath());
        System.out.println("It's normalized path is: " + testFilePath.normalize());

        Path testPathNormalized = Paths.get(testFilePath.normalize().toString());
        System.out.println("It's normalized absolute path is: " +  testPathNormalized.toAbsolutePath());

//        System.out.println("It's normalized real path is: " + testFilePath.toRealPath(LinkOption.NOFOLLOW_LINKS));

        Path dirName = Paths.get("D:\\books\\JAVA\\Sertificate\\sertification\\sertification\\");
        Path resolvedPath = dirName.resolve("Test");
        System.out.println(resolvedPath);
    }
}
