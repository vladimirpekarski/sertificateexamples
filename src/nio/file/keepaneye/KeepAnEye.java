package nio.file.keepaneye;

import java.io.IOException;
import java.nio.file.*;

public class KeepAnEye {
    public static void main(String[] args) {
        Path path = Paths.get("D:\\testFolder");
        WatchService watchService = null;
        try {
            watchService = path.getFileSystem().newWatchService();
            path.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        for (;;) {
            WatchKey key = null;
            try {
                key = watchService.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (WatchEvent<?> event : key.pollEvents()) {
                switch (event.kind().name()) {
                    case "OVERFLOW":
                        System.out.println("We lost some events");
                        break;
                    case "ENTRY_MODIFY":
                        System.out.println("File " + event.context() + " is changed!");
                        break;
                }
            }

            key.reset();
        }
    }
}
