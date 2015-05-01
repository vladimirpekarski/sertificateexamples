package nio.file.filevisit;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVisitor extends SimpleFileVisitor {
    @Override
    public FileVisitResult preVisitDirectory(Object dir, BasicFileAttributes attrs) throws IOException {
        if (dir instanceof Path) {
            Path tempPath = (Path) dir;
            System.out.println("---------Derictory name: " + tempPath);
            return FileVisitResult.CONTINUE;
        }

        return null;
    }

    @Override
    public FileVisitResult visitFile(Object file, BasicFileAttributes attrs) throws IOException {
        if (file instanceof Path) {
            Path tempPath = (Path) file;
            System.out.println("file name: " + tempPath.getFileName());
            return FileVisitResult.CONTINUE;
        }

        return null;
    }
}
