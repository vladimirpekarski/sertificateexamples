package graphicshape;

/**
 * Created by asus on 01.04.15.
 */
public class Rectangle extends Shape {
    private int length;
    private int height;

    @Override
    public double area() {
        return length * height;
    }
}
