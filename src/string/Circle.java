package string;

public class Circle {
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    void area() {
        double tempArea = Math.PI * radius * radius;
        System.out.println("Circle area using default formatting with println: " + tempArea);
        System.out.printf("Circle area using default formatting with printf: %.2f", tempArea);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(10, 10, 10);
        circle.area();
    }
}
