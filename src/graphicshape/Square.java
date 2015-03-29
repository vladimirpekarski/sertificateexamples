package graphicshape;

/**
 * Created by asus on 29.03.15.
 */
public class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
