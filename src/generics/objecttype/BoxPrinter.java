package generics.objecttype;

public class BoxPrinter {
    private Object val;
    public BoxPrinter(Object arg) {
        val = arg;
    }

    @Override
    public String toString() {
        return "[" + val + "]";
    }

    public Object getVal() {
        return val;
    }
}
