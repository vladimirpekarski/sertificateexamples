package pattern.singleton;

public class Logger {
    private Logger() {};
    public static Logger myInstance;
    public static Logger getMyInstance() {
        if (myInstance == null) {
            myInstance = new Logger();
        }

        return myInstance;
    }

    public void log(String s) {
        System.out.println(s);
    }
}
