package graphicshape;

public class Rectangle extends Shape {
    private int length;
    private int height;

    @Override
    public double area() {
        return length * height;
    }
}
