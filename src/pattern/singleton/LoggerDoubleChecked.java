package pattern.singleton;

public class LoggerDoubleChecked {
    private LoggerDoubleChecked() {}

    public static LoggerDoubleChecked myInstance;
    public static LoggerDoubleChecked getMyInstance() {
        if (myInstance == null) {
            synchronized (LoggerDoubleChecked.class) {
                if (myInstance == null) {
                    myInstance = new LoggerDoubleChecked();
                }
            }
        }

        return myInstance;
    }

    public void log(String s) {
        System.out.println(s);
    }
}
