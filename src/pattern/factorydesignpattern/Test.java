package pattern.factorydesignpattern;

public class Test {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.addNewShape("Circle");
        canvas.addNewShape("Circle");
        canvas.addNewShape("Rectangle");
        canvas.redraw();
    }
}
