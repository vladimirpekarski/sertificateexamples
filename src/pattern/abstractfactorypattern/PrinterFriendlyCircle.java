package pattern.abstractfactorypattern;

public class PrinterFriendlyCircle implements PrinterFriendlyShape {
    private int xPos;
    private int yPos;
    private int radius;

    public PrinterFriendlyCircle(int xPos, int yPos, int radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;

        System.out.println("PrinterFriendlyCircle constructor");
    }

    @Override
    public void draw() {
        System.out.println("PrinterFriendlyCircle draw(");
    }
}
