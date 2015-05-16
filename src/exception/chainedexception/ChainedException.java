package exception.chainedexception;

public class ChainedException {
    public static void foo () {
        try {
            String [] strings = {"foo"};
            System.out.println("About to throw ArrayIndexOutOfBoundException");
            String functionName = strings[50];
        } catch (ArrayIndexOutOfBoundsException oob) {
            System.out.println("Wrapping ArrayIndexOutOfBoundsException into a RuntimeException");
            throw new RuntimeException(oob);
        }
    }

    public static void main(String[] args) {
        try {
            foo();
        } catch (Exception re) {
            System.out.println("The caught exception in main is: " + re.getClass());
            System.out.println("The cause of the exception is: " + re.getCause());
        }
    }
}
