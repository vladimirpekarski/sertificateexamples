package exception;

public class Echo {
    public static void main(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("No input passed to echo command");
        } else {
            for (String str : args) {
                System.out.print(str + " ");
            }
        }
    }
}
