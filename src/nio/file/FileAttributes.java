package nio.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAttributes {
    public static void main(String[] args) {
        Path path = Paths.get(args[0]);

        try {
            Object obj = Files.getAttribute(path, "creationTime", LinkOption.NOFOLLOW_LINKS);
            System.out.println("Creation time: " + obj);

            obj = Files.getAttribute(path, "lastModifiedTime", LinkOption.NOFOLLOW_LINKS);
            System.out.println("Last modified time: " + obj);

            obj = Files.getAttribute(path, "size", LinkOption.NOFOLLOW_LINKS);
            System.out.println("Size: " + obj);

            obj = Files.getAttribute(path, "isDirectory", LinkOption.NOFOLLOW_LINKS);
            System.out.println("is Directory: " + obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
