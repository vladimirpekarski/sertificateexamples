package graphicshape;

/**
 * Created by v.pekarsky on 26.03.15.
 */
public class Circle extends Shape {
    private int radius;

    public void area() {
        System.out.println("area:" + 3.14 * radius * radius);
    }

    void fillColor() {
        System.out.println("color:" + color); //protected field in subclass
    }
}
