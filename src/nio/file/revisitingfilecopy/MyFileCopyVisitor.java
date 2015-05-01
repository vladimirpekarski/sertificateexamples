package nio.file.revisitingfilecopy;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileCopyVisitor extends SimpleFileVisitor<Path> {
    private Path source;
    private Path destination;

    public MyFileCopyVisitor(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newd = destination.resolve(source.relativize(file));
        try {
            Files.copy(file, newd, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ieo) {
            ieo.printStackTrace();
        }

        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newd = destination.resolve(source.relativize(dir));
        try {
            Files.copy(dir, newd, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return FileVisitResult.CONTINUE;
    }
}
