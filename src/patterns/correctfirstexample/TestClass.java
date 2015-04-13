package patterns.correctfirstexample;

public class TestClass {
    public static void main(String[] args) {
        Circle circle = new Circle(10, 10, 10);
        System.out.println(circle);
        circle.addObserver(new Canvas());
        circle.addObserver(new ShapeArchiver());
        circle.setRadius(50);
        System.out.println(circle);
    }
}
