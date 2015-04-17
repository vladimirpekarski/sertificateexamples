package pattern.factorydesignpattern;

public class Circle implements Shape {
    private int xPos;
    private int yPos;
    private int radius;

    public Circle(int xPos, int yPos, int radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;

        System.out.println("Circle constructor");
    }

    @Override
    public void draw() {
        System.out.println("Circle draw");
    }

    @Override
    public void fillColor() {
        System.out.println("Circle fill color");
    }
}
