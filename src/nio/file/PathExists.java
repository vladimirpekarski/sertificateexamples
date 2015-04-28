package nio.file;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExists {
    public static void main(String[] args) {
        Path path = Paths.get(args[0]);

        if (Files.exists(path, LinkOption.NOFOLLOW_LINKS)) {
            System.out.println("The file/directory " + path.getFileName() + " exists");

            if (Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS)) {
                System.out.println(path.getFileName() + " is a directory");
            } else {
                System.out.println(path.getFileName() + " is fiel");
            }
        } else {
            System.out.println("The file/directory " + path.getFileName() + " doesn't exist");
        }
    }
}
