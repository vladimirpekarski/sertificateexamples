package pattern.singleton;

public class Logger2nd {
    private Logger2nd() {}
    public static Logger2nd myLogger2;
    public static synchronized Logger2nd getMyLogger2() {
        if (myLogger2 == null) {
            myLogger2 = new Logger2nd();
        }

        return myLogger2;
    }

    public void log2(String s) {
        System.out.println(s);
    }
}
