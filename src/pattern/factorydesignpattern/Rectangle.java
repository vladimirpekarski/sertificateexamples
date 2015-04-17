package pattern.factorydesignpattern;

public class Rectangle implements Shape {
    private int length;
    private int height;

    public Rectangle(int length, int height) {
        this.length = length;
        this.height = height;

        System.out.println("Rectangle constructor");
    }

    @Override
    public void draw() {
        System.out.println("Rectangle draw");
    }

    @Override
    public void fillColor() {
        System.out.println("Rectangle fill color");
    }
}
