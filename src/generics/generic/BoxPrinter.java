package generics.generic;

public class BoxPrinter<T> {
    private T val;

    public BoxPrinter(T val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "[" + val + "]";
    }

    public T getVal() {
        return val;
    }
}
