package exception.overridingandthrowclause;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public interface IntReader {
    int readIntFromFile() throws IOException;
}

class ThrowsClause4 implements IntReader {
    @Override
    public int readIntFromFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("integer.txt"));
        return scanner.nextInt();
    }
}
