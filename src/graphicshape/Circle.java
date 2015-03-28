package graphicshape;

/**
 * Created by v.pekarsky on 26.03.15.
 */
public class Circle extends Shape {
    private int radius;
    private int xPos;
    private int yPos;

    public Circle() {
        this(20, 20, 10);
    }

    public Circle(int xPos, int yPos) {
        this(xPos, yPos, 10);
    }

    public Circle(int xPos, int yPos, int radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
    }


    public void area() {
        System.out.println("area:" + 3.14 * radius * radius);
    }

    void fillColor() {
        System.out.println("color:" + color); //protected field in subclass
    }

    public void fillColor(int red, int green, int blue) {
        //
    }

    public void fillColor(float hue, float saturation, float brightness) {
        //
    }
}
