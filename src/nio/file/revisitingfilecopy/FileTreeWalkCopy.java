package nio.file.revisitingfilecopy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTreeWalkCopy {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("usage: FileTreeWalkCopy <source-path> <destination-path>");
            System.exit(-1);
        }

        Path sourcePath = Paths.get(args[0]);
        Path destPath = Paths.get(args[1]);

        try {
            Files.walkFileTree(sourcePath, new MyFileCopyVisitor(sourcePath, destPath));
            System.out.println("Files copied successfully!");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
