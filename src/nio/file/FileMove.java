package nio.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileMove {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("usage: FileMove <source-path> <destination-path>");
            System.exit(-1);
        }

        Path pathSource = Paths.get(args[0]);
        Path pathDest = Paths.get(args[1]);

        try {
            Files.move(pathSource, pathDest);
            System.out.println("Source file moved successfully!");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
