package pattern.singleton;

public class LoggerInnerClass {
    private LoggerInnerClass() {}
    public static LoggerInnerClass myInstance;

    public static class LoggerHolder {
        public static LoggerInnerClass loggerInnerClass = new LoggerInnerClass();
    }

    public static LoggerInnerClass getMyInstance() {
        return LoggerHolder.loggerInnerClass;
    }

    public void log(String s) {
        System.out.println(s);
    }
}
