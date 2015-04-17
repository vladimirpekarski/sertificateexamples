package pattern.singleton;

public class Logger2_2nd {
    private Logger2_2nd() {}
    public static Logger2_2nd logger2_2nd;
    public static Logger2_2nd getLogger2_2nd() {
        if (logger2_2nd == null) {
            synchronized (Logger2_2nd.class) {
                logger2_2nd = new Logger2_2nd();
            }
        }

        return logger2_2nd;
    }

    public void log2_2nd(String s) {
        System.out.println(s);
    }
}
