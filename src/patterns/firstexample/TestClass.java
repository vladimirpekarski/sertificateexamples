package patterns.firstexample;

public class TestClass {
    public static void main(String[] args) {
        Circle circlle = new Circle(10, 10, 10);
        System.out.println(circlle);
        circlle.setCanvas(new Canvas());
        circlle.setShapeArchiver(new ShapeArchiver());
        circlle.setRadius(50);
        System.out.println(circlle);
    }
}
